package com.icici.loans.homeloans;

import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Set;

public class UserDefineEntity 
{

	public static void main(String[] args) 
	{
		Employee1 e1 = new Employee1(101, "ravilella1");
		Employee1 e2 = new Employee1(102, "ravilella2");
		Employee1 e3 = new Employee1(103, "ravilella3");
		Employee1 e4 = new Employee1(104, "ravilella4");
		
		
		HashMap<Integer, Employee1> h = new HashMap<Integer, Employee1>();
		
		h.put(e1.getEno(), e1);
		h.put(e2.getEno(), e2);
		h.put(e3.getEno(), e3);
		h.put(e4.getEno(), e4);
		
		Set<Entry<Integer, Employee1>> entries = h.entrySet();
		
		for(Entry<Integer, Employee1> emp :entries)
		{
			Integer eno = emp.getKey();
			System.out.println(eno);
			Employee1 employee = emp.getValue();
			employee.display();
			
		}
		
		
		
		
		

	}

}
