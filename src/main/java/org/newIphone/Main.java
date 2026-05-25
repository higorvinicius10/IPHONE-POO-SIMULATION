package org.newIphone;

public class Main {
  public static void main(String[] args){

        Iphone iphone = new Iphone();

        // Music section
        iphone.playMusic();
        iphone.selectMusic("Imagine Dragons - BELIEVER");

        // Call section
        iphone.call("81.97911-7999");

        // Browser section
        iphone.displayPage("https://google.com");


    }
}
