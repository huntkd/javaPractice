class Best {

	public static void main(String[] args) {
		int n = Integer.parseInt(args[0]);
		int e = Integer.parseInt(args[1]);

		String str = "";

		for (int i=0; i<e; i++) {
			str = str + "!";
		}

		for (int i=0; i<n; i++) {
			System.out.println("YOU'RE THE BEST" + str);
		}

	}

}