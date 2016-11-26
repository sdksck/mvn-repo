package tr.com.derin.java.domain;

import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name="APHORISM_USER")
@SequenceGenerator(name="seqGenerator",sequenceName="USER_SEQ")
public class User extends BaseEntity
{
	@Column(name="USER_NAME")
	private String username;
	
	@Column(name="PASSWORD")
	private String password;
	
	@Column(name="NICK")
	private String nick;
	
	@OneToMany(mappedBy = "owner",cascade=CascadeType.ALL)
	private Set<Aphorism> aphorismSet;

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getNick() {
		return nick;
	}

	public void setNick(String nick) {
		this.nick = nick;
	}

	public Set<Aphorism> getAphorismSet() {
		return aphorismSet;
	}

	public void setAphorismSet(Set<Aphorism> aphorismSet) {
		this.aphorismSet = aphorismSet;
	}
	
	
	
	
}
