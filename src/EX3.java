import java.util.ArrayList;
public class EX3 {
    public static void main(String[] args) {

        String text = "345-12-456-78-56-5";
        String text2 = "1998-2005-1956";
        String text3 = "hello-my-hello-wow-my-home-breakfast";

//        System.out.println(sum(text));
//        System.out.println(year(text2));
        repeat(text3);
    }
    public static int year (String text){
        String[] numbers = text.split("-");
        int result = 0;
        for(String number : numbers){
            result += 2024 - Integer.parseInt(number);
        }
        return result;
    }
    public static int sum (String text){
        String[] numbers = text.split("-");
        int result = 0;
        for(String number : numbers){
             result += Integer.parseInt(number);

        }
        return result;
    }
    public static void repeat (String text){
        String[] words = text.split("-");
        for(String word : words){
            int counter  = 0;
            for(String  word2 : words ){
                if(word.equals(word2)){
                    counter++;
                }

            }
            if(counter >= 2){
                System.out.println(word);
            }
        }
    }
}

