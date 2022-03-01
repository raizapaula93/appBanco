package contaBanco;

public class appBanco {

	public static void main(String[] args) {
		CadastroConta conta1 = new CadastroConta();// instanciando o objeto
		CadastroConta conta2 = new CadastroConta();

		conta1.abrirConta();
		System.out.println("-------------");
		conta1.setNumConta("0001");
		conta1.setTipoConta("CC");
		conta1.setDono("Jubileu");
		conta1.status();

		System.out.println("-------------");
		conta2.abrirConta();
		conta2.setNumConta("0002");
		conta2.setTipoConta("CP");
		conta2.setDono("Creuza");
		System.out.println("-------------");
		conta2.status();

	}

}
