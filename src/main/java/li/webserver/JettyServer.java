package li.webserver;

import org.mortbay.jetty.Server;
import org.mortbay.jetty.webapp.WebAppContext;

public class JettyServer {
    public static void main(String[] args){
        Server server = new Server(8080);

        WebAppContext appContext = new WebAppContext("src/main/webapp","/app");
//        appContext.setDescriptor("src/main/webapp/WEB-INF/web.xml");
//        appContext.setResourceBase("src/main/webapp");
//        appContext.setContextPath("/");
//        appContext.setParentLoaderPriority(true);
        server.addHandler(appContext);
        try {
            server.start();
            server.join();
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
