package com.balde.lombok01;
import com.balde.bean.*;
import com.balde.bean.ApiClientConfuguration.ApiClientConfugurationBuilder;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        User u1 = new User(1, "BALDE", "Ibrahima", 34);
        System.out.println(u1.toString());
        
        LoginResult l = new LoginResult("x", "x", "x", "x");
        
        ApiClientConfugurationBuilder config = ApiClientConfuguration.builder();
        config
        	.nom("BALDE")
        	.prenom("Ibrahima")
        	.age(15)
        .build();
        
        System.out.println(config);
        LoggerTest log = new LoggerTest();
        
    }
}