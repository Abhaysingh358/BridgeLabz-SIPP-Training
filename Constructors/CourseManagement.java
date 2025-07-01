package Constructors;

public class CourseManagement {
    // Instance Variables
    private String courseName;
    private int duration; // in weeks or hours
    private double fee;

    // Class Variable (shared among all Course objects)
    private static String instituteName = "Default Institute";

    // Constructor to initialize course details
    public CourseManagement(String courseName, int duration, double fee) {
        this.courseName = courseName;
        this.duration = duration;
        this.fee = fee;
    }

    // Instance Method: Display course details
    public void displayCourseDetails() {
        System.out.println("Course Name: " + courseName);
        System.out.println("Duration: " + duration + " weeks");
        System.out.println("Fee: ₹" + fee);
        System.out.println("Institute Name: " + instituteName);
        System.out.println("----------------------------");
    }

    // Class Method: Update institute name
    public static void updateInstituteName(String newInstituteName) {
        instituteName = newInstituteName;
    }

    // Main method for demonstration
    public static void main(String[] args) {
    	CourseManagement c1 = new CourseManagement("Java Programming", 6, 5000);
    	CourseManagement c2 = new CourseManagement("Web Development", 8, 7000);

        // Displaying initial course details
        c1.displayCourseDetails();
        c2.displayCourseDetails();

        // Updating institute name using class method
        CourseManagement.updateInstituteName("Tech Academy");

        // Displaying updated course details
        c1.displayCourseDetails();
        c2.displayCourseDetails();
    }
}
