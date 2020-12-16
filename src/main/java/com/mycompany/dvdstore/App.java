package com.mycompany.dvdstore;


import com.mycompany.dvdstore.controller.MovieController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;


/**
 * Hello world!
 *
 */
@SpringBootApplication
public class App 
{
    public static void main( String[] args )
    {
//        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        ApplicationContext context = SpringApplication.run(App.class , args);
        MovieController movieController = context.getBean(MovieController.class);
        movieController.addUsingConsole();
    }
}
