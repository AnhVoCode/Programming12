public class StringReverse {
    /**
     * Reverse the end of a string
     *
     *                          012345                      012345
     * For example: reverseEnd("Hello, world", 5 ) returns "Hellodlrow ,"
     *                               <----->                     <----->
     * With start ==0, reverse the entire text.
     * With start = text.length(), reverse nothing.
     *
     * @param text   non-null String that will have its end reversed
     * @param start  the index at which the remainder of the input is reversed,
     *               requires 0<= start <=text.length()
     * @return       input text with the substring from start to the end of the string reversed
     */
    public static String reverseEnd(String text, int start){
        String message;
        String notReverse = "";
        String reverse = "";
        if (text == ""){
          return reverse+notReverse;
        }
        if (start<0){
           message = "Start at 0 or greater";
           return message;
        }
        if(start>text.length()){
           message = "Start number must be less than or equal to length of the text";
           return message;
        }
        else{
            for(int i=0;i<=text.length();i++){
                String end;
                if(i==start){
                    notReverse = text.substring(0,i);
                    end =text.substring(i);
                    for(int j=end.length()-1;j>=0;j--){
                        reverse+=end.charAt(j);
                    }
                }

            }
        }
        return notReverse+reverse;
    }

}
