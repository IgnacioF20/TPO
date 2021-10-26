package Controllers;

public class pacienteController {
    private ArrayList<Paciente> listaDePaciente = new ArrayList();

    public void NuevoPaciente(PacienteDTO p){
        this.listaDePaciente.add(p.toObjet());
    }
}
