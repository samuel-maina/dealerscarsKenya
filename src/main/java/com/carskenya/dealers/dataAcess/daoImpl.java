/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.carskenya.dealers.dataAcess;

import com.carskenya.dealers.businessObject.Car;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author samuel
 */

public class daoImpl implements dao{

    @Override
 public boolean insertProduct(String price, String brand, int code, String model, String yearofManufacture, int mileage, String interiorColor, String exteriorColor, String engineSize, String fuel, String transmission, String additionalInfo, String image1, String image2, String image3, String image4) {
     {
        Connection conn=null;
        PreparedStatement ps=null;
        try {
            conn=connection.getConnection();
            
            ps = conn.prepareStatement("insert into products values(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?);");
            ps.setInt(1,code);
            ps.setString(2,brand);
            ps.setString(3,model);
            ps.setString(4,yearofManufacture);
            ps.setString(5,price);
            ps.setString(6, image1);
            ps.setString(7, image2);
            ps.setString(8, image3);
            ps.setString(9, image4);
            ps.setInt(10,mileage);
            ps.setString(11, transmission);
            ps.setString(12, engineSize);
            ps.setString(13, interiorColor);
            ps.setString(14,exteriorColor);
            ps.setString(15,additionalInfo);
            ps.setString(16, fuel);
            
            
           if( ps.executeUpdate()==1){
            return true;}
        } catch (SQLException ex) {
            Logger.getLogger(daoImpl.class.getName()).log(Level.SEVERE, null, ex);
        }finally{
        try{if(conn!=null)
            conn.close();
        }catch(SQLException e){System.out.println(e);}
       try{if(ps!=null)
           ps.close();
       }catch(SQLException e){System.out.println(e);}
        }
        return false;
    }}
    
    

    @Override
    public Car getProductbyCode(int code) {
        
            Connection conn=null;
            PreparedStatement st=null;
            ResultSet rs=null;
            try{
            conn=connection.getConnection();
            st=conn.prepareStatement("select * from products where code = ?;");
            st.setInt(1,code);
            rs=st.executeQuery();
            while(rs.next()){
                Car car=new Car();
                 car.setCode(rs.getInt("code"));
                 car.setBrand(rs.getString("brand"));
                 car.setmodel(rs.getString("model"));
                 car.setYom(rs.getString("yearofManufacture"));
                 car.setPrice(rs.getString("price"));
                 car.setImage1(rs.getString("image1"));
                 car.setImage2(rs.getString("image2"));
                 car.setImage3(rs.getString("image3"));
                 car.setImage4(rs.getString("image4"));
                 car.setmileage(rs.getInt("mileage"));
                 car.setTransmission(rs.getString("transmission"));
                 car.setEngineSize(rs.getString("engineSize"));
                 car.setInteriorColor(rs.getString("interiorcolor"));
                 car.setExteriorColor(rs.getString("exteriorcolor"));
                 car.setAddditionalInfo(rs.getString("additionalinfo"));
                 car.setFuel(rs.getString("fuel"));
                return car;
            }
            
            
        } catch (SQLException ex) {
            Logger.getLogger(daoImpl.class.getName()).log(Level.SEVERE, null, ex);
        }finally{
            try{
                if(conn!=null)
            conn.close();
            }catch(SQLException e){System.out.println(e);}
            try{
                if(st!=null)
            st.close();
            }catch(SQLException e){System.out.println(e);}
            try{
                if(rs!=null)
            rs.close();
            }catch(SQLException e){System.out.println(e);}
            }
            
        return null;
    }
    @Override
    public List getAllListings() {
        
            Connection conn=null;
            PreparedStatement st=null;
            ResultSet rs=null;
            List<Car>productList;
            try{
            productList=new ArrayList<>();
            conn=connection.getConnection();
            st=conn.prepareStatement("select * from products order by model asc;");
            rs=st.executeQuery();
                while(rs.next()){
                               Car car=new Car();
                 car.setCode(rs.getInt("code"));
                 car.setBrand(rs.getString("brand"));
                 car.setmodel(rs.getString("model"));
                 car.setYom(rs.getString("yearofManufacture"));
                 car.setPrice(rs.getString("price"));
                 car.setImage1(rs.getString("image1"));
                 car.setImage2(rs.getString("image2"));
                 car.setImage3(rs.getString("image3"));
                 car.setImage4(rs.getString("image4"));
                 car.setmileage(rs.getInt("mileage"));
                 car.setTransmission(rs.getString("transmission"));
                 car.setEngineSize(rs.getString("engineSize"));
                 car.setInteriorColor(rs.getString("interiorcolor"));
                 car.setExteriorColor(rs.getString("exteriorcolor"));
                 car.setAddditionalInfo(rs.getString("additionalinfo"));
                 car.setFuel(rs.getString("fuel"));
                productList.add(car);
            }
            
            return productList;
        } catch (SQLException ex) {
            Logger.getLogger(daoImpl.class.getName()).log(Level.SEVERE, null, ex);
        }finally{
            try{
                if(conn!=null)
            conn.close();
            }catch(SQLException e){System.out.println(e);}
            try{
                if(st!=null)
            st.close();
            }catch(SQLException e){System.out.println(e);}
            try{
                if(rs!=null)
            rs.close();
            }catch(SQLException e){System.out.println(e);}
            }
            
        return null;
    }
    @Override
    public void deleteListing(int code){
            Connection conn=null;
            PreparedStatement st=null;
                        try{
            conn=connection.getConnection();
            st=conn.prepareStatement("delete from products where code = ?;");
            st.setInt(1,code);
            st.execute();
           
            
            
        } catch (SQLException ex) {
            Logger.getLogger(daoImpl.class.getName()).log(Level.SEVERE, null, ex);
        }finally{
            try{
                if(conn!=null)
            conn.close();
            }catch(SQLException e){System.out.println(e);}
            try{
                if(st!=null)
            st.close();
            }catch(SQLException e){System.out.println(e);}
            
            }
            
        
    }

     

  
    
}
