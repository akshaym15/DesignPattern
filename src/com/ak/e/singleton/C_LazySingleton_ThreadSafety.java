package com.ak.e.singleton;

public class C_LazySingleton_ThreadSafety {

	private static C_LazySingleton_ThreadSafety instance;
	
	private C_LazySingleton_ThreadSafety() {
		System.out.println("LazySingleton Initializing");
	}
	
	//sync for thread safety
	//but will cause performance issue
	/*public static synchronized LazySingleton getInstance() {
		
		if(instance == null) {
			instance = new LazySingleton();			
		}
		
		return instance;		
	}*/
	
	//double-checked locking 
	public static C_LazySingleton_ThreadSafety getInstance() {
		
		if(instance == null) {
			synchronized (C_LazySingleton_ThreadSafety.class) {
				if(instance == null) {
					instance = new C_LazySingleton_ThreadSafety();
				}
			}
		}
		
		return instance;
	}

	

}

class LazySingletonDemo{
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		C_LazySingleton_ThreadSafety lazySingleton = C_LazySingleton_ThreadSafety.getInstance();

	}
}
