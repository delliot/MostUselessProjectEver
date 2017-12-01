public class Semester {
    private CourseCatalog courseCatalog;
    private int semesterId;
    private DBAccess dbAccess;

    public Semester(int id, CourseCatalog cc, DBAccess dbAccess)
    {
        this.courseCatalog = cc;
        this.semesterId = id;
        this.dbAccess = dbAccess;
    }

    public void getAllCourses(String all)
    {
        System.out.println("Message: ");
        System.out.println("className: semester");
        System.out.println("MethodName: getAllCourses()");
        System.out.println("");
    }

    public void getCourseSections(String sections)
    {
        System.out.println("Message: ");
        System.out.println("className: semester");
        System.out.println("MethodName: getCourseSections()");
        System.out.println("");
    }

    public void getSemester(String semester)
    {
        System.out.println("Message: ");
        System.out.println("className: semester");
        System.out.println("MethodName: getSemester()");
        System.out.println("");
    }

}
