
package co.edu.unicauca.figuras.patronbuilder.builder;

import co.edu.unicauca.figuras.patronbuilder.model.Project;
import java.util.List;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author ibell
 */
public class SoftwareProjectBuilderTest {
   @Test
    public void testBuildTechnologies_DefaultWhenNullOrEmpty() {
        SoftwareProjectBuilder builder = new SoftwareProjectBuilder();
        
        // Caso nulo
        builder.buildTechnologies(null);
        Project project = builder.getProject();
        assertEquals(List.of("Java", "Spring Boot", "PostgreSQL"), project.getTechnologies());
        
        // Caso lista vacía
        builder.buildTechnologies(List.of());
        project = builder.getProject();
        assertEquals(List.of("Java", "Spring Boot", "PostgreSQL"), project.getTechnologies());
    }

    @Test
    public void testBuildTechnologies_CustomList() {
        SoftwareProjectBuilder builder = new SoftwareProjectBuilder();
        List<String> customTech = List.of("Kotlin", "Micronaut");
        
        builder.buildTechnologies(customTech);
        Project project = builder.getProject();
        
        assertEquals(customTech, project.getTechnologies());
    }

    @Test
    public void testBuildDifficulty_DefaultWhenNullOrEmpty() {
        SoftwareProjectBuilder builder = new SoftwareProjectBuilder();
        
        // Dificultad nula
        builder.buildDifficulty(null);
        Project project = builder.getProject();
        assertEquals("Baja", project.getDifficulty());
        
        // Dificultad vacía
        builder.buildDifficulty("");
        project = builder.getProject();
        assertEquals("Baja", project.getDifficulty());
    }

    @Test
    public void testBuildDifficulty_CustomValue() {
        SoftwareProjectBuilder builder = new SoftwareProjectBuilder();
        String customDifficulty = "Media";
        
        builder.buildDifficulty(customDifficulty);
        Project project = builder.getProject();
        
        assertEquals(customDifficulty, project.getDifficulty());
    }

    @Test
    public void testBuildName() {
        SoftwareProjectBuilder builder = new SoftwareProjectBuilder();
        String projectName = "Sistema de Gestión de Ventas";
        
        builder.buildName(projectName);
        Project project = builder.getProject();
        
        assertEquals(projectName, project.getName());
    }

    @Test
    public void testBuildCompany() {
        SoftwareProjectBuilder builder = new SoftwareProjectBuilder();
        String company = "Tech Innovations";
        
        builder.buildCompany(company);
        Project project = builder.getProject();
        
        assertEquals(company, project.getCompany());
    }

    @Test
    public void testBuildRequirements() {
        SoftwareProjectBuilder builder = new SoftwareProjectBuilder();
        List<String> requirements = List.of("Login de usuarios", "Dashboard de reportes");
        
        builder.buildRequirements(requirements);
        Project project = builder.getProject();
        
        assertEquals(requirements, project.getRequirements());
    }

    @Test
    public void testBuildNumStudents() {
        SoftwareProjectBuilder builder = new SoftwareProjectBuilder();
        int students = 4;
        
        builder.buildNumStudents(students);
        Project project = builder.getProject();
        
        assertEquals(students, project.getNumStudents());
    }

    @Test
    public void testNegativeNumStudents() {
        SoftwareProjectBuilder builder = new SoftwareProjectBuilder();
        builder.buildNumStudents(-2); // El código actual permite valores negativos
        
        Project project = builder.getProject();
        assertEquals(-2, project.getNumStudents());
    } 
}
