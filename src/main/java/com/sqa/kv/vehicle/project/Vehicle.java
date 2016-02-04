package com.sqa.kv.vehicle.project;

import com.sqa.kv.util.helper.RequestInput;

/*
 * Create the Vehicle Class with following properties and behaviors 
 * (for the behaviors there will be no implementation just conform to 
 * the method signatures and return a valid value to match signature, 
 * include system out calls to detail what information should be calculated):
 * Fields/ Properties/ Instance Variables:
 * String name (any name you may give the instance - ex: "My First Car")
 * String type (the type of vehicle - ex: car, plane, train, bike)
 * String color
 * int numWheels
 * boolean waterProof
 * boolean fly
 * boolean useGas

 * Methods/ Behaviors/ Functions:
 * int move()
 * boolean stop()
 * boolean reChargel()
 * void initVehicle()

 * Override the toString method and Create the following constructors:

 * Default,
 * One that takes the name and type
 * One that takes all properties
 */

public class Vehicle
{
	String name;
	String type;
	String color;
	String model;
	int maxSpeed = 120;
	String madeIn;
	int numWheels;
	boolean waterProof;
	boolean fly;
	boolean useGas;

	public Vehicle()
	{
		this(RequestInput.getString("What's the vehicle name?"), RequestInput.getString("What's the vehicle type?",
				"sedan", "suv", "plane"));
		this.setColor("navy blue");
		this.setModel("foreign model");
		this.setMadeIn("China");
		this.setNumWheels(0);
	}

	public Vehicle(String name, String type)
	{
		super();
		this.setName(name);
		this.setType(type);

		switch (type.toLowerCase())
		{
		case "sedan":
			this.setName("Civic");
			this.setUseGas(true);
			this.setFly(false);
			this.setWaterProof(false);
		case "suv":
			this.setName("Acura");
			this.setUseGas(true);
			this.setFly(false);
			this.setWaterProof(false);
		case "plane":
			this.setName("Boing");
			this.setUseGas(true);
			this.setFly(true);
			this.setWaterProof(false);
		default:
			System.out.println("Unknow vehicle type.");
		}
	}

	public Vehicle(String name, String type, String color, int numWheels, boolean waterProof, boolean fly,
			boolean useGas)
	{
		super();
		this.name = name;
		this.type = type;
		this.color = color;
		this.numWheels = numWheels;
		this.waterProof = waterProof;
		this.fly = fly;
		this.useGas = useGas;
	}

	/**
	 * @return the color
	 */
	public String getColor()
	{
		return this.color;
	}

	public String getMadeIn()
	{
		return this.madeIn;
	}

	public int getMaxSpeed()
	{
		return this.maxSpeed;
	}

	public String getModel()
	{
		return this.model;
	}

	/**
	 * @return the name
	 */
	public String getName()
	{
		return this.name;
	}

	/**
	 * @return the numWheels
	 */
	public int getNumWheels()
	{
		return this.numWheels;
	}

	/**
	 * @return the type
	 */
	public String getType()
	{
		return this.type;
	}

	public void initVehicle()
	{
		this.setName("Martin");
		System.out.println("The " + this.getType() + " name is " + this.getName());
	}

	/**
	 * @return the fly
	 */
	public boolean isFly()
	{
		return this.fly;
	}

	/**
	 * @return the useGas
	 */
	public boolean isUseGas()
	{
		return this.useGas;
	}

	/**
	 * @return the waterProof
	 */
	public boolean isWaterProof()
	{
		return this.waterProof;
	}

	public int move()
	{
		System.out.println("The " + this.getName() + " moves super fast!");
		return 0;
	}

	public boolean reCharge()
	{
		System.out.println("The " + this.getName() + " just pumped some gas/electicity and ready for a drive!");
		return true;
	}

	/**
	 * @param color
	 *            the color to set
	 */
	public void setColor(String color)
	{
		this.color = color;
	}

	/**
	 * @param fly
	 *            the fly to set
	 */
	public void setFly(boolean fly)
	{
		this.fly = fly;
	}

	public void setMadeIn(String madeIn)
	{
		this.madeIn = madeIn;
	}

	public void setModel(String model)
	{
		this.model = model;
	}

	/**
	 * @param name
	 *            the name to set
	 */
	public void setName(String name)
	{
		this.name = name;
	}

	/**
	 * @param numWheels
	 *            the numWheels to set
	 */
	public void setNumWheels(int numWheels)
	{
		this.numWheels = numWheels;
	}

	/**
	 * @param type
	 *            the type to set
	 */
	public void setType(String type)
	{
		this.type = type;
	}

	/**
	 * @param useGas
	 *            the useGas to set
	 */
	public void setUseGas(boolean useGas)
	{
		this.useGas = useGas;
	}

	/**
	 * @param waterProof
	 *            the waterProof to set
	 */
	public void setWaterProof(boolean waterProof)
	{
		this.waterProof = waterProof;
	}

	public boolean stop()
	{
		System.out.println("The " + this.getName() + " just stopped.");
		return true;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString()
	{
		StringBuilder builder = new StringBuilder();
		builder.append("Vehicle name=");
		builder.append(this.name);
		builder.append(", type=");
		builder.append(this.type);
		builder.append(", color=");
		builder.append(this.color);
		builder.append(", number of wheels=");
		builder.append(this.numWheels);
		builder.append(", waterProof? =");
		builder.append(this.waterProof);
		builder.append(", can fly? =");
		builder.append(this.fly);
		builder.append(", use gas? =");
		builder.append(this.useGas);
		return builder.toString();
	}
}
