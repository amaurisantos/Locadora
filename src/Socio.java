import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

public class Socio {
	
	private String nome;
	private String endereco;
	private int telefone;
	private String rg;
	private String cpf;
	private String dataAdesao;
	Scanner ler = new Scanner(System.in);
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		System.out.println("Digite o nome");
		this.nome = ler.nextLine();
	}
	public String getEndereco() {
		return endereco;
	}
	public void setEndereco(String endereco) {
		System.out.println("Digite o endereço");
		this.endereco = ler.nextLine();
	}
	public int getTelefone() {
		return telefone;
	}
	public void setTelefone(int telefone) {
		System.out.println("Digite o telefone");
		this.telefone = ler.nextInt();
	}
	public String getRg() {
		return rg;
	}
	public void setRg(String rg) {
		System.out.println("Digite o RG");
		this.rg = ler.nextLine();
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		System.out.println("Digite o CPF");
		this.cpf = ler.nextLine();
	}
	public String getDataAdesao() {
		return dataAdesao;
	}
	public void setDataAdesao(String dataAdesao) {
		System.out.println("Digite a data de adesão");
		this.dataAdesao = ler.nextLine();
	}
	
	
	
}
