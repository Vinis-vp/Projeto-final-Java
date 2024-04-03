
import javax.swing.JOptionPane;

public class DesafioFinal {
	
	
	static String [][] persa = new String[3][7];
	static String [][] siames = new String[3][7];
	static String [][] angora = new String[3][7];
	static String[] frase = {" Nome: ", " Comportamento: ", " Porte: ", " Peso: ", " Sexo: ", " Castrado: ", " Adotado: "};
	
	public static void main(String[] args) {
		
		JOptionPane.showMessageDialog(null, "Campanha adote um amigo!", "Software Adoção de Gatos", JOptionPane.INFORMATION_MESSAGE);
		cadastro();
		visualiza();
	}
	
	private static void cadastro() {
		
		JOptionPane.showMessageDialog(null, "Cadastros dos Gatos. \n(Realize o cadastro de no minimo 3 gatos para cada raça)");
		
		cadastroPersa();
		cadastrosiames();
		cadastroAngora();
	}
	private static void cadastroPersa() {
		JOptionPane.showMessageDialog(null, "	Gatos da raça Persa.	");
		for (int i=0; i<3; i++) {
			JOptionPane.showMessageDialog(null, (i+1) + "º Gato.");
			persa[i][0] = soliciataNome();
			persa[i][1] = solicitaComportamento();
			persa[i][2] = soliciaTamanho();
			persa[i][3] = solicitaPeso();
			persa[i][4] = solicitaSexo();
			persa[i][5] = solicitaCastrado();
			persa[i][6] = solicitaAdotado();
		}
	}
	private static void cadastrosiames() {
		JOptionPane.showMessageDialog(null, "	Gatos da raça Siames.	");
		for (int i=0; i<3; i++) {
			JOptionPane.showMessageDialog(null, (i+1) + "º Gato.");
			siames[i][0] = soliciataNome();
			siames[i][1] = solicitaComportamento();
			siames[i][2] = soliciaTamanho();
			siames[i][3] = solicitaPeso();
			siames[i][4] = solicitaSexo();
			siames[i][5] = solicitaCastrado();
			siames[i][6] = solicitaAdotado();
		}
	}
	private static void cadastroAngora() {
		JOptionPane.showMessageDialog(null, "	Gatos da raça Angora.	");
		for (int i=0; i<3; i++) {
			JOptionPane.showMessageDialog(null, (i+1) + "º Gato.");
			angora[i][0] = soliciataNome();
			angora[i][1] = solicitaComportamento();
			angora[i][2] = soliciaTamanho();
			angora[i][3] = solicitaPeso();
			angora[i][4] = solicitaSexo();
			angora[i][5] = solicitaCastrado();
			angora[i][6] = solicitaAdotado();
		}
	}
	private static String soliciataNome() {
		
		String nome = JOptionPane.showInputDialog("Informe o nome");
		
		return nome;
	}
	private static String solicitaComportamento () {
		
		String comportamento = JOptionPane.showInputDialog("Informe o comportamento do gato");
	
		return comportamento;
	}
	private static String soliciaTamanho () {
		
		String tamanho = "";
		
		int opcao = Integer.parseInt(JOptionPane.showInputDialog("Informe o porte do gato \n(1)Pequeno. \n(2)Médio. \n(3)Grande."));
		
		switch (opcao) {
		
			 case 1: 
				 tamanho = "Pequeno";
				 break;
			 case 2:
				 tamanho = "Médio";
				 break;
			 case 3:
				 tamanho = "Grande";
				 break;
			 default:
				 JOptionPane.showMessageDialog(null, "Informe uma opção válida!");
				 soliciaTamanho();
				 break;
		}
		
		return tamanho;
	}
	private static String solicitaPeso () {
		
		String peso = "";
		
		int opcao = Integer.parseInt(JOptionPane.showInputDialog("Informe a média de peso do gato \n(1) 3 a 6Kg. \n(2) 6 a 10Kg. \n(3) 10 a 14Kg."));
		
		switch (opcao) {
		
			case 1: 
				peso = "3 a 6Kg";
				 break;
			case 2:
				 peso = "6 a 10Kg";
				 break;
			case 3:
				 peso = "10 a 14Kg";
				 break;
			default:
				 JOptionPane.showMessageDialog(null, "Informe uma opção válida!");
				 solicitaPeso();
			break;
		}
		return peso;
	}
	private static String solicitaSexo () {
		
		String sexo;
		
		do {
			sexo = JOptionPane.showInputDialog(null, "Informe o Sexo (MACHO/FÊMEA)").toUpperCase();
			
		} while (sexo.equals("MACHO")!= true && sexo.equals("FÊMEA")!=true);
			
		return sexo;
	}
	private static String solicitaCastrado() {
		
		String castrado;

		do {
			castrado = JOptionPane.showInputDialog("O gato é castrado? (SIM/NÃO)").toUpperCase();
		} while (castrado.equals("SIM")!= true && castrado.equals("NÃO")!=true);
		
		return castrado;
	}
	private static String solicitaAdotado() {
		
		String adotado;
		do {
			adotado = JOptionPane.showInputDialog("O gato ja foi adotado? (SIM/NÃO)").toUpperCase();
			
		} while (adotado.equals("SIM")!= true && adotado.equals("NÃO")!=true);
		
		return adotado;
	}
	
	public static void visualiza() {
		
		int opcoes = Integer.parseInt(JOptionPane.showInputDialog("Qual das opções você deseja visualizar? \n(1)Todos os animais. \n(2)Animais por tamanho. "
				+ "\n(3)Animais por raça. \n(4)Animais por peso. \n(5)Animais por sexo. \n(6)Animais Castrados. \n(7)Animais disponiveis para adoção. \n(8)Encerrar Programa."));
		
		switch (opcoes) {
		
			case 1:
				todosAnimais();
				break;
			case 2:
				animaisPorTamanho();
				break;
			case 3:
				animaisPorRaca();
				break;
			case 4:
				animaisPorPeso();
				break;
			case 5:
				animaisPorSexo();
				break;
			case 6:
				animaisCastrados();
				break;
			case 7:
				animaisDisponiveis();
				break;
			case 8:
				encerra();
				break;
			default:
				JOptionPane.showMessageDialog(null, "Informe uma opção de visualização VÁLIDA!", "", JOptionPane.ERROR_MESSAGE);
				visualiza();
				break;
		}
	}
	private static void todosAnimais() {
		
		String todos="";
		
		for (int i=0; i<3; i++) {
			for (int j=0; j<7; j++) {
				todos+=" | "+frase[j]+ persa[i][j];
			}
			todos+="\n";
		}
		for (int i=0; i<3; i++) {
			for (int j=0; j<7; j++) {
				todos+=" | "+frase[j]+ siames[i][j];
			}
			todos+="\n";
		}
		for (int i=0; i<3; i++) {
			for (int j=0; j<7; j++) {
				todos+=" | "+frase[j]+ angora[i][j];
			}
			todos+="\n";
		}
		JOptionPane.showMessageDialog(null, todos);
		int continuar = Integer.parseInt(JOptionPane.showInputDialog("Escolha uma das opções. \n(1)Consultar de outra maneira. \n(2)Encerrar."));
		
		switch (continuar) {
			case 1:
				visualiza();
				break;
			case 2:
				encerra();
				break;
			default:
				error();
				break;
		}
	}
	private static void animaisPorTamanho() {
		
		int escolha;
		escolha = Integer.parseInt(JOptionPane.showInputDialog("Qual Porte deseja visualizar? \n(1)Pequeno.\n(2)Médio.\n(3)Grande."));
		
		switch (escolha) {
			case 1:
				String pequeno="";
				for (int i=0;i<3;i++) {
					if (persa[i][2].equals("Pequeno")==true) {	
						int iaux = i;
						for (int j=0;j<7;j++) {
							pequeno+=" | "+frase[j]+persa[iaux][j];
						}
						pequeno+="\n";
					}
					if (siames[i][2].equals("Pequeno")==true) {
						int iaux= i;
						for (int j=0;j<7;j++) {
							pequeno+=" | "+frase[j]+siames[iaux][j];
						}
						pequeno+="\n";
					}
					if (angora[i][2].equals("Pequeno")==true) {
						int iaux= i;
						for (int j=0;j<7;j++) {
							pequeno+=" | "+frase[j]+angora[iaux][j];
						}
						pequeno+="\n";
					}
				}
				JOptionPane.showMessageDialog(null, "Animais de Porte Pequeno \n"+pequeno);
				break;
			case 2:
				String medio="";
				for (int i=0;i<3;i++) {
					if (persa[i][2].equals("Médio")==true) {
						int iaux = i;
						for (int j=0;j<7;j++) {
							medio+=" | "+frase[j]+persa[iaux][j];
						}
						medio+="\n";
					}
					if (siames[i][2].equals("Médio")==true) {
						int iaux= i;
						for (int j=0;j<7;j++) {
							medio+=" | "+frase[j]+siames[iaux][j];
						}
						medio+="\n";
					}
					if (angora[i][2].equals("Médio")==true) {
						int iaux= i;
						for (int j=0;j<7;j++) {
							medio+=" | "+frase[j]+angora[iaux][j];
						}
						medio+="\n";
					}
				}
				JOptionPane.showMessageDialog(null, "Animais de Porte Médio \n"+medio);
				break;
			case 3:
				String grande="";
				for (int i=0;i<3;i++) {
					if (persa[i][2].equals("Grande")==true) {
						int iaux = i;
						for (int j=0;j<7;j++) {
							grande+=" | "+frase[j]+persa[iaux][j];
						}
						grande+="\n";
					}
					if (siames[i][2].equals("Grande")==true) {
						int iaux= i;
						for (int j=0;j<7;j++) {
							grande+=" | "+frase[j]+siames[iaux][j];
						}
						grande+="\n";
					}
					if (angora[i][2].equals("Grande")==true) {
						int iaux= i;
						for (int j=0;j<7;j++) {
							grande+=" | "+frase[j]+angora[iaux][j];
						}
						grande+="\n";
					}
				}
				JOptionPane.showMessageDialog(null, "Animais de Porte Grande \n"+grande);
				break;
			default:
				JOptionPane.showMessageDialog(null, "Escolha uma das opções válidas!!");
				animaisPorTamanho();
				break;
		}
		int continuar = Integer.parseInt(JOptionPane.showInputDialog("Escolha uma das opções. \n(1)Consultar outro porte. \n(2)Consultar de outra maneira. \n(3)Encerrar."));
		
		switch (continuar) {
			case 1:
				animaisPorTamanho();
				break;
			case 2:
				visualiza();
				break;
			case 3:
				encerra();
				break;
			default:
				error();
				break;
		}
	}
	private static void animaisPorRaca() {
		

		String Raca_Persa="", Raca_Siames="", Raca_Angora="";
		
		for (int i=0; i<3; i++) {
			for (int j=0; j<7; j++) {
				Raca_Persa+=(" | "+frase[j]+ persa[i][j]);
				Raca_Siames+=(" | "+frase[j]+ siames[i][j]);
				Raca_Angora+=(" | "+frase[j]+ angora[i][j]);
			}
			Raca_Persa+="\n";
			Raca_Siames+="\n";
			Raca_Angora+="\n";
		}
		
		JOptionPane.showMessageDialog(null, "Raça Persa: \n" + Raca_Persa);
		JOptionPane.showMessageDialog(null, "Raça Siames: \n" + Raca_Siames);
		JOptionPane.showMessageDialog(null, "Raça Angora: \n" + Raca_Angora);
		
		int continuar = Integer.parseInt(JOptionPane.showInputDialog("Escolha uma das opções. \n(1)Consultar de outra maneira. \n(2)Encerrar."));
				
			switch (continuar) {
				case 1:
					visualiza();
					break;
				case 2:
					encerra();
					break;
				default:
					error();
					break;
			}
	}
	private static void animaisPorPeso() {
		
		int escolha = Integer.parseInt(JOptionPane.showInputDialog("Informe qual média de peso deseja pesquisar. \n(1) 3 a 6Kg. \n(2) 6 a 10Kg. \n(3) 10 a 14Kg. "));
		switch (escolha) {
			
			case 1:
				String leve="";
				for (int i=0; i<3; i++) {
					if (persa[i][3].equals("3 a 6Kg")==true) {
						int iaux = i;
						for (int j=0;j<7;j++) {
							leve+=" | "+frase[j]+persa[iaux][j];
						}
						leve+="\n";
					}
					if (siames[i][3].equals("3 a 6Kg")==true) {
						int iaux = i;
						for (int j=0;j<7;j++) {
							leve+=" | "+frase[j]+siames[iaux][j];
						}
						leve+="\n";
					}
					if (angora[i][3].equals("3 a 6Kg")==true) {
						int iaux = i;
						for (int j=0;j<7;j++) {
							leve+=" | "+frase[j]+angora[iaux][j];
						}
						leve+="\n";
					}
				}
				JOptionPane.showMessageDialog(null, "Animais de 3 a 6kg \n"+leve);
				break;
			case 2:
				String medio="";
				for (int i=0; i<3; i++) {
					if (persa[i][3].equals("6 a 10Kg")==true) {
						int iaux = i;
						for (int j=0;j<7;j++) {
							medio+=" | "+frase[j]+persa[iaux][j];
						}
						medio+="\n";
					}
					if (siames[i][3].equals("6 a 10Kg")==true) {
						int iaux = i;
						for (int j=0;j<7;j++) {
							medio+=" | "+frase[j]+siames[iaux][j];
						}
						medio+="\n";
					}
					if (angora[i][3].equals("6 a 10Kg")==true) {
						int iaux = i;
						for (int j=0;j<7;j++) {
							medio+=" | "+frase[j]+angora[iaux][j];
						}
						medio+="\n";
					}
				}
				JOptionPane.showMessageDialog(null, "Animais de 6 a 10kg \n"+medio);
				break;
			case 3:
				String pesado="";
				for (int i=0; i<3; i++) {
					if (persa[i][3].equals("10 a 14Kg")==true) {
						int iaux = i;
						for (int j=0;j<7;j++) {
							pesado+=" | "+frase[j]+persa[iaux][j];
						}
						pesado+="\n";
					}
					if (siames[i][3].equals("10 a 14Kg")==true) {
						int iaux = i;
						for (int j=0;j<7;j++) {
							pesado+=" | "+frase[j]+siames[iaux][j];
						}
						pesado+="\n";
					}
					if (angora[i][3].equals("10 a 14Kg")==true) {
						int iaux = i;
						for (int j=0;j<7;j++) {
							pesado+=" | "+frase[j]+angora[iaux][j];
						}
						pesado+="\n";
					}
				}
				JOptionPane.showMessageDialog(null, "Animais de 10 a 14kg \n"+pesado);
				break;
			default: 
				JOptionPane.showMessageDialog(null, "Escolha uma das opções válidas!!");
				animaisPorPeso();
				break;
		}
		int continuar = Integer.parseInt(JOptionPane.showInputDialog("Escolha uma das opções. \n(1)Consultar outro peso. \n(2)Consultar de outra maneira. \n(3)Encerrar."));
				
			switch (continuar) {
				case 1:
					animaisPorPeso();
					break;
				case 2:
					visualiza();
					break;
				case 3:
					encerra();
					break;
				default:
					error();
					break;
			}
	}
	private static void animaisPorSexo() {
		
		int escolha = Integer.parseInt(JOptionPane.showInputDialog("Qual deseja pesquisar? \n(1)Machos. \n(2)Fêmeas."));
		
		switch (escolha) {
		
			case 1:
				String machos="";
				for (int i=0; i<3; i++) {
					if (persa[i][4].equals("MACHO")==true) {
						int iaux = i;
						for (int j=0;j<7;j++) {
							machos+=" | "+frase[j]+persa[iaux][j];
						}
						machos+="\n";
					}
					if (siames[i][4].equals("MACHO")==true) {
						int iaux = i;
						for (int j=0;j<7;j++) {
							machos+=" | "+frase[j]+siames[iaux][j];
						}
						machos+="\n";
					}	
					if (angora[i][4].equals("MACHO")==true) {
						int iaux = i;
						for (int j=0;j<7;j++) {
							machos+=" | "+frase[j]+angora[iaux][j];
						}
						machos+="\n";
					}	
				}
				JOptionPane.showMessageDialog(null, "Gatos Machos \n"+machos);
				break;
			case 2:
				String femeas="";
				for (int i=0; i<3; i++) {
					if (persa[i][4].equals("FÊMEA")==true) {
						int iaux = i;
						for (int j=0;j<7;j++) {
							femeas+=" | "+frase[j]+persa[iaux][j];
						}
						femeas+="\n";
					}
					if (siames[i][4].equals("FÊMEA")==true) {
						int iaux = i;
						for (int j=0;j<7;j++) {
							femeas+=" | "+frase[j]+siames[iaux][j];
						}
						femeas+="\n";
					}	
					if (angora[i][4].equals("FÊMEA")==true) {
						int iaux = i;
						for (int j=0;j<7;j++) {
							femeas+=" | "+frase[j]+angora[iaux][j];
						}
						femeas+="\n";
					}	
				}
				JOptionPane.showMessageDialog(null, "Gatos Femeas \n"+femeas);
				break;
			default:
				JOptionPane.showMessageDialog(null, "Escolha uma das opções válidas!!");
				animaisPorSexo();
				break;
		}
		int continuar = Integer.parseInt(JOptionPane.showInputDialog("Escolha uma das opções. \n(1)Consultar de outra maneira. \n(2)Encerrar."));
		
		switch (continuar) {
			case 1:
				visualiza();
			case 2:
				encerra();
				break;
			default:
				error();
				break;
		}
	}
	private static void animaisCastrados() {
		
		int escolha = Integer.parseInt(JOptionPane.showInputDialog("Qual deseja pesquisar? \n(1)Castrados. \n(2)Não Castrados."));
		
		switch (escolha) {
		
			case 1:
				String castrados="";
				for (int i=0; i<3; i++) {
					if (persa[i][5].equals("SIM")==true) {
						int iaux = i;
						for (int j=0;j<7;j++) {
							castrados+=" | "+frase[j]+persa[iaux][j];
						}
						castrados+="\n";
					}
					if (siames[i][5].equals("SIM")==true) {
						int iaux = i;
						for (int j=0;j<7;j++) {
							castrados+=" | "+frase[j]+siames[iaux][j];
						}
						castrados+="\n";
					}	
					if (angora[i][5].equals("SIM")==true) {
						int iaux = i;
						for (int j=0;j<7;j++) {
							castrados+=" | "+frase[j]+angora[iaux][j];
						}
						castrados+="\n";
					}	
				}
				JOptionPane.showMessageDialog(null, "Gatos Castrados \n"+castrados);
				break;
			case 2:
				String naoCastrados="";
				for (int i=0; i<3; i++) {
					if (persa[i][5].equals("NÃO")==true) {
						int iaux = i;
						for (int j=0;j<7;j++) {
							naoCastrados+=" | "+frase[j]+persa[iaux][j];
						}
						naoCastrados+="\n";
					}
					if (siames[i][5].equals("NÃO")==true) {
						int iaux = i;
						for (int j=0;j<7;j++) {
							naoCastrados+=" | "+frase[j]+siames[iaux][j];
						}
						naoCastrados+="\n";
					}	
					if (angora[i][5].equals("NÃO")==true) {
						int iaux = i;
						for (int j=0;j<7;j++) {
							naoCastrados+=" | "+frase[j]+angora[iaux][j];
						}
						naoCastrados+="\n";
					}	
				}
				JOptionPane.showMessageDialog(null, "Gatos Não Castrados \n"+naoCastrados);
				break;
			default:
				JOptionPane.showMessageDialog(null, "Escolha uma das opções válidas!!");
				animaisCastrados();
				break;
		}
		int continuar = Integer.parseInt(JOptionPane.showInputDialog("Escolha uma das opções. \n(1)Consultar de outra maneira. \n(2)Encerrar."));
				
			switch (continuar) {
				case 1:
					visualiza();
				case 2:
					encerra();
					break;
				default:
					error();
					break;
		}
	}
	private static void animaisDisponiveis() {
		
int escolha = Integer.parseInt(JOptionPane.showInputDialog("Qual deseja pesquisar? \n(1)Adotados. \n(2)Não adotados."));
		
		switch (escolha) {
		
			case 1:
				String adotados="";
				for (int i=0; i<3; i++) {
					if (persa[i][6].equals("SIM")==true) {
						int iaux = i;
						for (int j=0;j<7;j++) {
							adotados+=" | "+frase[j]+persa[iaux][j];
						}
						adotados+="\n";
					}
					if (siames[i][6].equals("SIM")==true) {
						int iaux = i;
						for (int j=0;j<7;j++) {
							adotados+=" | "+frase[j]+siames[iaux][j];
						}
						adotados+="\n";
					}	
					if (angora[i][6].equals("SIM")==true) {
						int iaux = i;
						for (int j=0;j<7;j++) {
							adotados+=" | "+frase[j]+angora[iaux][j];
						}
						adotados+="\n";
					}	
				}
				JOptionPane.showMessageDialog(null, "Gatos Castrados \n"+adotados);
				break;
			case 2:
				String naoAdotados="";
				for (int i=0; i<3; i++) {
					if (persa[i][6].equals("NÃO")==true) {
						int iaux = i;
						for (int j=0;j<7;j++) {
							naoAdotados+=" | "+frase[j]+persa[iaux][j];
						}
						naoAdotados+="\n";
					}
					if (siames[i][6].equals("NÃO")==true) {
						int iaux = i;
						for (int j=0;j<7;j++) {
							naoAdotados+=" | "+frase[j]+siames[iaux][j];
						}
						naoAdotados+="\n";
					}	
					if (angora[i][6].equals("NÃO")==true) {
						int iaux = i;
						for (int j=0;j<7;j++) {
							naoAdotados+=" | "+frase[j]+angora[iaux][j];
						}
						naoAdotados+="\n";
					}	
				}
				JOptionPane.showMessageDialog(null, "Gatos Não Castrados \n"+naoAdotados);
				break;
			default:
				JOptionPane.showMessageDialog(null, "Escolha uma das opções válidas!!");
				animaisDisponiveis();
				break;
		}
		int continuar = Integer.parseInt(JOptionPane.showInputDialog("Escolha uma das opções. \n(1)Consultar de outra maneira. \n(2)Encerrar."));
				
			switch (continuar) {
				case 1:
					visualiza();
				case 2:
					encerra();
					break;
				default:
					error();
					break;
		}
	}
	private static void encerra() {
		
		JOptionPane.showMessageDialog(null, "Programa Finalizado \nObrigado por utilizar. :D");
		System.exit(0);
	}
	private static void error() {
		 
		JOptionPane.showMessageDialog(null, "ERROR","ERROR", JOptionPane.ERROR_MESSAGE);
		visualiza();
	}
}