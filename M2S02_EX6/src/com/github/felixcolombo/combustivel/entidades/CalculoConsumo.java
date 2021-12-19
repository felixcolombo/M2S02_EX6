package com.github.felixcolombo.combustivel.entidades;

public class CalculoConsumo{
	
	private double valorCombustivel;
	private double autonomiaCombustivel;
	private double rodagemMedia;
	private double totalConsumo;

	
	public double CalculoConsumo(double valorCombustivel, double autonomiaCombustivel, double rodagemMedia) {
		
		this.setValorCombustivel(valorCombustivel);
		this.setAutonomiaCombustivel(autonomiaCombustivel);
		this.setRodagemMedia(rodagemMedia);
		
		setTotalConsumo(((rodagemMedia/autonomiaCombustivel)*valorCombustivel));
		return totalConsumo;
		
	}

	public double getValorCombustivel() {
		return valorCombustivel;
	}

	public void setValorCombustivel(double valorCombustivel) {
		this.valorCombustivel = valorCombustivel;
	}

	public double getAutonomiaCombustivel() {
		return autonomiaCombustivel;
	}

	public void setAutonomiaCombustivel(double autonomiaCombustivel) {
		this.autonomiaCombustivel = autonomiaCombustivel;
	}

	public double getRodagemMedia() {
		return rodagemMedia;
	}

	public void setRodagemMedia(double rodagemMedia) {
		this.rodagemMedia = rodagemMedia;
	}

	public double getTotalConsumo() {
		return totalConsumo;
	}

	public void setTotalConsumo(double totalConsumo) {
		this.totalConsumo = totalConsumo;
	}


}