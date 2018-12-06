package com.privalia.model;

public class Main {

	public static void main(String[] args) {

		Student student = new Student();
		student.setIdStudent(1);
		student.setName("Pepe");
		student.setSurname("Carrasco");
		student.setAge(14);

		StringBuilder studentSb = new StringBuilder("El UUID del alumno es ");
		studentSb.append(student.getUUId());
		studentSb.append(" El nombre del alumno es ");
		studentSb.append(student.getName());
		System.out.println(studentSb);

	}

}
