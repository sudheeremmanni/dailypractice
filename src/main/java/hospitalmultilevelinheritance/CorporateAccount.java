package hospitalmultilevelinheritance;

public class CorporateAccount extends HospitalService {
    String hospitalName;
    String doctorName;
    String memberInsurance;

    /*public CorporateAccount(String hospitalName, String doctorName, String memberInsurance) {
        this.consultation(hospitalName,doctorName,memberInsurance);
        this.hospitalName = hospitalName;
        this.doctorName = doctorName;
        this.memberInsurance = memberInsurance;
    }*/

    public boolean consultation(String hospitalName, String doctorName, String memberInsurance){
        return super.consultation(hospitalName,doctorName,memberInsurance);

    }
}
