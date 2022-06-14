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
    public boolean detectCapitalUse() {
        char[] charArray = this.myString.toCharArray();
         if(Character.isUpperCase((charArray[0]))) {
             boolean result = false;
             for (int i = 1; i < charArray.length; i++){
                 if (Character.isLowerCase(charArray[i])){
                     continue;
                 }
                 else {
                     result = true;
                 }
             }
             return result;
         }

        if (isLowerCase(this.myString)){
            return true;
        }
        if (isUpperCase(this.myString)){
            return true;
        }
        return false;
    }
    private boolean isLowerCase (String string) {
        char[] charArray = string.toCharArray();
        for(char i: charArray){
            if(Character.isLowerCase(charArray[i])){
                continue;
            }
            return  false;
        }
        return true;
    }

    private boolean isUpperCase (String string) {
        char[] charArray = string.toCharArray();
        for(char i: charArray){
            if(Character.isUpperCase(charArray[i])){
                continue;
            }
            return  false;
        }
        return true;
    }

}

