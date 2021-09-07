package designPatterns;

import java.util.concurrent.locks.ReentrantLock;

public final class SingletoneDemo {

	private static SingletoneDemo singletoneDemoObj;
	private static ReentrantLock reentrantLock = new ReentrantLock();

	private SingletoneDemo() {

	}

	public static SingletoneDemo getSingletoneDemoInstance() {
		if (singletoneDemoObj == null) {
			reentrantLock.lock();
			if (singletoneDemoObj == null) {
				singletoneDemoObj = new SingletoneDemo();
			}
			reentrantLock.unlock();
		}
		return singletoneDemoObj;
	}
}
