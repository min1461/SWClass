package sungjukc;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class hakjum
 */
@WebServlet("/hakjum")
public class hakjum extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public hakjum() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		doPost(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub

//		besiness logic이 크면 service logic이 요구됨
		request.setCharacterEncoding("UTF-8");
		response.setContentType("text/html;charset=UTF-8");

		String irum = request.getParameter("irum");
		int jum = Integer.parseInt(request.getParameter("score"));

		String kaja = null;
		switch (jum / 10) {
		case 10:
		case 9:
			kaja = "A.jsp";
			break;
		case 8:
			kaja = "B.jsp";
			break;
		case 7:
			kaja = "C.jsp";
			break;
		case 6:
			kaja = "D.jsp";
			break;
		default:
			kaja = "F.jsp";
			break;
		}

		RequestDispatcher rd1 = request.getRequestDispatcher(kaja);
		rd1.forward(request, response);
	}
}
