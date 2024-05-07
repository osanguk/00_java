package com.khinheritance.ex;

public class 갤럭시 {
	private int 안드로이드;

	public void set안드로이드(int 안드로이드) {
		this.안드로이드 = 안드로이드;
	}

	public int get안드로이드() {
		return 안드로이드;
		
	}
	public 갤럭시() {
		
	}
	public 갤럭시(int 안드로이드) {
		super();
		this.안드로이드 =안드로이드;
	}

	//@override toString
	@Override
	public String toString() {
		return "갤럭시 [안드로이드=" + 안드로이드 + ", toString()=" + super.toString() + "]";
	}
	
	
	
	

}
