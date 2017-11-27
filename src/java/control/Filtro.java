package control;

import java.io.IOException;
import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import model.Usuario;

/**
 *
 * @author Rodrigo
 */
@WebFilter("/*")
public class Filtro implements Filter {

    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
        
    }

    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
        HttpServletRequest servletRequest = (HttpServletRequest) request;
        HttpServletResponse servletResponse = (HttpServletResponse) response;
        String url = servletRequest.getRequestURI();
        HttpSession sessao = servletRequest.getSession();
        Usuario usuario = (Usuario) sessao.getAttribute("userLogado");
        
        
        if (usuario !=null || url.lastIndexOf("login.jsp") > -1 ||
	url.lastIndexOf("GerenciaLogin") > -1 ){
            chain.doFilter(request, response); 
	}else{
            ((HttpServletResponse) response).sendRedirect("login.jsp");
        }
        
        /*if (url.endsWith("login.jsp")) {
            chain.doFilter(request, response);
        } else if (usuario == null) {
            servletResponse.sendRedirect("login.jsp");
        } else if (usuario.isLogado()) {
            chain.doFilter(request, response);
        } else {
            servletResponse.sendRedirect("login.jsp");
        }*/
            
    }

    @Override
    public void destroy() {
        
    }
    
}
