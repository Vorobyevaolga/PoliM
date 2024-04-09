public class Car extends Transport {

    public Car(String modelName, int wheelsCount) {
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
        System.out.println("Меняем покрышку машиене- " + getModelName());
    }

    private void checkEngine() {
        System.out.println("Проверяем двигатель машине- " + getModelName());
    }
}
