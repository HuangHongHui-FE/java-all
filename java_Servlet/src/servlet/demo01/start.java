package servlet.demo01;

import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import java.io.IOException;

/**
 * Servlet的方法
 */

// 设置访问路径·
//    @WebServlet("/demo1")
//    @WebServlet(name = "servlet01", value = "/demo1")
//    @WebServlet(name = "servlet01", value = {"/demo01", "/demo1"})
    @WebServlet(name = "servlet01", urlPatterns = {"/demo01", "/demo1"})

    public class start implements Servlet {
    private int age = 3;

    /**
     * 初始化方法
     * 在Servlet被创建时，执行。只会执行一次
     */
    @Override
    public void init(ServletConfig servletConfig) throws ServletException {
        System.out.println("init.....");
    }

    /**
     * 获取ServletConfig对象
     * ServletConfig：Servlet的配置对象
     */
    @Override
    public ServletConfig getServletConfig() {
        return null;
    }

    /**
     * 提供服务方法
     * 每一次Servlet被访问时，执行。执行多次
     */
    @Override
    public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
        System.out.println("service.....");
        System.out.println(req);  // 会有各种方法
        System.out.println(res);
        int number = 3;
        res.getWriter().write("hhhhh");
    }

    /**
     * 获取Servlet的一些信息，版本，作者等等。。
     */
    @Override
    public String getServletInfo() {
        return null;
    }

    /**
     * 销毁方法
     * 在服务器正常关闭时，执行，执行一次。
     */
    @Override
    public void destroy() {
        System.out.println("destroy.....");
    }
}

