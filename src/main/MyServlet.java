package main;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

public class MyServlet extends javax.servlet.http.HttpServlet {

    private static final String EMAIL = "corporate.beaver@gmail.com";
    private static final String PASSWORD = "qwerty123";

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        String Email = request.getParameter("email");
        String Password = request.getParameter("password");

        try (PrintWriter writer = response.getWriter()) {
            if(EMAIL.equalsIgnoreCase(Email) && PASSWORD.equals(Password)) {
                writer.println("Success");
            } else {
            writer.println("Failed to authorize.");
            }
        }
    }
}

