package com.sandeep.serviceImp;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sandeep.entities.Laptop;
import com.sandeep.repo.LaptopRepo;
import com.sandeep.service.LaptopService;

@Service
public class ServiceImp  implements LaptopService{

	
	@Autowired
	private LaptopRepo repo;
	@Override
	public void saveLaptop() {
		
		List<Laptop> list=Arrays.asList(
				new Laptop("redmi", 1),
				new Laptop("mi", 4),
				new Laptop("sumsung", 11),
				new Laptop("opppo", 43),
				new Laptop("motorola", 1333),
				new Laptop("lava", 5)
				

				
				);
		
		
		repo.saveAll(list);
		
		
	}
	@Override
	public void findProductByName(String name) {
		
		List<Laptop> ob=repo.findByName(name);
		
		ob.forEach(la->System.out.println(la.getName()+" "+la.getModel()+" "+la.getModel()));
		
		
		
	}
	@Override
	public void findLaptopByNameOrModel(String name, int model) {
		List<Laptop> l1=repo.findByNameOrModel(name, model);
		
		
		l1.forEach(d->System.out.println(d.getId()+" "+d.getName()+" "+d.getModel()));
	}
	@Override
	public void findLaptopByModelGreaterThan(int model) {
		List<Laptop> l2=	repo.findByModelGreaterThan(model);
		
		l2.forEach(d->System.out.println(d.getId()+" "+d.getName()+" "+d.getModel()));
	}
	@Override
	public void findLaptopByNameStartingWith(String name) {
		List<Laptop> l3=repo.findBynameStartingWith(name);
		
		l3.forEach(d->System.out.println(d.getId()+" "+d.getName()+" "+d.getModel()));
		
	}
	@Override
	public void findProductOrderByModel(String name) {
		List<Laptop> l4=repo.findByNameOrderByModelAsc(name);
		
		l4.forEach(d->System.out.println(d.getId()+" "+d.getName()+" "+d.getModel()));
		
		
	}
	@Override
	public void findProductTop3ByModel(int model) {
		List<Laptop> l6=repo.findTop3ByModelGreaterThan(model);
		
		l6.forEach(d->System.out.println(d.getId()+" "+d.getName()+" "+d.getModel()));
		
	}
	
	
	
	
	
	
	
	

}
