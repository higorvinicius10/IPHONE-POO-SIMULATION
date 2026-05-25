package org.newIphone;


public class Iphone implements MusicPlayer, TelephoneDevice, Browser {

    @Override
    public void selectMusic(String music) {
        System.out.println("Selecting music: " + music);
    }

    @Override
    public void playMusic() {
        System.out.println("Playing music");
    }

    @Override
    public void pause() {
        System.out.println("Music paused");
    }

    @Override
    public void call(String number) {
        System.out.println("Calling: " + number);
    }

    @Override
    public void answer() {
        System.out.println("Answering call");
    }

    @Override
    public void startVoicemail() {
        System.out.println("Starting voicemail");
    }

    @Override
    public void displayPage(String url) {
        System.out.println("Displaying page: " + url);
    }

    @Override
    public void openNewTab() {
        System.out.println("New tab opened");
    }

    @Override
    public void refreshPage() {
        System.out.println("Page refreshed");
    }
}

}
