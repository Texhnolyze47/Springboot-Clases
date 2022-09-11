package com.example.springpatterns.patterns.behavioral.template;

public class Main {

    public static void main(String[] args) {

        HtmlHome home = new HtmlHome();
        System.out.println(home.render());

        HtmlAboutUs aboutUs = new HtmlAboutUs();
        System.out.println(aboutUs.render());


    }
}
