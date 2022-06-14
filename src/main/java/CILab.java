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
        boolean result = false;
        char[] charArray = this.myString.toCharArray();
         if(Character.isUpperCase((charArray[0]))) {
             result = true;
             for (int i = 1; i < charArray.length; i++){
                 if (Character.isLowerCase(charArray[i])){
                     result = true;
                 }
                 else {
                     result = false;
                     break;
                 }
             }
         }

        if (isLowerCase(this.myString) == true){
           result = true;

        }
        if (isUpperCase(this.myString) == true){
           result = true;
        }
        return result;
    }
    private boolean isLowerCase (String string) {
        char[] charArray = string.toCharArray();
        boolean result = false;
        for( int i = 0; i < charArray.length; i++ ) {
            if (Character.isLowerCase(charArray[i])) {
                result = true;

            }
            else {
                result = false;
                break;
            }
        }
        return result;
    }

    private boolean isUpperCase (String string) {
        char[] charArray = string.toCharArray();
        boolean result = false;
        for( int i = 0; i < charArray.length; i++ ){
            if(Character.isUpperCase(charArray[i])){
               result = true;
            }
            else {
                result = false;
                break;
            }
        }
        return result;
    }


}

