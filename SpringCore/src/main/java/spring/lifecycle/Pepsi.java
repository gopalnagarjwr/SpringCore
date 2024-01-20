package spring.lifecycle;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class Pepsi implements InitializingBean,DisposableBean {
      private double val;

	public double getVal() {
		return val;
	}

	public void setVal(double val) {
		this.val = val;
	}

	@Override
	public String toString() {
		return "Pepsi [val=" + val + "]";
	}

	@Override
	public void destroy() throws Exception {
		 System.out.println("after initialaization");
		
	}

	@Override
	public void afterPropertiesSet() throws Exception {
		 System.out.println("before initialaization");
		
	}
      
}
