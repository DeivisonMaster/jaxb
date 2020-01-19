package br.com.jaxb.model;

import java.util.List;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Carro {
	private String nome;
	private String portas;
	private List<Motorista> motoristas;
	
	public Carro() {
	}

	public Carro(String nome, String portas, List<Motorista> motoristas) {
		super();
		this.nome = nome;
		this.portas = portas;
		this.motoristas = motoristas;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getPortas() {
		return portas;
	}

	public void setPortas(String portas) {
		this.portas = portas;
	}

	public List<Motorista> getMotoristas() {
		return motoristas;
	}

	public void setMotoristas(List<Motorista> motoristas) {
		this.motoristas = motoristas;
	}
	
	
}
