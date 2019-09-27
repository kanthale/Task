package com.innova.java;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;

public class PersonDemo {
	    public static void main(String[] args) {
	    	
	    	
	        Map<Person, List<String>> map = new HashMap<Person, List<String>>();
                
	        Person p=new Person();
	        p.setName("Naveen");
	       // p.setEmpId(101);
	        
	        Person p1=new Person();
	        p1.setName("shakhi");
	        //p1.setEmpId(102);
	        
	        Person p2=new Person();
	        p2.setName("logesh");
	        //p2.setEmpId(103);
	        	        
	        List<String> list = new ArrayList<String>();
	        list.add("manager");
	        list.add("lead Engineer");
	        list.add("QE ENgineer");
	        list.add("Analysis");
	        
	        List<String> list2 = new ArrayList<String>();
	        list2.add("manager");
	        list2.add("analysis");
	        list2.add("lead engineer");
	        
	        List<String> list3 = new ArrayList<String>();
	        list3.add("Analysis");
	        list3.add("lead engineer");
	        list3.add("QE Engineer");
	        
	        map.put(p, list);
	        map.put(p1, list2);
	        map.put(p2, list3);
	       // System.out.print(map);
	        
	        for (Entry<Person, List<String>> entry : map.entrySet()) {
	            Person key = entry.getKey();
	            List<String> values = entry.getValue();
	           /* System.out.println("Name = " + key);
	            System.out.println("Dept = " + values);*/
	            System.out.println(key+" Has a "+values);
	        }
	    }
	}

