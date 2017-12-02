public class CourseSelection {
    private Semester semester;
    private Instructor instructor;


    public CourseSelection(Semester s, Instructor i)
    {
        this.semester = s;
        this.instructor = i;
    }

    public void getSemester(String semester)
    {
        System.out.println("Message: ");
        System.out.println("className: CourseSelection");
        System.out.println("MethodName: getSemester()");
        System.out.println("");
    }

    public void addCourseSelectionToSchedule(String course)
    {
        System.out.println("Message: ");
        System.out.println("className: CourseSelection");
        System.out.println("MethodName: addCourseSelectionToSchedule()");
        System.out.println("");
    }

    public void getCourseSelections(String selections)
    {
        System.out.println("Message: ");
        System.out.println("className: CourseSelection");
        System.out.println("MethodName: getCourseSelections()");
        System.out.println("");
    }

    public void deleteCourseSelectionFromSchedule(String delete)
    {
        System.out.println("Message: ");
        System.out.println("className: CourseSelection");
        System.out.println("MethodName: deleteCourseSelectionFromSchedule()");
        System.out.println("");
    }

}
