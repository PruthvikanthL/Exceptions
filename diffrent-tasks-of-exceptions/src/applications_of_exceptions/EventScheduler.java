package applications_of_exceptions;

import java.time.LocalTime;

public class EventScheduler {
    LocalTime event1End;
    LocalTime event2Start;
    public EventScheduler(LocalTime event1End, LocalTime event2Start) {
        this.event1End = event1End;
        this.event2Start = event2Start;}
    public void validateSchedule() {
        try {
            if (event1End.isAfter(event2Start)) {
                throw new IllegalArgumentException("Scheduling conflict: Event 1 ends after Event 2 starts.");
            }
            System.out.println("Schedule is valid.");
        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        }
        System.out.println("Event scheduling check completed.");
    }
}
