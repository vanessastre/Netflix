package com.vanessa.Netflix;
import java.util.ArrayList;
public class Ejecutable {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Crear peliculas y colocarlas en ArrayList
		
		Pelicula pelicula1 = new Pelicula("Harry Potter y el prisionero de Azkaban", "Fantasia", "Alfonso Cuaron", 142, false, 2004);
		Pelicula pelicula2 = new Pelicula("Chinatown", "Drama", "John Willis", 135, false, 1975);
		Pelicula pelicula3 = new Pelicula("Tiburon", "Suspenso", "David Phil", 120, false, 1991);
		Pelicula pelicula4 = new Pelicula("El hombre elefante", "Drama", "David Lynch", 131, false, 1977);
		Pelicula pelicula5 = new Pelicula("Chinatown", "Drama", "John Willis", 135, false, 1975);
		
		ArrayList<Pelicula> peliculas = new ArrayList<Pelicula>();
		peliculas.add(pelicula1);
		peliculas.add(pelicula2);
		peliculas.add(pelicula3);
		peliculas.add(pelicula4);
		peliculas.add(pelicula5);
		
		//Crear series y colocarlas en ArrayList
		
		Serie serie1 = new Serie("Miss Fisher", "Comedia" , "Essie Davis", 51, false, 1);
		Serie serie2 = new Serie("Friends", "Comedia" , "Courtney Cox", 22, false, 10);
		Serie serie3 = new Serie("Breaking bad", "Drama" , "James Gilliham", 59, false, 5);
		Serie serie4 = new Serie("True detective", "Suspenso" , "Joe Williams", 51, false, 2);
		Serie serie5 = new Serie("Bojack Horseman", "Animado" , "Robert Jones", 30, false, 4);
		
		ArrayList<Serie> series = new ArrayList<Serie>();
		series.add(serie1);
		series.add(serie2);
		series.add(serie3);
		series.add(serie4);
		series.add(serie5);
		
		//Marcar peliculas y series como vistas
		try {
			peliculas.get(3).marcarVisto();
			series.get(2).marcarVisto();
			series.get(4).marcarVisto();
		}catch (ArrayIndexOutOfBoundsException e) {
			// TODO: handle exception
			System.out.println("No se puede acceder a ese espacio");
		}finally {
			System.out.println();
		}
		
		//Mostrar peliculas y series visualizadas
		for (int i=0; i<peliculas.size(); i++) {
			if (peliculas.get(i).isVisto()) {
				System.out.println(peliculas.get(i).getTitulo() + " Duracion: " + peliculas.get(i).getDuracion());
			}
		}
		for (int i=0; i<series.size(); i++) {
			if (series.get(i).isVisto()) {
				System.out.println(series.get(i).getTitulo() + " Duracion: " + series.get(i).getDuracion());
			}
		}
		
		//Serie con mas temporadas
		int indiceMasTemporadas = 0;
		for (int i=1; i<series.size(); i++) {
			if (series.get(i).getNroDeTemporadas()>series.get(indiceMasTemporadas).getNroDeTemporadas()){
				indiceMasTemporadas = i;
			}
		}
		System.out.println("La serie con mas temporadas es: " + series.get(indiceMasTemporadas).toString());
		
		//Pelicula mas reciente
		int indiceMasReciente = 0;
		for (int i=1; i<peliculas.size(); i++) {
			if (peliculas.get(i).getAnio()>peliculas.get(indiceMasReciente).getAnio()) {
				indiceMasReciente = i;
			}
		}
		System.out.println("La pelicula mas reciente es: " + peliculas.get(indiceMasReciente).toString());
		
	}
}
