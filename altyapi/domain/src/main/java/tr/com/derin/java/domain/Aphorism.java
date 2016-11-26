package tr.com.derin.java.domain;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name="APHORISM")
@SequenceGenerator(name="seqGenerator",sequenceName="APHORISM_SEQ")
public class Aphorism extends BaseEntity
{
	@Column(name="IMAGE_URL")
	private String imageURL;
	
	@Column(name="CONTENT")
	private String content;
	
	@Column(name="SIGNATURE")
	private String signature;
	
	@ManyToOne(cascade=CascadeType.ALL)
	@JoinColumn(name="OWNER_ID")
	private User owner;
	
	public Aphorism()
	{
		
	}
	
	public Aphorism(String content)
	{
		this.content = content;
	}
	
	public Aphorism(String content,User owner)
	{
		this.content = content;
		this.owner = owner;
	}
	
	public String getImageURL() {
		return imageURL;
	}
	public void setImageURL(String imageURL) {
		this.imageURL = imageURL;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public String getSignature() {
		return signature;
	}
	public void setSignature(String signature) {
		this.signature = signature;
	}
	public User getOwner() {
		return owner;
	}
	public void setOwner(User owner) {
		this.owner = owner;
	}
	
	
	
}
