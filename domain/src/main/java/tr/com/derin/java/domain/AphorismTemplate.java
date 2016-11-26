package tr.com.derin.java.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name="APHORISM_TEMPLETE")
@SequenceGenerator(name="seqGenerator",sequenceName="APHORISM_TEMPLETE_SEQ")
public class AphorismTemplate extends BaseEntity
{
	@Column(name="HEIGHT")
	private int height;
	
	@Column(name="WIDTH")
	private int width;
	
}
