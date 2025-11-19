package PRAKTIKUM6.view;

import PRAKTIKUM6.controller.MahasiswaController;
import PRAKTIKUM6.model.Mahasiswa;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.VBox;

public class MahasiswaView extends VBox {
    private final TableView<Mahasiswa> tableView = new TableView<>();
    private final MahasiswaController controller = new MahasiswaController();

    public MahasiswaView() {
        TableColumn<Mahasiswa, String> kolomNim = createTableColumn("NIM", "nim");
        TableColumn<Mahasiswa, String> kolomNama = createTableColumn("Nama", "nama");
        TableColumn<Mahasiswa, String> kolomKeahlian = createTableColumn("Keahlian", "keahlian");
        TableColumn<Mahasiswa, String> kolomJurusan = createTableColumn("Jurusan", "jurusan");

        kolomNama.setMinWidth(150);
        kolomJurusan.setMinWidth(150);

        tableView.getColumns().addAll(kolomNim, kolomNama, kolomKeahlian, kolomJurusan);
        tableView.setItems(controller.getMahasiswaList());
        this.getChildren().add(tableView);
    }

    private <S, T> TableColumn<S, T> createTableColumn(String title, String propertyName) {
        TableColumn<S, T> column = new TableColumn<>(title);
        column.setCellValueFactory(new PropertyValueFactory<>(propertyName));
        return column;
    }
}