/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package LittleBagShop;

/**
 *
 * @author DELL
 */
public class Bag {
    private String bagID;
    private String bagBrand;
    private String category;
    private String bagPrice;

    public Bag(String bagID, String bagBrand, String category, String bagPrice) {
        this.bagID = bagID;
        this.bagBrand = bagBrand;
        this.category = category;
        this.bagPrice = bagPrice;
    }

    // Getters and Setters
    public String getBagID() {
        return bagID;
    }

    public void setBagID(String bagID) {
        this.bagID = bagID;
    }

    public String getBagBrand() {
        return bagBrand;
    }

    public void setBagBrand(String bagBrand) {
        this.bagBrand = bagBrand;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getBagPrice() {
        return bagPrice;
    }

    public void setBagPrice(String bagPrice) {
        this.bagPrice = bagPrice;
    }
    
}
