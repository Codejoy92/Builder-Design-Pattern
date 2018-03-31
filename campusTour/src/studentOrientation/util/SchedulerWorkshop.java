package studentOrientation.util;

import studentOrientation.activityInterfaces.ScheduleI;
import studentOrientation.activityInterfaces.WorkshopI;

public class SchedulerWorkshop implements WorkshopI {

	@Override
	public void construct(ScheduleI createSchedule) {
		createSchedule.createBuilding();
		createSchedule.createGift();
		createSchedule.createLecture();
		createSchedule.createCafeteria();
	}

}


