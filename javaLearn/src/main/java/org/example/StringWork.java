package org.example;

public class StringWork {
    public static void main(String[] args) {
        //method to initiate string
        String name=new String("usman");
//        String name1="Ali";
//        System.out.println(name1);
//        System.out.println(name);
//
//        //length of string
//        int length=name.length();
//        System.out.println(length);
//
//        //uppercase
//        System.out.println(name.toUpperCase());
//
//        //lowerCase
//        System.out.println(name.toLowerCase());
//
        //Trim
        String a="    usman   ";
        System.out.println(a);
        System.out.println(a.trim());

        //Substring
        System.out.println(name.substring(2));
        System.out.println(name.substring(1,3));

        //replace
        System.out.println(name.replace("u","ah"));

        //start with
        System.out.println(name.startsWith("us"));
        //end with
        System.out.println(name.endsWith("an"));

        //index of
        String n="haseebeeb";
        System.out.println(name.indexOf("m"));
        //index of and start from index
        System.out.println(n.indexOf("eeb",4));
        System.out.println(n.lastIndexOf("eeb"));

        //char at
        System.out.println(name.charAt(2));

        //equal
        System.out.println(name.equals("Usman"));
        System.out.println(name.equalsIgnoreCase("Usman"));


        //escape \n \t \"
        System.out.println("hi \" usman");

    }
}
