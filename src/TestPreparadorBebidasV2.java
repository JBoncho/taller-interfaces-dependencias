import java.util.List;

public class TestPreparadorBebidasV2 {
    public static void main(String[] args) {
        List<EquipoCocina> equipos = List.of(
                new Cafetera(),
                new MaquinaTe(),
                new Licuadora(),
                new Exprimidor()
        );

        PreparadorBebidasV2 preparador = new PreparadorBebidasV2(equipos);
        preparador.prepararDesayuno();
        preparador.apagarTodo();
    }
}