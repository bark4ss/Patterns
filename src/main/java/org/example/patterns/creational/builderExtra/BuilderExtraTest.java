package org.example.patterns.creational.builderExtra;

public class BuilderExtraTest {
    public static void main(String[] args) {
        Car car = new CarBuilder()
                .brand("BMW")
                .model("8")
                .name("Light")
                .price(10000)
                .build();
        System.out.println(car);

        Car car2 = new CarBuilder()
                .leftHanded(true)
                .price(20000)
                .quality(80)
                .brand("Mercedes")
                .build();
        System.out.println(car2);
    }
}
