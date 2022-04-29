package task.day_2;

public class StringProcessor {

    public static void main(String[] args) {
        //Task 2. Given a string, find the number of words in it.

        String s="Task 2. Given a string, find the number of words in it.";
        System.out.println(s.split(" ").length);

        String[] wordArray=s.split(" ");

        //Task 3. Given a string, show number of chars in each word
        for(String w:wordArray){
            System.out.println(w.length()+"\t"+w);
        }

        //Task 4. Create function which takes 2 parameters:
        //1st(String) – text; 2nd (int) - index of word.
        // Function should return number of chars in word by its index in text
        System.out.println(stringWordCalc(wordArray,14));

    }

    private static int stringWordCalc(String[] wordArray, int i) {
        if(wordArray.length<(i+1)){
            throw new RuntimeException("Invalid index. Range should be: 0.."+(wordArray.length-1));
        }
        return wordArray[i].length();
    }

}
