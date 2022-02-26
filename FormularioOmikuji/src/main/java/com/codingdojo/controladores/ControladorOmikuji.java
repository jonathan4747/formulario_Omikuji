package com.codingdojo.controladores;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.codingdojo.modelos.Datos;

@Controller
public class ControladorOmikuji {
	
	@RequestMapping( value = "/omikuji", method = RequestMethod.GET )
	public String despliegaLogin() {
		return "login.jsp";
	}
	
	@RequestMapping(value="/login", method=RequestMethod.POST)
	public String login(@RequestParam(value="numero") int numero,
						@RequestParam(value="ciudad") String ciudad,
						@RequestParam(value="persona") String persona,
						@RequestParam(value="hobby") String hobby,
						@RequestParam(value="servivo") String servivo,
						@RequestParam(value="descripcion") String descripcion,
						HttpSession session) {
		Datos datos = new Datos(numero,ciudad,persona,hobby,servivo,descripcion);
		
		session.setAttribute("numero", datos.getNumero());
		session.setAttribute("ciudad", datos.getCiudad());
		session.setAttribute("persona", datos.getPersona());
		session.setAttribute("hobby", datos.getHobby());
		session.setAttribute("servivo", datos.getServivo());
		session.setAttribute("descripcion", datos.getDescripcion());
		
		
		return "redirect:/omikuji/show";
	}
	
	@RequestMapping( value = "/omikuji/show", method = RequestMethod.GET )
	public String plataforma(HttpSession session,Model model) {
		if(session.getAttribute("ciudad")!=null) {
			return "index.jsp";
		}
		else {
			return "login.jsp";
		}
	}
	
	@RequestMapping( value = "/logout", method = RequestMethod.GET )
	public String logout(HttpSession session ) {
		session.removeAttribute( "numero" );
		session.removeAttribute( "ciudad" );
		session.removeAttribute( "persona" );
		session.removeAttribute( "hobby" );
		session.removeAttribute( "servivo" );
		session.removeAttribute( "descripcion" );
		return "redirect:/omikuji";
	}
	

}
