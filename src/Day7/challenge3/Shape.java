package Day7.challenge3;

public abstract class Shape implements Drawable{
    private String shapeType;

    public Shape() {
    }

    public Shape(String shapeType) {
        this.shapeType = shapeType;
    }

    public void displayShapeType(){
        System.out.println("the type : "+shapeType);
    }

}
