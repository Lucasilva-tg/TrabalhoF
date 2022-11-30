package br.com.newchatproject.controllers;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.control.MenuBar;
import javafx.scene.control.SplitPane;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.control.ToolBar;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.HBox;

public class MainControlador {

    @FXML
    private HBox con;

    @FXML
    private TextArea dialogPane;

    @FXML
    private AnchorPane div01;

    @FXML
    private AnchorPane div02;

    @FXML
    private AnchorPane div03;

    @FXML
    private TextField explorador;

    @FXML
    private Button getContatos;

    @FXML
    private ImageView getFotoAmigo;

    @FXML
    private Button getMensagem;

    @FXML
    private ImageView getMinhaFoto;

    @FXML
    private Label getMeuNome;

    @FXML
    private Label getNomeAmigo;

    @FXML
    private SplitPane hSplitPane;

    @FXML
    private HBox fone;

    @FXML
    private TextField inputMessage;

    @FXML
    private ImageView logo2;

    @FXML
    private MenuBar menu;

    @FXML
    private HBox lerCaixa;

    @FXML
    private ToolBar caixaDeFerramentas;

    @FXML
    private ListView<?> listaDeUsuarios;

    @FXML
    private SplitPane vSplitPane;

    @FXML
    private HBox escreverCaixa;

}
