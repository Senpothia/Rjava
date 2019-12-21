package com.test.r;

import java.util.Enumeration;

import org.rosuda.JRI.REXP;
import org.rosuda.JRI.RList;
import org.rosuda.JRI.RVector;
import org.rosuda.JRI.Rengine;

public class Rtest2 {
public static void main(String[] args) {
		
	Rengine r = new Rengine(new String[]{"--no-save"}, false, null);

    r.eval("library(Hmisc)");

    r.eval("yy <- describe(rnorm(200))");

    REXP exp = r.eval("zz <- yy$counts[5:11]");

    //REXP names = r.eval("names(zz)");

   // String[] strExp = exp.asStringArray();

    System.out.println("result:" + exp);

 

    r.eval("histval <- hist(rnorm(100), plot=TRUE)");
    r.eval("abline(v=0.5");
    REXP xvalExp = r.eval("histval$mids");

    REXP yvalExp = r.eval("histval$counts");

    System.out.println("histval$mids:" + xvalExp);

    System.out.println("histval$counts:" + yvalExp);
    /**
    r.eval("x<-seq(1:20)");
    r.eval("y=2*x+12");
    r.eval("plot(c(-2,3), c(-1,5), type = \"n\", xlab = \"x\", ylab = \"y\", asp = 1, plot=TRUE)");
    r.eval("");*/
    
  }

	       

	    }


