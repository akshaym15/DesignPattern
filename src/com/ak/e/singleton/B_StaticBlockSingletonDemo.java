package com.ak.e.singleton;

class StaticBlockSingleton{
	
	private StaticBlockSingleton() throws Exception{
		System.out.println("Singleton intializing");
	}
	
	private static StaticBlockSingleton instance;
	
	static {
		try {
			instance = new StaticBlockSingleton();
		}catch(Exception e) {
			e.printStackTrace();
			System.out.println("Failed to create singleton object");
		}
	}
	
	public static StaticBlockSingleton getInstance() {
		return instance;
	}
	
}

public class B_StaticBlockSingletonDemo {
	
	
	public static void main(String[] args) {
		StaticBlockSingleton staticBlockSingleton = StaticBlockSingleton.getInstance();
	}
	
}
