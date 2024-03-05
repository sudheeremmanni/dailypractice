package swiggy;

public abstract class SwiggyLogin {
    private String swiggyUserName ;
    private String swiggyPassword;

    public SwiggyLogin(String swiggyUserName, String swiggyPassword) {
        this.swiggyUserName = swiggyUserName;
        this.swiggyPassword = swiggyPassword;
    }
    public String getSwiggyUserName() {
        return swiggyUserName;
    }

    public String getSwiggyPassword() {
        return swiggyPassword;
    }

    protected abstract boolean login(String swiggyUserName, String swiggyPassword);
    protected abstract double productPrice(int productQty, int productPrice);


    }










