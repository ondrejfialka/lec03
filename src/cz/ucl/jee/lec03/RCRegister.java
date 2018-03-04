package cz.ucl.jee.lec03;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Named;
import java.util.ArrayList;
import java.util.List;

@Named
@ApplicationScoped
public class RCRegister {
	private List<RodneCislo> rcList;

	public RCRegister() {
		rcList = new ArrayList<RodneCislo>();
		rcList.add(new RodneCislo("800312","1234"));
		rcList.add(new RodneCislo("801211","4854"));
		rcList.add(new RodneCislo("780102","8774"));
		rcList.add(new RodneCislo("700512","5454"));
	}
	
	public List<RodneCislo> getRCList() {
		return rcList;
	}
	
	
}
