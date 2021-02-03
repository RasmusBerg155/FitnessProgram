package com.company;

public class Member extends Person{

    private boolean isBasic;

    public Member(String name, String cpr, boolean isBasic) {
        super(name, cpr);
        this.isBasic = isBasic;
    }

    public boolean isBasic() {
        return isBasic;
    }

    public void setBasic(boolean basic) {
        isBasic = basic;
    }

    public int feeMontly(){
        if(isBasic){
            return 199;
        }
        else{
            return 299;
        }
    }

    public String checkBasic(){
        if (isBasic){
            return "Full ";
        }
            return "Basic";
    }

    @Override
    public String toString() {
        return name + "       " + cpr + "       " + checkBasic() + "              " + feeMontly();
    }
}
