package login;
//package servlet2;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/AccountCheck")
public class AccountCheck extends HttpServlet {
    private static final long serialVersionUID = 1L;


    public AccountCheck() {
        super();
    }


    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        // ?Z?b?V?????????O?C???????èÔ
        HttpSession session = request.getSession();
        AccountBeans ab = (AccountBeans) session.getAttribute("account");

        // ???[????t?H???[?h???U?ïì????
        if(ab.getRole() == 1) {
            RequestDispatcher rd = request.getRequestDispatcher("admin.jsp");
            rd.forward(request, response);
        } else if(ab.getRole() == 2) {
            RequestDispatcher rd = request.getRequestDispatcher("user.jsp");
            rd.forward(request, response);
        } else {
            RequestDispatcher rd = request.getRequestDispatcher("error2.jsp");
            rd.forward(request, response);
        }
    }


    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doGet(request, response);
    }
}