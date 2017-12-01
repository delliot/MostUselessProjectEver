public class Instructor {
    private int _id;
    private String fName;
    private String lName;
    private String email;
    private String phone;
    private DBAccess dbAccess;

    Instructor(int id, String fName, String lName, String email,
               String phone, DBAccess dbAccess)
    {
        this._id = id;
        this.fName = fName;
        this.lName = lName;
        this. email = email;
        this.phone = phone;
        this. dbAccess = dbAccess;
    }

    public void submitLoginInfo()
    {

        System.out.println("Message: ");
        System.out.println("className: Instructor");
        System.out.println("MethodName: submitLoginInfo()");
        System.out.println("");
    }
}
