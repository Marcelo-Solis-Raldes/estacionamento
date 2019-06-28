
public abstract class Veiculo {
	private String marca;
	private String modelo;
	private String placa;
	private String cor;
	
	
	
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public String getModelo() {
		return modelo;
	}
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	public String getPlaca() {
		return placa;
	}
	public void setPlaca(String placa) {
		this.placa = placa;
	}
	public String getCor() {
		return cor;
	}
	public void setCor(String cor) {
		this.cor = cor;
	}
	public void  cadastrarVeiculo() {
		if(this.equals(placa)!=this.equals(placa)){
			System.out.println("Cadastrar Veiculo");
		}
		else{
		System.out.println("Veiculo ja Cadastrado");	
		}
	}
	public void exibirInfo() {
		System.out.println("Marca: " + this.marca);
		System.out.println("Cor: " + this.getCor());
		System.out.println("Modelo: "+this.modelo);
		System.out.println("Placa: "+this.placa);
	}
}
