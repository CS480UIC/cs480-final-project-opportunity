package company.web.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import company.dao.CompanyDao;
import company.domain.Company;


/**
 * Servlet implementation class UserServlet
 */

public class CompanyServletDelete extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public CompanyServletDelete() {
        super();
    }
    
	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doPost(request,response);
	}
	
	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String method = request.getParameter("method");
		CompanyDao companyDao = new CompanyDao();
		Company company = null;
		if(method.equals("search"))
		{
			try {
				company = companyDao.findByCompanyID(Integer.parseInt(request.getParameter("company_id")));
			} catch (ClassNotFoundException e1) {
				e1.printStackTrace();
			} catch (InstantiationException e1) {
				e1.printStackTrace();
			} catch (IllegalAccessException e1) {
				e1.printStackTrace();
			}
		
			if(company.getCompany_id()!= 0){
					System.out.println(company);
					request.setAttribute("company", company);
					request.getRequestDispatcher("/jsps/company/company_delete_output.jsp").forward(request, response);			
			}
			else {
			request.setAttribute("msg", "[ERROR]: Company not found");
			request.getRequestDispatcher("/jsps/company/company_read_output.jsp").forward(request, response);
			}
		}
		else if(method.equals("delete"))
		{	
			try {
				companyDao.delete(Integer.parseInt(request.getParameter("company_id")));
			} catch (ClassNotFoundException e1) {
				e1.printStackTrace();
			} catch (InstantiationException e1) {
				e1.printStackTrace();
			} catch (IllegalAccessException e1) {
				e1.printStackTrace();
			}
			request.setAttribute("msg", "Company Deleted");
			request.getRequestDispatcher("/jsps/company/company_read_output.jsp").forward(request, response);
		}
	}
}



