package studentOrientation.util;

import studentOrientation.activityInterfaces.ScheduleI;
import studentOrientation.activityInterfaces.WorkshopI;

public class SchedulerWorkshop implements WorkshopI {
	/**
<<<<<<< HEAD
	 * This method is overridden from WorkshopI used to create sub parts of the campus tour
	 * @param ScheduleI createSchedule
	 *
=======
	 * This method is overridden from WorkshopI used to create sub parts of the campus tour 
	 * @param ScheduleI createSchedule
	 * 
>>>>>>> 530f024828e524c134bba2830c1edca1a7347e3f
	 */
	@Override
	public void construct(ScheduleI createSchedule) {
		createSchedule.createBuilding();
		createSchedule.createGift();
		createSchedule.createLecture();
		createSchedule.createCafeteria();
	}

}

