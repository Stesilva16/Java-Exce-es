
//contrato autenticavel
//quem assina esse contrato, precisa implementar
//metodo setSenha
//metdod autentica

public abstract interface Autenticado {
	
	public abstract void setSenha(int senha);

	public abstract boolean autentica(int senha);
	

}
