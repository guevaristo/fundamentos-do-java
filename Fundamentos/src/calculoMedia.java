import java.util.Scanner;

public class calculoMedia {

	public static void main(String[] args) {
		double nota1, nota2, media;
		System.out.println("Calculo da média");
		// Criando um objeto para entrada de daddos
		Scanner leia = new Scanner(System.in);
		System.out.println("Digite a nota1 ");
		nota1 = leia.nextDouble();
		System.out.println("Digite a nota2 ");
		nota2 = leia.nextDouble();
		media = (nota1 + nota2) /2;
		System.out.println("Média " + media);	
		
		leia.close();
	}

}
