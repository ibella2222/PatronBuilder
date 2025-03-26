package co.edu.unicauca.figuras.patronbuilder.builder;

import java.util.List;

/**
 *
 * @author ibell
 */
public class SoftwareProjectBuilder extends ProjectBuilder {

    @Override
    public void buildName(String name) {
        this.name = name;
    }

    @Override
    public void buildCompany(String company) {
        this.company = company;
    }

    @Override
    public void buildRequirements(List<String> requirements) {
        this.requirements = requirements;
    }

    @Override
    public void buildTechnologies(List<String> technologies) {
        this.technologies = (technologies == null || technologies.isEmpty())
                ? List.of("Java", "Spring Boot", "PostgreSQL")
                : technologies;
    }

    @Override
    public void buildNumStudents(int numStudents) {
        this.numStudents = numStudents;
    }

    @Override
    public void buildDifficulty(String difficulty) {
        this.difficulty = (difficulty == null || difficulty.isEmpty()) ? "Baja" : difficulty;
    }
}
