//package servlet2;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import dao.AccountDAO;
import model.AccountBeans;


@WebServlet("/AccountSearch")
public class AccountSearch extends HttpServlet {
    private static final long serialVersionUID = 1L;

    public AccountSearch() {
        super();
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }


    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        String loginId = request.getParameter("loginId");
        String pass = request.getParameter("pass");

        // login.jsp����󂯎�������O�C��ID��pass���r�[���Y�ɃZ�b�g
        AccountBeans ab = new AccountBeans();
        ab.setLoginId(loginId);
        ab.setPass(pass);

        // �A�J�E���g�̗L��������
        // ���������A�J�E���g�����擾
        AccountDAO ad = new AccountDAO();
        AccountBeans returnAb = ad.findAccount(ab);

        if(returnAb != null) {
            // �Z�b�V�����ɃA�J�E���g��񁕃��[����o�^
            HttpSession session = request.getSession();
            session.setAttribute("account", returnAb);

            RequestDispatcher rd = request.getRequestDispatcher("loginSuccess.jsp");
            rd.forward(request, response);

        } else {
            RequestDispatcher rd = request.getRequestDispatcher("error.jsp");
            rd.forward(request, response);
        }
    }
}