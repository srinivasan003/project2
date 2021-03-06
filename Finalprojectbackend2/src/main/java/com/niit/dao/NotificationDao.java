package com.niit.dao;

import java.util.List;

import com.niit.model.Notification;

public interface NotificationDao {
	void addNotification(Notification notification);
	List<Notification>  getNotificationNotViewed(String email);
	Notification getNotificaiton(int id);
	void updateNotification(int id);

}
