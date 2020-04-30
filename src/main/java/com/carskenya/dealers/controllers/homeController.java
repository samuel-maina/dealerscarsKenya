/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.carskenya.dealers.controllers;
import com.carskenya.dealers.businessObject.Car;
import com.carskenya.dealers.dataAcess.daoImpl;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Random;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.CookieValue;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import static org.springframework.web.bind.annotation.RequestMethod.GET;
import org.springframework.web.bind.annotation.RequestParam;

/**
 *
 * @author samuel
 */
@Controller

public class homeController {
//product pr=new product();
    daoImpl daoimpl=new daoImpl();
    @RequestMapping(value={"/","home"},method=GET)
 public String home(Model model){
List<Car>allProducts;
      allProducts=daoimpl.getAllListings();
      model.addAttribute("allListings", allProducts);
         return "homer";
 }  
  @RequestMapping(value="favorites",method=GET)
 public String favorite(Model model,HttpServletRequest request){
    
   Cookie[] favorites=  request.getCookies();
   if(favorites==null){
       return "favorite";
   }
   
   int it;
   
   List<Car>favCars=new ArrayList<>();
      for(it=0;it<favorites.length;it++){
         if(favorites[it]!=null||Integer.parseInt(favorites[it].getValue())>0){
      
          String k=favorites[it].getValue();
          Car car;
       car=daoimpl.getProductbyCode(Integer.parseInt(k));
       
       favCars.add(car);
      }}
      model.addAttribute("favs", favorites.length);
     model.addAttribute("likes", favCars);
         return "favorite";
 }  
@RequestMapping(value="p/{code}", method=GET)
public String product(@PathVariable("code") int code,Model model){
    Car car=daoimpl.getProductbyCode(code);
    model.addAttribute("product", car);
    
return "p";
}
    @RequestMapping(value={"listing"},method=GET)
 public String listing(Model model,HttpServletRequest request){
List<Car>allProducts;
      daoImpl daoimpl=new daoImpl();
      allProducts=daoimpl.getAllListings();
      Cookie[] favorites;
      
      favorites=  request.getCookies();
      if(favorites==null){}
      else
      model.addAttribute("favs", favorites.length);
      model.addAttribute("allListings", allProducts);
         return "home";
 }    
    @RequestMapping(value="favorite",method=GET)
 public String favAdd(@RequestParam("code") int code, HttpServletResponse response  ){
     String productCode=Integer.toString(code);
     Cookie cookie=new Cookie(productCode,productCode);
     cookie.setMaxAge(60*60*24*30*3);
     response.addCookie(cookie);
     
         return "home";
 }   
}
