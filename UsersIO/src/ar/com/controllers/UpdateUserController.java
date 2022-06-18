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


@WebServlet(description = "", urlPatterns = "/update")
public class UpdateUserController extends HttpServlet {

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
        req.getServletContext().setAttribute("userToUpdate", user);
        this.getServletContext().getRequestDispatcher("/ar/com/web/update.jsp").forward(req, resp);
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
        updateUser(req, resp);
        req.setAttribute("userList", this.userService.getListFromDB());
        this.getServletContext().getRequestDispatcher("/ar/com/web/index.jsp").forward(req, resp);
    }

    /**
     * Updates an user's personal information
     *
     * @param req
     * @param resp
     * @throws IOException
     */
    private void updateUser(final HttpServletRequest req, final HttpServletResponse resp) throws IOException {
        String name = req.getParameter("name");
        String surname = req.getParameter("surname");
        String idNumber = req.getParameter("idNumber");
        String birthday = req.getParameter("birthday");
        String profession = req.getParameter("profession");

        this.userService.updateUser(this.userService.createUser(name, surname, idNumber, birthday, profession));
    }
}
