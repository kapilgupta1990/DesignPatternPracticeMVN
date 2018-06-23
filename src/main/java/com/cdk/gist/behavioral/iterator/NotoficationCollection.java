package com.cdk.gist.behavioral.iterator;

import java.util.Iterator;

public class NotoficationCollection {

	static final int MAX_ITEMS=6;
	Notification [] notificationList;
	int numberOfItems = 0;
	public NotoficationCollection(){
		notificationList=new Notification[MAX_ITEMS];
	}
	 public void addItem(String str)
	    {
	        Notification notification = new Notification(str);
	        if (numberOfItems >= MAX_ITEMS)
	            System.err.println("Full");
	        else
	        {
	            notificationList[numberOfItems] = notification;
	            numberOfItems = numberOfItems + 1;
	        }
	    }
	 public Iterator createIterator()
	    {
	        return new NotificationIterator(notificationList);
	    }
}
