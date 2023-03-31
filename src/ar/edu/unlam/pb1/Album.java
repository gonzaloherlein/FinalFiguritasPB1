package ar.edu.unlam.pb1;

public class Album {
	
	private String selecciones[] = {"Qatar", "Ecuador", "Senegal", "Paises Bajos", "Inglaterra", "Ir�n", "EEUU", "Gales", "Argentina", "Arabia Saudita", "M�xico", "Polonia", "Francia", "Australia", "Dinamarca", "Tunez", "Espa�a", "Costa Rica", "Alemania", "Jap�n", "B�lgica", "Canad�", "Marruecos", "Croacia", "Brasil", "Serbia", "Suiza", "Camer�n", "Portugal", "Ghana", "Uruguay", "Corea del Sur"};
	
	private static Figurita figuritasDisponibles[] = new Figurita[704];
	private Figurita figuritasActuales[];
	
	public Album() {
		/*
		 * El constructor debe generar las condiciones necesaias para garantizar el correcto funcionamiento de la app
		 */
	}
	
	public static void inicializarCodigosDeFiguritas() {
		/*
		 * Por cada pa�s debe generar 22 c�digos de manera autom�tica por ejemplo QAT1, URU12, COS10
		 */

	}
	
	public static void actualizarDatosFigurita(String codigo, char grupo, String nombreJugador, double valor) {
		/*
		 * En funci�n del c�digo de figurita, se deben actualizar los datos de la misma en figuritasDisponibles 
		 */
	}
	
	public static Figurita getFigurita(String codigo) {
		/*
		 * En funci�n del c�digo de figurita, devuelve la figurita de figuritasDisponibles
		 */
		return null;
	}
	
	public Figurita[] comprarSobre() {
		/*
		 * Se debe calcular y devolver 5 c�digos de figurita de manera aleatoria.
		 */
		Figurita sobre[] = new Figurita[5];
		
		return sobre;
	}
	
	public void agregarFigurita(Figurita nueva) {
		/*
		 * Agrega una nueva figurita al array figuritasActuales
		 */
	}
	
	public void ordenarFiguritasActuales() {
		/*
		 * Debe ordenar el array figuritasActuales
		 */
	}
	
	public boolean elAlbumEstaCompleto() {
		/*
		 * Debe verificar que todas las figuritas disponibles est�n presentes al menos una vez en las figuritas actuales 
		 */		
		return false;
	}
	
	public double calcularPorcentajeCompletado() {
		/*
		 * Debe calcular el porcentaje de figuritas del album que est� completo. Para esto se debe basar en la informaci�n de las figuritasDisponibles en relaci�n a las figuritasActuales que se tiene en el album.
		 */
		return 0.0;
	}

	
	
	
	
	
	
	
	
	
	
}
