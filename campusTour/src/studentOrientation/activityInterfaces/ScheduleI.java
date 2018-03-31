package studentOrientation.activityInterfaces;

import studentOrientation.util.ActivitiesEnum;

public interface ScheduleI {

	public void setCafeteria(ActivitiesEnum cafeteriaValue);
	public void setLecture(ActivitiesEnum lectureValue);
	public void setGift(ActivitiesEnum giftValue);
	public void setBuilding(ActivitiesEnum buildingValue);
	public void createBuilding();
	public void createGift();
	public void createLecture();
	public void createCafeteria();

}