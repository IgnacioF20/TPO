package com.company.models;

import com.company.enumerate.SexoEnumerate;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Date;
import java.text.DateFormat;

public class Paciente extends Persona {

    ArrayList<Peticion> peticiones = new ArrayList();
    SexoEnumerate sexo;
    int edad;

    public Paciente(int DNI, String email, String nombre, String domicilio, Date fechaDeNacimiento, SexoEnumerate sexo) {

        super(DNI, email, nombre, domicilio, fechaDeNacimiento);
        this.sexo = sexo;
        this.edad = edad;
    }

    @Override
    public int getDNI() {
        return super.getDNI();
    }

    @Override
    public String getEmail() {
        return super.getEmail();
    }

    @Override
    public String getNombre() {
        return super.getNombre();
    }

    @Override
    public String getDomicilio() {
        return super.getDomicilio();
    }

    @Override
    public Date getFechaDeNacimiento() {
        return super.getFechaDeNacimiento();
    }

    @Override
    public void setDNI(int DNI) {
        super.setDNI(DNI);
    }

    @Override
    public void setEmail(String email) {
        super.setEmail(email);
    }

    @Override
    public void setNombre(String nombre) {
        super.setNombre(nombre);
    }

    @Override
    public void setDomicilio(String domicilio) {
        super.setDomicilio(domicilio);
    }

    @Override
    public void setFechaDeNacimiento(Date fechaDeNacimiento) {
        super.setFechaDeNacimiento(fechaDeNacimiento);
    }

    public Paciente(int DNI, String email, String nombre, String domicilio, Date fechaDeNacimiento) {
        super(DNI, email, nombre, domicilio, fechaDeNacimiento);
    }

    public SexoEnumerate getSexo() {
        return sexo;
    }

    public void setSexo(SexoEnumerate sexo) {
        this.sexo = sexo;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public int calcularEdad(Date fechaNacimientoIngresada) {

        DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy");

        String pattern = "MM/dd/yyyy HH:mm:ss";
        DateFormat df = new SimpleDateFormat(pattern);

        LocalDate fechaNacimiento = LocalDate.parse(df.format(fechaNacimientoIngresada), fmt);
        LocalDate fechaHoy = LocalDate.now();

        Period periodoNacimientoAHoy = Period.between(fechaNacimiento, fechaHoy);
        System.out.printf("Tu edad es: %s años, %s meses y %s días",
                periodoNacimientoAHoy.getYears(), periodoNacimientoAHoy.getMonths(), periodoNacimientoAHoy.getDays());

        return this.edad;
    }


    public boolean PeticionFinalizada(){
        boolean response = false;
        for(Peticion peticion: this.peticiones){
            if(!response){
                response = peticion.estaActiva();
            }
        }
        return response;
    }

    public int mostrarResultadoPractica(int nroPractica){
        int response = 0;
        for(Peticion peticion: this.peticiones){
            if(nroPractica == Integer.parseInt(peticion.codigoPeticion())){
                response = Integer.parseInt(peticion.codigoPeticion());
            }
        }
        return response;
    }

//    public boolean modificarAtributos(PacienteDTO paciente){
//
//        paciente
//
//
//    }



}
