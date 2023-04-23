package org.madhav;



import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Required;
import org.springframework.context.annotation.ImportResource;
import org.springframework.jmx.export.annotation.ManagedResource;
import org.springframework.stereotype.Component;


@Component
public class Circle implements Shape{


	private Point center;
	
	public Point getCenter() {
		return center;
	}


	@Resource(name = "center")
	
	public void setCenter(Point center) {
		this.center = center;
	}

	@Override
	public void draw() {
		// TODO Auto-generated method stub
		System.out.println("drawing a circle");
		
		
		
	}
	
	
	
	
	

}
