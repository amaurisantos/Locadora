import java.util.Scanner;

public class Copia {
	private int numero;
	private String filme;
	Scanner ler = new Scanner(System.in);
	public int getNumero() {
		return numero;
	}
	public void setNumero(int numero) {
		System.out.println("Digite o número \n");
		this.numero = ler.nextInt();
	}
	public String getFilme() {
		return filme;
	}
	public void setFilme(String filme) {
		System.out.println("Digite o nome do filme \n");
		this.filme = ler.nextLine();
	}
	
	
}
