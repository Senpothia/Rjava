package com.test.r;

import org.rosuda.JRI.Rengine;

public class RTest3 {

	private static Rengine rengine;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Rengine rengine=new Rengine(new String[]{"--vanilla"},false,null);
		//Rengine r = new Rengine(new String[]{"--no-save"}, false, null);
		int [] x =  {1,2,3,4,5,6,7,8,9,10};
		int [] y=  {14,16,18,20,22 ,24 ,26 ,28 ,30 ,32, 34, 36, 38, 40, 42 ,44 ,46 ,48 ,50, 52};
		
		rengine.assign("x", x);
	    rengine.assign("y", y);
	    rengine.eval("mod_U<-lm(y ~ x)");
	    rengine.eval("predict(mod_U, interval=\"confidence\")");
	   // rengine.eval("jpeg(\"Image_U.jpeg\", width = 670, height = 470, units = \"px\")");
	    rengine.eval("plot(x,y,plot=TRUE)");
	    rengine.eval("abline(mod_U)");
	    rengine.eval("segments(x,fitted(mod_U),x,y)");
	   
	    rengine.eval("pred.frame<-data.frame(x)");
	    rengine.eval("pc<-predict(mod_U, interval=\"confidence\",newdata=pred.frame)");
	    rengine.eval("print(pc)");
	    rengine.eval("pp<-predict(mod_U, interval=\"prediction\",newdata=pred.frame)");
	    rengine.eval("print(pp)");
	    rengine.eval("matlines(pred.frame, pc[,2:3], lty=c(2,2), col=\"blue\")");
	    rengine.eval("matlines(pred.frame, pp[,2:3], lty=c(3,3), col=\"red\")");
	    rengine.eval("dev.off()");
	   /** rengine.eval("res<-coef(mod_U)")
	    double [] coef = rengine.eval("res").asDoubleArray();
    
	    System.out.println(coef[0]);
	    System.out.println(coef[1]);
	    System.out.println("ok");
    
	    InterU.setText(String.valueOf(coef[0]));
	    dydxU.setText(String.valueOf(coef[1]));;   */
	    System.out.println("End!");
	    
	}

}
