public class SelectCourseController {
    DBAccess dbAccess;
    Instructor instructor;
    CourseCatalog courseCatalog;
    Schedule schedule;




    public SelectCourseController(DBAccess dbAccess, Instructor instructor,
                           CourseCatalog cc, Schedule schedule)
    {
        this.courseCatalog = cc;
        this.instructor = instructor;
        this.schedule = schedule;
        this.dbAccess = dbAccess;
    }


    public void enterLoginInfo(String loginInfo)
    {
        System.out.println("Message: ");
        System.out.println("className: SelectCourseController");
        System.out.println("MethodName: enterLoginInfo()");
        System.out.println("");
    }

    public void requestSemester(String semester)
    {
        System.out.println("Message: ");
        System.out.println("className: SelectCourseController");
        System.out.println("MethodName: requestSemester()");
        System.out.println("");
    }

    public void presentActivityOptions(String options)
    {

        System.out.println("Message: ");
        System.out.println("className: SelectCourseController");
        System.out.println("MethodName: presentActivityOptions()");
        System.out.println("");
    }

    public void selectAdd(String add)
    {

        System.out.println("Message: ");
        System.out.println("className: SelectCourseController");
        System.out.println("MethodName: selectAdd()");
        System.out.println("");
    }

    public void displayCourseScreen(String screen)
    {

        System.out.println("Message: ");
        System.out.println("className: SelectCourseController");
        System.out.println("MethodName: displayCourseScreen()");
        System.out.println("");
    }

    public void selectCourse(String course)
    {

        System.out.println("Message: ");
        System.out.println("className: SelectCourseController");
        System.out.println("MethodName: selectCourse()");
        System.out.println("");
    }

    public void displayCourseDetails(String details)
    {

        System.out.println("Message: ");
        System.out.println("className: SelectCourseController");
        System.out.println("MethodName: displayCourseDetails()");
        System.out.println("");
    }

    public void confirmCourseSelection(String selections)
    {

        System.out.println("Message: ");
        System.out.println("className: SelectCourseController");
        System.out.println("MethodName: confirmCourseSelection()");
        System.out.println("");
    }

    public void selectDelete(String delete)
    {

        System.out.println("Message: ");
        System.out.println("className: SelectCourseController");
        System.out.println("MethodName: selectDelete()");
        System.out.println("");
    }

    public void selectCoursesToDelete(String selection)
    {

        System.out.println("Message: ");
        System.out.println("className: SelectCourseController");
        System.out.println("MethodName: enterLoginInfo()");
        System.out.println("");
    }

    public void confirmCourseToDelete(String display)
    {

        System.out.println("Message: ");
        System.out.println("className: SelectCourseController");
        System.out.println("MethodName: confirmCourseToDelete()");
        System.out.println("");
    }

    public void reviewCoursesToTeach(String review)
    {

        System.out.println("Message: ");
        System.out.println("className: SelectCourseController");
        System.out.println("MethodName: reviewCoursesToTeach()");
        System.out.println("");
    }

    public void selectPrintSchedule(String schedule)
    {

        System.out.println("Message: ");
        System.out.println("className: SelectCourseController");
        System.out.println("MethodName: selectPrintSchedule()");
        System.out.println("");
    }

    public void  displayReviewInto(String info)
    {

        System.out.println("Message: ");
        System.out.println("className: SelectCourseController");
        System.out.println("MethodName: displayReviewInfo()");
        System.out.println("");
    }
}
