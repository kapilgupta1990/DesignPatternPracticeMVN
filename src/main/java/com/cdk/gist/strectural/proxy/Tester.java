package com.cdk.gist.strectural.proxy;

import java.lang.reflect.Proxy;
import java.util.List;

public class Tester {

	public static void main(String[] args) {
		
		TwitterService twitterService=new TwitterServiceImpl();
		List<String> mList=twitterService.getMessage("ifd");
		System.out.println(mList);
		twitterService.postToTimeline("as", "posting new message to timelime");
		
		// Implement a security proxy that doed not allow posting to timeline . 
		// If someone sends to timeline it throws an error message
		//String arr[]={"kapil"};
		TwitterService twitterServiceProxy=(TwitterService) TwitterSecuriyPolicy.newInstance(twitterService);
		System.out.println(twitterServiceProxy.getMessage("ifd"));
		twitterServiceProxy.postToTimeline("as", "posting new message to timelime");
		
		
	}
}
