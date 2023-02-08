package com.codesoom.assignment;

import com.codesoom.assignment.handler.DemoHttpHandler;
import com.sun.net.httpserver.HttpHandler;
import com.sun.net.httpserver.HttpServer;

import java.net.InetSocketAddress;

public class App {
    public String getGreeting() {
        return "Hello World!";
    }

    public static void main(String[] args) {

        try{
            InetSocketAddress address = new InetSocketAddress(8000);
            HttpServer httpServer = HttpServer.create(address , 0);
            HttpHandler handler = new DemoHttpHandler();
            httpServer.createContext("/", handler);
            httpServer.start();
        }catch(Exception e){
            e.printStackTrace();
        }
    }
}
