package studentOrientation.driver;

import studentOrientation.activityInterfaces.ScheduleI;
import studentOrientation.activityInterfaces.WorkshopI;
import studentOrientation.util.ActivitiesEnum;
import studentOrientation.util.Schedule;
import studentOrientation.util.SchedulerWorkshop;

public class Driver {
    public static void main(String[] args) {
        ScheduleI createSchedule = new Schedule(ActivitiesEnum.MOUNTAINVIEW, ActivitiesEnum.CS350, ActivitiesEnum.UNIVERSITYUNION_BUS,
                ActivitiesEnum.WATSON_BUS);
        WorkshopI schedule = new SchedulerWorkshop();
        schedule.construct(createSchedule);
    }
}