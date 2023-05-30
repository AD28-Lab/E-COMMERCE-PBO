package org.example;

import java.net.InetSocketAddress;
import com.sun.net.httpserver.HttpServer;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.concurrent.Executors;

public class Main {
    public static void main(String[] args) throws IOException {
        try{
            HttpServer httpserver = HttpServer.create(new InetSocketAddress("localhost", 8125),0);
            httpserver.createContext("/", new Server());
//            test
            httpserver.setExecutor(Executors.newSingleThreadExecutor());
            httpserver.start();
            System.out.println( "Listening on port 8125...");
        }catch(Exception e){
            e.printStackTrace();
        }
    }

    public static class Connect{

        public static void connect(){
            Connection connection = null;
            String rootPath = System.getProperty("user.dir");
            try {
                String url = "jdbc:sqlite:C:\\Users\\USER\\IdeaProjects\\E-COMMERCE-PBO\\ecommerce";
                connection = DriverManager.getConnection(url);
                System.out.println("Connection to SQLite has been established");
            }   catch (SQLException e){
                    System.out.println(e.getMessage());
            }   finally {
                  try {
                      if(connection != null){
                            connection.close();
                      }
                  }catch (SQLException exception){
                      System.out.println(exception.getMessage());
                  }
            }
        }
    }
}
