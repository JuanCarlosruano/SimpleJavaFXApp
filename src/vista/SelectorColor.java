/*
* Proyecto: SimpleJavaFXApp
* Paquete: vista
* Archivo: SelectorColor.java
* Autor: Alberto Martínez Cánovas
* Fecha: 16 dic 2025 8:50:37
*
* Descripción:
* [Resumen del propósito del archivo/clase.]
*
* Licencia:
* [Condiciones de uso/licencia.]
*/
package vista;

import javafx.application.Application;
import javafx.event.Event;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.ColorPicker;
import javafx.scene.control.Label;
import javafx.scene.layout.HBox;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.stage.Stage;


public class SelectorColor extends Application {

	@Override
	public void start(Stage escenarioPrincipal) {
	
		try {
			HBox raiz = new HBox();
			raiz.setPadding(new Insets(40));
			raiz.setSpacing(10);
			raiz.setAlignment(Pos.CENTER_LEFT);
			
			Label lbElige;
			lbElige = new Label("Elige el color:");
			lbElige.setFont(Font.font(20));
			
			ColorPicker cpColor = new ColorPicker(Color.BLUE);
						
			raiz.getChildren().addAll(lbElige, cpColor);
			
			Scene escena = new Scene(raiz, 400, 120);
			escenarioPrincipal.setTitle("Selector de color");
			escenarioPrincipal.setScene(escena);
			escenarioPrincipal.show();
			final ColorPicker colorPicker = new ColorPicker();
			 colorPicker.setOnAction(new EventHandler() {
			     @Override
				public void handle(Event t) {
			         Color c = colorPicker.getValue();
			         System.out.println("New Color's RGB = "+c.getRed()+" "+c.getGreen()+" "+c.getBlue());
			     }
			 });
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	

	public static void main(String[] args) {
		launch(args);
	}

}
