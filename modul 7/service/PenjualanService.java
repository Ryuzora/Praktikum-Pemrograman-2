package service;

import dao.PenjualanDao;
import dao.BukuDao;
import dao.impl.PenjualanImpl;
import dao.impl.BukuImpl;
import model.Penjualan;
import model.Buku;
import java.time.LocalDate;
import java.util.List;

public class PenjualanService {
    private final PenjualanDao dao = new PenjualanImpl();
    private final BukuDao bukuDao = new BukuImpl();

    public List<Penjualan> getAll() throws Exception {
        return dao.findAll();
    }

    public void addData(Penjualan p) throws Exception {
        validate(p);
        
        Buku buku = bukuDao.findById(p.getBukuId());
        if (buku == null) {
            throw new Exception("Buku tidak ditemukan!");
        }
        if (buku.getStok() < p.getJumlah()) {
            throw new Exception("Stok buku tidak mencukupi! Stok tersedia: " + buku.getStok());
        }
        
        dao.save(p);
        
        buku.setStok(buku.getStok() - p.getJumlah());
        bukuDao.update(buku);
    }

    public void updateData(Penjualan p) throws Exception {
        if (p.getPenjualanId() <= 0) throw new Exception("Pilih data tabel dulu untuk diedit!");
        validate(p);
        dao.update(p);
    }

    public void deleteData(int penjualanId) throws Exception {
        if (penjualanId <= 0) throw new Exception("ID tidak valid!");
        dao.delete(penjualanId);
    }

    private void validate(Penjualan p) throws Exception {
        if (p.getJumlah() <= 0) {
            throw new Exception("Jumlah harus lebih dari 0!");
        }
        if (p.getJumlah() > 1000) {
            throw new Exception("Jumlah maksimal 1000 unit per transaksi!");
        }
        
        if (p.getTotalHarga() <= 0) {
            throw new Exception("Total harga harus lebih dari 0!");
        }
        
        if (p.getTanggal() == null) {
            throw new Exception("Tanggal tidak boleh kosong!");
        }
        if (p.getTanggal().isAfter(LocalDate.now())) {
            throw new Exception("Tanggal tidak boleh di masa depan!");
        }
        
        if (p.getPelangganId() <= 0) {
            throw new Exception("Pilih pelanggan terlebih dahulu!");
        }
        if (p.getBukuId() <= 0) {
            throw new Exception("Pilih buku terlebih dahulu!");
        }
    }

    public int getTotalTransaksi() throws Exception {
        return dao.findAll().size();
    }

    public double getTotalPendapatan() throws Exception {
        List<Penjualan> list = dao.findAll();
        double total = 0;
        for (Penjualan p : list) {
            total += p.getTotalHarga();
        }
        return total;
    }

    public List<Penjualan> getPenjualanByPelanggan(int pelangganId) throws Exception {
        return dao.findByPelanggan(pelangganId);
    }
}