package tokio.registration;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;
import tokio.registration.model.Utilizador;

import java.util.ArrayList;
import java.util.List;

public class HelloController {
    @FXML
    private TextField nome;

    @FXML
    private TextField idade;

    @FXML
    private TableView tableView;

    @FXML
    private TableColumn nomeCol;

    @FXML
    private TableColumn idadeCol;

    private List<Utilizador> utilizadores = new ArrayList<>();

    @FXML
    protected void onClickResgitarUtilizador() {
        String nome = this.nome.getText();
        try {
            int idade = Integer.parseInt(this.idade.getText());
            Utilizador utilizador = new Utilizador(nome, idade);
            utilizadores.add(utilizador);

            nomeCol.setCellValueFactory(new PropertyValueFactory<Utilizador, String>("nome"));
            idadeCol.setCellValueFactory(new PropertyValueFactory<Utilizador, Integer>("idade"));

            ObservableList<Utilizador> data = FXCollections.observableList(utilizadores);
            tableView.setItems(data);
        } catch (NumberFormatException e){
            e.printStackTrace();
        }

    }
}