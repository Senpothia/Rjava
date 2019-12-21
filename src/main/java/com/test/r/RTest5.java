package com.test.r;

import org.rosuda.JRI.Rengine;

public class RTest5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Rengine rengine=new Rengine(new String[]{"--vanilla"},false,null);
		
		double [] x = {1,2,3,4,5,6,7,8,9,10};
		
		double [ ] y = {14,16,18,20,22 ,24 ,26 ,28 ,30 ,32};
		
		rengine.assign("x",x);
		rengine.assign("y",y);
		//rengine.eval("jpeg(\"Image_U.jpeg\", width = 670, height = 470, units = \"px\")");
		rengine.eval("plot(x,y,xlab=\"Vin\",ylab=\"Vout\")");
		rengine.eval("abline(h=20)");
		
		//rengine.eval("library(\"ggplot2\")");
		//rengine.eval("ggplot(midwest, aes(x=area, y=poptotal)) + geom_point()");
		
	}

}
