/*
* Proyecto: SimpleJavaFXApp
* Paquete: vista
* Archivo: EditorHTML.java
* Autor: Alberto Martínez Cánovas
* Fecha: 16 dic 2025 8:39:04
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
import javafx.scene.layout.VBox;
import javafx.scene.web.HTMLEditor;
import javafx.stage.Stage;

public class EditorHTML extends Application {

	@Override
	public void start(Stage escenarioPrincipal) {
		try {
			VBox raiz = new VBox();
			raiz.setPadding(new Insets(40));
			raiz.setSpacing(10);
			
			HTMLEditor editor = new HTMLEditor();
			
			raiz.getChildren().addAll(editor);
			
			Scene escena = new Scene(raiz, 750, 400);
			escenarioPrincipal.setTitle("Editor HTML");
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