package com.cdk.gist.strectural.proxy;

import java.util.List;

public interface TwitterService {

	public List<String> getMessage(String key);
	public void postToTimeline(String key,String message);
}
