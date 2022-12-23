package ru.netology.revision;

public class Radio {
    private int minStation = 0;
    private int maxStation = 9;
    private int currentStation = minStation;
    private int minVolume = 0;
    private int maxVolume = 100;
    private int currentVolume = minVolume;

    public Radio() {
        maxStation = 9;
    }

    public Radio(int amount) {
        maxStation = amount - 1;
    }

    public void next() {
        if (currentStation < maxStation) {
            currentStation++;
        } else {
            currentStation = minStation;
        }
    }

    public void prev() {
        if (currentStation > minStation) {
            currentStation--;
        } else {
            currentStation = maxStation;
        }
    }

    public int getCurrentStation() {
        return currentStation;
    }

    public void setCurrentStation(int newCurrentStation) {
        if (0 < newCurrentStation && newCurrentStation < maxStation) {
        }
        currentStation = newCurrentStation;
    }

    public int getCurrentVolume() {
        return currentVolume;
    }

    public void setCurrentVolume(int newCurrentVolume) {
        currentVolume = newCurrentVolume;
    }

    public void plus() {
        if (currentVolume < 100) {
            currentVolume++;
        }
    }

    public void minus() {
        if (currentVolume > 0) {
            currentVolume--;
        }
    }
}