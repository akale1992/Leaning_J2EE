package demopack1;

class Singleton {
	private static Singleton s = new Singleton();
	private Singleton() {
		// TODO Auto-generated constructor stub
	}
     public static Singleton getSingleton() {
		return s;
	}
}

