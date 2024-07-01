
package web.model;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Car {
    private String company;
    private String model;
    private int years;

    public Car(String company, String model, int years) {
        this.company = company;
        this.model = model;
        this.years = years;
    }
}
