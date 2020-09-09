package com.vanessa.Netflix;

public class Pelicula extends PiezaAudiovisual implements IVisualizable{
	private int anio;
	
	public Pelicula(String titulo, String genero, String creador, int duracion, boolean visto, int anio) {
		super(titulo, genero, creador, duracion, visto);
		// TODO Auto-generated constructor stub
		this.anio = anio;
	}	

	public int getAnio() {
		return anio;
	}
	public void setAnio(int anio) {
		this.anio = anio;
	}

	@Override
	public void marcarVisto() {
		// TODO Auto-generated method stub
		setVisto(true);
	}

	@Override
	public void esVisto() {
		// TODO Auto-generated method stub
		System.out.println(isVisto());	
	}

	@Override
	public void tiempoVisto() {
		// TODO Auto-generated method stub
		System.out.println(getDuracion());
	}

	@Override
	public String toString() {
		return super.toString() + " anio= " + anio;
	}
}
