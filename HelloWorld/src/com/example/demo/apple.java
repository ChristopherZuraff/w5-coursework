package com.example.demo;

public class apple {


private String name;
private String flavor;
public apple()
{this.name = "red";
this.name = "yummy";
	}

public void setName(String name) {
	if(name=="fuji") {
		this.flavor = "yucky";
	}else{
		this.name = name;
	}
}

public String getFlavor() {
	return flavor;
}

public void setFlavor(String flavor) {
	this.flavor = flavor;
}
public void eat() {
	if (this.flavor == "yucky") {
	System.out.println("the apple is yucky");
}else {
	System.out.println("yum!!");
}
}
}
