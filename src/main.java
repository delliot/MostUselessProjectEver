public class main {

    public static void main(String[] args)
    {
        DBAccess dbAccess = new DBAccess();
        CourseSection c1 = new CourseSection(1, new String[]{""}, "COMP3711");
        CourseSection c2 = new CourseSection(1, new String[]{""}, "COMP3717");
        CourseSection c3 = new CourseSection(1, new String[]{""}, "COMP3721");

        CourseSection[] sections = new CourseSection[]{c1,c2,c3};
        CourseCatalog courseCatalog = new CourseCatalog(sections);
        Semester semester = new Semester(201703, courseCatalog, dbAccess);


        Instructor instructor = new Instructor(38293, "Chris", "Jones",
                "chris@jones.gov", "7785559492", dbAccess);

        Schedule schedule = new Schedule(semester, instructor, new CourseSection[]{});

        SelectCourseController controller = new SelectCourseController(dbAccess, instructor,
                courseCatalog,schedule);

        CourseSelection selection = new CourseSelection(semester,instructor);

        controller.enterLoginInfo("info");
        instructor.submitLoginInfo();
        dbAccess.fetchInstructorData("data");


        controller.requestSemester("winter 2017");
        semester.getSemester("winter2017");
        dbAccess.fetchSemester("winter2017");
        controller.presentActivityOptions("options");

        controller.selectAdd("course");
        semester.getAllCourses("all");
        courseCatalog.getCourseCatalog("winter2017");
        dbAccess.fetchCourses("courses");
        controller.displayCourseScreen("screen");

        controller.selectCourse("courses");
        semester.getCourseSections("sections");
        courseCatalog.getCourseSections("sections");
        sections[0].getCourseSection("section");
        dbAccess.fetchSectionDetails("details");
        controller.displayCourseDetails("details");

        controller.confirmCourseSelection("confirm");
        schedule.addToSchedule(selection.toString());
        dbAccess.addCourseSelectionToSchedule("course");

        controller.selectCoursesToDelete("delete");
        schedule.getCourseSelectionsFromSchedule("schedule");
        dbAccess.fetchCourseSelectionsPerInstructor("courses");
        controller.displayCourseScreen("screen");


        controller.confirmCourseToDelete("courses to delete");
        schedule.deleteFromSchedule("delete");
        dbAccess.deleteCourseSelectionFromSchedule("delete");

        controller.reviewCoursesToTeach("");
        schedule.getCourseSelectionsFromSchedule("schedule");
        dbAccess.fetchCourseSelectionsPerInstructor("courses");
        controller.displayReviewInto("review info");

        controller.selectPrintSchedule("print");
        schedule.printSchedule("print");



    }
}
