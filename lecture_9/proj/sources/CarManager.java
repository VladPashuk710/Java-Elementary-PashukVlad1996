package lecture_9.proj.sources;

import lecture_9.proj.models.Car;

public interface CarManager {
    void add(Car c);
    void sell(Car c);
    void findByBrand(String brand);
    void findByModel(String model);
    void findByType(String type);
}
