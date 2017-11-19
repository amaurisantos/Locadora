import java.util.ArrayList;
import java.util.Scanner;

public class Programa {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int opcao = 0;
		
		Filme f = new Filme();
		ArrayList<Filme> filmes = new ArrayList<>();
		
		Copia c = new Copia();
		ArrayList<Copia> copias = new ArrayList<>();
		
		Socio s = new Socio();
		ArrayList<Socio> socios = new ArrayList<>();
		
		Locacao l = new Locacao();
		ArrayList<Locacao> locacoes = new ArrayList<>();
		do{
			System.out.println("-------------------");
			System.out.println("1 - Cadastrar Filme");
			System.out.println("2 - Listar Filmes");
			System.out.println("3 - Cadastrar C�pia");
			System.out.println("4 - Listar C�pias");
			System.out.println("5 - Cadastrar S�cio");
			System.out.println("6 - Listar S�cios");
			System.out.println("7 - Cadastrar Loca��o");
			System.out.println("8 - Listar Loca��es");
			System.out.println("Escolha uma op��o");
			Scanner ler = new Scanner(System.in);
			opcao = ler.nextInt();
			switch(opcao){
			case 1:
				f.setTitulo(f.getTitulo());
				f.setDuracao(f.getDuracao());
				f.setFormato(f.getFormato());
				f.setAtores(f.getAtores());
				f.setAno(f.getAno());
				filmes.add(f);
				break;
			case 2:
				for(int i= 0;i<filmes.size();i++){
					System.out.println("Titulo: " +f.getTitulo());
					System.out.println("Dura��o: " +f.getDuracao());
					System.out.println("Formato: " +f.getFormato());
					System.out.println("Atores: " +f.getAtores());
					System.out.println("Ano: " +f.getAno());
				}
				break;
			case 3:
				c.setFilme(c.getFilme());
				c.setNumero(c.getNumero());
				copias.add(c);
				break;
			case 4:
				for (int i = 0;i < copias.size();i++){
					System.out.println("Filme: " + c.getFilme());
					System.out.println("N�mero: " + c.getNumero());
				}
				break;
			case 5:
				s.setNome(s.getNome());
				s.setEndereco(s.getEndereco());
				s.setRg(s.getRg());
				s.setCpf(s.getCpf());
				s.setDataAdesao(s.getDataAdesao());
				s.setTelefone(s.getTelefone());
				
				socios.add(s);
				break;
			
			case 6:
				for (int i = 0; i< socios.size();i++){
					System.out.println("Nome: " +s.getNome());
					System.out.println("Endere�o: " +s.getEndereco());
					System.out.println("RG: " +s.getRg());
					System.out.println("CPF: " +s.getCpf());
					System.out.println("Data Ades�o: " +s.getDataAdesao());
					System.out.println("Telefone: " +s.getTelefone());
				}
				break;
			case 7:
				l.setFilme(l.getFilme());
				l.setDataLocacao(l.getDataLocacao());
				l.setNomeSocio(l.getNomeSocio());
				
				locacoes.add(l);
				break;
			case 8:
				for(int i = 0;i < locacoes.size();i++){
					System.out.println("Filme: " +l.getFilme());
					System.out.println("Data Loca��o: " +l.getDataLocacao());
					System.out.println("S�cio: " +l.getNomeSocio());
				}
				break;
			}
		}while (opcao != 0);
	}

}
