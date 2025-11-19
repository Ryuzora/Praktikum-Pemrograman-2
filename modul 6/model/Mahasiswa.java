package PRAKTIKUM6.model;

import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.property.SimpleStringProperty;

public class Mahasiswa {
    private final SimpleIntegerProperty id;
    private final SimpleStringProperty nim;
    private final SimpleStringProperty nama;
    private final SimpleStringProperty keahlian;
    private final SimpleStringProperty jurusan;

    public Mahasiswa(int id, String nim, String nama, String keahlian, String jurusan) {
        this.id = new SimpleIntegerProperty(id);
        this.nim = new SimpleStringProperty(nim);
        this.nama = new SimpleStringProperty(nama);
        this.keahlian = new SimpleStringProperty(keahlian);
        this.jurusan = new SimpleStringProperty(jurusan);
    }

    public int getId() {
        return id.get();
    }
    public SimpleIntegerProperty idProperty() {
        return id;
    }
    public void setId(int id) {
        this.id.set(id);
    }

    public String getNim() {
        return nim.get();
    }
    public SimpleStringProperty nimProperty() {
        return nim;
    }
    public void setNim(String nim) {
        this.nim.set(nim);
    }

    public String getNama() {
        return nama.get();
    }
    public SimpleStringProperty namaProperty() {
        return nama;
    }
    public void setNama(String nama) {
        this.nama.set(nama);
    }

    public String getKeahlian() {
        return keahlian.get();
    }
    public SimpleStringProperty hobiProperty() {
        return keahlian;
    }
    public void setKeahlian(String keahlian) {
        this.keahlian.set(keahlian);
    }

    public String getJurusan() {
        return jurusan.get();
    }
    public SimpleStringProperty jurusanProperty() {
        return jurusan;
    }
    public void setJurusan(String jurusan) {
        this.jurusan.set(jurusan);
    }
}