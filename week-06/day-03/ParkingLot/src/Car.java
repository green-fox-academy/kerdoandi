public class Car {
  CarType carType;
  CarColor carColor;

  public Car(CarType carType, CarColor carColor) {
    this.carType = carType;
    this.carColor = carColor;
  }

  @Override
  public String toString() {
    return carType + " " + carColor;
  }
}