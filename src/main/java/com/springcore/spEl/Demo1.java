package com.springcore.spEl;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component()
public class Demo1 {
	@Value("#{45+5}")
	private int x;
	@Value("#{6-7}")
	private int y;
	//how to get the square root of any number
	@Value("#{T(java.lang.Maht).sqrt(25)}")
	private int z;
	@Value("#{T(jva.lang.Maht).E}")
	private int p;
	
	@Value("#{new java.lang.String('rehan khan')}")
	private String name;
	
	@Value("#{8>4}")
	private boolean isTrue;
	
	public int getX() {
		return x;
	}
	public void setX(int x) {
		this.x = x;
	}
	public int getY() {
		return y;
	}
	public void setY(int y) {
		this.y = y;
	}
	
	public int getZ() {
		return z;
	}
	public void setZ(int z) {
		this.z = z;
	}
	
	public int getP() {
		return p;
	}
	public void setP(int p) {
		this.p = p;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public boolean isTrue() {
		return isTrue;
	}
	public void setTrue(boolean isTrue) {
		this.isTrue = isTrue;
	}
	@Override
	public String toString() {
		return "Demo1 [x=" + x + ", y=" + y + ", z=" + z + ", p=" + p + ", name=" + name + ", isTrue=" + isTrue + "]";
	}
	
		
}
