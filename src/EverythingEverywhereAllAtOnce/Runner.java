package EverythingEverywhereAllAtOnce;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Runner  {
    static Scanner scan = new Scanner(System.in);
    static Map<String ,Map<String,Object>> carList ;


    public static void main(String[] args) {
        boolean flag = true;
        while (flag){

            System.out.println("do you wanna keep adding?");
            if (scan.next().equalsIgnoreCase("no")) break;

        }
        System.out.println("bye bye");
    }


    public static void storedate() {
        HashMap<String, Object> clientdata = new HashMap<>();
        Contract client = new Contract(LocalDate.of(scan.nextInt(),scan.nextInt(),scan.nextInt()),LocalDate.of(scan.nextInt(),scan.nextInt(),scan.nextInt()), LocalTime.of(scan.nextInt(), scan.nextInt(), scan.nextInt()), LocalTime.of(scan.nextInt(), scan.nextInt(), scan.nextInt()));
        Vechile vechile = new Vechile(Brand.FORD,scan.next(), scan.next());
        clientdata.put("Contract",client);
        clientdata.put("Car Details",vechile);
        System.out.println("name and surname please?");
        carList.put(scan.nextLine(),clientdata);
        System.out.println("sucessfully entered ");
    }
}
