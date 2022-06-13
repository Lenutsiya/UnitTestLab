public class CILab implements CILabInterface {
    private String myString;

    @Override
    public String getString() {
        return myString;
    }

    @Override
    public void setString(String string) {
        myString = string;
    }

    @Override
    public boolean detectCapitalUse() throws Exception {
        char[] charArray = this.myString.toCharArray();

        for(char i: charArray){
            if(!Character.isUpperCase(charArray[i])){
                return false;
            }
        }


        throw new Exception("throwing exception");
        return false;
    }

}

