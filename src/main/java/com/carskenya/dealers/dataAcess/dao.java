/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.carskenya.dealers.dataAcess;

import com.carskenya.dealers.businessObject.Car;
import java.util.List;

/**
 *
 * @author samuel
 */
public interface dao {
 public Car getProductbyCode(int code);
 public List getAllListings();
 public void deleteListing(int code);
 public boolean insertProduct(String price, String brand, int code, String model, String yearofManufacture, int mileage, String interiorColor, String exteriorColor, String engineSize, String fuel, String transmission, String additionalInfo, String image1, String image2, String image3, String image4) ;
  
 
 
}
