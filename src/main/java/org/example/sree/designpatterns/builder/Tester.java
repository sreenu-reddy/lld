package org.example.sree.designpatterns.builder;

public class Tester {
    public static void main(String[] args) {
       User user=  new User
               .Builder(1,"sree")
               .phoneNumber("111111")
               .build();
    }
}
