
public abstract class Pessoa {
	private String nome;
	private String cpf;
	
	Pessoa(String nome, String cpf){
		this.nome = nome;
		this.cpf = cpf;
	}
	Pessoa(){
		this.nome = "";
		this.cpf = "";
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getNome() {
		return nome;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public String getCpf() {
		return cpf;
	}
	
	
}
