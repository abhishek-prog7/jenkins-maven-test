package com.jenkins.maven;

import com.learning.jenkins.messageSource;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        System.out.println("This is my jenkins project");
        System.out.println("I am testing CI");
        messageSource message = new messageSource();
        message.getMessage();

    }
}