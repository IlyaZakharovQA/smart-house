package ru.netology.revision;

public class Radio {
    public int currentStation;

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

    public int currentVolume;

    public void plus() {
        if (currentVolume == 10) {
            currentVolume = 10;
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