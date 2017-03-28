package edu.iis.mto.time;

import edu.iis.mto.time.faketime.AdvancedTimeSrc;
import edu.iis.mto.time.faketime.DefaultTimeSrc;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by Patryk Wierzyński.
 */

public class OrderTest {

	@Test
	public void confirm_notExpired() throws Exception {
		Order order = new Order(new DefaultTimeSrc());
		order.submit();
		order.confirm();
	}

	@Test (expected = OrderExpiredException.class)
	public void confirm_ExpiredThrowsException() throws Exception {
		Order order = new Order(new AdvancedTimeSrc());
		order.submit();
		order.confirm();
	}

}