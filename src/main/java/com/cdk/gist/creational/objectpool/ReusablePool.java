package com.cdk.gist.creational.objectpool;

import java.util.Enumeration;
import java.util.Hashtable;

public class ReusablePool {

	Hashtable<Reusable, Long> lock, unlock;

	public ReusablePool() {
		lock = new Hashtable<Reusable, Long>();
		unlock = new Hashtable<Reusable, Long>();
	}

	public synchronized Reusable acquireReusable() {

		long now = System.currentTimeMillis();
		Reusable reusable;
		if (unlock.size() > 0) {
			// Then return object from here

			Enumeration<Reusable> reusables = unlock.keys();

			while (reusables.hasMoreElements()) {
				 reusable = reusables.nextElement();

				if (now - unlock.get(reusable) > 500000) {
					// Object is dead, remove from unlock
					unlock.remove(reusable);
					dead(reusable);
					reusable = null;
				} else {
					if (validate(reusable)) {
						unlock.remove(reusable);
						lock.put(reusable, now);
						return reusable;

					} else {
						unlock.remove(reusable);
						dead(reusable);
						reusable = null;
					}
				}
			}
		}
		reusable = create();
		lock.put(reusable, now);
		return reusable;
	}

	private boolean validate(Reusable reusable) {
		return !reusable.isClosed();
	}

	private void dead(Reusable reusable) {
		reusable.close();

	}

	private Reusable create() {
		return new Reusable();
	}

	public  synchronized void releaseReusable(Reusable reusable) {
		lock.remove(reusable);
		unlock.put(reusable, System.currentTimeMillis());
	}

	public void setMaxPoolSize(int size) {

	}
}
