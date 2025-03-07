// Análisis (completar)
// Descripción del programa:
// Entradas:
// Salidas:
// Ejemplo:


package ui; // No olvidar especificar el paquete / carpeta de nuestro programa

import java.util.Scanner; // Para poder usar Scanner, debemos importarlo

public class AtlasPuntuaciones {

	// Declaración del Escaner que nos ayudará en todo el programa
	private Scanner escaner;

	static final int CANTIDAD_JUGADORES = 10;
	static final int CANTIDAD_RONDAS = 5;

	
	// Declaración de nuestras constantes a utilizar


	private AtlasPuntuaciones() {
		escaner = new Scanner(System.in);
	}
	
	
	public void run()
	{
	boolean flag = true;
	int cantidad_jugadores = 0;
	while (flag) {
		System.out.println("Ingrese la cantidad de jugadores (Maximo 10)");
		cantidad_jugadores = escaner.nextInt();
		flag = comprobarMaximo(cantidad_jugadores, CANTIDAD_JUGADORES);
		}
	

	flag = true;
	int cantidad_rondas = 0;
	while (flag){
	System.out.println("Ingrese el numero de rondas");
		cantidad_rondas[i] = escaner.nextInt();
		flag = atlas.comprobarMaximo(cantidad_rondas,CANTIDAD_RONDAS);
	}

	

	//Arreglo de los puntajes de los jugadores
	int [] jugadores = new int[cantidad_jugadores];
	double[] promJugadores = new double[cantidad_Jugadores];

	atlas.entradaDePuntajes(cantidad_jugadores,cantidad_rondas,jugadores);
	atlas.promedio(promJugadores, jugadores);
	System.out.println("Resultados del torneo:");
	int jugadorPuntuacionMasAlta = atlas.mostrarResultados(jugadores, promjugaores);
	System.out.println("El jugador con la puntuacion mas alta es: Jugador " + jugadorPuntuacionMasAlta);


	
	
		int cantidad_jugadores;
		int[] numeroderondas = new int[CANTIDAD_RONDAS];
		int[] puntaje = new int[CANTIDAD_RONDAS];

		for(int i = 0; i < CANTIDAD_JUGADORES; i++){
		System.out.println("Ingrese la cantidad de jugadores");
		cantidad_jugadores[i] = escaner.nextInt();
		}

		for(int i = 0; i < CANTIDAD_RONDAS; i++){
		System.out.println("Ingrese el numero de rondas");
		cantidad_rondas[i] = escaner.nextInt();
		// Declaracion de todas las variables a usar en el programa


		// Notificacion al usuario de la solicitud de dato

		// Capturamos el dato con nuestro Scanner (que se llama, escaner)



		// Realizamos los cálculos delegandolos a los métodos


		// Notificación al usuario de los resultados


	}
	}

	public static void main(String[] args) {
		AtlasPuntuaciones mainApp = new AtlasPuntuaciones();
		mainApp.run();
	}

	/**
	 * Descripción: El método calcularSumaTotal permite sumar y guardar los puntajes de los jugadores
	 * @param int cantidadJugadores
	 * @param int cantidadRondas
	 * @param int[] jugadores
	 * 
	 * @return 
	 */
    public int calcularSumaTotal(int[] numeros) {
        // Completar
    }

	/**
	 * Descripción: El método calcularPromedio permite ...
	 * @param int[] numeros
	 * @return 
	 */
    public double calcularPromedio(int[] numeros) {
        // Completar
    }

	/**
	 * Descripción: El método encontrarMayor permite ...
	 * @param double[] numeros
	 * @return 
	 */
    public double encontrarMayor(double[] numeros) {
        // Completar
    }

	
}