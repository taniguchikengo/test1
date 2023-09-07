package chapter2_7;
import java.util.Scanner;
public class Sample1 {

	public static void main(String[] args) {
		// Scannerインスタンス作成（標準入力System.inから入力）
	    Scanner sc = new Scanner(System.in);
	    System.out.print("数字を入力してください : ");
	    int i = sc.nextInt();
	    System.out.println(i + "が入力されました");
	    sc.close();
	}

}
