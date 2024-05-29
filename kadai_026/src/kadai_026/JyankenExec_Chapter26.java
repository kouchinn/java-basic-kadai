package kadai_026;

public class JyankenExec_Chapter26 {

	public static void main(String[] args) {
		Jyanken_Chapter26 jyanken = new Jyanken_Chapter26();
		// ジャンケンの手を入力します
		String myhand = jyanken.getMyChoice();
		// 相手ジャンケンの手をランダムに決めます
		String opponenthand = jyanken.getRandom();
		// ジャンケンを実行
		jyanken.playGame(myhand, opponenthand);
	}

}
