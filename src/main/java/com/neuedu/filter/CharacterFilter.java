package com.neuedu.filter;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import java.io.IOException;
import java.io.UnsupportedEncodingException;

/**
 * Servlet Filter implementation class CharacterFilter
 */
@WebFilter("/*")
public class CharacterFilter implements Filter {

    /**
     * Default constructor.
     */
    public CharacterFilter() {
        // TODO Auto-generated constructor stub
    }

    /**
     * @see Filter#destroy()
     */
    public void destroy() {
        // TODO Auto-generated method stub
        //
    }

    /**
     * @see Filter#doFilter(ServletRequest, ServletResponse, FilterChain)
     */
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws ServletException, IOException {

        //����
        request.setCharacterEncoding("UTF-8");

        chain.doFilter(request, response);


    }

    /**
     * @see Filter#init(FilterConfig)
     */
    public void init(FilterConfig fConfig) throws ServletException {
        // TODO Auto-generated method stub
        //������ʼ��
    }

}
