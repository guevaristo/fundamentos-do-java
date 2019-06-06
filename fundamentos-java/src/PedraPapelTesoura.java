import java.util.Scanner;

public class PedraPapelTesoura {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int jogador;
		Scanner mao = new Scanner(System.in);
		System.out.println("___________________________________________");
		System.out.println("___________________JokenPo_________________");
		System.out.println("___________________________________________");
		System.out.println("");
		System.out.println("1. Pedra");
		System.out.println("2. Papel");
		System.out.println("3. Tesoura");
		System.out.println("Digite a op��o desejada: ");
		jogador = mao.nextInt();
		
		//Estrutura do tipo INT e CHAR
		
		switch (jogador) {
		
		case 1:
		System.out.println("Jogador escolheu pedra");
		break;
		
		case 2:
		System.out.println("Jogador escolheu papel");
		break;
		
		case 3:
		System.out.println("Jogador escolheu tesoura");
		break;
	
		default:
		System.out.println("Op��o inv�lida");
		
		}
		
		//L�gica do computador
		//A lINHA ABAIXO GERA 3 N�MEROS ALEATORIOS ENTRE 3 E 2
		//(int) converte para o tipo inteiro - nome t�cnico = "casting"
		
		int computador = (int)(Math.random()* 3 + 1);
		switch(computador) {
	case 1:
		System.out.println("Computador escolheu pedra");
		break;
		
	case 2:
		System.out.println("Computador escolheu papel");
		break;
		
	case 3:
		System.out.println("Computador escolheu tesoura");
		break;
		}
		//Logica para determinar o vencedor ou empate
		if (jogador == computador) {
			System.out.println("Empate");
		}else {
			if((jogador ==1 && computador == 3) ||(jogador ==2 && computador ==1) || (jogador ==3 && computador ==2)){
			System.out.println("Jogador venceu");
		}else {
			if((computador ==1 && jogador == 3) ||(computador ==2 && jogador ==1) || (computador ==3 && jogador ==2))
				System.out.println("Computador venceu");
			
		}	
		
}
			
				
	mao.close();
		
	}
}


