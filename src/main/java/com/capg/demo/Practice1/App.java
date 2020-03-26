package com.capg.demo.Practice1;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

//import com.capg.demo.Practice1.Trainee;
//import com.capg.demo.Practice1.TrainerConfig;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	 ApplicationContext context=new AnnotationConfigApplicationContext(TrainerConfig.class);
         
         Trainee t1=(Trainee) context.getBean("trainee");
         t1.display();
         
    }
}
