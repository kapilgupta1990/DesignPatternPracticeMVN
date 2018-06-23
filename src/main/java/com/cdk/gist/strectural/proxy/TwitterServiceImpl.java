package com.cdk.gist.strectural.proxy;

import java.util.ArrayList;
import java.util.List;

public class TwitterServiceImpl implements TwitterService {

	@Override
	public List<String> getMessage(String key) {

		List<String> messageList = new ArrayList<>();
		messageList.add("Hi Kapil");
		messageList.add("Hi mahses");
		return messageList;
	}

	@Override
	public void postToTimeline(String key, String message) {
		System.out.println("Posting new to timeline");
	}

}
