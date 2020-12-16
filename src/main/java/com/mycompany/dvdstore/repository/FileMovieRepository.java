package com.mycompany.dvdstore.repository;

import com.mycompany.dvdstore.entity.Movie;
import org.springframework.beans.factory.annotation.Value;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class FileMovieRepository implements MovieRepositoryInterface {
    @Value("${movies.file.location}")
    private File file ;

    public File getFile() {
        return file;
    }

    public void setFile(File file) {
        this.file = file;
    }

    public void add(Movie movie){
        FileWriter writer;
        try{
//            C:\Users\Administrateur\Desktop\test spring
            writer=new FileWriter("C:\\Users\\Administrateur\\Desktop\\testspring\\movies.txt",true);
            writer=new FileWriter(file,true);
            writer.write(movie.getTitle()+";"+movie.getGenre()+"\n");
            writer.close();
        }
        catch (IOException e){
            e.printStackTrace();
        }
        System.out.println("The movie "+movie.getTitle()+" has been added.");
    }


}
