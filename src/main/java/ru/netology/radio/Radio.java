package ru.netology.radio;

public class Radio {
    private int quantityStations;
    private int stationNumber;
    private int volume;

    public Radio() {
        this.quantityStations = 9;
    }

    public Radio(int quantityStations) {
        this.quantityStations = quantityStations - 1;
    }

    public void setQuantityStations(int newQuantityStations) {
        quantityStations = newQuantityStations;
    }

    public int getQuantityStations() {
        int totalQuantityStations = quantityStations;
        return totalQuantityStations;
    }

    public void setStationNumber(int newStationNumber) {
        if (newStationNumber > quantityStations) {
            return;
        }
        if (newStationNumber < 0) {
            return;
        }
        stationNumber = newStationNumber;
    }

    public int getStationNumber() {
        return stationNumber;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    public int getVolume() {
        int actualVolume = volume;
        return actualVolume;
    }

    public void next() {
        if (stationNumber == quantityStations) {
            stationNumber = 0;
        } else {
            stationNumber++;
        }
    }

    public void prev() {
        if (stationNumber == 0) {
            stationNumber = quantityStations;
        } else {
            stationNumber = stationNumber - 1;
        }
    }

    public void increaseVolume() {
        if (volume == 100) {
            return;
        } else {
            volume++;
        }
    }

    public void decreaseVolume() {
        if (volume == 0) {
            return;
        } else {
            volume = volume - 1;
        }
    }
}
