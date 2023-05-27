package Reg.Dao;

import java.util.List;

import Reg.model.Login;
import Reg.model.Register;

public interface RegisterInterface {
	
	public int create(List<Register> lstreg);
    public List<Register> displayall();
    public int delete(int regno);
	public List<Register> retrive(int regno); //  FOR SEARCH NO NEED TO MAKE GETTER SETTER
	public int Update(int regno,String uname,String pass,String accbal);
//	public boolean validate(Login l);
	String validate(Login l);
}
