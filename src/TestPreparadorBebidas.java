public class TestPreparadorBebidas {
    public static void main(String[] args) {
        // Configuracion 1: Cafetera y Licuadora
        System.out.println("Configuracion 1: Cafetera y Licuadora");
        PreparadorBebidas p1 = new PreparadorBebidas(new Cafetera(), new Licuadora());
        p1.prepararDesayuno();
        p1.apagarTodo();

        // Configuracion 2: MaquinaTe y Exprimidor
        System.out.println();
        System.out.println("Configuracion 2: MaquinaTe y Exprimidor");
        PreparadorBebidas p2 = new PreparadorBebidas(new MaquinaTe(), new Exprimidor());
        p2.prepararDesayuno();
        p2.apagarTodo();

        // Configuracion 3: Cafetera y MaquinaTe
        System.out.println();
        System.out.println("Configuracion 3: Cafetera y MaquinaTe");
        PreparadorBebidas p3 = new PreparadorBebidas(new Cafetera(), new MaquinaTe());
        p3.prepararDesayuno();
        p3.apagarTodo();
    }
}