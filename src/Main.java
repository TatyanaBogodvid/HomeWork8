public class Main {
    public static void main(String[] args) {
        //Задача 1
        System.out.println("Задача 1");
        int[] figure = new int[3];
        figure[0] = 1;
        figure[1] = 2;
        figure[2] = 3;

        float[] floats = {1.57f, 7.654f, 9.986f};

        int[] random = {1, 5, 6, 8};

        //Задача 2
        System.out.println("Задача 2");
        System.out.print("");
        for (int i = 0; i < figure.length; i ++) {
            System.out.print(figure[i]);
            if (i < figure.length - 1){
                System.out.print(", ");}
        }
        System.out.println("");
        for (int a = 0; a < floats.length; a ++) {
            System.out.print(floats[a]);
            if (a < floats.length - 1){
                System.out.print(", ");}
        }
        System.out.println("");
        for(int b = 0; b < random.length; b ++) {
            System.out.print(random[b]);
            if (b < random.length - 1){
                System.out.print(", ");}
        }


        //Задача 3
        System.out.println("");
        System.out.println("Задача 3");
        for (int i = figure.length - 1; i < figure.length && i >= 0; i --) {
            System.out.print(figure[i]);
            if(i > 0) {
                System.out.print(", ");
            }
        }
        System.out.println("");
        for (int a = floats.length - 1; a < floats.length && a >= 0; a --) {
            System.out.print(floats[a]);
            if(a > 0) {
                System.out.print(", ");
            }
        }
        System.out.println("");
        for (int b = random.length - 1; b < random.length && b >= 0; b --) {
            System.out.print(random[b]);
            if(b > 0) {
                System.out.print(", ");
            }
        }

        //Задача 4
        System.out.println("");
        System.out.println("Задача 4");
        for (int i = 0; i < figure.length; i++) {
            if (figure[i] % 2 != 0) {
                figure[i] = figure[i] + 1;}
                System.out.print(figure[i] + " ");
            }

    }
}


