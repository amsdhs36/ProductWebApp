package Com.to.data;



public class product {
private int p_id;
private String pname;
private String p_desc;
private float price;
public product() {
	// TODO Auto-generated constructor stub
}
public product(int p_id, String pname, String p_desc, float price) {
	super();
	this.p_id = p_id;
	this.pname = pname;
	this.p_desc = p_desc;
	this.price = price;
}

public int getP_id() {
	return p_id;
}
public int setP_id(int p_id) {
	this.p_id = p_id;
}

public String getPname() {
	return pname;
}

public void setPname(String pname) {
	this.pname = pname;
}

public String getP_desc() {
	return p_desc;
}
public void setP_desc(String p_desc) {
	this.p_desc = p_desc;
}
public float getPrice() {
	return price;
}
public void setPrice(float price) {
	this.price = price;
}
}
