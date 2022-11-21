package bhanu.com;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OrderColumn;
import javax.persistence.Table;

@Entity
@Table(name="Cst")
public class Customer {
	@Id
	@GeneratedValue(strategy=GenerationType.TABLE)  
	private int id;
	private String cname;
	private String caddress;
	@OneToMany(cascade = CascadeType.ALL)  
	@JoinColumn(name="id")  
	@OrderColumn(name="type")  
	private List<Order> answers;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getCname() {
		return cname;
	}
	public void setCname(String cname) {
		this.cname = cname;
	}
	public String getCaddress() {
		return caddress;
	}
	public void setCaddress(String caddress) {
		this.caddress = caddress;
	}
	public List<Order> getAnswers() {
		return answers;
	}
	public void setAnswers(List<Order> answers) {
		this.answers = answers;
	}  
}
	