package com.arqapp.springbd;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.arqapp.beans.Marca;
import com.arqapp.service.ServiceMarca;


public class App 
{
    public static void main( String[] args ) {

    Marca mar = new Marca();
    mar.setId(2);
    mar.setNombre("Marca2");
    
    ApplicationContext appContext = new ClassPathXmlApplicationContext("com/arqapp/xml/beans.xml");
    
    ServiceMarca sm = (ServiceMarca)appContext.getBean("serviceMarcaImpl");
    		
    try {
		sm.registrar(mar);
	} catch (Exception e) {
		System.out.println(e.getMessage());	}
    }    
}
