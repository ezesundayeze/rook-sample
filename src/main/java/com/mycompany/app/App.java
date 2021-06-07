package com.mycompany.app;
import io.javalin.Javalin;



public class App {
    public static void main(String[] args) {
        Javalin app = Javalin.create().start(7000);
        app.get("/", ctx -> {
            // some code
            ctx.result("Hello world");
            ctx.status(201);
        });
    }
}