package studentOrientation.util;

import studentOrientation.activityInterfaces.ScheduleI;
import studentOrientation.activityInterfaces.WorkshopI;

public class SchedulerWorkshop implements WorkshopI {
	/**
	 * This method is overridden from WorkshopI used to create sub parts of the campus tour
	 * @param createSchedule createSchedule
	 *
	 */
	@Override
	public void construct(ScheduleI createSchedule) {
		createSchedule.createBuilding();
		createSchedule.createGift();
		createSchedule.createLecture();
		createSchedule.createCafeteria();
	}

}

