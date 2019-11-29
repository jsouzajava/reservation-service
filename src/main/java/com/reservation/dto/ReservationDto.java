package com.reservation.dto;

public class ReservationDto {

    private String name;
    private String checkin;
    private String checkout;
    private Integer roomsQuantity;

    public ReservationDto() {
    }

    public ReservationDto(String name, String checkin, String checkout, Integer roomsQuantity) {
        this.name = name;
        this.checkin = checkin;
        this.checkout = checkout;
        this.roomsQuantity = roomsQuantity;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCheckin() {
        return checkin;
    }

    public void setCheckin(String checkin) {
        this.checkin = checkin;
    }

    public String getCheckout() {
        return checkout;
    }

    public void setCheckout(String checkout) {
        this.checkout = checkout;
    }

    public Integer getRoomsQuantity() {
        return roomsQuantity;
    }

    public void setRoomsQuantity(Integer roomsQuantity) {
        this.roomsQuantity = roomsQuantity;
    }

}