package org.bigdata;

import java.util.ArrayList;

public class SelectService {

	public ArrayList<EmpDTO> execute(){
		EmpDAO dao=new EmpDAO();
		return dao.select();
	}
}
