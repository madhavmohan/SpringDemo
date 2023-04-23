package org.madhav;

import java.util.Iterator;
import java.util.List;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

public class Triangle implements ApplicationContextAware, BeanNameAware,Shape {

	private List<Point> points;
//	private Point pointA;
//	private Point pointB;
//	private Point pointC; 
	private ApplicationContext context = null;

	/*
	 * public Point getPointA() { return pointA; }
	 * 
	 * public void setPointA(Point pointA) { this.pointA = pointA; }
	 * 
	 * public Point getPointB() { return pointB; }
	 * 
	 * public void setPointB(Point pointB) { this.pointB = pointB; }
	 * 
	 * public Point getPointC() { return pointC; }
	 * 
	 * public void setPointC(Point pointC) { this.pointC = pointC; }
	 */

	public void draw() {
		System.out.println("trinagle dtawn");
		
	}

	public List<Point> getPoints() {
		return points;
	}

	public void setPoints(List<Point> points) {
		this.points = points;
	}

	@Override
	public void setApplicationContext(ApplicationContext context) throws BeansException {
		this.context = context;

	}

	@Override
	public void setBeanName(String beanName) {
		
		System.out.println(beanName);
	}

	/*
	 * @Override public void afterPropertiesSet() throws Exception {
	 * System.out.println("initialization of bean done");
	 * 
	 * }
	 * 
	 * @Override public void destroy() throws Exception { // to destroy the bean
	 * System.out.println("|disponsealb bean desrtoy called");
	 * 
	 * }
	 */
	
	public void myInit() {
		System.out.println("init method");
	}
	public void initmethod2() {
		System.out.println("init method");
	}
}
