package work4.task2;

import java.io.IOException;

@WebServlet(name = "HelloTomcat", value = "/HelloTomcat")
public class HelloTomcat extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html;charset=utf-8");
        response.getWriter().write("hello tomcat");
    }
}
