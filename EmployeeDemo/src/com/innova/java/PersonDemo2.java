package com.innova.java;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class PersonDemo2 {
	 public static void main(String[] args) {	    	
	    	
	        Map<Person, Map<Integer,String>> map = new HashMap<Person, Map<Integer,String>>();
	      
	        Person p=new Person();
	        p.setName("Naveen");
	        p.setEmpId(101);
	        
	        Person p1=new Person();
	        p1.setName("shakhi");
	        p1.setEmpId(102);
	        
	        Person p2=new Person();
	        p2.setName("logesh");
	        p2.setEmpId(103);
	        
	        
	        	        
	        Map<Integer,String> list =new HashMap<Integer, String>();
	        list.put(101,"manager");
	        list.put(102,"lead Engineer");
	        list.put(103,"QE ENgineer");
	        //list.put(104,"Analysis");
	        
	        /*Map<Integer,String> list2 =new HashMap<Integer, String>();
	        list2.put(105,"manager");
	        list2.put(106,"lead Engineer");
	        list2.put(107,"QE ENgineer");
	        list2.put(108,"Analysis");
	        
	        Map<Integer,String> list3 =new HashMap<Integer, String>();
	        list3.put(109,"manager");
	        list3.put(110,"lead Engineer");
	        list3.put(111,"QE ENgineer");
	        list3.put(112,"Analysis");
	        */
	        map.put(p, list); 
	        map.put(p1, list);
	        for (Entry<Person, Map<Integer, String>> entry : map.entrySet()) {
	            Person key = entry.getKey();
	            Map<Integer,String> values = (Map<Integer, String>) entry.getValue();
	           /* System.out.println("Name = " + key);
	            System.out.println("Dept = " + values);*/
	            System.out.println(key+" "+"EmpId"+values);
	        }	        
	 }
}
