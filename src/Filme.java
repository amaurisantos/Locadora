import java.util.List;
import java.util.Scanner;

public class Filme {
	private String titulo;
	private String duracao;
	private int ano;
	private String formato;
	private String atores;
	
	Scanner ler = new Scanner(System.in);
	
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		System.out.println("Digite o titulo: \n" );
		this.titulo = ler.nextLine();
	}
	public String getDuracao() {
		return duracao;
	}
	public void setDuracao(String duracao) {
		System.out.println("Digite a duração do filme: \n" );
		this.duracao = ler.nextLine();
	}
	public int getAno() {
		return ano;
	}
	public void setAno(int ano) {
		System.out.println("Digite o ano do filme: \n" );
		this.ano = ler.nextInt();
	}
	public String getFormato() {
		return formato;
	}
	public void setFormato(String formato) {
		System.out.println("Digite o formato do filme: \n" );
		this.formato = ler.nextLine();
	}
	public String getAtores() {
		return atores;
	}
	public void setAtores(String atores) {
		System.out.println("Digite os nome dos principais atores: \n" );
		this.atores = ler.nextLine();
	}
	
	

}
