package com.example.java.access;

public class Speaker {
    private int volume;

    public Speaker(int volume) {
        this.volume = volume;
    }

    void volumeUp() {
        if (volume > 100) {
            System.out.println("볼륨을 증가할 수 없습니다");
        } else {
            volume++;
            System.out.println("볼륨은 : " + volume);
        }
    }

    void volumeDown() {
        volume--;
        System.out.println("현재 볼륨은 : " + volume);
    }

    void showVolume() {
        System.out.println("볼룜은 : " + volume);
    }
}
