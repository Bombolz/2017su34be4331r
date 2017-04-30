/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment1carseek;

/**
 *
 * @author adimt460a
 */
public class CarOffer {

    int carOfferID;
    int quota;
    String price;
    String currentPostCode;
    String startingPostCode;
    String destinationPostCode;
    String travelTime;
    String pickupTime;
    String dropOffTime;

    public CarOffer(int carOfferID, int quota, String price, String currentPostCode, String startingPostCode, String destinationPostCode, String travelTime, String pickupTime, String dropOffTime) {
        this.carOfferID = carOfferID;
        this.quota = quota;
        this.price = price;
        this.currentPostCode = currentPostCode;
        this.startingPostCode = startingPostCode;
        this.destinationPostCode = destinationPostCode;
        this.travelTime = travelTime;
        this.pickupTime = pickupTime;
        this.dropOffTime = dropOffTime;
    }
    
    public int getCarOfferID()
    {
        return carOfferID;
    }
    
    public void setCarOfferID(int carOfferID)
    {
        this.carOfferID = carOfferID;
    }
    
    
    public String getCurrentPostCode() {
        return currentPostCode;
    }

    public void setCurrentPostCode(String currentPostCode) {
        this.currentPostCode = currentPostCode;
    }

    public String getStartingPostCode() {
        return startingPostCode;
    }

    public void setStartingPostCode(String startingPostCode) {
        this.startingPostCode = startingPostCode;
    }

    public String getDestinationPostCode() {
        return destinationPostCode;
    }

    public void setDestinationPostCode(String destinationPostCode) {
        this.destinationPostCode = destinationPostCode;
    }

    public String getTravelTime() {
        return travelTime;
    }

    public void setTravelTime(String travelTime) {
        this.travelTime = travelTime;
    }

    public String getPickupTime() {
        return pickupTime;
    }

    public void setPickupTime(String pickupTime) {
        this.pickupTime = pickupTime;
    }

    public String getDropOffTime() {
        return dropOffTime;
    }

    public void setDropOffTime(String dropOffTime) {
        this.dropOffTime = dropOffTime;
    }

    public int getQuota() {
        return quota;
    }

    public void setQuota(int quota) {
        this.quota = quota;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;

    }
}
