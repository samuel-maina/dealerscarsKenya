/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.carskenya.dealers.controllers;

import com.carskenya.dealers.businessObject.Car;
import com.carskenya.dealers.dataAcess.daoImpl;
import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.Random;
import java.util.UUID;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.http.HttpSession;
import javax.servlet.http.Part;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import static org.springframework.web.bind.annotation.RequestMethod.GET;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.multipart.MultipartFile;

/**
 *
 * @author samuel
 */
@Controller
@RequestMapping(value="/admin")
public class admin {
  @RequestMapping(method=GET) 
  public String admin(){
  return "admin";
  }
  @RequestMapping(value="/new",method=GET)
  public String newListing(){
  return "newlisting";
  }
  @PostMapping(path="/new/detailshandler")
  public String detailshandler(@RequestParam("image_1")MultipartFile image_1 ,@RequestParam("image_2")MultipartFile image_2,@RequestParam("image_3")MultipartFile image_3,@RequestParam("image_4")MultipartFile image_4,@RequestParam ("brand")String brand,@RequestParam("model")String model,@RequestParam("yearofManufacture")String yearofManufacture,@RequestParam("price")String price,@RequestParam("transmission") String transmission,@RequestParam("mileage")int mileage,@RequestParam("interiorcolor")String interiorColor,@RequestParam("enginesize")String engineSize,@RequestParam("fueltype")String fuel,@RequestParam("exteriorcolor")String exteriorColor,@RequestParam("additionalinfo")String additionalInfo,Model md,HttpSession session){
      try {
          String path=session.getServletContext().getRealPath("/");
          System.out.println(path);
          daoImpl daoimpl=new daoImpl();
          Random random=new Random();
          File file1=new File(path+""+"/resources/images/"+UUID.randomUUID().toString()+""+".jpg");
         
         image_1.transferTo(file1);
          File file2=new File(path+""+"/resources/images/"+UUID.randomUUID().toString()+""+".jpg");
         image_2.transferTo(file2);
         File file3=new File(path+""+"/resources/images/"+UUID.randomUUID().toString()+""+".jpg");
         image_3.transferTo(file3);
         File file4=new File(path+""+"/resources/images/"+UUID.randomUUID().toString()+""+".jpg");
         image_4.transferTo(file4);
     System.out.println(file2.getName());
          int code=random.nextInt(500000);
          int milege;
          if((daoimpl.insertProduct(price, brand, code, model, yearofManufacture,mileage,interiorColor,exteriorColor,engineSize,fuel,transmission,additionalInfo,file1.getName(),file2.getName(),file3.getName(),file4.getName())==true)) {
              
              return "redirect:/admin/new/detailshandler/success";
          } 
              
          
      } catch (IOException ex) {
          Logger.getLogger(admin.class.getName()).log(Level.SEVERE, null, ex);
      }return "redirect:/admin/new/detailshandler/error";
  }
  @RequestMapping(value="/all",method=GET)
  public String getAll(Model model){
      List<Car>allProducts;
      daoImpl daoimpl=new daoImpl();
      allProducts=daoimpl.getAllListings();
      model.addAttribute("allListings", allProducts);
  return "all";
  }
   @RequestMapping(value="/login",method=GET)
 public String login(){
return "login";
}
 @RequestMapping(value="/logout",method=GET)
 public String logout(){
return "logout";
}
 @GetMapping(path="/new/detailshandler/images")
 public String images(){
 return "images";
 }
 @GetMapping(path="/new/detailshandler/success")
 public String uploadSuccess(){
 return "success";
 }
 @PostMapping(path="/new/detailshandler/imagesupload")
 public String uploadImage(@RequestPart("image_1")Part image_1 ,@RequestPart("image_2")Part image_2,@RequestPart("image_3")Part image_3,@RequestPart("image_4")Part image_4){
      try {
          UUID uuid=UUID.randomUUID();
         
          
          image_1.write(UUID.randomUUID().toString()+""+".jpg");
          String image1=image_1.getSubmittedFileName();
          image_2.write(UUID.randomUUID().toString()+""+".jpg");
          String image2=image_2.getSubmittedFileName();
          image_3.write(UUID.randomUUID().toString()+""+".jpg");
          String image3=image_3.getSubmittedFileName();
          image_4.write(UUID.randomUUID().toString()+""+".jpg");
          String image4=image_4.getSubmittedFileName();
          
          
      } catch (IOException ex) {
          Logger.getLogger(admin.class.getName()).log(Level.SEVERE, null, ex);
      }return "redirect:/new/detailshandler/success";
 }
 @GetMapping(path="delete")
 public String deleteListing(@RequestParam("code") int code,HttpSession session){
 daoImpl daoimpl=new daoImpl();
 Car car=daoimpl.getProductbyCode(code);
 String path=session.getServletContext().getRealPath("/");
 
 File file1= new File(path+"resources/images/"+car.getImage1());
 file1.delete();
 File file2= new File(path+"resources/images/"+car.getImage2());
 file2.delete();
 File file3= new File(path+"resources/images/"+car.getImage3());
 file3.delete();
 File file4=new File(path+"resources/images/"+car.getImage4());
 file4.delete();
 daoimpl.deleteListing(code);
 return "redirect:all";
 }
}
