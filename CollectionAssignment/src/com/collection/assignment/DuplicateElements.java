package com.collection.assignment;

import java.util.*;

public class DuplicateElements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		List<String> pdc = new ArrayList<>();
		
		pdc.add("baby");
		pdc.add("soap");
		pdc.add("soap");
		pdc.add("baby");
		pdc.add("soap");
		pdc.add("oil");
		pdc.add("baby");
		
		
		  for(int i=0; i<pdc.size(); i++) 
		  { 
			  for(int j=0; j<pdc.size();j++) 
			  {
				  if(i==j) continue;
				  if(pdc.get(i).equals(pdc.get(j))&&j<i)
					  break;
				  if(pdc.get(i).equals(pdc.get(j))) {
						  System.out.println("Duplicate Elements:" +pdc.get(j)); break;
					  }
			  }
		  }
		 
	}
}

