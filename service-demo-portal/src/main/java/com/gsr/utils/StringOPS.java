package com.gsr.utils;

public class StringOPS {
	
	public static String getValues(String input) {
		String[] array=input.split(",");
		StringBuilder build=new StringBuilder();
		for(int i=0;i<array.length;i++) {
			if(i==0) {
				build.append("'").append(array[i]).append("'");
			}else {
				build.append(",").append("'").append(array[i]).append("'");
			}
		}
		return build.toString();
	}

}
