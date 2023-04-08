package EverythingEverywhereAllAtOnce;

import java.time.LocalDate;
import java.time.LocalTime;

public class Contract {
    private LocalDate rent_Start;
    private LocalDate rent_end;
    private LocalTime rentstarttime;
    private LocalTime rentendtime;

    public Contract(LocalDate rent_Start, LocalDate rent_end, LocalTime rentstarttime, LocalTime rentendtime) {
        this.rent_Start = rent_Start;
        this.rent_end = rent_end;
        this.rentstarttime = rentstarttime;
        this.rentendtime = rentendtime;
    }


}
