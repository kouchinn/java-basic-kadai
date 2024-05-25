package kadai_018;

abstract public class Kato_Chapter18 {
	public static final String familyName = "加藤";
	public String givenName;
	public String address;
	
	// 住所の出力
	public void commonIntroduce() {
		System.out.println("名前は"+ familyName + givenName +"です");
		System.out.println("住所は東京都中野区〇×です");
	}
	
	// 自己紹介の出力
	abstract public void eachIntroduce();
	
	// 紹介の実行メソッド 
	public void execIntroduce() {
		commonIntroduce();
		eachIntroduce();
		// 改行
		System.out.println();
	}
}
