package com.kh.javaAPIEx;

public class BufferBuilder {
	
	public static void main(String[] args) {
		StringBuffer buffer = new StringBuffer();
		buffer.append("Hello");
		buffer.append("world");
		System.out.println(buffer.toString());
		
		
		StringBuilder builder = new StringBuilder();
		builder.append("Hello");
		builder.append("world");
		System.out.println(builder.toString());
	
	}
	
	
}
