package com.vanessa.Netflix;

public class PiezaAudiovisual {
	private String titulo;
	private String genero;
	private String creador;
	private int duracion;
	private boolean visto = false;
	
	public PiezaAudiovisual(String titulo, String genero, String creador, int duracion, boolean visto) {
		this.titulo = titulo;
		this.genero = genero;
		this.creador = creador;
		this.duracion = duracion;
		this.visto = visto;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getGenero() {
		return genero;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}

	public String getCreador() {
		return creador;
	}

	public void setCreador(String creador) {
		this.creador = creador;
	}

	public int getDuracion() {
		return duracion;
	}

	public void setDuracion(int duracion) {
		this.duracion = duracion;
	}

	public boolean isVisto() {
		return visto;
	}

	public void setVisto(boolean visto) {
		this.visto = visto;
	}

	@Override
	public String toString() {
		return "titulo=" + titulo + ", genero=" + genero + ", creador=" + creador + ", duracion="
				+ duracion + ", visto=" + visto;
	}
}
