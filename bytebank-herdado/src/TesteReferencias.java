
public class TesteReferencias {

	public static void main(String[] args) {
		
		Funcionario g1 = new Gerente();
		g1.setNome("Marcos");
		g1.setSalario(5000.0);
		
		Funcionario f = new Gerente();
		f.setSalario(2000.00);
		
		Funcionario ev = new EditorDeVideo();
		ev.setSalario(2500);
		
		Desgner d = new Desgner();
		d.setSalario(2000.0);


        ControleBonificacao controle = new ControleBonificacao();
        controle.registra(g1);
        controle.registra(f);
        controle.registra(ev);
        controle.registra(d);
        
        
        System.out.println(controle.getSoma());

	}

}
