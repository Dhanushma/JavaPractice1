package com.java.streams;

import java.awt.print.Printable;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

public class StreamPracticeProblems {

	static class TempStudent {
		public String name;
		public int age;
		public Address address;
		public List<MobileNumber> mobileNumbers;

		public TempStudent(String name, int age, Address address, List<MobileNumber> mobileNumbers) {
			this.name = name;
			this.age = age;
			this.address = address;
			this.mobileNumbers = mobileNumbers;
		}
	}

	static class Student {
		private String name;
		private int age;
		private Address address;
		private List<MobileNumber> mobileNumbers;

		public Student(String name, int age, Address address, List<MobileNumber> mobileNumbers) {
			this.name = name;
			this.age = age;
			this.address = address;
			this.mobileNumbers = mobileNumbers;
		}

		public String getName() {
			return name;
		}

		public int getAge() {
			return age;
		}

		public Address getAddress() {
			return address;
		}

		public List<MobileNumber> getMobileNumbers() {
			return mobileNumbers;
		}

		public void setName(String name) {
			this.name = name;
		}

		public void setAge(int age) {
			this.age = age;
		}

		public void setAddress(Address address) {
			this.address = address;
		}

		public void setMobileNumbers(List<MobileNumber> mobileNumbers) {
			this.mobileNumbers = mobileNumbers;
		}

		@Override
		public String toString() {
			return "Student{" + "name='" + name + '\'' + ", age=" + age + ", address=" + address + ", mobileNumbers="
					+ mobileNumbers + '}';
		}
	}

	static class Address {
		private String zipcode;

		public Address(String zipcode) {
			this.zipcode = zipcode;
		}

		public String getZipcode() {
			return zipcode;
		}

		public void setZipcode(String zipcode) {
			this.zipcode = zipcode;
		}
	}

	static class MobileNumber {
		private String number;

		public MobileNumber(String number) {
			this.number = number;
		}

		public String getNumber() {
			return number;
		}

		public void setNumber(String number) {
			this.number = number;
		}
	}

	public static void main(String[] args) {

		Student student1 = new Student("Jayesh", 20, new Address("1234"),
				Arrays.asList(new MobileNumber("1233"), new MobileNumber("1234")));

		Student student2 = new Student("Khyati", 20, new Address("1235"),
				Arrays.asList(new MobileNumber("1111"), new MobileNumber("3333"), new MobileNumber("1233")));

		Student student3 = new Student("Jason", 20, new Address("1236"),
				Arrays.asList(new MobileNumber("3333"), new MobileNumber("4444")));

		Student student4 = new Student("Dhanushma", 28, new Address("680641"),
				Arrays.asList(new MobileNumber("6767754"), new MobileNumber("667788")));

		List<Student> students = Arrays.asList(student1, student2, student3, student4);

		// Get student with exact match name "Dhanushma"
		Optional<Student> st = students.stream().filter(s -> s.getName().equals("Dhanushma")).findFirst();
		System.out.println(st.isPresent() ? st.get().toString() : "noStudent");

		// Get student with matching address "1235"
		Optional<Student> st1 = students.stream().filter(s -> s.getAddress().getZipcode().equals("1235")).findFirst();
		System.out.println(st1.isPresent() ? st1.get().toString() : "noStudent");

		// Get all student having mobile numbers 3333.
		List<Student> result = students.stream()
				.filter(s -> s.getMobileNumbers().stream().anyMatch(m -> m.getNumber().equals("3333")))
				.collect(Collectors.toList());
		String x = result.stream().map(s -> s.getName()).collect(Collectors.joining(","));
		System.out.println(x);

		// Get all student having mobile number 1233 and 1234
		List<Student> result1 = students.stream()
				.filter(s -> s.getMobileNumbers().stream()
						.allMatch(m -> m.getNumber().equals("1233") || m.getNumber().equals("1234")))
				.collect(Collectors.toList());
		String y = result1.stream().map(s -> s.getName()).collect(Collectors.joining(",", "[", "]"));
		System.out.println(y);

		// Convert List<Student> to List<String> of student name
		List<String> studentNames = students.stream().map(s -> s.getName()).collect(Collectors.toList());
		// studentNames.stream().forEach(System.out::println);
		System.out.println(studentNames.stream().collect(Collectors.joining(",")));

		// Change the case of List<String>
		List<String> nameList = Arrays.asList("Ammu", "Dany", "Amal", "Mehr");
		nameList.stream().map(n -> n.toUpperCase()).forEach(System.out::println);

		// Sort List<String>
		nameList.stream().sorted().forEach(System.out::println);

		// sorting based on a condition
		students.stream().sorted(Comparator.comparing(Student::getName)).collect(Collectors.toList()).stream()
				.forEach(s -> System.out.println(s.getName()));

		// group students on their age
		Map<Integer, List<Student>> map = new HashMap<>();
		map = students.stream().collect(Collectors.groupingBy(student -> student.getAge()));
		
		//average age of students
		double averageAge = students.stream().mapToInt(Student::getAge).average().getAsDouble();
		System.out.println("Average Age " + averageAge);

	}

}
