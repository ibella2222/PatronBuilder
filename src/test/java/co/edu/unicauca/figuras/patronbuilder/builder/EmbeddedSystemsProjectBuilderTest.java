/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package co.edu.unicauca.figuras.patronbuilder.builder;

import co.edu.unicauca.figuras.patronbuilder.model.Project;
import java.util.List;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author ibell
 */
public class EmbeddedSystemsProjectBuilderTest {
    @Test
    public void testBuildTechnologies_DefaultWhenEmptyOrNull() {
        EmbeddedSystemsProjectBuilder builder = new EmbeddedSystemsProjectBuilder();
        
        // Caso nulo
        builder.buildTechnologies(null);
        Project project = builder.getProject();
        assertEquals(List.of("C", "Arduino", "ESP32"), project.getTechnologies());
        
        // Caso lista vacía
        builder.buildTechnologies(List.of());
        project = builder.getProject();
        assertEquals(List.of("C", "Arduino", "ESP32"), project.getTechnologies());
    }

    @Test
    public void testBuildTechnologies_CustomList() {
        EmbeddedSystemsProjectBuilder builder = new EmbeddedSystemsProjectBuilder();
        List<String> customTech = List.of("Rust", "STM32");
        
        builder.buildTechnologies(customTech);
        Project project = builder.getProject();
        assertEquals(customTech, project.getTechnologies());
    }

    @Test
    public void testBuildDifficulty_DefaultWhenEmptyOrNull() {
        EmbeddedSystemsProjectBuilder builder = new EmbeddedSystemsProjectBuilder();
        
        // Dificultad nula
        builder.buildDifficulty(null);
        Project project = builder.getProject();
        assertEquals("Alta", project.getDifficulty());
        
        // Dificultad vacía
        builder.buildDifficulty("");
        project = builder.getProject();
        assertEquals("Alta", project.getDifficulty());
    }

    @Test
    public void testBuildDifficulty_CustomValue() {
        EmbeddedSystemsProjectBuilder builder = new EmbeddedSystemsProjectBuilder();
        String customDifficulty = "Crítica";
        
        builder.buildDifficulty(customDifficulty);
        Project project = builder.getProject();
        assertEquals(customDifficulty, project.getDifficulty());
    }

    @Test
    public void testBuildName() {
        EmbeddedSystemsProjectBuilder builder = new EmbeddedSystemsProjectBuilder();
        String projectName = "Sistema de Control de Temperatura";
        
        builder.buildName(projectName);
        Project project = builder.getProject();
        assertEquals(projectName, project.getName());
    }

    @Test
    public void testBuildCompany() {
        EmbeddedSystemsProjectBuilder builder = new EmbeddedSystemsProjectBuilder();
        String company = "IoT Solutions";
        
        builder.buildCompany(company);
        Project project = builder.getProject();
        assertEquals(company, project.getCompany());
    }

    @Test
    public void testBuildRequirements() {
        EmbeddedSystemsProjectBuilder builder = new EmbeddedSystemsProjectBuilder();
        List<String> requirements = List.of("Control PID", "Comunicación LoRa");
        
        builder.buildRequirements(requirements);
        Project project = builder.getProject();
        assertEquals(requirements, project.getRequirements());
    }

    @Test
    public void testBuildNumStudents() {
        EmbeddedSystemsProjectBuilder builder = new EmbeddedSystemsProjectBuilder();
        int students = 5;
        
        builder.buildNumStudents(students);
        Project project = builder.getProject();
        assertEquals(students, project.getNumStudents());
    }

    @Test
    public void testNegativeNumStudents() {
        EmbeddedSystemsProjectBuilder builder = new EmbeddedSystemsProjectBuilder();
        builder.buildNumStudents(-3);
        
        Project project = builder.getProject();
        assertEquals(-3, project.getNumStudents());
    }
}
