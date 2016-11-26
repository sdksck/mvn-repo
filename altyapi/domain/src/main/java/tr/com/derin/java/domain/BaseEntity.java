package tr.com.derin.java.domain;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;

@MappedSuperclass
public class BaseEntity
{
	@Id
	@Column(name ="ID")
	@GeneratedValue(generator="seqGenerator")
	private long id;
	
	@Column(name = "CREATION_DATE")
	private Date creationDate;
	
	@Column(name = "DELETED")
	private boolean deleted;
	
	@Column(name = "LAST_UPDATE_DATE")
	private Date lastUpdateDate;
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public Date getCreationDate() {
		return creationDate;
	}
	public void setCreationDate(Date creationDate) {
		this.creationDate = creationDate;
	}
	public boolean isDeleted() {
		return deleted;
	}
	public void setDeleted(boolean deleted) {
		this.deleted = deleted;
	}
	public Date getLastUpdateDate() {
		return lastUpdateDate;
	}
	public void setLastUpdateDate(Date lastUpdateDate) {
		this.lastUpdateDate = lastUpdateDate;
	}
	
	
}
