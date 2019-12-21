package com.test.r;

import org.rosuda.JRI.Rengine;

public class RTest4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Rengine rengine = new Rengine(new String[] { "--vanilla" }, false, null);
		String str = "library(\"survival\")";
		rengine.eval(str);
		//rengine.eval("data(ovarian)");
		//rengine.eval("hist(ovarian$age)");
		//rengine.eval("x<-c(1,10,20)");
		//rengine.eval("y<-c(102,115,169)");	
		//rengine.eval("plot(x,y)");
		rengine.eval("delay<-c(14,14,14,17,17,17,17,17,17,17,17,17,17,17,17,17,17,17,17,17,17,17,20,20,20,20,20,20,20,20,20,20,20,20,20,20,20,20,20,20,20,20,20,20,20,20,20,20,23)");
		rengine.eval("status<-rep(1,49)");
		//rengine.eval("survreg(Surv(futime, fustat) ~ ecog.ps + rx, ovarian, dist='weibull',scale=1)");
		//rengine.eval("survreg(Surv(futime, fustat) ~ ecog.ps + rx, ovarian,dist=\"exponential\")");
		rengine.eval("d<-data.frame(delay,status)");
		//rengine.eval("d$status<-1");
		//rengine.eval("s<-survfit(Surv(d$delay,d$status)~1)");
		//rengine.eval("plot(d$delay,d$status)");
		//rengine.eval("plot(survfit(Surv(d$delay,d$status)~1))");
		System.out.println(str);
		System.out.println("End");
		
	}

}
