package ru.netology.revision;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RadioTest {

    @Test
    public void shouldSet6Station() {
        Radio radioStation = new Radio();
        radioStation.setCurrentStation(6);

        int expected = 6;
        int actual = radioStation.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSet0Station() {
        Radio radioStation = new Radio();
        radioStation.setCurrentStation(0);

        int expected = 0;
        int actual = radioStation.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSet9Station() {
        Radio radioStation = new Radio();
        radioStation.setCurrentStation(9);

        int expected = 9;
        int actual = radioStation.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetMinusStation() {
        Radio radioStation = new Radio();
        radioStation.setCurrentStation(-1);

        int expected = 0;
        int actual = radioStation.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSet10Station() {
        Radio radioStation = new Radio();
        radioStation.setCurrentStation(10);

        int expected = 0;
        int actual = radioStation.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void sholdSetNext9Station() {
        Radio radioStation = new Radio();
        radioStation.currentStation = 9;
        radioStation.next();
        int expected = 0;
        int actual = radioStation.currentStation;
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void sholdSetNext0Station() {
        Radio radioStation = new Radio();
        radioStation.currentStation = 0;
        radioStation.next();
        int expected = 1;
        int actual = radioStation.currentStation;
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void sholdSetNext5Station() {
        Radio radioStation = new Radio();
        radioStation.currentStation = 5;
        radioStation.next();
        int expected = 6;
        int actual = radioStation.currentStation;
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void sholdSetPrev0Station() {
        Radio radioStation = new Radio();
        radioStation.prev();
        int expected = 9;
        int actual = radioStation.currentStation;
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void sholdSetPrev5Station() {
        Radio radioStation = new Radio();
        radioStation.currentStation = 5;
        radioStation.prev();
        int expected = 4;
        int actual = radioStation.currentStation;
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void sholdSetPrev9Station() {
        Radio radioStation = new Radio();
        radioStation.currentStation = 9;
        radioStation.prev();
        int expected = 8;
        int actual = radioStation.currentStation;
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void sholdSetPlus10Volume() {
        Radio radioVolume = new Radio();
        radioVolume.currentVolume = 10;
        radioVolume.plus();
        int expected = 10;
        int actual = radioVolume.currentVolume;
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void sholdSetPlus5Volume() {
        Radio radioVolume = new Radio();
        radioVolume.currentVolume = 5;
        radioVolume.plus();
        int expected = 6;
        int actual = radioVolume.currentVolume;
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void sholdSetPlus0Volume() {
        Radio radioVolume = new Radio();
        radioVolume.currentVolume = 0;
        radioVolume.plus();
        int expected = 1;
        int actual = radioVolume.currentVolume;
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void sholdSetMinus0Volume() {
        Radio radioVolume = new Radio();
        radioVolume.currentVolume = 0;
        radioVolume.minus();
        int expected = 0;
        int actual = radioVolume.currentVolume;
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void sholdSetMinus5Volume() {
        Radio radioVolume = new Radio();
        radioVolume.currentVolume = 5;
        radioVolume.minus();
        int expected = 4;
        int actual = radioVolume.currentVolume;
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void sholdSetMinus10Volume() {
        Radio radioVolume = new Radio();
        radioVolume.currentVolume = 10;
        radioVolume.minus();
        int expected = 9;
        int actual = radioVolume.currentVolume;
        Assertions.assertEquals(expected, actual);
    }
}