package com.xworkz.configure;

import java.util.ArrayList;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

public class Configure {
	private ArrayList<String> animals;
	private Set<String> sets;
	private Map<String,String> maps;
	private Properties prop;
	private int[] array=new int[20];
    public Configure() {
		System.out.println(" It is a Default constructor"+this.getClass().getSimpleName());
	}
	public int[] getArray() {
		return array;
	}
    public void setArray(int[] array) {
		this.array = array;
	}


	public ArrayList<String> getanimals() {
		return animals;
	}


	public void setanimals(ArrayList<String> animals) {
		this.animals = animals;
	}


	public Set<String> getSets() {
		return sets;
	}


	public void setSets(Set<String> sets) {
		this.sets = sets;
	}


	public Map<String, String> getMaps() {
		return maps;
	}


	public void setMaps(Map<String, String> maps) {
		this.maps = maps;
	}


	public Properties getProp() {
		return prop;
	}


	public void setProp(Properties prop) {
		this.prop = prop;
		}
}
