package com.wycliffe.codility;
import java.text.SimpleDateFormat;  
import java.util.Date; 

/**
 *
 * @author WOCHIENG1
 */
class TIME_FORMATTER {
       
    Date date = new Date();  
    SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");  
    String strDate= formatter.format(date);  
    
}      

