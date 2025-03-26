
package co.edu.unicauca.figuras.patronbuilder.model;
import java.util.List;
/**
 *
 * @author ibell
 */
public class Project {
    private String name;
    private String company;
    private List<String> requirements;
    private List<String> technologies;
    private int numStudents;
    private String difficulty;

    // Constructor
    public Project(String name, String company, List<String> requirements, List<String> technologies, int numStudents, String difficulty) {
        this.name = name;
        this.company = company;
        this.requirements = requirements;
        this.technologies = technologies;
        this.numStudents = numStudents;
        this.difficulty = difficulty;
    }
    
    //setters and getters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public List<String> getRequirements() {
        return requirements;
    }

    public void setRequirements(List<String> requirements) {
        this.requirements = requirements;
    }

    public List<String> getTechnologies() {
        return technologies;
    }

    public void setTechnologies(List<String> technologies) {
        this.technologies = technologies;
    }

    public int getNumStudents() {
        return numStudents;
    }

    public void setNumStudents(int numStudents) {
        this.numStudents = numStudents;
    }

    public String getDifficulty() {
        return difficulty;
    }

    public void setDifficulty(String difficulty) {
        this.difficulty = difficulty;
    }

    
    // Método toString para imprimir detalles del proyecto
    @Override
    public String toString() {
        return "Project{" +
                "name='" + name + '\'' +
                ", company='" + company + '\'' +
                ", requirements=" + requirements +
                ", technologies=" + technologies +
                ", numStudents=" + numStudents +
                ", difficulty='" + difficulty + '\'' +
                '}';
    }
}
