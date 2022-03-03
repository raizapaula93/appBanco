package contaBanco;

public class CadastroConta {
    //ATRIBUTOS

    public int numConta;
	
	protected String tipoConta; //- cc ou cp

	private  String dono;
		
	private double saldo;
	
	private boolean status;

    //METODOS ESPECIAIS
	public void estadoAtual(){
		System.out.println("-------------------");
		System.out.println("Conta: " + this.getNumConta());
		System.out.println("Tipo: " + this.getTipoConta());
		System.out.println("Dono: " + this.getDono());
		System.out.println("Saldo: " + this.getSaldo());
		System.out.println("Status: " + this.getStatus());

	}
	
		
	public void CadastroConta(){//construtor
			this.setSaldo(0);
			this.setStatus(false);
	}
	
	public int getNumConta() {
		return this.numConta;
	}

	public void setNumConta(int numConta) {
		this.numConta = numConta;
	}

	public String getTipoConta() {
		return this.tipoConta;
	}

	public void setTipoConta(String tipoConta) {
		this.tipoConta = tipoConta;
	}

	public double getSaldo() {
		return this.saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	public boolean getStatus() {
		return this.status;
	}

	public void setStatus(boolean status) {
		this.status = status;
	}

	public String getDono() {
		return this.dono;
	}

	public void setDono(String dono) {
		this.dono = dono;
	}
	
	//METODOS PERSONALIZADOS
	public void abrirConta(String t) {
		this.setTipoConta(t);
		this.setStatus(true);
        
		if (t == "CC") {

	      this.setSaldo(50);
		}
		else if(t == "CP"){

		  this.setSaldo(150);
		}
		System.out.println("Conta aberta com sucesso!");
	}	
	
	public void fecharConta() {
		if(this.getSaldo() >0){
			System.out.println("Conta com dinheiro");
		}else if (this.getSaldo() < 0) {
			System.out.println("Conta em débito");
		}else {
			this.setStatus(false);
			System.out.println("Conta fechada com sucesso!");
		}
	}
	public void depositar(double v) {
		if (this.getStatus()){
			this.setSaldo(this.getSaldo()+v);
			System.out.println("Depósito realizado na conta de " + this.getDono());
		}
		else{
			System.out.println("Impossível depositar em uma conta fechada");
		}
			
	}

	public void sacar(double v) {
		if (this.getStatus()){
			if(this.getSaldo()>=v){
				this.setSaldo(this.getSaldo()-v);
			}else{
				System.out.println("Saldo insuficiente");
			}
				
		}else{
			System.out.println("Impossível sacar");
	
		}	
	}
	public void pagarMensal() {
		int v=0;
		if (this.getTipoConta()== "CC") {
			v= 12;
		}
		else if(this.getTipoConta()=="CP") {
			v=20;
		}
        if (this.getStatus()){
			if(this.getSaldo()>=v){
				this.setSaldo(this.getSaldo()-v);
			}
			else{
				System.out.println("Saldo insuficiente");
				}
		{
			System.out.println("Impossível pagar uma conta fechada");	
		}
	}
}
}