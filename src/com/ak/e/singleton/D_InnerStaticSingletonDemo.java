package com.ak.e.singleton;

class InnerStaticSingleton{
	private InnerStaticSingleton() {}
	
	//Inner class which declare and define instance
	private static class Impl{
		private static final InnerStaticSingleton instance = new InnerStaticSingleton();
	}
	
	public InnerStaticSingleton getInsance() {
		return Impl.instance;
	}
	
}


public class D_InnerStaticSingletonDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
