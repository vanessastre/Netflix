package com.vanessa.Netflix;

public class Serie extends PiezaAudiovisual implements IVisualizable{
	private int nroDeTemporadas = 1;

	public Serie(String titulo, String genero, String creador, int duracion, boolean visto, int nroDeTemporadas) {
		super(titulo, genero, creador, duracion, visto);
		// TODO Auto-generated constructor stub
		this.nroDeTemporadas = nroDeTemporadas;
	}

	public int getNroDeTemporadas() {
		return nroDeTemporadas;
	}

	public void setNroDeTemporadas(int nroDeTemporadas) {
		this.nroDeTemporadas = nroDeTemporadas;
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
		return super.toString() + " nro de temporadas= " + nroDeTemporadas;
	}	
}
