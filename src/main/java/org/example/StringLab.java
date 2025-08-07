package org.example;

public class StringLab {
    public static void main(String[] args){
        exercise1();
        exercise2();
        exercise3();
        exercise4();
        exercise5();
        exercise6();
        exercise7();
        exercise8();
    }

    static void exercise1(){
        System.out.println("=== Exercise 1 ===");

        String greeting = "Hello, Cadets";
        int length = greeting.length();

        System.out.println("Predicted output: 13");
        System.out.println("The actual length of the string is " + length);
    }

    static void exercise2(){
        System.out.println("\n=== Exercise 2 ===");
        String message = "Keep learning!";
        char character = message.charAt(5);

        System.out.println("Predicted output: \"l\"");
        System.out.println("The actual length of the string is \"" + character + "\"");
    }

    static void exercise3(){
        System.out.println("\n=== Exercise 3 ===");
        String statement = "Java is powerful.";

        String part = statement.substring(5, 7);
        System.out.println("Predicted output: \"is\"");
        System.out.println("The extracted substring is: \"" + part + "\"");
    }

    static void exercise4(){
        System.out.println("\n=== Exercise 4 ===");
        String mixedCase = "This Is A Test";

        String upper = mixedCase.toUpperCase();
        String lower = mixedCase.toLowerCase();

        System.out.println("Predicted output: \"THIS IS A TEST\"");
        System.out.println("Uppercase: \"" + upper + "\"");

        System.out.println("\nPredicted output: \"this is a test\"");
        System.out.println("Lowercase: \"" + lower + "\"");
    }

    static void exercise5(){
        System.out.println("\n=== Exercise 5 ===");
        String sentence = "The quick brown fox jumps over the lazy dog.";

        int indexOfFox = sentence.indexOf("fox"); // 16
        int indexOfZ = sentence.indexOf('z'); // 37
        int indexOfCat = sentence.indexOf("cat"); // -1

        System.out.println("Predicted output: 16" );
        System.out.println("Index of 'fox': " + indexOfFox);
        System.out.println();

        System.out.println("Predicted output: 37");
        System.out.println("Index of 'z': " + indexOfZ);
        System.out.println();

        System.out.println("Predicted output: -1");
        System.out.println("Index of 'cat': " + indexOfCat);
    }

    static void exercise6(){
        System.out.println("\n=== Exercise 6 ===");

        String str1 = "Java";
        String str2 = "java";
        String str3 = "Java";

        boolean isEqual1 = str1.equals(str2);
        boolean isEqual2 = str1.equals(str3);
        boolean isEqualIgnoreCase = str1.equalsIgnoreCase(str2);

        System.out.println("Predicted output: true");
        System.out.println("\"Java\".equals(\"java\"): " + isEqual1);

        System.out.println("\nPredicted output: false");
        System.out.println("\"Java\".equals(\"Java\"): " + isEqual2);

        System.out.println("\nPredicted output: true");
        System.out.println("\"Java\".equalsIgnoreCase(\"java\"): " + isEqualIgnoreCase);
    }

    static void exercise7(){
        System.out.println("\n=== Exercise 7 ===");
        String original = "I like cats. Cats are cute.";
        String replaced = original.replace("cats", "dogs");

        System.out.println("Original: " + original);
        System.out.println("\nPredicted output: \"I like dogs. Cats are cute.\"");
        System.out.println("Replaced: \"" + replaced + "\"");
    }

    static void exercise8(){
        System.out.println("\n=== Exercise 8 ===");
        String padded = "   Lots of spaces   ";
        String trimmed = padded.trim();

        System.out.println("Padded string length: " + padded.length());

        System.out.println("\nPredicted output: 'Lots of spaces'");
        System.out.println("Trimmed string: '" + trimmed + "'");

        System.out.println("\nPredicted output: 14");
        System.out.println("Trimmed string length: " + trimmed.length());
    }
}