import java.util.Scanner;    //�¶�ת��

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int F;
        double C;
        Scanner scanner = new Scanner(System.in);
        F = scanner.nextInt();
        C = (F-32)/(9/5.0);
        System.out.println((int)(C));

	}

}
