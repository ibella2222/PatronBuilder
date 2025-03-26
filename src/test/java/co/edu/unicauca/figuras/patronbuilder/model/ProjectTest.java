
package co.edu.unicauca.figuras.patronbuilder.model;

import java.util.Arrays;
import java.util.List;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author ibell
 */
public class ProjectTest {
    
    @Test
    public void testGetName() {
        Project instance = new Project("Sistema de Gestión", "TechCorp", null, null, 4, "Baja");
        assertEquals("Sistema de Gestión", instance.getName());
    }

    @Test
    public void testSetName() {
        Project instance = new Project("", "TechCorp", null, null, 4, "Baja");
        instance.setName("Nuevo Nombre");
        assertEquals("Nuevo Nombre", instance.getName());
    }

    @Test
    public void testGetCompany() {
        Project instance = new Project("Sistema de Gestión", "TechCorp", null, null, 4, "Baja");
        assertEquals("TechCorp", instance.getCompany());
    }

    @Test
    public void testSetCompany() {
        Project instance = new Project("Sistema de Gestión", "", null, null, 4, "Baja");
        instance.setCompany("Nueva Empresa");
        assertEquals("Nueva Empresa", instance.getCompany());
    }

    @Test
    public void testGetRequirements() {
        List<String> reqs = Arrays.asList("Gestión de productos", "Manejo de stock");
        Project instance = new Project("Sistema", "TechCorp", reqs, null, 4, "Baja");
        assertEquals(reqs, instance.getRequirements());
    }

    @Test
    public void testSetRequirements() {
        Project instance = new Project("Sistema", "TechCorp", null, null, 4, "Baja");
        List<String> newReqs = Arrays.asList("Nuevo requerimiento");
        instance.setRequirements(newReqs);
        assertEquals(newReqs, instance.getRequirements());
    }

    @Test
    public void testGetTechnologies() {
        List<String> techs = Arrays.asList("Java", "Spring Boot");
        Project instance = new Project("Sistema", "TechCorp", null, techs, 4, "Baja");
        assertEquals(techs, instance.getTechnologies());
    }

    @Test
    public void testSetTechnologies() {
        Project instance = new Project("Sistema", "TechCorp", null, null, 4, "Baja");
        List<String> newTechs = Arrays.asList("Python", "Django");
        instance.setTechnologies(newTechs);
        assertEquals(newTechs, instance.getTechnologies());
    }

    @Test
    public void testGetNumStudents() {
        Project instance = new Project("Sistema", "TechCorp", null, null, 4, "Baja");
        assertEquals(4, instance.getNumStudents());
    }

    @Test
    public void testSetNumStudents() {
        Project instance = new Project("Sistema", "TechCorp", null, null, 4, "Baja");
        instance.setNumStudents(5);
        assertEquals(5, instance.getNumStudents());
    }

    @Test
    public void testGetDifficulty() {
        Project instance = new Project("Sistema", "TechCorp", null, null, 4, "Baja");
        assertEquals("Baja", instance.getDifficulty());
    }

    @Test
    public void testSetDifficulty() {
        Project instance = new Project("Sistema", "TechCorp", null, null, 4, "Baja");
        instance.setDifficulty("Alta");
        assertEquals("Alta", instance.getDifficulty());
    }

    @Test
    public void testToString() {
        Project instance = new Project("Sistema", "TechCorp", Arrays.asList("Req1"), Arrays.asList("Java"), 4, "Baja");
        String expected = "Project{name='Sistema', company='TechCorp', requirements=[Req1], technologies=[Java], numStudents=4, difficulty='Baja'}";
        assertEquals(expected, instance.toString());
    }
}
