package com.example.taglib;

import javax.servlet.jsp.tagext.*;
import javax.servlet.jsp.*;
import java.io.*;
import java.util.List;

public class SelectTagHandler extends SimpleTagSupport{
	// store the 'optionList' attribute:
	private List optionList = null;
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
	
	// generate the <select> and <option> tags
	public void doTag()throws JspException, IOException{
		PageContext pageContext = (PageContext)getJspContext();
		JspWriter out = pageContext.getOut();
		
		// start the HTML <select> tag with HTML-specific attributes:
		// The HTML <select> open tag uses the name and size attributes:
		out.print("<select ");
		out.print(String.format(ATTR_TEMPLATE, "name",this.name));
		out.print(String.format(ATTR_TEMPLATE, "size",this.size));
		out.println(">");
		
		// Generate the <option> tags from the optionList:
		for(Object option : this.optionList){
			String optionTag = String.format(OPTION_TEMPLATE, option.toString());
			out.println(optionTag);
		}
		
		// End the HTML </select> tag
		out.println(" </select>");
		
	} // END of doTag() method
	
	// Our implementation used a few String constants to make the code more readable:
	private  static final String ATTR_TEMPLATE = "%s='%s'"; 
	private  static final String OPTION_TEMPLATE = "<option value='%1$s'> %1$s </option>";
	
} // END of SelectTagHandler
