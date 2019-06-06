
public class Escopo {

	public static void main(String[] args) {
		// No java toda variável precisa ser iniciada
		int x = 0;
		boolean gameover;
		x = 1;
		System.out.println(x);
		if (x == 0) {
			gameover = false;
		} else {
			gameover = true;
		}
		System.out.println(gameover);

	}
}
