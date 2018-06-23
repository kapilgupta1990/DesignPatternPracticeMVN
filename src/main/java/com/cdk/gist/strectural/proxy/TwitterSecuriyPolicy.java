package com.cdk.gist.strectural.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class TwitterSecuriyPolicy implements InvocationHandler {

	private Object object;

	private TwitterSecuriyPolicy(Object object) {
		this.object = object;
	}

	public static Object newInstance(Object object) {
		return Proxy.newProxyInstance(object.getClass().getClassLoader(), object.getClass().getInterfaces(),
				new TwitterSecuriyPolicy(object));
	}

	@Override
	public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
		if(method.getName().startsWith("post")){
			throw new IllegalArgumentException("Post is currently not supported");
		}
		return method.invoke(object, args);
	}

}
