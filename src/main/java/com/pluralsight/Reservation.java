package com.pluralsight;

public class Reservation {
    //Field members (Backing Fields)
    private String roomType;
    private int numberOfNights;
    private boolean isWeekend;
        // Getters and Setters
    public String getRoomType() {
        return roomType;
    }

    public void setRoomType(String roomType) {
        this.roomType = roomType;
    }

    public int getNumberOfNights() {
        return numberOfNights;
    }

    public void setNumberOfNights(int numberOfNights) {
        this.numberOfNights = numberOfNights;
    }

    public boolean isWeekend() {
        return isWeekend;
    }

    public void setWeekend(boolean weekend) {
        isWeekend = weekend;
    }

    //Derived Methods

    public double getPrice() {
        return switch (roomType.toLowerCase()) {
            case "king" -> 139;
            case "double" -> 124;
            default -> throw new IllegalArgumentException("Invalid room type: " + roomType);
        };
    }
    public double getReservationTotal(){
        double total = getPrice() * numberOfNights;
        if (isWeekend) {
            total = total * 1.10; //Rooms are a 10% increase on Weekends
        }
        return total;
    }
}
