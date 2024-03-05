package swiggy;

public abstract class Login extends SwiggyLogin {

    String userName ="Mahesh";
    String password= "Mahesh";

    public Login(String swiggyUserName, String swiggyPassword) {
        super(swiggyUserName,swiggyPassword);

    }
    public boolean login(String swiggyUserName, String swiggyPassword) {
        if (userName.equals(swiggyUserName) && password.equals(swiggyPassword)){
            System.out.println("login successful");
            return true;
        }else{
            System.out.println("login unsuccessful");
            return false;
        }
    }
}
