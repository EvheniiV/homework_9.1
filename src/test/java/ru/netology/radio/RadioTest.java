package ru.netology.radio;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RadioTest {

    @Test
    public void SetStationNumberTest() {
        Radio radio = new Radio();
        radio.setStationNumber(2);

        int expected = 2;
        int actual = radio.stationNumber;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void SetStationNumberMoreAllowableValueTest() {
        Radio radio = new Radio();
        radio.setStationNumber(10);

        int expected = 0;
        int actual = radio.stationNumber;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void SetStationNumberLessAllowableValueTest() {
        Radio radio = new Radio();
        radio.setStationNumber(-1);

        int expected = 0;
        int actual = radio.stationNumber;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void NextInAllowableValueTest() {
        Radio radio = new Radio();
        radio.setStationNumber(5);
        radio.next();

        int expected = 6;
        int actual = radio.stationNumber;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void NextMoreAllowableValueTest() {
        Radio radio = new Radio();
        radio.setStationNumber(9);
        radio.next();

        int expected = 0;
        int actual = radio.stationNumber;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void NextMinAllowableValueTest() {
        Radio radio = new Radio();
        radio.setStationNumber(0);
        radio.next();

        int expected = 1;
        int actual = radio.stationNumber;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void PrevInAllowableValueTest() {
        Radio radio = new Radio();
        radio.setStationNumber(5);
        radio.prev();

        int expected = 4;
        int actual = radio.stationNumber;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void PrevMinAllowableValueTest() {
        Radio radio = new Radio();
        radio.setStationNumber(0);
        radio.prev();

        int expected = 9;
        int actual = radio.stationNumber;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void IncreaseVolumeMaxTest() {
        Radio radio = new Radio();
        radio.volume = 100;
        radio.increaseVolume();

        int expected = 100;
        int actual = radio.volume;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void IncreaseVolumeAllowableValueTest() {
        Radio radio = new Radio();
        radio.volume = 56;
        radio.increaseVolume();

        int expected = 57;
        int actual = radio.volume;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void DecreaseVolumeMaxTest() {
        Radio radio = new Radio();
        radio.volume = 100;
        radio.decreaseVolume();

        int expected = 99;
        int actual = radio.volume;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void DecreaseVolumeAllowableValueTest() {
        Radio radio = new Radio();
        radio.volume = 82;
        radio.decreaseVolume();

        int expected = 81;
        int actual = radio.volume;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void DecreaseVolumeMinValueTest() {
        Radio radio = new Radio();
        radio.volume = 0;
        radio.decreaseVolume();

        int expected = 0;
        int actual = radio.volume;

        Assertions.assertEquals(expected, actual);
    }
}
