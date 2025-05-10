package process1;

import java.util.*;
public class HelloBiodome08 {
    public static void main(String[] args) {
        String a = args[0];
        List<String> alist = new ArrayList<>(Arrays.asList(a));
        List<String> alistt = new ArrayList<>(Arrays.asList(a));
        String[] dictionary = {"hello", "where", "this", "biodome", "help", "tree", "new", "is", "problem", "please", "need", "we", "isn’t", "there", "a", "your", "any", "thanks", "the", "for", "solution", "can", "?"};
        Arrays.sort(dictionary, Comparator.comparingInt(String::length).reversed());
        //System.out.println(Arrays.toString(dictionary));
        int i, j;
        for (i = 0; i < a.length(); i++) {
            for (j = 0; j < dictionary.length; j++) {
                if (dictionary[j].charAt(0) == a.charAt(i)) {

                    if ((alist.subList(i, i + dictionary[j].length())).equals(dictionary[j])) {
                        System.out.println(dictionary[i]);
                        alistt.add(i + dictionary[j].length(), " ");
                        i += dictionary[j].length();
                        continue;
                    }
                }

            }
        }
        System.out.println(alistt);


    }
}