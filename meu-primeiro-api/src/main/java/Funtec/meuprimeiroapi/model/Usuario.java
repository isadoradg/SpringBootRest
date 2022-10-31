package Funtec.meuprimeiroapi.model;

public class Usuario {
	private Integer id;
	private String login;
	private String password;
	
	public Usuario() {
		
	}
	
	public Usuario(String login, String password) {
		this.login = login;
		this.password = password;
	}
	
	public String toString() {
		return "User { login= " + login + '\'' + ", password= " + password + '\'' + "}";
	}
	
	public void setId(Integer id) {
		this.id = id;
	}
	
	public Integer getId() {
		return id;
	}
	
	public void setLogin(String login) {
		this.login = login;
	}
	
	public String getLogin() {
		return login;
	}
	
	public void setPassword(String password) {
		this.password = password;
	}
	
	public String getPassword() {
		return password;
	}
	
	
	
}
