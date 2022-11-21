package learning.inheritance;

public class Calculator {
    public static void main(String[] args){
        int num1=8,num2=4;
        ScientificCalculator scientificCalculator=new ScientificCalculator(num1, num2);
        System.out.println("Add: "+scientificCalculator.add());
        System.out.println("Add: "+scientificCalculator.add("25","55"));
        System.out.println("Sub: "+scientificCalculator.sub());
        System.out.println("Mul: "+scientificCalculator.mul());
        System.out.println("Div: "+scientificCalculator.div());
        System.out.println("Div: "+scientificCalculator.modulo());

    }
}