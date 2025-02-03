package designPatterns;

public class LiskovSubstituionPrincipleCheck {
    public static void main(String[] args) {

        Rectangle rectangle  = new Rectangle(10,20);
        System.out.println(rectangle.areaMethod());
        Square square = new Square(10);
        System.out.println(square.areaMethod());

        useReactangle(rectangle);
        useReactangle(square);



    }
    private static void useReactangle(Rectangle rectangle){
        rectangle.setHeight(20);
        rectangle.setWidth(30);
        assert rectangle.getHeight() == 20:"Height is not 10";
        assert rectangle.getWidth() == 30:"width is not 20";

    }
}
