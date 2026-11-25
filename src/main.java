public class main {
    public static void main(String[] args) {
        ClienteCine cliente1 = new ClienteCine("Ana", 20, true);
        ClienteCine cliente2 = new ClienteCine("Pedro", 15, false);
        cliente1.mostrarEstado();
        cliente2.mostrarEstado();
        cliente2.setEdad(-5);
    }
}