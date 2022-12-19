package ru.netology.revision;

public class Radio {
    private int minStation = 0;
    private int maxStation = 9;
    private int currentStation = minStation;

    public Radio(int amount) {
        maxStation = amount - 1;
        maxVolume = amount - 1;
    }

    public void next() {
        if (currentStation == 9) {
            currentStation = 0;
        } else {
            currentStation++;
        }
    }

    public void prev() {
        if (currentStation == 0) {
            currentStation = 9;
        } else {
            currentStation--;
        }
    }

    public int getCurrentStation() {
        return currentStation;
    }

    public void setCurrentStation(int newCurrentStation) {
        if (newCurrentStation < 0) {
            return;
        }
        if (newCurrentStation > 9) {
            return;
        }
        currentStation = newCurrentStation;
    }

    private int minVolume = 0;
    private int maxVolume = 100;
    private int currentVolume = minVolume;

    public int getCurrentVolume() {
        return currentVolume;
    }

    public void setCurrentVolume(int newCurrentVolume) {
        currentVolume = newCurrentVolume;
    }

    public void plus() {
        if (currentVolume == 100) {
            currentVolume = 100;
        } else {
            currentVolume++;
        }
    }

    public void minus() {
        if (currentVolume == 0) {
            currentVolume = 0;
        } else {
            currentVolume--;
        }
    }
}