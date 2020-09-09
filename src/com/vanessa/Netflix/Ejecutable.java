package com.vanessa.Netflix;

public class Ejecutable {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Crear arreglo de peliculas y cargarlo
		Pelicula[] arregloPeliculas = new Pelicula[5];
		Pelicula pelicula1 = new Pelicula("Harry Potter y el prisionero de Azkaban", "Fantasia", "Alfonso Cuaron", 142, false, 2004);
		arregloPeliculas[0] = pelicula1;
		Pelicula pelicula2 = new Pelicula("Chinatown", "Drama", "John Willis", 135, false, 1975);
		arregloPeliculas[1] = pelicula2;
		Pelicula pelicula3 = new Pelicula("Tiburon", "Suspenso", "David Phil", 120, false, 1991);
		arregloPeliculas[2] = pelicula3;
		Pelicula pelicula4 = new Pelicula("El hombre elefante", "Drama", "David Lynch", 131, false, 1977);
		arregloPeliculas[3] = pelicula4;
		Pelicula pelicula5 = new Pelicula("Chinatown", "Drama", "John Willis", 135, false, 1975);
		arregloPeliculas[4] = pelicula5;
		
		//Crear arreglo de series y cargarlo
		Serie[] arregloSeries = new Serie[5];
		Serie serie1 = new Serie("Miss Fisher", "Comedia" , "Essie Davis", 51, false, 1);
		arregloSeries[0] = serie1;
		Serie serie2 = new Serie("Friends", "Comedia" , "Courtney Cox", 22, false, 10);
		arregloSeries[1] = serie2;
		Serie serie3 = new Serie("Breaking bad", "Drama" , "James Gilliham", 59, false, 5);
		arregloSeries[2] = serie3;
		Serie serie4 = new Serie("True detective", "Suspenso" , "Joe Williams", 51, false, 2);
		arregloSeries[3] = serie4;
		Serie serie5 = new Serie("Bojack Horseman", "Animado" , "Robert Jones", 30, false, 4);
		arregloSeries[4] = serie5;
		
		//Marcar peliculas y series como vistas
		pelicula3.marcarVisto();
		serie2.marcarVisto();
		serie4.marcarVisto();
		
		//Mostrar peliculas y series visualizadas
		for (int i=0; i<5; i++) {
			if (arregloPeliculas[i].isVisto()) {
				System.out.println(arregloPeliculas[i].getTitulo() + " Duracion: " + arregloPeliculas[i].getDuracion());
			}
		}
		for (int i=0; i<5; i++) {
			if (arregloSeries[i].isVisto()) {
				System.out.println(arregloSeries[i].getTitulo() + " Duracion: " + arregloSeries[i].getDuracion());
			}
		}
		
		//Serie con mas temporadas
		int indiceMasTemporadas = 0;
		for (int i=1; i<5; i++) {
			if (arregloSeries[i].getNroDeTemporadas()>arregloSeries[indiceMasTemporadas].getNroDeTemporadas()) {
				indiceMasTemporadas = i;
			}
		}
		System.out.println("La serie con mas temporadas es: " + arregloSeries[indiceMasTemporadas].toString());
		
		//Pelicula mas reciente
		int indiceMasReciente = 0;
		for (int i=1; i<5; i++) {
			if (arregloPeliculas[i].getAnio()>arregloPeliculas[indiceMasReciente].getAnio()) {
				indiceMasReciente = i;
			}
		}
		System.out.println("La pelicula mas reciente es: " + arregloPeliculas[indiceMasReciente].toString());
		
	}
}
