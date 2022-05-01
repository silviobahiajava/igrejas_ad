package br.com.missaoefe.enums;

public enum Cargo {
	
	COOPERADOR("COOPERADOR"),DIACONO("DIACONO"),EVANGELISTA("EVANGELISTA"),
	PRESBITERO("PRESBITERO"),PASTOR("PASTOR"),BISPO("BISPO"),DIACONIZA("DIACONIZA");
	private String descricao;
	private Cargo(String descricao){
		this.descricao=descricao;
	}
	public String getDescricao() {
		return descricao;
	}
	
	
}
