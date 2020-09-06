package com.oshabz.readtimelibrary;

public class ReadTime {

    public static String readTime(String string){


        int wordCount = countWords(string);
        int total = wordCount /200;

        if(total < 1){
            return  "0.5 min read" ;
        }else{
            return total + "min read";
        }
    }

    public String customReadTime(String string, String message){

        int wordCount = countWords(string);
        int total = wordCount /200;

        if(total < 1){
            return  "0.5 " + message;
        }else{
            return total + " " + message;
        }
    }

    public static int countWords(String inputString){

        String strArray[] = inputString.split(" ");
        int count = 0;

        for (String s : strArray){
            if (!s.equalsIgnoreCase(" ")){
                count++;
            }
        }

        return count;
    }
}
