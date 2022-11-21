package string.demo;

public class SwitchCarDemo {
    public static void main(String[] args) {
        String input = "";
        try{
            input = args[0].toLowerCase();
        }catch(ArrayIndexOutOfBoundsException exception){
            System.out.println("Please enter valid data");
            throw exception;
        }
        System.out.println(input);
        String kiaprice = "8L - 23L";
        String fordprice = "5L - 23L";
        String tataprice = "4L - 30L";
        String hondaprice = "8L - 20L";
        String[] kiaModels = {"Sonet", "Seltos", "Carvens", "Carnivel"};
        String[] fordModels = {"Mustang", "ecosport"};
        String[] tataModels = {"Indica", "Nanao", "Harrier","Safari","Nexon"};
        String[] hondaModels = {"Civic", "City"};

        switch (input){
            case "kia":
                System.out.println("Kia Price Starts from" + " " + kiaprice);
                printCarModels(kiaModels);
                break;

            case "ford":
                System.out.println("Ford Price Starts from" + " " + fordprice);
                printCarModels(fordModels);
                break;

            case "tata":
                System.out.println("Tata Price Starts from" + " " + tataprice);
                printCarModels(tataModels);
                break;

            case "honda":
                System.out.println("Honda Price Starts from" + " " + hondaprice);
                printCarModels(hondaModels);
                break;

            default:
                System.out.println("Choose KIA/FORD/TATA/HONDA");
        }
    }

    private static void printCarModels(String[] carModels){
        for (int i = 0; i < carModels.length; i++) {
            System.out.println(carModels[i]);
        }
    }
}
