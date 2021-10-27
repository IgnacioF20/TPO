package Models;

public class Paciente {
    private Sexo sexo;
    private int edad;

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
