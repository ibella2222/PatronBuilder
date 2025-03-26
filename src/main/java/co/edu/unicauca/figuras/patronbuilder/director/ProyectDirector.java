
package co.edu.unicauca.figuras.patronbuilder.director;

import co.edu.unicauca.figuras.patronbuilder.builder.ProjectBuilder;
import co.edu.unicauca.figuras.patronbuilder.model.Proyect;
import java.util.List;
/**
 *
 * @author ibell
 */
public class ProyectDirector {
    private ProjectBuilder builder; // Atributo para almacenar el builder

    // Método para asignar el builder (requerido por el diagrama)
    public void setBuilder(ProjectBuilder builder) {
        this.builder = builder;
    }

    // Método buildProject con parámetros según el diagrama
    public Proyect buildProject(
        String name,
        String company,
        List<String> requirements,
        List<String> technologies,
        int numStudents
    ) {
        // Construye el proyecto usando el builder almacenado
        builder.buildName(name);
        builder.buildCompany(company);
        builder.buildRequirements(requirements);
        builder.buildTechnologies(technologies);
        builder.buildNumStudents(numStudents);
        builder.buildDifficulty();
        
        return builder.getProject();
    }
    
}
