package main.br.edu.estabelecimento.model;

public abstract class Pessoa {

	private String nome;
	private String cpf;
	private String dataNascimento;
	private String sexo;

	private Endereco endereco;

//-----------------------Construtores-----------------------
	public Pessoa () {
		nome = "";
		cpf = "";
		dataNascimento = "";
		sexo = "";
		endereco = new Endereco();
	}

	public Pessoa (String nome, String cpf, String dataNascimento, String sexo, Endereco endereco) {
		this.nome = nome;
		this.cpf = cpf;
		this.dataNascimento = dataNascimento;
		this.sexo = sexo;
		this.endereco = endereco;
	}
	
	
//----------------------- Getters -----------------------
	public String getNome() {
		return nome;
	}

	public String getCpf() {
		return cpf;
	}

	public String getDataNascimento() {
		return dataNascimento;
	}

	public String getSexo() {
		return sexo;
	}

	public Endereco getEndereco(){
		return endereco;
	}

////----------------------- Setters -----------------------
	
	public final void setNome(String nome){
		this.nome = nome;
	}
	
	public final void setCpf(String cpf){
		this.cpf = cpf;
	}

	public final void setDataNascimento(String dataNascimento){
		this.dataNascimento = dataNascimento;
	}

	public final void setSexo(String sexo){
		this.sexo = sexo;
	}
	
	public final void setEndereco(Endereco endereco){
		this.endereco = endereco;
	}

}