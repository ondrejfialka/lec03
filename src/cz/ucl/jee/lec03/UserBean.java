package cz.ucl.jee.lec03;

import javax.enterprise.context.SessionScoped;
import javax.inject.Named;
import javax.validation.constraints.Pattern;
import java.io.Serializable;

@Named("user")
@SessionScoped
public class UserBean implements Serializable {

	@Pattern(regexp="[a-z]*", message="{user.namePattern}")
	private String username;
	private String password;
	private RodneCislo rodneCislo;
	private boolean loggedIn;

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return ""; 			// není vhodné prozrazovat
	} 

	public void setPassword(String password) {
		this.password = password;
	}
	
	

	public RodneCislo getRodneCislo() {
		return rodneCislo;
	}

	public void setRodneCislo(RodneCislo rodneCislo) {
		this.rodneCislo = rodneCislo;
	}

	public boolean isLoggedIn() {
		return loggedIn;
	}
	
	public String login() {
		if ("admin".equals(username) && "secret".equals(password)) {
			loggedIn = true;
			return "success";
		} else
			return "failure";
	}
}