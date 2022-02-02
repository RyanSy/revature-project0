package com.revature;

import java.util.Scanner;

public class BankingApplicationDriver {

    public static void main(String[] args)  {
        JavalinApp app = new JavalinApp();
        app.start(8080);

        System.out.println("===================================");
        System.out.println("||   Welcome to Revature Bank!   ||");
        System.out.println("===================================");
        /*
        Javalin app = Javalin.create().start();

        PersonController personController = new PersonController();
        AppExceptionHandler appExceptionHandler = new AppExceptionHandler();

        app.get("/people", personController::handleGetAll);

        // GET /people/5
        app.get("/people/{id}", personController::handleGetOne);

        app.put("/people/{id}", personController::handleUpdate);

        app.exception(NumberFormatException.class, appExceptionHandler::handleNumberFormatException);

        app.post("/people", personController::handleCreate);

        app.delete("/people", personController::handleDelete);
         */

    }
}
