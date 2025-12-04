package controller;

import javafx.fxml.FXML;
import javafx.scene.control.Tab;
import javafx.scene.control.TabPane;

public class MainController {

    @FXML
    private TabPane mainTabPane;

    @FXML
    private Tab tabPenjualan;
    
    @FXML
    private PelangganController pelangganTabController; 
    
    @FXML
    private BukuController bukuTabController;
    
    @FXML
    private PenjualanController penjualanTabController;

    @FXML
    public void initialize() {
        System.out.println("Main Layout Loaded");
    }
}