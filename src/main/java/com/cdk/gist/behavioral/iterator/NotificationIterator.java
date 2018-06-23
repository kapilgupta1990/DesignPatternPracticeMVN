package com.cdk.gist.behavioral.iterator;

import java.util.Iterator;

public class NotificationIterator implements Iterator {

	private Notification[] notificationList;
	int position=0;

	public NotificationIterator(Notification[] notificationList) {
		this.notificationList = notificationList;
	}

	@Override
	public boolean hasNext() {
		if(position>=notificationList.length)
			return false;
		else
			return true;
					
	}

	@Override
	public Object next() {
		// return next element in the array and increment pos
        Notification notification =  notificationList[position];
        position += 1;
        return notification;
	}

}
