public class Truck extends Transport {
    public Truck(String modelName, int wheelsCount) {
        super(modelName, wheelsCount);
    }

    @Override
    public void check() {
        System.out.println("Обслуживаем машину - " + getModelName());
        for (int i = 0; i < getWheelsCount(); i++) {
            updateTyre();
        }
    }

    @Override
    public void updateTyre() {
        System.out.println("Меняем покрышку грузовику - " + getModelName());
    }

    private void checkEngine() {
        System.out.println("Проверяем двигатель у грузовика- " + getModelName());
    }

    private void checkTrailer() {
        System.out.println("Проверяем прицеп грузовика- " + getModelName());
    }
}