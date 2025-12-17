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
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

public class CamposContrasena extends Application {

	@Override
	public void start(Stage escenarioPrincipal) {
		try {
			HBox raiz = new HBox();
			raiz.setPadding(new Insets(40));
			raiz.setSpacing(10);
			raiz.setAlignment(Pos.CENTER_LEFT);
			
			Label lbContrasena;
			lbContrasena = new Label("Contraseña:");
			
			PasswordField pfContrasena = new PasswordField();
			
			raiz.getChildren().addAll(lbContrasena, pfContrasena);
			
			Scene escena = new Scene(raiz, 350, 100);
			escenarioPrincipal.setTitle("Campos de contraseña");
			escenarioPrincipal.setScene(escena);
			escenarioPrincipal.show();
		} catch(Exception e) {
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		launch(args);
	}

}
