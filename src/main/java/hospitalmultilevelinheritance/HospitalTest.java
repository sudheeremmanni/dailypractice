package hospitalmultilevelinheritance;

public class HospitalTest {
    public static void main(String[] args){
        HospitalService hospitalService = new CorporateAccount();
        hospitalService.consultation("Medicover","Raja","Y");
       // HospitalService h1 = new HospitalService();
        System.out.println("Amount to be Paid "+hospitalService.amt);

        HospitalService hospitalService1 = new MemberAccount();
        hospitalService.consultation("Medicover","Mahesh","N");
        // HospitalService h1 = new HospitalService();
        System.out.println("Amount to be Paid "+hospitalService.amt);




    }
}
