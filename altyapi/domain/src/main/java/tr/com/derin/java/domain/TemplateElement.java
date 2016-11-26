package tr.com.derin.java.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name="TEMPLETE_ELEMENT")
@SequenceGenerator(name="seqGenerator",sequenceName="TEMPLETE_ELEMENT_SEQ")
public class TemplateElement extends BaseEntity
{
	@Column(name="TYPE")
	private String type;
	
	@Column(name="HEIGHT")
	private int height;
	
	@Column(name="WIDTH")
	private int width;
	
	@Column(name="LOCALE_X")
	private int localeX;
	
	@Column(name="LOCALE_Y")
	private int localeY;
	
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public int getHeight() {
		return height;
	}
	public void setHeight(int height) {
		this.height = height;
	}
	
	
	public int getWidth() {
		return width;
	}
	public void setWidth(int width) {
		this.width = width;
	}
	public int getLocaleX() {
		return localeX;
	}
	public void setLocaleX(int localeX) {
		this.localeX = localeX;
	}
	public int getLocaleY() {
		return localeY;
	}
	public void setLocaleY(int localeY) {
		this.localeY = localeY;
	}
 
	
	
}
