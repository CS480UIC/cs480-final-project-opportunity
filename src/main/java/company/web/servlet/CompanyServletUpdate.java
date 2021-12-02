package company.web.servlet;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import company.dao.CompanyDao;
import company.domain.Company;

/**
 * Servlet implementation class UserServlet
 */

public class CompanyServletUpdate extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public CompanyServletUpdate() {
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

			if(company.getCompany_id()!=0){
				request.setAttribute("company", company);
				request.getRequestDispatcher("/jsps/company/company_update_output.jsp").forward(request, response);

			}
			else{
				request.setAttribute("msg", "Company not found");
				request.getRequestDispatcher("/jsps/company/company_read_output.jsp").forward(request, response);
			}
		}
		else if(method.equals("update"))
		{
			Map<String,String[]> paramMap = request.getParameterMap();
			Company form = new Company();
			List<String> info = new ArrayList<String>();

			for(String name : paramMap.keySet()) {
				String[] values = paramMap.get(name);
				info.add(values[0]);
			}
			
			form.setCompany_id(Integer.parseInt(request.getParameter("company_id")));
			form.setName(info.get(2));
			form.setComp_address(info.get(3));
			form.setIndustry(info.get(4));
			form.setReview(info.get(5));
			

			try {
				companyDao.update(form);

			} catch (ClassNotFoundException e1) {
				e1.printStackTrace();
			} catch (InstantiationException e1) {
				e1.printStackTrace();
			} catch (IllegalAccessException e1) {
				e1.printStackTrace();
			}
			request.setAttribute("msg", "Company Updated");
			request.getRequestDispatcher("/jsps/company/company_read_output.jsp").forward(request, response);
		}
	}
}



