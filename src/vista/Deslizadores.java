/*
* Proyecto: SimpleJavaFXApp
* Paquete: vista
* Archivo: Deslizadores.java
* Autor: Alberto Martínez Cánovas
* Fecha: 16 dic 2025 8:33:57
*
* Descripción:
* [Resumen del propósito del archivo/clase.]
*
* Licencia:
* [Condiciones de uso/licencia.]
*/
package vista;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.Slider;
import javafx.scene.layout.HBox;
import javafx.scene.text.Font;
import javafx.stage.Stage;

public class Deslizadores extends Application {

	@Override
	public void start(Stage escenarioPrincipal) {
		try {
			HBox raiz = new HBox();
			raiz.setPadding(new Insets(40));
			raiz.setSpacing(10);
			
			Label lbElige;
			lbElige = new Label("Elige el porcentaje:");
			lbElige.setFont(Font.font(20));
			
			Slider porcentaje = new Slider();
			porcentaje.setMin(0);
			porcentaje.setMax(100);
			porcentaje.setValue(50);
			porcentaje.setShowTickLabels(true);
			porcentaje.setShowTickMarks(true);
			porcentaje.setMajorTickUnit(50);
			porcentaje.setMinorTickCount(4);
			porcentaje.setBlockIncrement(10);
			porcentaje.setSnapToTicks(true);
			
			raiz.getChildren().addAll(lbElige, porcentaje);
			
			Scene escena = new Scene(raiz, 430, 100);
			escenarioPrincipal.setTitle("Deslizadores");
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
