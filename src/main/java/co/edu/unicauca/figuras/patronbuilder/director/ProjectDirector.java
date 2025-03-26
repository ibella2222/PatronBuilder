package co.edu.unicauca.figuras.patronbuilder.director;

import co.edu.unicauca.figuras.patronbuilder.builder.ProjectBuilder;
import co.edu.unicauca.figuras.patronbuilder.model.Project;
import java.util.List;

/**
 *
 * @author ibell
 */
public class ProjectDirector {

    private ProjectBuilder builder;

    public void setBuilder(ProjectBuilder builder) {
        this.builder = builder;
    }

    /**
     * Construye un proyecto de Software con valores predefinidos.
     *
     * @param name
     * @param company
     * @return
     */
    public Project buildSoftwareProject(String name, String company) {
        builder.buildName(name);
        builder.buildCompany(company);
        builder.buildRequirements(List.of("Gestion de productos", "Manejo de stock", "Generacion de reportes"));
        builder.buildTechnologies(List.of("Java", "Spring Boot", "PostgreSQL"));
        builder.buildNumStudents(4);
        builder.buildDifficulty("Baja");
        return builder.getProject();
    }

    public Project buildDataScienceProject(String name, String company) {
        builder.buildName(name);
        builder.buildCompany(company);
        builder.buildRequirements(List.of("Analisis de tendencias", "Prediccion de demanda", "Optimizacion de inventarios"));
        builder.buildTechnologies(List.of("Python", "Pandas", "TensorFlow"));
        builder.buildNumStudents(3);
        builder.buildDifficulty("Mediana");
        return builder.getProject();
    }

    public Project buildEmbeddedSystemsProject(String name, String company) {
        builder.buildName(name);
        builder.buildCompany(company);
        builder.buildRequirements(List.of("Sensor de temperatura", "Comunicacion Bluetooth", "Interfaz Web"));
        builder.buildTechnologies(List.of("C", "Arduino", "ESP32"));
        builder.buildNumStudents(5);
        builder.buildDifficulty("Alta");
        return builder.getProject();
    }
}
