//Clase calculateId que recibe por parámetro el número de dni que ingresa el usuario

public class CalculateId {

    int id;

    public CalculateId(int Id) {
        this.id = Id;
    }

    //Método que calcula a partir del número del Dni, la letra que le corresponde
    public char calculateLetterId() {
        String caracteres = "TRWAGMYFPDXBNJZSQVHLCKE";
        int resto = id % 23;
        return caracteres.charAt(resto);
    }
}
