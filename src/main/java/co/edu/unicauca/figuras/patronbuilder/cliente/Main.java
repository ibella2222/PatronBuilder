package co.edu.unicauca.figuras.patronbuilder.cliente;
import co.edu.unicauca.figuras.patronbuilder.builder.DataScienceProjectBuilder;
import co.edu.unicauca.figuras.patronbuilder.builder.EmbeddedSystemsProjectBuilder;
import co.edu.unicauca.figuras.patronbuilder.builder.ProjectBuilder;
import co.edu.unicauca.figuras.patronbuilder.builder.SoftwareProjectBuilder;
import co.edu.unicauca.figuras.patronbuilder.director.ProjectDirector;
import co.edu.unicauca.figuras.patronbuilder.model.Project;
/**
 *
 * @author ibell
 */
public class Main {
    public static void main(String[] args) {
        ProjectDirector director = new ProjectDirector();

        // Construir un proyecto de Software
        ProjectBuilder softwareBuilder = new SoftwareProjectBuilder();
        director.setBuilder(softwareBuilder);
        Project softwareProject = director.buildSoftwareProject("Sistema de Gestión de Inventarios", "TechCorp");
        System.out.println(softwareProject);

        // Construir un proyecto de Ciencia de Datos
        ProjectBuilder dataScienceBuilder = new DataScienceProjectBuilder();
        director.setBuilder(dataScienceBuilder);
        Project dataScienceProject = director.buildDataScienceProject("Análisis Predictivo de Ventas", "DataCorp");
        System.out.println(dataScienceProject);

        // Construir un proyecto de Sistemas Embebidos
        ProjectBuilder embeddedBuilder = new EmbeddedSystemsProjectBuilder();
        director.setBuilder(embeddedBuilder);
        Project embeddedProject = director.buildEmbeddedSystemsProject("Sistema de Monitoreo de Temperatura", "IoT Solutions");
        System.out.println(embeddedProject);
    }
}
