package creational.builder;

import lombok.Getter;
import lombok.Setter;

/**
 * @author Milan Rathod
 */
@Getter
@Setter
public class Beverage {

    private int water;

    private int milk;

    private int sugar;

    private String beverageName;

    @Override
    public String toString() {
        return "Beverage [water=" + water + ", milk=" + milk + ", sugar=" + sugar + ", beverageName=" + beverageName
                + "]";
    }

}
