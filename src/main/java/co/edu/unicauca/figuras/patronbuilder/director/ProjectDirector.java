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
     * @param name
     * @param company
     * @return 
     */
    public Project buildSoftwareProject(String name, String company) {
        builder.buildName(name);
        builder.buildCompany(company);
        builder.buildRequirements(List.of("Gestión de usuarios", "Seguridad"));
        builder.buildTechnologies(List.of("Java", "Spring Boot", "PostgreSQL"));
        builder.buildNumStudents(4);
        builder.buildDifficulty("Baja");
        return builder.getProject();
    }

    /**
     * Construye un proyecto de Ciencia de Datos con valores predefinidos.
     * @param name
     * @param company
     * @return 
     */
    public Project buildDataScienceProject(String name, String company) {
        builder.buildName(name);
        builder.buildCompany(company);
        builder.buildRequirements(List.of("Análisis de datos", "Machine Learning"));
        builder.buildTechnologies(List.of("Python", "Pandas", "TensorFlow"));
        builder.buildNumStudents(3);
        builder.buildDifficulty("Mediana");
        return builder.getProject();
    }

    /**
     * Construye un proyecto de Sistemas Embebidos con valores predefinidos.
     * @param name
     * @param company
     * @return 
     */
    public Project buildEmbeddedSystemsProject(String name, String company) {
        builder.buildName(name);
        builder.buildCompany(company);
        builder.buildRequirements(List.of("Comunicación con sensores", "Tiempo real"));
        builder.buildTechnologies(List.of("C", "Arduino", "ESP32"));
        builder.buildNumStudents(5);
        builder.buildDifficulty("Alta");
        return builder.getProject();
    }
}
