package task_4;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {
    private static Collections Lists;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input number: ");
        int number = scanner.nextInt();
        scanner.close();
        ArrayList<Integer> chislo = new ArrayList<Integer>();
        while (number > 0) {
            chislo.add(number % 10);
            number = number / 10;
        }
        Collections.reverse(chislo);

        String[] first = new String[]{"  *  ", " *** ", " *** ", "   * ", "*****", " *** ", "*****", " *** ", " *** ", " *** "};
        String[] second = new String[]{" **  ", "*   *", "*   *", "  ** ", "*    ", "*   *", "    *", "*   *", "*   *", "*   *"};
        String[] third = new String[]{"* *  ", "    *", "    *", " * * ", "*    ", "*    ", "   * ", "*   *", "*   *", "*   *"};
        String[] fourth = new String[]{"  *  ", "   * ", "  ** ", "*  * ", "**** ", "**** ", "  *  ", " *** ", " ****", "*   *"};
        String[] fifth = new String[]{"  *  ", "  *  ", "    *", "*  * ", "    *", "*   *", " *   ", "*   *", "    *", "*   *"};
        String[] sixth = new String[]{"  *  ", " *   ", "*   *", "*****", "*   *", "*   *", " *   ", "*   *", "    *", "*   *"};
        String[] seventh = new String[]{"*****", "*****", " *** ", "   * ", " *** ", " *** ", " *   ", " *** ", "**** ", " *** "};
        int max = 0;
        for (int i = 0; i < chislo.size(); i++) {
            if (chislo.get(i) > max)
                max = chislo.get(i);

        }
        String best;

        if(max==0){
            System.out.println(" 000 ");
            System.out.println("0   0");
            System.out.println("0   0");
            System.out.println("0   0");
            System.out.println("0   0");
            System.out.println("0   0");
            System.out.println(" 000 ");
        } else {
            best = Integer.toString(max);
            String newString1 = first[max - 1].replace("*", best);
            String newString2 = second[max - 1].replace("*", best);
            String newString3 = third[max - 1].replace("*", best);
            String newString4 = fourth[max - 1].replace("*", best);
            String newString5 = fifth[max - 1].replace("*", best);
            String newString6 = sixth[max - 1].replace("*", best);
            String newString7 = seventh[max - 1].replace("*", best);


            for (int i = 0; i < chislo.size(); i++) {
                if (chislo.get(i) == max)
                    System.out.print(newString1 + "   ");
                else {
                    if (chislo.get(i) == 0) {
                        System.out.print(first[9] + "   ");
                    } else
                        System.out.print(first[chislo.get(i) - 1] + "   ");
                }
            }
            System.out.println();
            for (int i = 0; i < chislo.size(); i++) {
                if (chislo.get(i) == max)
                    System.out.print(newString2 + "   ");
                else {

                    if (chislo.get(i) == 0) {
                        System.out.print(second[9] + "   ");
                    } else
                        System.out.print(second[chislo.get(i) - 1] + "   ");
                }
            }
            System.out.println();
            for (int i = 0; i < chislo.size(); i++) {
                if (chislo.get(i) == max)
                    System.out.print(newString3 + "   ");
                else {

                    if (chislo.get(i) == 0) {
                        System.out.print(third[9] + "   ");
                    } else
                        System.out.print(third[chislo.get(i) - 1] + "   ");
                }
            }

            System.out.println();
            for (int i = 0; i < chislo.size(); i++) {
                if (chislo.get(i) == max)
                    System.out.print(newString4 + "   ");
                else {
                    if (chislo.get(i) == 0) {
                        System.out.print(fourth[9] + "   ");
                    } else
                        System.out.print(fourth[chislo.get(i) - 1] + "   ");
                }
            }
            System.out.println();
            for (int i = 0; i < chislo.size(); i++) {

                if (chislo.get(i) == max)
                    System.out.print(newString5 + "   ");
                else {
                    if (chislo.get(i) == 0) {
                        System.out.print(fifth[9] + "   ");
                    } else
                        System.out.print(fifth[chislo.get(i) - 1] + "   ");
                }
            }
            System.out.println();
            for (int i = 0; i < chislo.size(); i++) {
                if (chislo.get(i) == max)
                    System.out.print(newString6 + "   ");
                else {
                    if (chislo.get(i) == 0) {
                        System.out.print(sixth[9] + "   ");
                    } else
                        System.out.print(sixth[chislo.get(i) - 1] + "   ");
                }
            }

            System.out.println();
            for (int i = 0; i < chislo.size(); i++) {
                if (chislo.get(i) == max)
                    System.out.print(newString7 + "   ");
                else {

                    if (chislo.get(i) == 0) {
                        System.out.print(seventh[9] + "   ");
                    } else
                        System.out.print(seventh[chislo.get(i) - 1] + "   ");
                }
            }
            System.out.println();
        }


    }






}
