package ar.com.controllers;

import ar.com.entities.User;
import ar.com.services.Services;
import ar.com.services.UserService;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(description = "", urlPatterns = "/delete")
public class DelUserController extends HttpServlet {

    private static final long serialVersionUID = 1234L;
    private Services userService;

    /**
     * Init Method that instantiate userService
     *
     * @throws ServletException
     */
    @Override
    public void init() throws ServletException {
        super.init();
        userService = new UserService();
    }

    /**
     * Get Method
     *
     * @param req
     * @param resp
     * @throws ServletException
     * @throws IOException
     */
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        User user = this.userService.findUser(req.getParameter("idNumber"));
        this.userService.deleteUser(user);
        req.setAttribute("userList", this.userService.getListFromDB());
        this.getServletContext().getRequestDispatcher("/ar/com/web/index.jsp").forward(req, resp);
    }

    /**
     * Post Method
     *
     * @param req
     * @param resp
     * @throws ServletException
     * @throws IOException
     */
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        this.doGet(req, resp);
    }
}
