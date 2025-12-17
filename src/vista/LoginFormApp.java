/*
* Proyecto: 
* Archivo: 
* Autor/a: Juan Carlos Ruano Mayor
* Fecha: 11 dic 2025 10:50:59
*
* Descripción:
* [Resumen breve del propósito de este archivo/clase.]
*
* Licencia:
* [Indica la licencia o condiciones de uso si procede.]
*/
package vista;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.Menu;
import javafx.scene.control.MenuBar;
import javafx.scene.control.MenuItem;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.stage.Modality;
import javafx.stage.Stage;

public class LoginFormApp extends Application {
	private Label labelUsuarioActual;

	@Override
	public void start(Stage primaryStage) {
		// Crear el menú "Registro"
		MenuBar menuBar = new MenuBar();
		Menu menuRegistro = new Menu("Registro");
		MenuItem menuItemNuevo = new MenuItem("Nuevo");
		menuRegistro.getItems().add(menuItemNuevo);
		menuBar.getMenus().add(menuRegistro);
		// Crear el contenedor principal (BorderPane)
		BorderPane root = new BorderPane();
		root.setTop(menuBar);
		// Crear una etiqueta para mostrar el usuario actual
		labelUsuarioActual = new Label("Usuario: No autenticado");
		labelUsuarioActual.setPadding(new Insets(10));
		BorderPane.setAlignment(labelUsuarioActual, Pos.TOP_RIGHT);
		root.setRight(labelUsuarioActual);
		// Acción para abrir el formulario de login
		menuItemNuevo.setOnAction(event -> abrirVentanaLogin(primaryStage));
		// Configurar la escena principal
		Scene scene = new Scene(root, 400, 300);
		primaryStage.setTitle("Ventana Principal");
		primaryStage.setScene(scene);
		primaryStage.show();
	}

	private void abrirVentanaLogin(Stage owner) {
		// Crear la ventana de diálogo
		Stage dialog = new Stage();
		dialog.setTitle("Formulario de Login");
		dialog.initModality(Modality.WINDOW_MODAL);
		dialog.initOwner(owner);
		// Crear los componentes del formulario
		Label labelUsuario = new Label("Usuario:");
		TextField campoUsuario = new TextField();
		Label labelPassword = new Label("Contraseña:");
		PasswordField campoPassword = new PasswordField();
		Button btnLogin = new Button("Iniciar Sesión");
		Label labelResultado = new Label();
		// Configurar la acción del botón Login
		btnLogin.setOnAction(event -> {
			String usuario = campoUsuario.getText();
			String password = campoPassword.getText();
			if (usuario.isEmpty() || password.isEmpty()) {
				labelResultado.setText("Todos los campos son obligatorios.");
				labelResultado.setStyle("-fx-text-fill: red;");
			} else if (usuario.equals("admin") && password.equals("1234")) {
				labelResultado.setText("Inicio de sesión exitoso.");
				labelResultado.setStyle("-fx-text-fill: green;");
				labelUsuarioActual.setText("Usuario: " + usuario);
				dialog.close(); // Cerrar el diálogo al validar
			} else {
				labelResultado.setText("Credenciales incorrectas.");
				labelResultado.setStyle("-fx-text-fill: red;");
			}
		});
		// Crear el layout para el formulario
		GridPane gridPane = new GridPane();
		gridPane.setPadding(new Insets(10));
		gridPane.setHgap(10);
		gridPane.setVgap(10);

		gridPane.add(labelUsuario, 0, 0);
		gridPane.add(campoUsuario, 1, 0);
		gridPane.add(labelPassword, 0, 1);
		gridPane.add(campoPassword, 1, 1);
		gridPane.add(btnLogin, 1, 2);
		gridPane.add(labelResultado, 1, 3);
		// Configurar y mostrar el diálogo
		Scene dialogScene = new Scene(gridPane, 300, 200);
		dialog.setScene(dialogScene);
		dialog.showAndWait();
	}

	public static void main(String[] args) {
		launch(args);
	}
}
