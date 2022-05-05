// Ferid Ruano
// 10/22/18
// Lab 7b - Course Service Class

public class Course
{

    // Instance Variables
    private String courseCode;
    private String courseDesc;
    private int courseCredit;

    // Default Constructor
    public Course()
    {
        this.courseCode = null;
        this.courseDesc = "";
        this.courseCredit = 0;
    }

    // Secondary Constructor
    public Course(String startCourseCode, String startCourseDesc, int startCourseCredit)
    {
        setCourseCode(startCourseCode);
        setCourseDesc(startCourseDesc);
        setCourseCredit(startCourseCredit);
    }

    // Accessor Method - Course Code
    public String getCourseCode()
    {
        return this.courseCode;
    }

    // Accessor Method - Course Description
    public String getCourseDesc()
    {
        return this.courseDesc;
    }

    // Accessor Method - Course Credit
    public int getCourseCredit()
    {
        return this.courseCredit;
    }

    // Mutator Method - Course Description
    public void setCourseCode(String courseCode)
    {
        this.courseCode = courseCode;
    }

    // Mutator Method - Course Description
    public void setCourseDesc(String courseDesc)
    {
        this.courseDesc = courseDesc;
    }

    // Mutator Method - Course Credit
    public void setCourseCredit(int courseCredit)
    {
        this.courseCredit = courseCredit;
    }

    // toString Method
    public String toString()
    {
        return "Course Code: " + getCourseCode()
                + "\nCourse Description: " + getCourseDesc()
                + "\nCourse Credit: " + getCourseCredit()
                + "\nThe level is: " + level();
    }

    // Equals Method
    public boolean equals(Course otherObject)
    {
        return this.courseCode.equalsIgnoreCase(otherObject.courseCode) && this.courseDesc.equalsIgnoreCase(otherObject.courseDesc);
    }

    // Course Level - Only Applies to CS1 - CS9 and that is the reason why I used char
    public char level()
    {
        return this.courseCode.charAt(courseCode.length() - 1);
    }
}
