package co.edu.udea.appEmpresariales.dojo.jersey.ws;

import java.util.ArrayList;
import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.xml.bind.annotation.XmlRootElement;

import co.edu.udea.appEmpresariales.dojo.jersey.pojo.Contacto;

@Path("Contact")
@XmlRootElement
	public class ContactoWS {

	private List<Contacto> contactos;

	public ContactoWS() {
		super();
		this.contactos = new ArrayList<Contacto>();
		Contacto nuevoContacto = new Contacto(1, "Jorge", "Cazorla", "5723438",
				"jorge@gmail.com");

		Contacto contacto2 = new Contacto(2, "Pedro", "Perez", "5903033",
				"pedro@gmail.com");
		Contacto contacto3 = new Contacto(3, "Carlos", "Figueroa", "4444445",
				"carlos@gmail.com");

		contactos.add(nuevoContacto);
		contactos.add(contacto2);
		contactos.add(contacto3);
	}
	
	public List<Contacto> getContactos() {
		return contactos;
	}

	@GET
	@Produces({MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML})
	@Path("getContacts")
	public List<Contacto> obtenerContactos() {
		
		return contactos;

	}

}
