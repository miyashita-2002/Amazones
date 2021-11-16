//package servlet2;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import dao.AccountRegisterDAO;
import model.AccountBeans;

@WebServlet("/AccountRegister")
public class AccountRegister extends HttpServlet {
    private static final long serialVersionUID = 1L;

    public AccountRegister() {
        super();
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }


    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String name = request.getParameter("name");
        String loginId = request.getParameter("loginId");
        String pass = request.getParameter("pass");
        int role = Integer.parseInt(request.getParameter("role"));

        // register.jsp����󂯎�����l���r�[���Y�ɃZ�b�g
        AccountBeans ab = new AccountBeans();
        ab.setName(name);
        ab.setLoginId(loginId);
        ab.setPass(pass);
        ab.setRole(role);

        // �A�J�E���g��DB�ɓo�^
        AccountRegisterDAO ard = new AccountRegisterDAO(ab);

        // �Z�b�V�����ɃA�J�E���g����ۑ�
        HttpSession session = request.getSession();
        session.setAttribute("account", ab);

        RequestDispatcher rd = request.getRequestDispatcher("registerSuccess.jsp");
        rd.forward(request, response);

    }

}
