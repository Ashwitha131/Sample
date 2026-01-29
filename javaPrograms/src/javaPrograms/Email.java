package javaPrograms;
import java.util.*;

public class Email {
    public static void main(String[] args) {
        Set<String> email = new HashSet<>();


        email.add("abc@gmail.com");
        email.add("bghk@gmail.com");
        email.add("char@gmail.com");
        email.add("abc@gmail.com"); 
        email.add("dick@gmail.com");
   
        List<String> emailList = new ArrayList<>(email);
        
        Collections.sort(emailList);
        for (String emails : emailList) {
            System.out.println(emails);
        }
    }
}

