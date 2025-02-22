package hello.servlet.web.servletmvc;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

@WebServlet(name = "mvcMemberFormServlet", urlPatterns = "/servlet-mvc/members/new-form")
public class MvcMemberFormServlet extends HttpServlet {

    @Override
    protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        //WEB-INF 안에 있는 파일은 외부에서 호출되지 않음!
        String viewPath = "/WEB-INF/views/new-form.jsp";

        //controller->view로 이동할때 사용
        RequestDispatcher dispatcher = request.getRequestDispatcher(viewPath);

        //forward는 서버 내부에서 일어나는 호출. redirect는 클라이언트에 응답이 가는 형태
        dispatcher.forward(request, response);
    }
}
