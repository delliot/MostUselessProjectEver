public class CourseSelection {
    private Semester semester;
    private Instructor instructor;


    public CourseSelection(Semester s, Instructor i)
    {
        this.semester = s;
        this.instructor = i;
    }

    public void getSemester()
    {
        System.out.println("Message: ");
        System.out.println("className: CourseSelection");
        System.out.println("MethodName: getSemester()");
        System.out.println("");
    }

    public void selectCourses()
    {
        System.out.println("Message: ");
        System.out.println("className: CourseSelection");
        System.out.println("MethodName: selectCourses()");
        System.out.println("");
    }

    public void confirmCourseToDelete()
    {
        System.out.println("Message: ");
        System.out.println("className: CourseSelection");
        System.out.println("MethodName: confirmCourseToDelete()");
        System.out.println("");
    }

    public void selectCourseToDelete()
    {
        System.out.println("Message: ");
        System.out.println("className: CourseSelection");
        System.out.println("MethodName: selectCourseToDelete()");
        System.out.println("");
    }

}
