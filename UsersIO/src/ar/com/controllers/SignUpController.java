/*
 *  User: coder       Date: 6/1/22        Time: 4:42 PM
 */

package ar.com.controllers;

import ar.com.exceptions.SuccessfulException;
import ar.com.exceptions.UserAlreadyExists;
import ar.com.services.Services;
import ar.com.services.UserService;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(description = "", urlPatterns = "/insert")
public class SignUpController extends HttpServlet {

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
     * GET Method
     *
     * @param req
     * @param resp
     * @throws ServletException
     * @throws IOException
     */
    @Override
    protected void doGet(final HttpServletRequest req, final HttpServletResponse resp) throws ServletException, IOException {
        getServletContext().getRequestDispatcher("/ar/com/web/insert.jsp").forward(req, resp);
    }

    /**
     * POST Method
     *
     * @param req
     * @param resp
     * @throws ServletException
     * @throws IOException
     */
    @Override
    protected void doPost(final HttpServletRequest req, final HttpServletResponse resp) throws ServletException, IOException {
        createUser(req, resp);
        req.setAttribute("userList", this.userService.getListFromDB());
        this.getServletContext().getRequestDispatcher("/ar/com/web/index.jsp").forward(req, resp);
    }


    /**
     * Creates an user and saves it in the DB
     *
     * @param req
     * @param resp
     * @throws IOException
     * @throws UserAlreadyExists
     * @throws SuccessfulException
     */
    private void createUser(final HttpServletRequest req, final HttpServletResponse resp) throws IOException {
        String name = req.getParameter("name");
        String surname = req.getParameter("surname");
        String idNumber = req.getParameter("idNumber");
        String birthday = req.getParameter("birthday");
        String profession = req.getParameter("profession");

        this.userService.addUser(this.userService.createUser(name, surname, idNumber, birthday, profession));
    }

}
