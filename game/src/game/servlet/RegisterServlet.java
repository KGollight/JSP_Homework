package game.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import game.bean.GameDTO;
import game.bean.GameDAO;

@WebServlet(urlPatterns="/register.it")
public class RegisterServlet extends HttpServlet{
	@Override
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		try {
//			[1] 준비 : id, job
			request.setCharacterEncoding("utf-8");
//			GameDTO gdto = new GameDTO();
//			gdto.setId(request.getParameter("id"));
//			gdto.setJob(request.getParameter("job"));
			GameDTO gdto = new GameDTO(request);
			
//			[2] 처리
			GameDAO gdao = new GameDAO();
			gdao.register(gdto);
			
//			[3] 출력
//			response.sendRedirect("register_result.jsp");
			response.sendRedirect(request.getContextPath()+"/register_result.jsp");
		}catch(Exception e) {
			e.printStackTrace();
			response.sendError(500);
		}
	}
}










