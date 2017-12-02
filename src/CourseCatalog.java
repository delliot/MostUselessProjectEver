public class CourseCatalog {
    private CourseSection[] courseSections;

    public CourseCatalog(CourseSection[] courseSections)
    {
        this.courseSections = courseSections;
    }

    public void getCourses(String catalog)
    {
        System.out.println("Message: ");
        System.out.println("className: CourseCatalog");
        System.out.println("MethodName: getCourses()");
        System.out.println("");
    }

    public void getCourseSections(String sections)
    {
        System.out.println("Message: ");
        System.out.println("className: CourseCatalog");
        System.out.println("MethodName: getCourseSections()");
        System.out.println("");
    }
}
