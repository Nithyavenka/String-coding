package com.practice;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class Employee {
	private int age;
	private String name;

	public int getAge() {
		return age;
	}

	public String getName() {
		return name;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Employee [age=" + age + ", name=" + name + "]";
	}

	public Employee(int age, String name) {
		super();
		this.age = age;
		this.name = name;
	}

}
public class Compare {
	public static void main(String[] args) {
		List<Employee> list = new ArrayList<>();
		Employee e1 = new Employee(19, "nithya");
		Employee e2 = new Employee(17, "kumar");
		Employee e3 = new Employee(25, "Kavi");
		list.add(e1);
		list.add(e2);
		list.add(e3);
		Collections.sort(list, (Employee ref1, Employee ref2) -> {
			if (ref1.getAge() > ref2.getAge()) {
				return 1;
			} else
				return -1;

		});
		System.out.println(list);

	}

}
