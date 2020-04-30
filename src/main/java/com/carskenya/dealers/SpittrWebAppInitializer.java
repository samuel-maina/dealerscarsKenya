package com.carskenya.dealers;

import javax.servlet.MultipartConfigElement;
import javax.servlet.ServletRegistration.Dynamic;
import org.springframework.web.servlet.support.
AbstractAnnotationConfigDispatcherServletInitializer;
import security.SecurityConfig;
public class SpittrWebAppInitializer
extends AbstractAnnotationConfigDispatcherServletInitializer {
@Override
protected String[] getServletMappings() {
return new String[] { "/" };
}

@Override
protected Class<?>[] getServletConfigClasses() {
return new Class<?>[] { WebConfig.class };
}

   @Override
    protected Class<?>[] getRootConfigClasses() {
    return new Class<?>[]{SecurityConfig.class};
        
    }
  /*@Override
  protected void customizeRegistration(Dynamic registration){
 MultipartConfigElement multiparConfig=new MultipartConfigElement("/home/samuel/NetBeansProjects/dealerscarsKenya/src/main/webapp/resources/images",1024000,1024000,0);
  registration.setMultipartConfig(multiparConfig);
  }*/

}
