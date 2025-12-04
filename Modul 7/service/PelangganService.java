package service;

import dao.PelangganDao;
import dao.impl.PelangganImpl;
import model.Pelanggan;
import java.util.List;
import java.util.regex.Pattern;

public class PelangganService {
    private final PelangganDao dao = new PelangganImpl();
    
    private static final Pattern EMAIL_PATTERN = Pattern.compile(
        "^[a-zA-Z0-9_+&*-]+(?:\\.[a-zA-Z0-9_+&*-]+)*@(?:[a-zA-Z0-9-]+\\.)+[a-zA-Z]{2,7}$"
    );
    
    private static final Pattern PHONE_PATTERN = Pattern.compile(
        "^(\\+62|62|0)[0-9]{9,12}$"
    );

    public List<Pelanggan> getAll() throws Exception {
        return dao.findAll();
    }

    public void addData(Pelanggan p) throws Exception {
        validate(p);
        checkDuplicateEmail(p.getEmail(), 0);
        checkDuplicateTelepon(p.getTelepon(), 0);
        dao.save(p);
    }

    public void updateData(Pelanggan p) throws Exception {
        if (p.getId() <= 0) throw new Exception("Pilih data tabel dulu untuk diedit!");
        validate(p);
        checkDuplicateEmail(p.getEmail(), p.getId());
        checkDuplicateTelepon(p.getTelepon(), p.getId()); 
        dao.update(p);
    }

    public void deleteData(int id) throws Exception {
        if (id <= 0) throw new Exception("ID tidak valid!");
        dao.delete(id);
    }

    private void validate(Pelanggan p) throws Exception {
        if (p.getNama() == null || p.getNama().trim().isEmpty()) {
            throw new Exception("Nama tidak boleh kosong!");
        }
        if (p.getNama().trim().length() < 3) {
            throw new Exception("Nama minimal 3 karakter!");
        }
        if (p.getNama().trim().length() > 50) {
            throw new Exception("Nama maksimal 50 karakter!");
        }
        
        if (p.getEmail() == null || p.getEmail().trim().isEmpty()) {
            throw new Exception("Email tidak boleh kosong!");
        }
        if (!EMAIL_PATTERN.matcher(p.getEmail()).matches()) {
            throw new Exception("Format email tidak valid!");
        }
        
        if (p.getTelepon() == null || p.getTelepon().trim().isEmpty()) {
            throw new Exception("Nomor telepon tidak boleh kosong!");
        }
        
        String cleanPhone = p.getTelepon().replaceAll("[\\s-]", "");
        
        if (!PHONE_PATTERN.matcher(cleanPhone).matches()) {
            throw new Exception("Format nomor tidak valid");
        }
        
        if (cleanPhone.length() < 10) {
            throw new Exception("Nomor telepon kurang dari 10 digit!");
        }
        
        if (cleanPhone.length() > 15) {
            throw new Exception("Nomor telepon lebih dari 15 digit!");
        }
    }

    private void checkDuplicateEmail(String email, int currentId) throws Exception {
        List<Pelanggan> allData = dao.findAll();
        for (Pelanggan p : allData) {
            if (p.getEmail().equalsIgnoreCase(email) && p.getId() != currentId) {
                throw new Exception("Email sudah digunakan!");
            }
        }
    }
    
    private void checkDuplicateTelepon(String telepon, int currentId) throws Exception {
        String cleanPhone = telepon.replaceAll("[\\s-]", "");
        List<Pelanggan> allData = dao.findAll();
        for (Pelanggan p : allData) {
            String existingPhone = p.getTelepon().replaceAll("[\\s-]", "");
            if (existingPhone.equals(cleanPhone) && p.getId() != currentId) {
                throw new Exception("Nomor telepon sudah terdaftar! Gunakan nomor lain.");
            }
        }
    }

    public int getTotalPelanggan() throws Exception {
        return dao.findAll().size();
    }

}