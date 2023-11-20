package sdptSTUDENT;

public class Student {
    String firstName, lastName, year, course, section;
    int midtermGrade, finalGrade;
    Student(String firstName, String lastName, String year, String course, String section, int midtermGrade, int finalGrade){
        this.firstName = firstName;
        this.lastName = lastName;
        this.year = year;
        this.course = course;
        this.section = section;
        this.midtermGrade = midtermGrade;
        this.finalGrade = finalGrade;

    }
    
    void introduceSelf(){
        System.out.println("Hi! Im " + firstName + " " + lastName + " from BSIT " + year + " " + section);
    }
    
    void evaluateGrade(){
        int average = (finalGrade + midtermGrade) / 2;

        String result = (average > 100) ? "Invalid"
        : (average >= 98 && average <= 100) ? "With Highest Honors"
        : (average >= 95 && average < 98) ? "With High Honors"
        : (average >=90 && average < 95) ? "With Honors"
        : (average >= 75 && average < 90) ? "Passed"
        : "Failed";

        System.out.println("Grade: " + average + "\nRemarks: " + result);
    }
}
