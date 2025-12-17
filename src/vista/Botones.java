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
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.HBox;
import javafx.scene.text.Font;
import javafx.stage.Stage;


public class Botones extends Application {
	@Override
	public void start(Stage escenarioPrincipal) {
		try {
			HBox raiz = new HBox();
			raiz.setPadding(new Insets(20, 20, 20, 20));
			raiz.setSpacing(10);
			raiz.setAlignment(Pos.CENTER);
			
			Button  btTexto, btTextoImagen, btImagen;
			btTexto = new Button();
			btTextoImagen = new Button();
			btImagen = new Button();
			
			btTexto.setText("Pulsar");
			
			Image imagen = new Image(getClass().getResourceAsStream("../imagenes/iconoCerveza.png"), 50, 50, true, true);
			btTextoImagen.setGraphic(new ImageView(imagen));
			btTextoImagen.setText("Beber");
			btTextoImagen.setGraphicTextGap(20);
			btTextoImagen.setFont(Font.font("Ani", 30));
			
			imagen = new Image(getClass().getResourceAsStream("../imagenes/iconoApagar.png"), 60, 60, true, true);
			btImagen.setGraphic(new ImageView(imagen));
			
			raiz.getChildren().addAll(btTexto, btTextoImagen, btImagen);
			
			Scene escena = new Scene(raiz, 400, 120);
			escenarioPrincipal.setTitle("Botones");
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