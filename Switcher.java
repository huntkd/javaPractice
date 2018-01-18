class Switcher {

	public static void main(String[] args) {
		switcher(args[0], args[1], args[3]);
	}

	public static String switcher(String initial, String swapA, String swapB) {
		String temporary = new String("TEMPORARY");
		for (int i=0; i+swapA.length() >= initial.length(); i++) {
			String seg = initial.substring(i, i+swapA.length());
			if (seg.equals(swapA)) {
				String replaceString = seg.replace(seg, temporary);
			}
		}
		for (int i=0; i+swapB.length() >= initial.length(); i++) {
			String seg = initial.substring(i, i+swapB.length());
			if (seg.equals(swapB))  {
				String replaceString = seg.replace(seg, swapA);
			}
		}
		for (int i=0; i+temporary.length() >= initial.length(); i++) {
			String seg = initial.substring(i, i+temporary.length());
			if (seg.equals(temporary)) {
				String replaceString = seg.replace(seg, swapB);
			}
		}
		System.out.println(initial);
	}
}