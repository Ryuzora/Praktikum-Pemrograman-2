package service;

import dao.BukuDao;
import dao.impl.BukuImpl;
import model.Buku;
import java.util.List;

public class BukuService {
    private final BukuDao dao = new BukuImpl();

    public List<Buku> getAll() throws Exception {
        return dao.findAll();
    }

    public void addData(Buku b) throws Exception {
        validate(b);
        checkDuplicateJudul(b.getJudul(), 0);
        dao.save(b);
    }

    public void updateData(Buku b) throws Exception {
        if (b.getBukuId() <= 0) throw new Exception("Pilih data untuk diedit!");
        validate(b);
        checkDuplicateJudul(b.getJudul(), b.getBukuId());
        dao.update(b);
    }

    public void deleteData(int bukuId) throws Exception {
        if (bukuId <= 0) throw new Exception("ID tidak valid!");
        dao.delete(bukuId);
    }

    private void validate(Buku b) throws Exception {
        if (b.getJudul() == null || b.getJudul().trim().isEmpty()) {
            throw new Exception("Judul tidak boleh kosong!");
        }
        if (b.getJudul().trim().length() < 3) {
            throw new Exception("Judul minimal 3 karakter!");
        }
        if (b.getJudul().trim().length() > 150) {
            throw new Exception("Judul maksimal 150 karakter!");
        }
        
        if (b.getPenulis() == null || b.getPenulis().trim().isEmpty()) {
            throw new Exception("Nama penulis tidak boleh kosong!");
        }
        if (b.getPenulis().trim().length() < 3) {
            throw new Exception("Nama penulis minimal 3 karakter!");
        }
        
        if (b.getHarga() <= 0) {
            throw new Exception("Harga harus lebih dari 0!");
        }
        if (b.getHarga() > 10000000) {
            throw new Exception("Harga tidak boleh lebih dari Rp 10.000.000!");
        }
        
        if (b.getStok() < 0) {
            throw new Exception("Stok tidak boleh negatif!");
        }
        if (b.getStok() > 1000) {
            throw new Exception("Stok maksimal 1000 unit!");
        }
    }

    private void checkDuplicateJudul(String judul, int currentId) throws Exception {
        List<Buku> allData = dao.findAll();
        for (Buku b : allData) {
            if (b.getJudul().equalsIgnoreCase(judul) && b.getBukuId() != currentId) {
                throw new Exception("Judul buku sudah terdaftar! Gunakan judul lain.");
            }
        }
    }

    public int getTotalBuku() throws Exception {
        return dao.findAll().size();
    }

    public double getTotalNilaiStok() throws Exception {
        List<Buku> list = dao.findAll();
        double total = 0;
        for (Buku b : list) {
            total += (b.getHarga() * b.getStok());
        }
        return total;
    }
}