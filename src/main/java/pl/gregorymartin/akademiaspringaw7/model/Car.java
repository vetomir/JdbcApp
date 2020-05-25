package pl.gregorymartin.akademiaspringaw7.model;

import java.time.Year;

class Car {

    private long carId;
    private String mark;
    private String model;
    private String color;
    private Year year;

    //

    public Car() {
    }

    public Car(final long id, final String mark, final String model, final String color, final Year year) {
        this.carId = id;
        this.mark = mark;
        this.model = model;
        this.color = color;
        this.year = year;
    }

    //

    public long getId() {
        return carId;
    }

    public void setId(final long id) {
        this.carId = id;
    }

    public String getMark() {
        return mark;
    }

    public void setMark(final String mark) {
        this.mark = mark;
    }

    public String getModel() {
        return model;
    }

    public void setModel(final String model) {
        this.model = model;
    }

    public String getColor() {
        return color;
    }

    public void setColor(final String color) {
        this.color = color;
    }

    public Year getYear() {
        return year;
    }

    public void setYear(final Year year) {
        this.year = year;
    }
}
