package com.example.Java_servlet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/s03")
public class servlet03 extends HttpServlet {
    @Override
    public void init() throws ServletException {
        System.out.println("init...");
    }

    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println(("service.."));
    }

    @Override
    public void destroy() {
        System.out.println("destroy...");
    }
}
