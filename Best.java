class Best {

	public static void main(String[] args) {
		int n = Integer.parseInt(args[0]);
		String message = "YOU'RE THE BEST";

		if (args.length > 1) {
			int e = Integer.parseInt(args[1]);
			for (int i=0; i<e; i++) {
				message = message + "!";
			}
			for (int i=0; i<n; i++) {
				System.out.println(message);
			}
		} else {
			for (int i=0; i<n; i++) {
				System.out.println(message);
			}
		}

	}

}