package com.epam.course.java.se.data.classes;

public class Next extends Base implements Cloneable {

    public String info(){
        return "Next";
    }



    {
        System.out.println("Next block");
    }

    private int nextField = Base.getInt("Next::nextField", 100);

    public Next() {
        this(200, 300);
    }

    public Next(int baseField1, int nextField) {
        super(baseField1);
        this.nextField = nextField;
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }


    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Next{");
        sb.append("nextField=").append(nextField);
        sb.append('}');
        sb.append(super.toString());
        return sb.toString();
    }
}
