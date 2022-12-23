package ru.netology.revision;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RadioTest {

    @Test
    public void shouldSet6Station() {
        Radio radioStation = new Radio(10);
        radioStation.setCurrentStation(6);

        int expected = 6;
        int actual = radioStation.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSet0Station() {
        Radio radioStation = new Radio(10);
        radioStation.setCurrentStation(0);

        int expected = 0;
        int actual = radioStation.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSet9Station() {
        Radio radioStation = new Radio(10);
        radioStation.setCurrentStation(9);

        int expected = 9;
        int actual = radioStation.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }


    @Test
    public void sholdSetNext9Station() {
        Radio radioStation = new Radio(10);
        radioStation.setCurrentStation(9);
        radioStation.next();
        int expected = 0;
        int actual = radioStation.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void sholdSetNext0Station() {
        Radio radioStation = new Radio(10);
        radioStation.setCurrentStation(0);
        radioStation.next();
        int expected = 1;
        int actual = radioStation.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void sholdSetNext5Station() {
        Radio radioStation = new Radio(10);
        radioStation.setCurrentStation(5);
        radioStation.next();
        int expected = 6;
        int actual = radioStation.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void sholdSetPrev0Station() {
        Radio radioStation = new Radio(10);
        radioStation.prev();
        int expected = 9;
        int actual = radioStation.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void sholdSetPrev0StationAmount20() {
        Radio radioStation = new Radio(20);
        radioStation.prev();
        int expected = 19;
        int actual = radioStation.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void sholdSetPrev5Station() {
        Radio radioStation = new Radio(10);
        radioStation.setCurrentStation(5);
        radioStation.prev();
        int expected = 4;
        int actual = radioStation.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void sholdSetPrev9Station() {
        Radio radioStation = new Radio(10);
        radioStation.setCurrentStation(9);
        radioStation.prev();
        int expected = 8;
        int actual = radioStation.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void sholdSetStation() {
        Radio radioStation = new Radio();
        radioStation.setCurrentStation(8);
        int expected = 8;
        int actual = radioStation.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void sholdSetPlus100Volume() {
        Radio radioVolume = new Radio(101);
        radioVolume.setCurrentVolume(100);
        radioVolume.plus();
        int expected = 100;
        int actual = radioVolume.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void sholdSetPlus5Volume() {
        Radio radioVolume = new Radio(101);
        radioVolume.setCurrentVolume(5);
        radioVolume.plus();
        int expected = 6;
        int actual = radioVolume.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void sholdSetPlus0Volume() {
        Radio radioVolume = new Radio(101);
        radioVolume.setCurrentVolume(0);
        radioVolume.plus();
        int expected = 1;
        int actual = radioVolume.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void sholdSetMinus0Volume() {
        Radio radioVolume = new Radio(101);
        radioVolume.setCurrentVolume(0);
        radioVolume.minus();
        int expected = 0;
        int actual = radioVolume.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void sholdSetMinus5Volume() {
        Radio radioVolume = new Radio(101);
        radioVolume.setCurrentVolume(5);
        radioVolume.minus();
        int expected = 4;
        int actual = radioVolume.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void sholdSetMinus100Volume() {
        Radio radioVolume = new Radio(101);
        radioVolume.setCurrentVolume(100);
        radioVolume.minus();
        int expected = 99;
        int actual = radioVolume.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }
}