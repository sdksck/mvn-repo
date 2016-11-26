package tr.com.derin.java.domain.constants;

public enum TemleteElementType
{
	PICTURE("PICTURE"),
	CONTENT("CONTENT"),
	SIGNATURE("SIGNATURE");
	
	private String type;
	
	public String getType()
	{
		return this.type;
	}
	
	TemleteElementType(String type)
	{
		this.type = type;
	}
}
