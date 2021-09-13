
public class MediaDosAlunos {
	public static void main(String[] args) {
			
			AlunoA aluno1 = new AlunoA();
						
			aluno1.setNome("João");
			aluno1.setNota1(5);
			aluno1.setNota2(8);
			aluno1.setNota3(7);
			
			AlunoB aluno2 = new AlunoB();
			
			aluno2.setNome("Maria");
			aluno2.setNota1(4.5f);
			aluno2.setNota2(4);
			aluno2.setNota3(6);
			
			AlunoC aluno3 = new AlunoC();
			
			aluno3.setNome("Mario");
			aluno3.setNota1(7.5f);
			aluno3.setNota2(6);
			aluno3.setNota3(8);
			

			AlunoD aluno4 = new AlunoD();
			
			aluno4.setNome("Marcos");
			aluno4.setNota1(10);
			aluno4.setNota2(9.5f);
			aluno4.setNota3(9);
			
			AlunoE aluno5 = new AlunoE();
			
			aluno5.setNome("Luciene");
			aluno5.setNota1(10);
			aluno5.setNota2(9);
			aluno5.setNota3(8);
			
			
			System.out.println("AlunoA : " + aluno1.getNome()+
					"\n" + 
					"Media : " + aluno1.calcularMedia()
			);
			
			
			System.out.println("AlunoB : " + aluno2.getNome()+
					"\n" + 
					"Media : " + aluno2.calcularMedia()
			);
			
			System.out.println("AlunoC : " + aluno3.getNome()+
					"\n" + 
					"Media : " + aluno3.calcularMedia()
			);
			
			System.out.println("AlunoD : " + aluno4.getNome()+
					"\n" + 
					"Media : " + aluno4.calcularMedia()
			);
			
			System.out.println("AlunoE : " + aluno5.getNome()+
					"\n" + 
					"Media : " + aluno5.calcularMedia()
			);
			
			
			
		}
		}

		