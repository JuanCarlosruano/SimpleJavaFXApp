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
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

public class CamposTexto extends Application {

	@Override
	public void start(Stage escenarioPrincipal) {
		try {
			HBox raiz = new HBox();
			raiz.setPadding(new Insets(40));
			raiz.setSpacing(10);
			raiz.setAlignment(Pos.BOTTOM_RIGHT);
			
			Label lbNombre;
			lbNombre = new Label("Nombre:");
			
			TextField tfNombre = new TextField();
			
			raiz.getChildren().addAll(lbNombre, tfNombre);
			
			Scene escena = new Scene(raiz, 450, 300);
			escenarioPrincipal.setTitle("Campos de texto");
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