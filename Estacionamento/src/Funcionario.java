import org.apache.commons.codec.digest.DigestUtils;


public class Funcionario extends Pessoa implements Autenticavel{
	private String login;
	private String senha;
	private String nivel;
	
	Funcionario(){
		
	}
	Funcionario(String nome, String cpf){
		super(nome,cpf);
	}

	public void setLogin(String login) {
		this.login = login;
	}

	public String getLogin() {
		return login;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

	public String getSenha() {
		return senha;
	}

	public void setNivel(String nivel) {
		this.nivel = nivel;
	}

	public String getNivel() {
		return nivel;
	}
	/*public void  cadastrarUsuario() {
		if((this.equals(login)!=this.equals(login))&&(this.equals(senha)!=this.equals(senha))){
			System.out.println("Cadastrar novo funcionario");
		}else{
			System.out.println("funcionario ja cadastrado");
		}
	}*/

	public boolean autenticar(String senhaAtual) {
		String senhaAtualMD5 = DigestUtils.md5Hex(senhaAtual);
		
		if(senhaAtualMD5.equals(this.senha)) {
			System.out.println("Senha correta.");
			return true;
		}
		else {
			System.out.println("Senha incorreta.");
			return false;
		}
	
	}
	
}
