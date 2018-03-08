import java.util.Scanner;

public class P02_SmallShop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String product = scanner.nextLine();
        String city = scanner.nextLine();
        double quantity = Double.parseDouble(scanner.nextLine());

        double price = 0;

        //Check if the town is "Sofia":
        if (city.equals("Sofia")){
            //For every town we check products and set price for every product. We using nested if statements:
            if(product.equals("coffee")){
                price = 0.5;
            }else if (product.equals("water")){
                price = 0.80;
            } else if (product.equals("beer")){
                price = 1.20;
            } else if (product.equals("sweets")){
                price = 1.45;
            }else if (product.equals("peanuts")){
                price = 1.60;
            }
        }else if (city.equals("Plovdiv")){
            if(product.equals("coffee")){
                price = 0.40;
            }else if (product.equals("water")){
                price = 0.70;
            } else if (product.equals("beer")){
                price = 1.15;
            } else if (product.equals("sweets")){
                price = 1.30;
            }else if (product.equals("peanuts")){
                price = 1.50;
            }
        } else if (city.equals("Varna")){
            if(product.equals("coffee")){
                price = 0.45;
            }else if (product.equals("water")){
                price = 0.70;
            } else if (product.equals("beer")){
                price = 1.10;
            } else if (product.equals("sweets")){
                price = 1.35;
            }else if (product.equals("peanuts")){
                price = 1.55;
            }
        }

        //Calculate total price:
        double result = price * quantity;

        System.out.println(result);
    }
}
