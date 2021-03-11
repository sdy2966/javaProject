package generics;

import java.util.Arrays;

public class WildCardExample {
	public static <T> void registerCourse(Course<?> course) {
		System.out.println(course.getCourseName() + " 수강생: " + Arrays.toString(course.getStudents()));
	}
	public static void registerCourseWorker(Course<? super Worker> course) {
		System.out.println(course.getCourseName() + " 수강생: " + Arrays.toString(course.getStudents()));
	}
	
	public static void registerCourseStudent(Course<? super Student> course) {
		System.out.println(course.getCourseName() + " 수강생: " + Arrays.toString(course.getStudents()));
	}
	
	public static void main(String[] args) {
		Course <Person> personCourse= new Course<Person>("일반인과정", 5);
			personCourse.add(new Person("일반인"));
			personCourse.add(new Worker("직장인"));
			personCourse.add(new Student("학생"));
			personCourse.add(new HighStudent("고등학생"));
		Course<Worker> workerCourse = new Course<Worker>("직장인과정",5);
		workerCourse.add(new Worker("직장인"));
		Course<Student> StudentCourse = new Course<Student>("학생과정",5);
		StudentCourse.add(new Student("학생"));
		StudentCourse.add(new HighStudent("고등학생"));
		Course<HighStudent> HighStudentCourse = new Course<HighStudent>("고등학생과정",5);
		HighStudentCourse.add(new HighStudent("고등학생"));
		
		register
	}

}
