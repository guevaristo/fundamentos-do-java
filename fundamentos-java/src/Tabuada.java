import java.util.Scanner;

public class Tabuada {

	public static void main(String[] args) {
		System.out.println("=======TABUADA=========");
		Scanner leia = new Scanner(System.in);
		
		int valor;
		System.out.print("Digite o valor da tabuada: ");
		//valor = leia.nextInt(); INICIA A VARIAVEL "LEIA"
		valor = leia.nextInt();
		
		for(int i = 0; i <=10 ; i++){
			System.out.println(valor + " x " + i+ " = " + (valor*i));
		}
		
		leia.close();
	}

}
