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
			System.out.println("3 - Cadastrar Cópia");
			System.out.println("4 - Listar Cópias");
			System.out.println("5 - Cadastrar Sócio");
			System.out.println("6 - Listar Sócios");
			System.out.println("7 - Cadastrar Locação");
			System.out.println("8 - Listar Locações");
			System.out.println("Escolha uma opção");
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
					System.out.println("Duração: " +f.getDuracao());
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
					System.out.println("Número: " + c.getNumero());
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
					System.out.println("Endereço: " +s.getEndereco());
					System.out.println("RG: " +s.getRg());
					System.out.println("CPF: " +s.getCpf());
					System.out.println("Data Adesão: " +s.getDataAdesao());
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
					System.out.println("Data Locação: " +l.getDataLocacao());
					System.out.println("Sócio: " +l.getNomeSocio());
				}
				break;
			}
		}while (opcao != 0);
	}

}
