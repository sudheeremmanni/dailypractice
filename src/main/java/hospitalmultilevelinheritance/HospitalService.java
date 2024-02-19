package hospitalmultilevelinheritance;

public class HospitalService {

    String typeOfPatient = null;
    int amt = 0;


    public boolean consultation(String hospitalName, String doctorName, String memberInsurance){
        if (memberInsurance == "Y"){
            typeOfPatient = "Corporate";
        } else{
            typeOfPatient = "Member";
        }
        return this.bookConsultation(hospitalName,doctorName,typeOfPatient);
    }
    private boolean bookConsultation(String hospitalName, String doctorName, String typeOfPatient){
        if (hospitalName.equals("Medicover")){
            if(doctorName.equals("Raja")){
                if(typeOfPatient.equals("Corporate")){
                    amt = 800;
                }
            }else {
                amt = 1200;
            }
        }
       return true;

    }
}
