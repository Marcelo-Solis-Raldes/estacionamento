
public class Conta {
	private Veiculo []Veiculo;
	private Cliente []Cliente;
	private String data;
	private String horaChegada;
	private String horaSaida;
	private double valor;
	private boolean paga;
	
	public Veiculo[] getVeiculo() {
		return Veiculo;
	}
	public void setVeiculo(Veiculo[] veiculo) {
		Veiculo = veiculo;
	}
	public Cliente[] getCliente() {
		return Cliente;
	}
	public void setCliente(Cliente[] cliente) {
		Cliente = cliente;
	}
	public String getData() {
		return data;
	}
	public void setData(String data) {
		this.data = data;
	}
	public String getHoraChegada() {
		return horaChegada;
	}
	public void setHoraChegada(String horaChegada) {
		this.horaChegada = horaChegada;
	}
	public String getHoraSaida() {
		return horaSaida;
	}
	public void setHoraSaida(String horaSaida) {
		this.horaSaida = horaSaida;
	}
	public double getValor() {
		return valor;
	}
	public void setValor(double valor) {
		this.valor = valor;
	}
	public boolean isPaga() {
		return paga;
	}
	public void setPaga(boolean paga) {
		this.paga = paga;
	}
	
	
}
