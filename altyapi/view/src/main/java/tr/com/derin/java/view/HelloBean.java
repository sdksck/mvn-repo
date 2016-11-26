package tr.com.derin.java.view;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

@ManagedBean(name="helloBean")
@SessionScoped
public class HelloBean 
{
	private String test;
	
	@PostConstruct
	public void init()
	{
		test = "hello world!";
	}

	public String getTest() {
		return test;
	}

	public void setTest(String test) {
		this.test = test;
	}
	
	
	
}
