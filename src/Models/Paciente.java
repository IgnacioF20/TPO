package Models;

import java.util.ArrayList;
import java.util.List;

public class Paciente {
    private Sexo sexo;
    private int edad;
    private List<Peticion> peticiones = new ArrayList<>();

    public Sexo getSexo() {
        return sexo;
    }

    public int getEdad() {
        return edad;
    }

    public void setSexo(Sexo sexo) {
        this.sexo = sexo;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public Paciente(Sexo sexo, int edad) {
        this.sexo = sexo;
        this.edad = edad;
    }
}
