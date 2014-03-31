package com.sk.pinout.models;

import java.util.ArrayList;
import java.util.List;

import android.util.SparseIntArray;

/**
 * This class is a model that will contain data pertaining to any IC/Components Pins.
 * @author Sushant Khanna
 *
 */
public class PinMap {
	
	/**
	 * List to store pin numbers which are OUT pins. Useful for components with a very large pin no.
	 */
	private List<Integer> outPins = new ArrayList<Integer>();
	
	/**
	 * List to store pin numbers which are IN pins. Useful for components with a very large pin no.
	 */
	private List<Integer> inPins = new ArrayList<Integer>();
	
	/**
	 * List to store ping numbers which are POWER pins. Useful for compounds with a very large pin no.
	 */
	private List<Integer> powerPins = new ArrayList<Integer>();
	
	/**
	 * List to store pin numbers which are GND pins. Useful for components with a very large pin no.
	 */
	private List<Integer> gndPins = new ArrayList<Integer>();
	
	/**
	 * Essentially a map of all pins. Key is the pin number.
	 */
	private SparseIntArray pinMap;
	
	public PinMap(SparseIntArray pinMap) {
		this.pinMap = pinMap;
	}
}
