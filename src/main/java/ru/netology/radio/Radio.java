package ru.netology.radio;

public class Radio {
    int stationNumber;
    int volume;

    public void setStationNumber(int newStationNumber) {
        if (newStationNumber > 9) return;
        if (newStationNumber < 0) return;
        stationNumber = newStationNumber;
    }

    public void next() {
        if (stationNumber == 9) stationNumber = 0;
        else stationNumber++;
    }

    public void prev() {
        if (stationNumber == 0) stationNumber = 9;
        else stationNumber = stationNumber - 1;
    }

    public void increaseVolume() {
        if (volume == 100) return;
        else volume++;
    }

    public void decreaseVolume() {
        if (volume == 0) return;
        else volume = volume - 1;
    }
}
