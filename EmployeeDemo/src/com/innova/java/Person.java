package com.innova.java;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Person {
	    public static void main(String[] args) {
	    	
	    	
	        Map<String, List<String>> map = new HashMap<String, List<String>>();
	        
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
	        
	        map.put("Naveen", list);
	        map.put("Logesh", list2);
	        map.put("Shakti", list3);
	        
	        for (Map.Entry<String, List<String>> entry : map.entrySet()) {
	            String key = entry.getKey();
	            List<String> values = entry.getValue();
	            /*System.out.println("Name = " + key);
	            System.out.println("Dept = " + values);*/
	            System.out.println(key+" Has a "+values);
	        }
	    }
	}

