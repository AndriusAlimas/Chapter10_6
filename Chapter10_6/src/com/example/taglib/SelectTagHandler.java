package com.example.taglib;

import javax.servlet.jsp.tagext.*;
import javax.servlet.jsp.*;
import java.io.*;
import java.util.List;

public class SelectTagHandler extends SimpleTagSupport{
	// store the 'optionList' attribute:
	private List optionList;
	// setter:
	public void setOptionList(List optionList){
		this.optionList = optionList;
	}
	
	// store the 'name' attribute:
	private String name;
	// setter:
	public void setName(String name){
		this.name = name;
	}
	
	// store the 'size' attribute:
	private String size;
	// setter:
	public void setSize(String size){
		this.size = size;
	}
	
	public void doTag(){
		
	}
}
