package co.edu.unicauca.figuras.patronbuilder.builder;

import co.edu.unicauca.figuras.patronbuilder.model.Project;
import java.util.List;

/**
 *
 * @author ibell
 */
public abstract class ProjectBuilder {

    protected String name;
    protected String company;
    protected List<String> requirements;
    protected List<String> technologies;
    protected int numStudents;
    protected String difficulty;

    // Métodos abstractos para definir la estructura del Builder
    public abstract void buildName(String name);

    public abstract void buildCompany(String company);

    public abstract void buildRequirements(List<String> requirements);

    public abstract void buildTechnologies(List<String> technologies);

    public abstract void buildNumStudents(int numStudents);

    public abstract void buildDifficulty(String difficulty);

    // Retorna el objeto Project construido
    public Project getProject() {
        return new Project(name, company, requirements, technologies, numStudents, difficulty);
    }
}
