package LW_03.Q4;

public class Main {
    public static void main(String[] args) {
        Lecturer lecturer = new Lecturer();
        lecturer.setLecturerName("Ruth Downer");
        lecturer.setCourseTeaching("Mathematics");

        Course course = new Course();
        course.setCourseName("Mathematics");
        course.setCourseCode("M01");
        course.setLecturer(lecturer);

        Student student = new Student();
        student.setStudentName("Seth Rod");
        student.setCourseFollowing("Mathematics");
        student.setDegreeName("Higher Mathematics");

        // Student Information
        System.out.println("Student Information:");
        System.out.println("Name: " + student.getStudentName());
        System.out.println("Course Following: " + student.getCourseFollowing());
        System.out.println("Degree Name: " + student.getDegreeName());
        System.out.println();

        // Lecturer Information
        System.out.println("Lecturer Information");
        System.out.println("Lecturer Name: " + lecturer.getLecturerName());
        System.out.println("Course Teaching: " + lecturer.getCourseTeaching());
        System.out.println();

        // Course Information
        System.out.println("Course Information:");
        System.out.println("Course Name: " + course.getCourseName());
        System.out.println("Course Code: " + course.getCourseCode());
        System.out.println("Lecturer Name: " + course.getLecturer().getLecturerName());


    }
}
