package kadai_026;

import java.util.HashMap;
import java.util.Scanner;

public class Jyanken_Chapter26 {
	HashMap<String,String> rsp = new HashMap<String,String>();
	//コンストラクタ
	public Jyanken_Chapter26() {
		rsp.put("r", "グー");
		rsp.put("s", "チョキ");
		rsp.put("p", "パー");
	}
	
	
	public String getMyChoice() {
		System.out.println("自分のジャンケンの手を入力しましょう");
		System.out.println("グーはrockのrを入力しましょう");
		System.out.println("チョキはscissorsのsを入力しましょう");
		System.out.println("パーはpaperのpを入力しましょう");
		
	    //Scannerクラスのオブジェクトを生成する
	    Scanner scanner = new Scanner(System.in);
	    //入力した内容を取得する
	    String input = scanner.nextLine();
	    
	    while(!rsp.containsKey(input)) {
	    	System.out.println("正しいジャンケン手ではありません\nr(グー)かs(チョキ)かp(パー)を入力してください");
		    //もう一度入力する
		    input = scanner.nextLine();
	    }
	    return input;
	}
	
	public String getRandom() {
		// ジャンケンの手を配列に代入
		String [] jyanken = {"r","s","p"};
		return jyanken[(int)Math.floor(Math.random() * jyanken.length)];
	}
	
	public void playGame(String my,String opponent) {
		//自分の手
		String myhand = rsp.get(my);
		// 相手の手
		String opponenthand = rsp.get(opponent);
		// ジャンケンの手を出力
		System.out.println("自分の手は"+myhand+",対戦相手の手は"+opponenthand);
		// ジャンケンの勝敗を決める
        if (myhand.equals(opponenthand)) {
        	System.out.println("引き分けです！");
        } else if((myhand.equals(rsp.get("r")) && opponenthand.equals(rsp.get("s"))) ||
        	(myhand.equals(rsp.get("s")) && opponenthand.equals(rsp.get("p"))) ||
        	(myhand.equals(rsp.get("p")) && opponenthand.equals(rsp.get("r")))){
        	System.out.println("自分の勝ちです");
        } else {
        	System.out.println("自分の負けです");
        }
	}

}
