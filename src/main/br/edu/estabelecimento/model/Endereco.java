package main.br.edu.estabelecimento.model;

public class Endereco {
	private String rua;
	private String numero;
	private String bairro;
	private String cidade;
	private String estado;
	private String cep;

//-----------------------Construtores-----------------------
	public Endereco(){
		rua = "";
		numero = "";
		bairro = "";
		cidade = "";
		estado = "";
		cep = "";
	}

	public Endereco(String rua, String numero, String bairro, String cidade, String estado, String cep){
		this.rua = rua;
		this.numero = numero;
		this.bairro = bairro;
		this.cidade = cidade;
		this.estado = estado;
		this.cep = cep;
	}
	
//----------------------- Getters -----------------------
	public String getRua() {
		return rua;
	}
	public String getNumero() {
		return numero;
	}
	public String getBairro() {
		return bairro;
	}
	public String getCidade() {
		return cidade;
	}
	public String getEstado() {
		return estado;
	}
	public String getCep() {
		return cep;
	}

//----------------------- Setters -----------------------
	public void setRua(String rua){
		this.rua = rua;
	}
	public void setNumero(String numero){
		this.numero = numero;
	}
	public void setBairro(String bairro){
		this.bairro = bairro;
	}
	public void setCidade(String cidade){
		this.cidade = cidade;
	}
	public void setEstado(String estado){
		this.estado = estado;
	}
	public void setCep(String cep){
		this.cep = cep;
	}
}