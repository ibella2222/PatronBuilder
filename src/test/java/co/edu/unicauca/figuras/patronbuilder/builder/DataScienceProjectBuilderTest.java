
package co.edu.unicauca.figuras.patronbuilder.builder;

import co.edu.unicauca.figuras.patronbuilder.model.Project;
import java.util.Arrays;
import java.util.List;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author ibell
 */

public class DataScienceProjectBuilderTest {
    @Test
    public void testBuildTechnologies_WhenListIsNullOrEmpty_ShouldSetDefaults() {
        DataScienceProjectBuilder builder = new DataScienceProjectBuilder();
        
        // Caso 1: Lista nula
        builder.buildTechnologies(null);
        Project project = builder.getProject();
        assertEquals(List.of("Python", "Pandas", "TensorFlow"), project.getTechnologies());
        
        // Caso 2: Lista vacía
        builder.buildTechnologies(List.of());
        project = builder.getProject();
        assertEquals(List.of("Python", "Pandas", "TensorFlow"), project.getTechnologies());
    }

    @Test
    public void testBuildTechnologies_WhenCustomList_ShouldUseProvidedTechnologies() {
        DataScienceProjectBuilder builder = new DataScienceProjectBuilder();
        List<String> customTech = List.of("PyTorch", "Scikit-learn");
        
        builder.buildTechnologies(customTech);
        Project project = builder.getProject();
        
        assertEquals(customTech, project.getTechnologies());
    }

    @Test
    public void testBuildDifficulty_WhenNullOrEmpty_ShouldSetDefault() {
        DataScienceProjectBuilder builder = new DataScienceProjectBuilder();
        
        // Caso 1: Dificultad nula
        builder.buildDifficulty(null);
        Project project = builder.getProject();
        assertEquals("Mediana", project.getDifficulty());
        
        // Caso 2: Dificultad vacía
        builder.buildDifficulty("");
        project = builder.getProject();
        assertEquals("Mediana", project.getDifficulty());
    }

    @Test
    public void testBuildDifficulty_WhenValidValue_ShouldUseCustomDifficulty() {
        DataScienceProjectBuilder builder = new DataScienceProjectBuilder();
        String customDifficulty = "Alta";
        
        builder.buildDifficulty(customDifficulty);
        Project project = builder.getProject();
        
        assertEquals(customDifficulty, project.getDifficulty());
    }

    @Test
    public void testBuildName() {
        DataScienceProjectBuilder builder = new DataScienceProjectBuilder();
        String projectName = "Análisis de Datos Climáticos";
        
        builder.buildName(projectName);
        Project project = builder.getProject();
        
        assertEquals(projectName, project.getName());
    }

    @Test
    public void testBuildCompany() {
        DataScienceProjectBuilder builder = new DataScienceProjectBuilder();
        String company = "Climate Corp";
        
        builder.buildCompany(company);
        Project project = builder.getProject();
        
        assertEquals(company, project.getCompany());
    }

    @Test
    public void testBuildRequirements() {
        DataScienceProjectBuilder builder = new DataScienceProjectBuilder();
        List<String> requirements = List.of("Limpieza de datos", "Modelado predictivo");
        
        builder.buildRequirements(requirements);
        Project project = builder.getProject();
        
        assertEquals(requirements, project.getRequirements());
    }

    @Test
    public void testBuildNumStudents() {
        DataScienceProjectBuilder builder = new DataScienceProjectBuilder();
        int students = 3;
        
        builder.buildNumStudents(students);
        Project project = builder.getProject();
        
        assertEquals(students, project.getNumStudents());
    }

    @Test
    public void testBuildNumStudents_WithNegativeValue_ShouldAcceptIt() {
        DataScienceProjectBuilder builder = new DataScienceProjectBuilder();
        int negativeStudents = -2; // El código actual permite esto
        
        builder.buildNumStudents(negativeStudents);
        Project project = builder.getProject();
        
        assertEquals(negativeStudents, project.getNumStudents());
    }     
}

