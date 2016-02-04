package com.sqa.kv.vehicle.project;

import org.junit.Test;

public class VehicleTest
{
	@Test
	public void test()
	{
		Vehicle bmw = new Vehicle("BWM", "Sedan", "Black", 4, false, false, true);

		System.out.println("Testing vehicle output: " + bmw.toString());

	}

}
