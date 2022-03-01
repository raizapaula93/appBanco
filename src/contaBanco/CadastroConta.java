package contaBanco;

public class CadastroConta {

	public String numConta;

	protected String tipoConta; //- cc ou cp

	private  String dono;

	private double saldo;
	
	private boolean contaAberta = false;


	public boolean abrirConta;//
	public boolean fecharConta;//
	public boolean depositar;//itera em cima do saldo
	public boolean sacar;//itera em cima do saldo
	public boolean pagarMensal;// - itera em cima do saldo
	

	
	public String getNumConta() {
		return numConta;
	}

	public void setNumConta(String numConta) {
		this.numConta = numConta;
	}

	public String getTipoConta() {
		return this.tipoConta;
	}

	public void setTipoConta(String tipoConta) {
		this.tipoConta = tipoConta;
			if(this.tipoConta=="CC") {
				this.setSaldo(50.0);
			}
			if(this.tipoConta=="CP") {
				this.setSaldo(120.0);
			}
	}

	public String getDono() {
		return dono;
	}

	public void setDono(String dono) {
		this.dono = dono;
	}

	
	public double getSaldo() {
		return this.saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	
	public boolean getcontaAberta() {
		return this.contaAberta;
	}
	
	public void setcontaAberta(boolean contaAberta) {
		this.contaAberta = contaAberta;
	}
			
	public void abrirConta() {
		this.contaAberta = true;
			if (this.contaAberta == true) {
				System.out.println("Favor, cadastrar os dados da conta: ");
			}
	}
	
	public void fecharConta() {
		this.saldo=0.0;
		
			if (this.saldo>0.0){
				System.out.println("ERRO!Não é possível fechar a conta, favor fazer um saque");
			}
			if (this.saldo<0.0) {
				System.out.println("ERRO!Não é possível fechar a conta, favor cobrir o saldo devedor");
			}
			else {
				System.out.println("A conta está fechada.");
			}
			}
	public void status() {
		System.out.println("SOBRE A CONTA: "); 
		System.out.println("Nº da conta: " + this.getNumConta());
		System.out.println("Tipo de Conta: "+ this.getTipoConta());
		System.out.println("Dono: "+ getDono());
		System.out.println("Saldo " + getSaldo());
		System.out.println("A conta está aberta? " + getcontaAberta());
	}
}
	

