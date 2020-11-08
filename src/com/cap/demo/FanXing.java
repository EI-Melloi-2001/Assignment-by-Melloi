package com.cap.demo;

import java.util.HashMap;
import java.util.Map;

public class FanXing {
	//泛型
	public static <K,T> void DisplayArray(T[] anArray,K[] twoArray) {
		for(T t:anArray) {
			System.out.println(t);//默认调用了Object类的toString();
			System.out.println("------");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		String[] strArray= {"ABC","DEF","GHIJ"};
//		
//		Integer[] intArray = {1,2,3,4,5};
//		
//		Car[] carArray=new Car[2];
//		carArray[0]=new Car("奔驰",3,4);
//		carArray[1]=new Car("宝马",3,4);
//		DisplayArray(carArray,strArray);
		    //K泛型    //V泛型
		Map<Integer,String> map=new HashMap<>();//哈希表
		map.put(2, "ABC");
		map.put(4, "8784");
		System.out.println(map.get(4));
		System.out.println(map.get(2));
		
		Map<String,Car> carmap =new HashMap<String,Car>();
		carmap.put("奔驰",new Car("奔驰",3,4));
		carmap.put("奔驰",new Car("宝马",1,6));
		System.out.println(carmap.get("奔驰"));
		System.out.println(carmap.size());

	}

}
