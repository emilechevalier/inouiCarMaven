package com.inoui.servlet;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.inoui.model.Clients;
import com.inoui.model.DAOHibernate;

/**
 * Servlet implementation class listeClientsServlet
 */
@WebServlet(name="/listeClientsServlet", urlPatterns= {"/listeClients"})
public class listeClientsServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private static final String VUE_GET = "/WEB-INF/listeClients.jsp";
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public listeClientsServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		List<Clients> clients = new ArrayList<Clients>();
		
		DAOHibernate daoHibernate = new DAOHibernate();
		
		clients = daoHibernate.lectureClient();
		
		request.setAttribute("clients", clients);
		
		this.getServletContext().getRequestDispatcher(VUE_GET).forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

	}

}
