package tw.brad.bs2.model;



public class User {
	private Long id;
	private String account;
	private String passwd;
	private String name;
	
	private byte[] icon;
	private String iconBase64;
	
	
	
	public String getIconBase64() {
		return iconBase64;
	}
	public void setIconBase64(String iconBase64) {
		this.iconBase64 = iconBase64;
	}
	public byte[] getIcon() {
		return icon;
	}
	public void setIcon(byte[] icon) {
		this.icon = icon;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getAccount() {
		return account;
	}
	public void setAccount(String account) {
		this.account = account;
	}
	public String getPasswd() {
		return passwd;
	}
	public void setPasswd(String passwd) {
		this.passwd = passwd;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	
	
}