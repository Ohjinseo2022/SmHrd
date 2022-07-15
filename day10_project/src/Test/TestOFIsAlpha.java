package Test;


public class TestOFIsAlpha {
	public static boolean isAlpha(String str) {
		if(str.isEmpty()) {
			return false;
		}
		final int sz = str.length();
		for(int i = 0; i<sz;i++) {
			char a = str.charAt(i);
			if(!(a >= '0' && a<='9')) {
				return false;
			}
		}
		return true;
	}
	public static void main(String[] args) {
		String str = "123";
		String num;
		Boolean b = isAlpha(str);
		System.out.println(b);
		if(b) {
			int a = Integer.parseInt(str) + 10000;
			String ok = Integer.toString(a);
			System.out.println(ok.substring(1, 5));
		}
	}
}
