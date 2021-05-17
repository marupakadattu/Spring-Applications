package order;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class Order implements InitializingBean,DisposableBean {
	private int oId;
	private String oName;
	//private Date oDate;
	public int getoId() {
		return oId;
	}
	public void setoId(int oId) {
		this.oId = oId;
	}
	public String getoName() {
		return oName;
	}
	public void setoName(String oName) {
		this.oName = oName;
	}
	/*public Date getoDate() {
		return oDate;
	}
	public void setoDate(Date oDate) {
		this.oDate = oDate;
	}*/
	
	public Order() {
		super();
	}
	public Order(int oId, String oName) {
		super();
		this.oId = oId;
		this.oName = oName;
		//this.oDate = oDate;
	}
	public void afterPropertiesSet() throws Exception {
        System.out.println("InitDisposeService.afterPropertiesSet");
    }
    public void destroy() throws Exception {
        System.out.println("InitDisposeService.destroy");
    }
	@Override
	public String toString() {
		return "Orders [oId=" + oId + ", oName=" + oName + "]";
	}
}
