package com.tothenew.beyond_java_8.ques4;

public class StringMethodExample {

    public static void main(String[] args) {

        String hello = "Hello! ";
        System.out.println("repeat(): " + hello.repeat(3));

        String spaced = "   Java 11   ";
        System.out.println("strip(): '" + spaced.strip() + "'");

        System.out.println("trim(): '" + spaced.trim() + "'");

        String blank = "   ";
        System.out.println("isBlank(): " + blank.isBlank());

        String text = "Line1\nLine2";
        System.out.println("indent(+4):\n" + text.indent(4));
        System.out.println("indent(-2):\n" + text.indent(-2));

        String transformed = "java".transform(s -> s.toUpperCase() + " is fun!");
        System.out.println("transform(): " + transformed);

        String block = """
                Line A
                    Line B
                Line C
                """;
        System.out.println("Original block:\n" + block);
        System.out.println("stripIndent():\n" + block.stripIndent());

        String escaped = "Hello\\nWorld\\tJava";
        System.out.println("translateEscapes():\n" + escaped.translateEscapes());


        String textBlock = """
                This is a text block
                spanning multiple lines
                without explicit \\n
                """;
        System.out.println("Text block:\n" + textBlock);

        String name = "Alice";
        int age = 25;
        String formatted = "Name: %s, Age: %d".formatted(name, age);
        System.out.println("formatted(): " + formatted);
    }


}
