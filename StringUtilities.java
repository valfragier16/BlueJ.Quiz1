
public class StringUtilities {
    /**
     * @param input value to be returned
     * @return `input`
     */
    public String returnInput(String input) {
        return input;
    }

    /**
     * @param baseValue value to be added to
     * @param valueToBeAdded value to add
     * @return the concatenation of `baseValue` and `valueToBeAdded`
     */
    public String concatenate(String baseValue, String valueToBeAdded) {
        String a = baseValue;
        String b = valueToBeAdded;
        String result = a + b;
        
        return result;
    }

    /**
     * @param valueToBeReversed value to be reversed
     * @return identical string with characters in opposite order
     */
    public String reverse(String valueToBeReversed) {
       int len = valueToBeReversed.length();
       StringBuilder reversed = new StringBuilder(len);
       
       for (int i = (len - 1); i >= 0; i--){
           reversed.append(valueToBeReversed.charAt(i));
        }
        
        return reversed.toString();
    }

    /**
     * @param word word to get middle character of
     * @return middle character of `word`
     */
    public Character getMiddleCharacter(String word) {
        int len = word.length();
        int mid = len/2;
        
        char result = word.charAt(mid);
        return result;
        
    }
    

    /**
     * @param value value to have character removed from
     * @param charToRemove character to be removed from `value`
     * @return `value` with char of value `charToRemove` removed
     */
    public String removeCharacter(String value, Character charToRemove) {
        String str = value;
        //convert Character to String to use the .replace() function
        String c = String.valueOf(charToRemove);
        // place all `charToRemove` values to "" to show it is removed
        String result = str.replace(c, "");
        return result;
    }

    /**
     * @param sentence String delimited by spaces representative of a sentence
     * @return last `word` in sentence
     */
    public String getLastWord(String sentence) {
        String myString = sentence;
        String[] parts = myString.split(" ");
        String lastWord = parts[parts.length - 1];
        
        return lastWord;
    }
}
