public class Member extends Person {
    private boolean isBasic;

    public Member(String name, String cpr) {
        super(name, cpr);
    }


    public boolean isBasic(boolean isBasic) {
        return isBasic;
    }
    public int monthlyFee(){
        if(isBasic){
            return 199;
        }
        else{
            return 299;
        }
    }
    public String getMemberType(){
        if(isBasic){
            return "Basic";
        }
        else{
            return "Full";
        }
    }


}
