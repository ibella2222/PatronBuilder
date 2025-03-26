
package co.edu.unicauca.figuras.patronbuilder.director;

import co.edu.unicauca.figuras.patronbuilder.builder.DataScienceProjectBuilder;
import co.edu.unicauca.figuras.patronbuilder.builder.EmbeddedSystemsProjectBuilder;
import co.edu.unicauca.figuras.patronbuilder.builder.ProjectBuilder;
import co.edu.unicauca.figuras.patronbuilder.builder.SoftwareProjectBuilder;
import co.edu.unicauca.figuras.patronbuilder.model.Project;
import java.util.List;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.Before;

/**
 *
 * @author ibell
 */
public class ProjectDirectorTest {
     private ProjectDirector director;

    @Before
    public void setUp() {
        director = new ProjectDirector();
    }

    @Test
    public void testBuildSoftwareProject() {
        SoftwareProjectBuilder softwareBuilder = new SoftwareProjectBuilder();
        director.setBuilder(softwareBuilder);
        
        Project softwareProject = director.buildSoftwareProject("Sistema de Gestion de Inventarios", "TechCorp");
        
        assertEquals("Sistema de Gestion de Inventarios", softwareProject.getName());
        assertEquals("TechCorp", softwareProject.getCompany());
        assertEquals(List.of("Gestion de productos", "Manejo de stock", "Generacion de reportes"), softwareProject.getRequirements());
        assertEquals(List.of("Java", "Spring Boot", "PostgreSQL"), softwareProject.getTechnologies());
        assertEquals(4, softwareProject.getNumStudents());
        assertEquals("Baja", softwareProject.getDifficulty());
    }

    @Test
    public void testBuildDataScienceProject() {
        DataScienceProjectBuilder dataScienceBuilder = new DataScienceProjectBuilder();
        director.setBuilder(dataScienceBuilder);
        
        Project dataScienceProject = director.buildDataScienceProject("Analisis Predictivo de Ventas", "DataCorp");
        
        assertEquals("Analisis Predictivo de Ventas", dataScienceProject.getName());
        assertEquals("DataCorp", dataScienceProject.getCompany());
        assertEquals(List.of("Analisis de tendencias", "Prediccion de demanda", "Optimizacion de inventarios"), dataScienceProject.getRequirements());
        assertEquals(List.of("Python", "Pandas", "TensorFlow"), dataScienceProject.getTechnologies());
        assertEquals(3, dataScienceProject.getNumStudents());
        assertEquals("Mediana", dataScienceProject.getDifficulty());
    }

    @Test
    public void testBuildEmbeddedSystemsProject() {
        EmbeddedSystemsProjectBuilder embeddedBuilder = new EmbeddedSystemsProjectBuilder();
        director.setBuilder(embeddedBuilder);
        
        Project embeddedProject = director.buildEmbeddedSystemsProject("Sistema de Monitoreo de Temperatura", "IoT Solutions");
        
        assertEquals("Sistema de Monitoreo de Temperatura", embeddedProject.getName());
        assertEquals("IoT Solutions", embeddedProject.getCompany());
        assertEquals(List.of("Sensor de temperatura", "Comunicacion Bluetooth", "Interfaz Web"), embeddedProject.getRequirements());
        assertEquals(List.of("C", "Arduino", "ESP32"), embeddedProject.getTechnologies());
        assertEquals(5, embeddedProject.getNumStudents());
        assertEquals("Alta", embeddedProject.getDifficulty());
    }
}
