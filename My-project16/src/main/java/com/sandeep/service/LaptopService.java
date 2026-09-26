package com.sandeep.service;




public interface LaptopService {
	
	void saveLaptop();
	
	
	 void findProductByName(String name);
	 
	 
	 void findLaptopByNameOrModel(String name,int model);
	 
	 
	 void findLaptopByModelGreaterThan(int model);
	 
	 
	 void findLaptopByNameStartingWith(String name);
	 
	 void findProductOrderByModel(String name);
	 
	 
	 void findProductTop3ByModel(int model);
	 
	 
	 
	 
	 

}
