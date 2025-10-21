package com.pluralsight;

public class Room {

    private int numberOfBeds;
    private double price;
    private boolean isOccupied;
    private boolean isDirty;
    private boolean isAvailable;


    public int getNumberOfBeds() {
        return numberOfBeds;
    }

    public double getPrice() {
        return price;
    }

    public boolean isOccupied() {
        return isOccupied;
    }

    public boolean isDirty() {
        return isDirty;
    }

    public boolean isAvailable() {
        return !isDirty && !isOccupied;
    }

    //DO
    public void checkIn() {
        if (isAvailable) {
            throw new IllegalStateException("Room is not available.");
        }
        isOccupied = true;
        isDirty = true;
    }
    public void checkOut() {
        if (isAvailable()) {
            throw new IllegalStateException("Room is available.");
        }
        isOccupied = false;
        cleanRoom();
    }
    public void cleanRoom() {
        isDirty = false;
    }
}