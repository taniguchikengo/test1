package chapter1_1;
/**
 * ユーティリティクラス
 * <p>
 * メソッドを集めたクラスです。<br>
 * 随時メソッドを追加して行きます。
 * 
 * @version 1.0
 * @author jyo09
 *
 */
public class util {
	/**
	 * 
	 * @param a:四角形の縦
	 * @param b:四角形の横
	 * @return：四角形の面積
	 */
	public static double menseki(double a,double b) {	
		return a*b;
	}
	
	/**
	 * 
	 * @param w：体重
	 * @param h：身長
	 * @return：BMI値
	 * 	 */
	public static double bmi(double w,double h) {	
		return w/Math.pow(h/100,2);
	}


}
