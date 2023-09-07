package chapter5_1;
import jp.kwebs.lib.Input;

public class Sample2 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
	
	int a = Input.getInt("年齢を入力してください？");
	String str = Input.getString("性別を入力して下さい");
	if( a>=10 && str=="女性") {
		System.out.println("10才以上、かつ、女性");
	}else {
		System.out.println("10才より若い、もしくは男性");
	}
	
	if( a>=10 || str=="女性") {
		System.out.println("10才以上、または、女性");
	}else {
		System.out.println("10才より若い男性");
	}
	
	if(!(a>10)){
		System.out.println("10才以下");
	}else {
		System.out.println("10才より年上");
	}
	
	str = Input.getString("くだものを入力して下さい");
	if(!str.equals("バナナ")){
		System.out.println("入力された文字はバナナではない");
	}else {
		System.out.println("入力された文字はバナナです");
	}
	}
}
