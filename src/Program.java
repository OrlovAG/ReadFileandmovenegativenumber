/*Задача.
Дан текстовый файл, содержащий вещественные числа, разделенные ;
5; 16,7; -1; 7,8; 99; -7; -9,4

требуется прочитать файл, сделать Список вещественных чисел List<Double>
затем переставить все отрицательные значения в начало и вывести

-1  -7  -9.4  5  16.7  7.8  99*/
import java.io.*;

public class Program {

    public static void main(String[] args) {

        try(FileReader reader = new FileReader("List of numbers.txt"))
        {
            // читаем посимвольно
            int c;
            while((c=reader.read())!=-1){

                System.out.print((char)c);
            }
        }
        catch(IOException ex){

            System.out.println(ex.getMessage());
        }
    }
}
/*String str = "";
String[] words = str.split(" ");
        for (String word : words) {
        System.out.println(word);
        }
                }
                }*/


