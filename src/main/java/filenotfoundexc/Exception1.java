package filenotfoundexc;

public class Exception1 {
    public static void main(String[] args){
        String name = null;
        String company = "neoteric";
        System.out.println(name);
        System.out.println(company);
        try {
            System.out.println(name.toUpperCase());
        }catch (Exception e){
            e.printStackTrace();
            System.out.println("Error Occured"+e.getMessage());
            throw new RuntimeException(e);

        }finally {
            System.out.println("From Finally Block");
        }
        System.out.println(company.toUpperCase());
    }
}
