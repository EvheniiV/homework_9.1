package ru.netology.radio;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RadioTest {

    @Test
    public void SetQuantityStationsTest() {
        Radio radio = new Radio(25);

        int expected = 24;
        int actual = radio.getQuantityStations();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void SetStationNumberTest() {
        Radio radio = new Radio(10);
        radio.setStationNumber(2);

        int expected = 2;
        int actual = radio.getStationNumber();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void SetStationNumberMoreAllowableValueTest() {
        Radio radio = new Radio(20);
        radio.setStationNumber(20);

        int expected = 0;
        int actual = radio.getStationNumber();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void SetStationNumberLessAllowableValueTest() {
        Radio radio = new Radio(15);
        radio.setStationNumber(-1);

        int expected = 0;
        int actual = radio.getStationNumber();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void NextInAllowableValueTest() {
        Radio radio = new Radio(10);
        radio.setStationNumber(5);
        radio.next();

        int expected = 6;
        int actual = radio.getStationNumber();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void NextMoreAllowableValueTest() {
        Radio radio = new Radio(20);
        radio.setStationNumber(19);
        radio.next();

        int expected = 0;
        int actual = radio.getStationNumber();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void NextMinAllowableValueTest() {
        Radio radio = new Radio(10);
        radio.setStationNumber(0);
        radio.next();

        int expected = 1;
        int actual = radio.getStationNumber();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void PrevInAllowableValueTest() {
        Radio radio = new Radio(10);
        radio.setStationNumber(5);
        radio.prev();

        int expected = 4;
        int actual = radio.getStationNumber();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void PrevMinAllowableValueTest() {
        Radio radio = new Radio(25);
        radio.setStationNumber(0);
        radio.prev();

        int expected = 24;
        int actual = radio.getStationNumber();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void IncreaseVolumeMaxTest() {
        Radio radio = new Radio(10);
        radio.setVolume(100);
        radio.increaseVolume();

        int expected = 100;
        int actual = radio.getVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void IncreaseVolumeAllowableValueTest() {
        Radio radio = new Radio(10);
        radio.setVolume(56);
        radio.increaseVolume();

        int expected = 57;
        int actual = radio.getVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void DecreaseVolumeMaxTest() {
        Radio radio = new Radio(10);
        radio.setVolume(100);
        radio.decreaseVolume();

        int expected = 99;
        int actual = radio.getVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void DecreaseVolumeAllowableValueTest() {
        Radio radio = new Radio(10);
        radio.setVolume(82);
        radio.decreaseVolume();

        int expected = 81;
        int actual = radio.getVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void DecreaseVolumeMinValueTest() {
        Radio radio = new Radio(10);
        radio.setVolume(0);
        radio.decreaseVolume();

        int expected = 0;
        int actual = radio.getVolume();

        Assertions.assertEquals(expected, actual);
    }
}
