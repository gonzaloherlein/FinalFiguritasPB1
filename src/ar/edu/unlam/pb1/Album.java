package ar.edu.unlam.pb1;

import java.util.Random;

public class Album {

	private static String[] selecciones = { "Qatar", "Ecuador", "Senegal", "Paises Bajos", "Inglaterra", "Ir�n", "EEUU",
			"Gales", "Argentina", "Arabia Saudita", "M�xico", "Polonia", "Francia", "Australia", "Dinamarca", "Tunez",
			"Espa�a", "Costa Rica", "Alemania", "Jap�n", "B�lgica", "Canad�", "Marruecos", "Croacia", "Brasil",
			"Serbia", "Suiza", "Camer�n", "Portugal", "Ghana", "Uruguay", "Corea del Sur" };

	private static Figurita figuritasDisponibles[] = new Figurita[704];
	private Figurita figuritasActuales[];

	public Album() {
		/*
		 * El constructor debe generar las condiciones necesaias para garantizar el
		 * correcto funcionamiento de la app
		 */
	}

	public Album(String[] selecciones, Figurita[] figuritasDisponibles, Figurita[] figuritasActuales) {
		this.selecciones = selecciones;
		Album.figuritasDisponibles = figuritasDisponibles;
		this.figuritasActuales = figuritasActuales;
	}

	public static void inicializarCodigosDeFiguritas() {
		/*
		 * Por cada pais debe generar 22 codigos de manera automotica por ejemplo QAT1,
		 * URU12, COS10
		 */
		for (int i = 0; i < selecciones.length; i++) {
			String pais = selecciones[i];
			for (int j = 1; j < 22; j++) {
				String codigo = pais + j;
			}
		}

	}

	public static void actualizarDatosFigurita(String codigo, char grupo, String nombreJugador, double valor) {
		/*
		 * En funci�n del c�digo de figurita, se deben actualizar los datos de la misma
		 * en figuritasDisponibles
		 */
		for (int i = 0; i < figuritasDisponibles.length; i++) {
			if (figuritasDisponibles[i].getCodigo().equals(codigo)) {
				figuritasDisponibles[i].setGrupo(grupo);
				figuritasDisponibles[i].setNombreJugador(nombreJugador);
				figuritasDisponibles[i].setValor(valor);
			}
		}

	}

	public static Figurita getFigurita(String codigo) {
		/*
		 * En funci�n del c�digo de figurita, devuelve la figurita de
		 * figuritasDisponibles
		 */
		Figurita figurita = null;

		for (int i = 0; i < figuritasDisponibles.length; i++) {
			if (figuritasDisponibles[i].getCodigo().equals(codigo)) {
				return figurita;
			}
		}
		return null;
	}

	public Figurita[] comprarSobre() {
		/*
		 * Se debe calcular y devolver 5 codigos de figurita de manera aleatoria.
		 */
		Figurita sobre[] = new Figurita[5];
		Random rand = new Random();
		
		for (int i = 0; i < sobre.length; i++) {
			String seleccion = selecciones[rand.nextInt(selecciones.length)];
			int numero = rand.nextInt(22) + 1;
			String codigo = seleccion + numero;
			sobre[i].setCodigo(codigo);
		}
		
		return sobre;
	}

	public void agregarFigurita(Figurita nueva) {
		/*
		 * Agrega una nueva figurita al array figuritasActuales
		 */
		for (int i = 0; i < figuritasActuales.length; i++) {
			if (figuritasActuales[i] == null) {
				figuritasActuales[i] = nueva;
			}
		}

	}

	public void ordenarFiguritasActuales() {
		/*
		 * Debe ordenar el array figuritasActuales
		 */
		Figurita auxiliar = null;
		auxiliar = figuritasActuales[0];
		for (int i = 1; i < figuritasActuales.length; i++) {
			for (int j = 0; j < figuritasActuales.length - 1; j++) {
				if (figuritasActuales[j] != null && figuritasActuales[j + 1] != null) {
					if (figuritasActuales[j].getCodigo().compareTo(figuritasActuales[j + 1].getCodigo()) == 1) {
						auxiliar = figuritasActuales[j];
						figuritasActuales[j] = figuritasActuales[j+1];
						figuritasActuales[j+1] = auxiliar;
					}
				}
			}
		}

	}
	
	public void mostrarFiguritasOrdenadas() {
		for (int i = 0; i < figuritasActuales.length; i++) {
			if(figuritasActuales[i] != null ) {
				System.out.println(figuritasActuales[i].toString());
			}
		}
	}

	public boolean elAlbumEstaCompleto() {
		/*
		 * Debe verificar que todas las figuritas disponibles est�n presentes al menos
		 * una vez en las figuritas actuales
		 */
		for (int i = 0; i < figuritasDisponibles.length; i++) {
			if(figuritasDisponibles.length == 0) {
				return true;
			}
		}
		
		return false;
	}

	public double calcularPorcentajeCompletado() {
		/*
		 * Debe calcular el porcentaje de figuritas del album que est� completo. Para
		 * esto se debe basar en la informaci�n de las figuritasDisponibles en relaci�n
		 * a las figuritasActuales que se tiene en el album.
		 */
		
		return ((figuritasActuales.length * 100)/figuritasDisponibles.length);
	}

}
