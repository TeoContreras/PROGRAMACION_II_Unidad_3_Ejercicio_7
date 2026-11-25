public class ClienteCine {
    private String nombre;
    private int edad;
    private boolean tieneMembresiaVip;

    public ClienteCine(String nombre, int edad, boolean tieneMembresiaVip) {
        this.nombre = nombre;
        setEdad(edad);
        this.tieneMembresiaVip = tieneMembresiaVip;
    }

    public void setEdad(int edad) {
        if (edad >= 0) {
            this.edad = edad;
        } else {
            System.out.println("La edad no puede ser negativa.");
        }
    }

    public boolean esAptoParaFuncionMayores() {
        return edad >= 18;
    }

    public boolean puedeIngresarVip() {
        return tieneMembresiaVip;
    }

    public void mostrarEstado() {
        System.out.println(nombre + " - Apto para mayores: " + esAptoParaFuncionMayores());
        System.out.println("Puede ingresar a VIP: " + puedeIngresarVip());
    }
}