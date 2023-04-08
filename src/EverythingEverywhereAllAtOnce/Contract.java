package EverythingEverywhereAllAtOnce;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.Scanner;

public class Contract {
    static Scanner scan = new Scanner(System.in);
    private LocalDate rent_Start;
    public LocalDate rent_end;
    private LocalTime rentstarttime;
    public LocalTime rentendtime;

    public Contract(LocalDate rent_Start, LocalDate rent_end, LocalTime rentstarttime, LocalTime rentendtime) {
        setRent_Start(rent_Start);
        setRent_end(rent_end);
        this.rentstarttime = rentstarttime;
        this.rentendtime = rentendtime;
    }

    private void setRent_Start(LocalDate rent_Start) {
        if (LocalDate.now().isAfter(rent_Start)) {
            this.rent_Start = rent_Start;
            return ;
        }
        System.out.println("wrong date its old enter a new date");
        try {
            setRent_Start(LocalDate.of(scan.nextInt(), scan.nextInt(), scan.nextInt()));
        }catch (Exception e){
            System.out.println("first year month and day");
            setRent_Start(LocalDate.of(2012,5,3));
        }
    }

    public void setRent_end(LocalDate rent_end) {
        if (rent_Start.isAfter(rent_end)) {
            this.rent_end = rent_end;
            return;
        }
        System.out.println("wrong date its old enter a new date");
        try {
            setRent_end(LocalDate.of(scan.nextInt(), scan.nextInt(), scan.nextInt()));
        }catch (Exception e){
            System.out.println("first year month and day");
            setRent_end(LocalDate.of(2012,5,3));
        }
    }

}
