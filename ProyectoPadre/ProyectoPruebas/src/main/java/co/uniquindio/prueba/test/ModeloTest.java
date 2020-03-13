package co.uniquindio.prueba.test;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import org.jboss.arquillian.container.test.api.Deployment;
import org.jboss.arquillian.junit.Arquillian;
import org.jboss.arquillian.transaction.api.annotation.TransactionMode;
import org.jboss.arquillian.transaction.api.annotation.Transactional;
import org.jboss.shrinkwrap.api.Archive;
import org.jboss.shrinkwrap.api.ShrinkWrap;
import org.jboss.shrinkwrap.api.asset.EmptyAsset;
import org.jboss.shrinkwrap.api.spec.WebArchive;
import org.junit.Test;
import org.junit.runner.RunWith;

import co.edu.uniquindio.ejemploe.Estudiante;
import co.edu.uniquindio.entidades.Genero;
import co.edu.uniquindio.entidades.Persona;

@RunWith(Arquillian.class)
public class ModeloTest {
	@PersistenceContext
	private EntityManager entityManager;

	@Deployment
	public static Archive<?> createTestArchive() {
		return ShrinkWrap.create(WebArchive.class, "prueba.war").addPackage(Estudiante.class.getPackage())
				.addAsResource("persistenceForTest.xml", "META-INF/persistence.xml")
				.addAsWebInfResource(EmptyAsset.INSTANCE, "beans.xml");
	}
	
	
	@Test
	public void test() {
		
	}
	
	@Test
	@Transactional(value = TransactionMode.ROLLBACK)
	public void persistenciaPersonaTest() throws ParseException {
		
		SimpleDateFormat sdf= new SimpleDateFormat("dd/MM/yyyy");
		Date fecha = sdf.parse("15/11/1999");
		
		HashMap<String, String> telefonos = new HashMap<>();
		telefonos.put("casa", "7677880");
		telefonos.put("celular", "311445678");
		
		Persona persona = new Persona();
		persona.setCedula("125");
		persona.setNombre("Juanita");
		persona.setApellido("Perez");
		persona.setEmail("juanitaws@gmail.com");
		persona.setGenero(Genero.FEMENINO);
		persona.setFechaNacimiento(fecha);
		persona.setTelefono(telefonos);
		
		entityManager.persist(persona);
		entityManager.flush();
		
		
		Persona persona1 = new Persona();
		persona1.setCedula("3334");
		persona1.setNombre("Juanita");
		persona1.setApellido("Perez");
		persona1.setEmail("juanita642@gmail.com");
		persona1.setGenero(Genero.FEMENINO);
		persona1.setFechaNacimiento(fecha);
		persona1.setTelefono(telefonos);
		
		entityManager.persist(persona1);
		entityManager.flush();
	}
}
