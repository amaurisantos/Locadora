import java.util.Scanner;

public class Locacao {
	private String filme;
	private String dataLocacao;
	private String nomeSocio;
	
	Scanner ler = new Scanner(System.in);
	
	public String getFilme() {
		return filme;
	}
	public void setFilme(String filme) {
		System.out.println("Nome do filme locado");
		this.filme = ler.nextLine();
	}
	public String getDataLocacao() {
		return dataLocacao;
	}
	public void setDataLocacao(String dataLocacao) {
		System.out.println("Digite a data de loca��o");
		this.dataLocacao = ler.nextLine();
	}
	public String getNomeSocio() {
		return nomeSocio;
	}
	public void setNomeSocio(String nomeSocio) {
		System.out.println("Digite o nome do s�cio");
		this.nomeSocio = ler.nextLine();
	}
	
	
}
