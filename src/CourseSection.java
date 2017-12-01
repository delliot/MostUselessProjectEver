public class CourseSection {

    private int cm;
    private String[] details;
    private String name;

    public CourseSection(int cm, String[] details, String name)
    {
        this.cm = cm;
        this.details = details;
        this.name = name;
    }

    public void getCourseSection(String section)
    {

        System.out.println("Message: ");
        System.out.println("className: CourseSection");
        System.out.println("MethodName: getCourseSection()");
        System.out.println("");
    }

}
