package io.spring.springrestful;

class EmployeeNotFoundException extends RuntimeException {
	
	EmployeeNotFoundException(Long id) {
		super("Could not find employee " + id);
	}

}
