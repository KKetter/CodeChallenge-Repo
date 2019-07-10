package RepeatedWord;

import hashtable.Hashtable;

import java.util.Arrays;

public class RepeatedWord {

    public static String repeatedWord(String statement) {
        //all characters to lowercase
        String morphString = statement.toLowerCase();
        System.out.println(morphString);

        //eliminates all punctuation("apple..." then "apple."
        morphString = morphString.replaceAll("[^a-z ]","");
        System.out.println(morphString);

        //splits up string into individual array parts
        String[] splitString = morphString.split(" ");
        System.out.println(Arrays.toString(splitString));

        Hashtable wb = new Hashtable(statement.length());
        for (String string : splitString) {
            if (wb.contains(string)) {
                return string;
            } else {
                wb.add(string,"0");
            }
        }
        return "no repeats, nice vocabulary!";
    }
}
