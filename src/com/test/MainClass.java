package com.test;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import com.test.dao.EployeeDao;

public class MainClass {

	public static void main(String[] args) {
		List<Employee> empList = EployeeDao.getEmployees();
//		Collections.sort(empList);
//		System.out.println("Sorting based on age" +empList);
		
//		Collections.sort(empList, new Comparator<Employee>() {
//
//			@Override
//			public int compare(Employee o1, Employee o2) {
//				return (int) (o1.getSalary()-o2.getSalary());
//			}
//			
//		});
//		System.out.println("Sorting based on salary" + empList);
		Collections.sort(empList, new NameComparator());
		System.out.println("Sorting based on name" +empList);
	}
}
