package ru.netology.radio;

public class Radio {
    int quantityStations = 10;
    int stationNumber;
    int volume;

    public Radio(int quantityStations) {
        this.quantityStations = quantityStations -1;
    }

    public void setStationNumber(int newStationNumber) {
        if (newStationNumber > quantityStations) return;
        if (newStationNumber < 0) return;
        stationNumber = newStationNumber;
    }

    public void next() {
        if (stationNumber == quantityStations) stationNumber = 0;
        else stationNumber++;
    }

    public void prev() {
        if (stationNumber == 0) stationNumber = quantityStations;
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
