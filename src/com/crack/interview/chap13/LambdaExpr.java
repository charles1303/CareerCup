package com.crack.interview.chap13;

import java.util.*;
import java.util.stream.*;

class Country{
	public int getPopulation(){
		return 0;
	}
	
	public String getContinent(){
		return "continent";
	}
	
	public int getPopulation(List<Country> countries, String continent){
		Stream<Country> northAmerica = countries.stream().filter(country ->
		{return country.getContinent().equals(continent);});
		return -1;
	}
}

public class LambdaExpr {

}
