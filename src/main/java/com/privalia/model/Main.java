package com.privalia.model;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Main {

	private static final Logger logger = LoggerFactory.getLogger(Main.class);

	public static void main(String[] args) {

		// Debug.
		logger.debug("Depuracion");
		// Info.
		logger.info("Informacion");
		// Trace.
		logger.trace("Traza");
		// Warning.
		logger.warn("Advertencia");
		// Error.
		logger.error("Error");

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
