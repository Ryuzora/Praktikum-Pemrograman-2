package PRAKTIKUM6.controller;

import PRAKTIKUM6.model.Mahasiswa;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

public class MahasiswaController {

    public ObservableList<Mahasiswa> getMahasiswaList() {
        ObservableList<Mahasiswa> list = FXCollections.observableArrayList();
        
        list.add(new Mahasiswa(1, "1231242", "Cristiano Ronaldo", "Main Bola", "Teknik Kimia"));
        list.add(new Mahasiswa(2, "1231245", "Alexander Isak", "Main Futsal", "Sastra Mesin"));
        list.add(new Mahasiswa(3, "1232132", "Cole Palmer", "menggambar", "Teknik Rekayasa Pangan"));
        list.add(new Mahasiswa(4, "1232138", "Meltzbox", "Nyari mangsa", "FEB"));
        list.add(new Mahasiswa(5, "6783828", "nervers", "jadi kroco", "Teknologi Wedding Organizer"));
        list.add(new Mahasiswa(6, "1234442", "Ulyani", "nyari kumals", "S1 Goldlaner"));
        list.add(new Mahasiswa(7, "1233344", "Kumals", "ninja", "D3 Barista"));
        list.add(new Mahasiswa(8, "1234421", "Ibnu melon", "Jungler", "S.Scam"));
        list.add(new Mahasiswa(9, "2888347", "Florian Wirtz", "lari marathon", "JPOK"));
        list.add(new Mahasiswa(10, "2784473", "Gol D Roger", "Berlayar", "Teknik Perkapalan"));
        
        return list;
    }
}