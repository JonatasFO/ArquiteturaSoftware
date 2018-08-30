package br.usjt.cadastrofilmes.beans;

public class Filmes {
	private int id;
	private String titulo;
	private int anoLancamento;

	public Filmes() {
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getId() {
		return id;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setAnoLancamento(int anoLancamento) {
		this.anoLancamento = anoLancamento;
	}

	public int getAnoLancamento() {
		return anoLancamento;
	}
}
