package kadai_021;

import java.util.HashMap;

public class Dictionary_Chapter21 {
	HashMap<String,String> dictionary = new HashMap<String,String>();
	
	// 要素の追加
	public Dictionary_Chapter21() {
		dictionary.put("apple","りんご");
		dictionary.put("peach","桃");
		dictionary.put("banana","バナナ");
		dictionary.put("lemon","レモン");
		dictionary.put("pear","梨");
		dictionary.put("kiwi","キウィ");
		dictionary.put("strawberry","いちご");
		dictionary.put("grape","ぶどう");
		dictionary.put("muscat","マスカット");
		dictionary.put("cherry","さくらんぼ");
	}
	
	// 辞書に存在しているかチェック
	public void existDictionary(String eng, String eng2, String eng3, String eng4) {
		String englishWords[] = {eng,eng2,eng3,eng4};
		for(int i=0; i < englishWords.length; i++) {
			if(dictionary.get(englishWords[i]) == null) {
				System.out.println(englishWords[i]+"は存在しません");
			}
			else {
				System.out.println(englishWords[i]+"の意味は"+dictionary.get(englishWords[i]));
			}
			
		}
	}
	
}
