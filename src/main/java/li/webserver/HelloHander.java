package li.webserver;

import org.mortbay.jetty.Request;
import org.mortbay.jetty.handler.AbstractHandler;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class HelloHander extends AbstractHandler{

    @Override
    public void handle(String s, HttpServletRequest request, HttpServletResponse response, int i) throws IOException, ServletException {
        response.setContentType("text/html;charset=utf-8");
        response.setStatus(HttpServletResponse.SC_OK);
        ((Request)request).setHandled(true);
        response.getWriter().print("<h1>Hello world</h1>");
    }
}
