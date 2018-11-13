package com.cdk.gist.strectural.proxy;

import java.util.List;

public class ProxyInternet implements Internet {

	// Composite pattern
	private Internet internet = new RealInternet();
	private static List<String> bannedSites;

	@Override
	public void connectTo(String serverhost) throws Exception {
		if (bannedSites.contains(serverhost.toLowerCase())) {
			throw new Exception("Access Denied");
		}

		internet.connectTo(serverhost);

	}

}
