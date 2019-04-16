package lanQiaoSeventhC;

public class T1 {
	public static void main(String[] args) {
		String value = "vxvxvxvxvxvxvvx";
		int coin = 777;
		for (int i = 0; i < value.length(); i++) {
			if (value.charAt(i) == 'v') {
				coin *= 2;
			} else {
				coin -= 555;
			}
		}
		System.out.println(coin);
	}
}
