package studentOrientation.driver;

import studentOrientation.activityInterfaces.ScheduleI;
import studentOrientation.activityInterfaces.WorkshopI;
import studentOrientation.util.ActivitiesEnum;
import studentOrientation.util.Schedule;
import studentOrientation.util.SchedulerWorkshop;

public class Driver {
    public static void main(String[] args) {
    	ScheduleI createSchedule = new Schedule(ActivitiesEnum.CIW, ActivitiesEnum.CS240, ActivitiesEnum.UNIVERSITYUNION,ActivitiesEnum.WATSON);
    	WorkshopI schedule = new SchedulerWorkshop(createSchedule);
    }
}
