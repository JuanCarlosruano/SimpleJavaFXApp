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
import javafx.scene.control.Label;
import javafx.stage.Stage;

public class ApplicationLifecycleExample extends Application {
	@Override
	public void init() {
		System.out.println("Inicializando recursos...");
	}

	@Override
	public void start(Stage primaryStage) {
		System.out.println("Configurando la GUI...");
		Label label = new Label("Hola, JavaFX!");
		Scene scene = new Scene(label, 300, 200);
		primaryStage.setScene(scene);
		primaryStage.setTitle("Ciclo de Vida JavaFX");
		primaryStage.show();
	}

	@Override
	public void stop() {
		System.out.println("Liberando recursos...");
	}

	public static void main(String[] args) {
		System.out.println("Iniciando la aplicación...");
		launch(args);
		System.out.println("Aplicación finalizada.");
	}
}
