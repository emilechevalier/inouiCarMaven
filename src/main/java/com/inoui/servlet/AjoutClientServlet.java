package com.inoui.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.inoui.model.Adresse;
import com.inoui.model.Clients;
import com.inoui.model.DAOHibernate;

/**
 * Servlet implementation class AjoutClientServlet
 */
@WebServlet(name="/AjoutClientServlet", urlPatterns= {"/ajoutClient"})
public class AjoutClientServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private static final String VUE_GET = "/WEB-INF/ajoutClient.jsp";
	private static final String VUE_POST_SUCCES = "/WEB-INF/indexInoui.jsp";
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AjoutClientServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		this.getServletContext().getRequestDispatcher(VUE_GET).forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		Integer client_id = Integer.valueOf(request.getParameter("code"));
		String prenom = request.getParameter("prenom");
		String nom = request.getParameter("nom");
		Integer age = Integer.valueOf(request.getParameter("age"));
		String email = request.getParameter("email");
		String password = request.getParameter("mdp");
		String tel_mobile = request.getParameter("tel");
		String adresse = request.getParameter("adresse");
		Integer codePostal = Integer.valueOf(request.getParameter("cp"));
		String ville = request.getParameter("ville");
		String pays = request.getParameter("pays");
		
		Adresse adresseClient = new Adresse();
		adresseClient.setAdresse(adresse);
		adresseClient.setCodePostal(codePostal);
		adresseClient.setVille(ville);
		adresseClient.setPays(pays);
		
		Clients client = new Clients();
		client.setClient_id(client_id);
		client.setPrenom(prenom);
		client.setNom(nom);
		client.setAge(age);
		client.setEmail(email);
		client.setPassword(password);
		client.setTel_mobile(tel_mobile);
		client.setAdresse(adresseClient);
		
		DAOHibernate daoHibernate = new DAOHibernate();
		
		daoHibernate.insertClient(client);
		
		request.setAttribute("message", "creation avec succes");
		
		this.getServletContext().getRequestDispatcher(VUE_POST_SUCCES).forward(request, response);
		
		
	}

}
