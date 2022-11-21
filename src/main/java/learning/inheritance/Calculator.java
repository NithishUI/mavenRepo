package learning.inheritance;
class NormalCalculator{
    private  int num1 = 0 ,num2 = 0;
    NormalCalculator(int num1, int num2){
        this.num1=num1;
        this.num2=num2;
    }
    public int add(){
        return num1+num2;
    }
    public int add(String num1, String num2 ){
        return Integer.parseInt(num1)+Integer.parseInt(num2);
    }
    public int sub(){
        return num1-num2;
    }
    public int mul(){
        return num1*num2;
    }
    public int div(){
        return num1/num2;
    }
}
class ScientificCalculator extends NormalCalculator{
    private  int num3 = 0 ,num4 = 0;
    ScientificCalculator(int num1, int num2){
        super(num1,num2);
        this.num3=num1;
        this.num4=num2;
    }
    public int modulo(){
        return num3%num4;
    }
}

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