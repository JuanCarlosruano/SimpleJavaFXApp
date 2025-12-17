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
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class SimpleJavaFXApp extends Application {
	 @Override
	 public void start(Stage primaryStage) {
	 // Crear los componentes de la interfaz
	 Label label = new Label("Presiona el botón para cambiar este mensaje.");
	 Button button = new Button("Haz clic aquí");
	 // Configurar la acción del botón
	 button.setOnAction(event -> label.setText("¡Botón presionado!"));
	 // Crear el contenedor y añadir los componentes
	 VBox layout = new VBox(10); // Espaciado de 10 píxeles entre los elementos
	 layout.getChildren().addAll(label, button);
	 // Crear la escena y establecerla en el escenario principal
	 Scene scene = new Scene(layout, 300, 200);
	 primaryStage.setTitle("Ejemplo Sencillo de JavaFX");
	 primaryStage.setScene(scene);
	 primaryStage.show();
	 }
	 public static void main(String[] args) {
	 launch(args); // Lanzar la aplicación
	 }

}
