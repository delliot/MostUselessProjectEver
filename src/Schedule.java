public class Schedule {
    private CourseSection[] courseSections;
    private Instructor instructor;
    private Semester semester;


    public Schedule(Semester s, Instructor i, CourseSection[] courseSections)
    {
        this.courseSections = courseSections;
        this.instructor = i;
        this.semester = s;
    }

    public void addToSchedule(String add)
    {
        System.out.println("Message: ");
        System.out.println("className: Schedule");
        System.out.println("MethodName: addToSchedule()");
        System.out.println("");
    }

    public void deleteFromSchedule(String delete)
    {
        System.out.println("Message: ");
        System.out.println("className: Schedule");
        System.out.println("MethodName: deleteFromSchedule()");
        System.out.println("");
    }

    public void printSchedule(String print)
    {
        System.out.println("Message: ");
        System.out.println("className: Schedule");
        System.out.println("MethodName: printSchedule()");
        System.out.println("");
    }

    public void displaySchedule(String display)
    {
        System.out.println("Message: ");
        System.out.println("className: Schedule");
        System.out.println("MethodName: displaySchedule()");
        System.out.println("");
    }

    public void getCourseSelectionsFromSchedule(String sched)
    {
        System.out.println("Message: ");
        System.out.println("className: Scedule");
        System.out.println("MethodName: getCourseSelectionsFromSchedule()");
        System.out.println("");
    }
}
