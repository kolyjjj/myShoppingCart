package li.webserver;

import org.mortbay.jetty.Server;
import org.mortbay.jetty.webapp.WebAppContext;

public class JettyServer {
    public static void main(String[] args){
        Server server = new Server(8080);
        server.setHandler(new HelloHander());
        try {
            server.start();
            server.join();
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
