package hospitalmultilevelinheritance;

public class MemberAccount extends HospitalService{
    String hospitalName;

    String doctorName;
    String memberInsurance;

   /* public MemberAccount(String hospitalName, String doctorName, String memberInsurance) {
        this.hospitalName = hospitalName;
        this.doctorName = doctorName;
        this.memberInsurance = memberInsurance;
    }*/

    public boolean consultation(String hospitalName, String doctorName, String memberInsurance){
        return super.consultation(hospitalName,doctorName,memberInsurance);

    }
}
