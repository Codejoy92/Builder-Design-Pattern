package studentOrientation.driver;

import studentOrientation.activityInterfaces.ScheduleI;
import studentOrientation.activityInterfaces.WorkshopI;
import studentOrientation.util.ActivitiesEnum;
import studentOrientation.util.Schedule;
import studentOrientation.util.SchedulerWorkshop;

public class Driver {
    public static void main(String[] args) {
<<<<<<< HEAD
        ScheduleI createSchedule = new Schedule(ActivitiesEnum.CIW, ActivitiesEnum.CS240, ActivitiesEnum.UNIVERSITYUNION,ActivitiesEnum.WATSON);
        WorkshopI schedule = new SchedulerWorkshop();
        schedule.construct(createSchedule);
=======
    	ScheduleI createSchedule = new Schedule(ActivitiesEnum.CIW, ActivitiesEnum.CS240, ActivitiesEnum.UNIVERSITYUNION,ActivitiesEnum.WATSON);
    	WorkshopI schedule = new SchedulerWorkshop(createSchedule);
>>>>>>> cee0c1bbe6542bf94fad6f181b9d353cf3b11f9f
    }
}