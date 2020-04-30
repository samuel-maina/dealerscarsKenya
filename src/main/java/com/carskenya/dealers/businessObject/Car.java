/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.carskenya.dealers.businessObject;




/**
 *
 * @author samue*/

public class Car {
    
    private  String brand;
    private String model;
    private  int code;
    private  String price;
    private  String yom;
    private String image1;
    private String image2;
    private String image3;
    private String image4;
    private int mileage;
    private String fuel;
    private String engineSize;
    private String transmission;
    private String interiorColor;
    private String exteriorColor;
   private String additionalInfo;
   public void setAddditionalInfo(String additionalInfo){
   this.additionalInfo=additionalInfo;
   }
   public  void setmileage(int mileage ){
   this.mileage=mileage;
   }
   public  void setFuel(String fuel){
   this.fuel=fuel;
   }
   public  void setEngineSize(String engineSize ){
   this.engineSize=engineSize;
   }
   public  void setTransmission(String transmission ){
   this.transmission=transmission;
   }
   public  void setInteriorColor(String interiorColor ){
   this.interiorColor=interiorColor;
   }
   public  void setExteriorColor(String exteriorColor ){
   this.exteriorColor=exteriorColor;
   }
   public  void setImage1(String image1){
   this.image1=image1;
   }
   public  void setImage2(String image2){
   this.image2=image2;
   }
   public  void setImage3(String image3){
   this.image3=image3;
   }
   public  void setImage4(String image4){
   this.image4=image4;
   }
   
   public  void setBrand(String brand){
   this.brand=brand;
   }
   public void setPrice(String price){
   this.price=price;
   }
   public void setCode(int code){
   this.code=code;
   }
   public void setmodel(String model){
   this.model=model;
   }
   public void setYom(String yom){
   this.yom=yom;
   }
   public String getYom(){
   return yom;
   }
   public String getBrand(){
   return brand.toUpperCase();
   }
   public String getModel(){
   return model;
   }
   public String getPrice(){
   return price;
   }
   public int getCode(){
   return code;
   }
   public String getImage1(){
   return image1;
   }
   public String getImage2(){
   return image2;
   }
   public String getImage3(){
   return image3;
   }
   public String getImage4(){
   return image4;
   }
   public int getMileage (){
   return  mileage;
   }
   public String getFuel(){
   return fuel;
   }
   public String getTransmission(){
   return transmission;
   }
   public String getEngineSize (){
   return engineSize;
   }
   public String getinteriorColor(){
   return interiorColor;
   }
   public String getExteriorColor (){
   return exteriorColor;
   }
   public String getAdditianlInfo(){
   return additionalInfo;
   }
   @Override
   public String toString(){return model+" "+price+" "+code+""+yom+""+brand;
}
    
}
