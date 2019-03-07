package by.andd3dfx.model.shop;

import javax.persistence.Column;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue("Tube")
public class ItemWithLengthAndDiameter extends AbstractItem {

    @Column(name = "size_1")
    private Double length;

    @Column(name = "size_2")
    private Double diameter;

    public Double getLength() {
        return length;
    }

    public void setLength(Double length) {
        this.length = length;
    }

    public Double getDiameter() {
        return diameter;
    }

    public void setDiameter(Double diameter) {
        this.diameter = diameter;
    }

    @Override
    public String toString() {
        return "ItemWithLengthAndDiameter{" +
            super.toString() +
            ", length=" + length +
            ", diameter=" + diameter +
            '}';
    }
}
