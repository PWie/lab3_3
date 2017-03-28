package edu.iis.mto.time.faketime;

/**
 * Created by Patryk Wierzyński
 */

public class DefaultTimeSrc implements TimeSource {

	@Override
	public long currentTimeMillis() {
		return System.currentTimeMillis();
	}

}
