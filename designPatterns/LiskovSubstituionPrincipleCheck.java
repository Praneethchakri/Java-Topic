package designPatterns;

/**
 * LiskovSubstitution Principle, where the Object of Super class should be able to replaced with Object of Subclass
 * without affecting the correctness of the program
 */

public class LiskovSubstituionPrincipleCheck {
    public static void main(String[] args) {

        Rectangle rectangle  = new Rectangle(10,20);
        System.out.println(rectangle.areaMethod());
        Square square = new Square(10);
        System.out.println(square.areaMethod());

        useReactangle(rectangle);
        useSquare(square);
   }
    private static void useReactangle(Rectangle rectangle){
        rectangle.setHeight(20);
        rectangle.setWidth(30);
        assert rectangle.getHeight() == 20:"Height is not 20";
        assert rectangle.getWidth()  == 30:"width is not 30";

    }
    private static void useSquare(Square square){
       square.setSide(10);
        assert square.getSide() == 10:"Height & Width is not 20";

    }
}
