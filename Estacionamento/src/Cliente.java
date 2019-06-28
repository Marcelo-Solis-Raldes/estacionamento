
public class Cliente extends Pessoa{
	private String telefone;
	
	Cliente(String nome, String cpf){
		super(nome,cpf);
	}
	
	Cliente(){
		this.setTelefone("");
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public String getTelefone() {
		return telefone;
	}
public void  cadastrarCliente() {
		if((this.equals(getNome())!=this.equals(getNome()))&&(this.equals(getCpf()))!=this.equals(getCpf())){
			System.out.println("cadastrar novo cliente"); 
		}else{
			System.out.println("Cliente ja cadastrado");
		}
	}
}
