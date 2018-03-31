package studentOrientation.util;

import studentOrientation.activityInterfaces.ScheduleI;
import studentOrientation.activityInterfaces.WorkshopI;

public class SchedulerWorkshop implements WorkshopI {

<<<<<<< HEAD
=======
	public SchedulerWorkshop(ScheduleI createSchedule) {
		construct(createSchedule);
	}

>>>>>>> cee0c1bbe6542bf94fad6f181b9d353cf3b11f9f
	@Override
	public void construct(ScheduleI createSchedule) {
		createSchedule.createBuilding();
		createSchedule.createGift();
		createSchedule.createLecture();
		createSchedule.createCafeteria();
	}
<<<<<<< HEAD
}
=======


}
>>>>>>> cee0c1bbe6542bf94fad6f181b9d353cf3b11f9f
