package mocklabjava;

public class PilhaDAO implements IPilhaDAO{

	@Override
	public void save(Pilha pilha) {
		// Chamei getconn
		// Inicializo o que for necessario
		System.out.println("Salvei a pilha no BD");
	}
	
}
