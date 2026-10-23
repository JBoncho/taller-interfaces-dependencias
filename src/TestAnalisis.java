public class TestAnalisis {
    public static void main(String[] args) {
        // 1. Crear PreparadorBebidas
        PreparadorBebidas preparador = new PreparadorBebidas();

        // 2. Preparar desayuno
        preparador.prepararDesayuno();

        // 3. Apagar todos los equipos
        preparador.apagarTodo();

        // 4. Resumir problema detectado
        System.out.println("El preparador esta amarrado a Cafetera y Licuadora.");

    }
}

