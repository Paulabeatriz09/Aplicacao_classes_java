
public class Conta {
	public String usuario;
	private float saldo;
	private String aberta;
	
	public Conta() { // metodo construtor
		this.aberta="Ativa";
		
	}
	
	public String getUsuario() {
		return this.usuario;
	}
	
	public void setUsuario(String u) {
		this.usuario=u;
	}
	
	public float getSaldo() {
		return this.saldo;
	}
	
	public void setSaldo(float s) {
		this.saldo=s;
	}
	
	
	public void status() {
		System.out.println("SOBRE A CONTA:");
		System.out.println("Usuário:"+this.usuario);
		System.out.println("Saldo:"+this.saldo);
		System.out.println("Situação da conta : "+this.aberta);
	}
}
