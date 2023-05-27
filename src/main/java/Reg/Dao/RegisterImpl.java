package Reg.Dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import Reg.model.Login;
import Reg.model.Register;

public class RegisterImpl implements RegisterInterface 
{
	Connection con=DbConnection.getconnection();
	int i=0;
	ResultSet rs;
	@Override
	public int create(List<Register> lstreg) 
	{  
		Register reg =lstreg.get(0);

		try {


			PreparedStatement pstate=con.prepareStatement("insert into register values(?,?,?,?,?,?)");
			pstate.setInt(1,reg.getRegno());
			pstate.setString(2,reg.getName());
			pstate.setString(3,reg.getEmail());
			pstate.setString(4,reg.getUname());
			pstate.setString(5,reg.getPass());
			pstate.setString(6,reg.getAccbal());

			i=pstate.executeUpdate(); 


		} 
		catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return i;

	}

	@Override
	public List<Register> displayall() {

		List<Register> lstreg=new ArrayList<Register>();
		String str="Select * from register";
		try {
			Statement state=con.createStatement();
			rs=state.executeQuery(str);
			//			ResultSetMetaData rsmd=rs.getMetaData();
			//			
			//			for(int i=1;i<rsmd.getColumnCount();i++)
			//			{
			//				System.out.print(rsmd.getColumnName(i)+"\t");
			//			}
			while(rs.next())
			{  Register reg=new Register(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getString(4),rs.getString(5), rs.getString(6));

			lstreg.add(reg);
			}

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return lstreg;
	}

	@Override
	public List<Register> retrive(int regno) {

		List<Register> lstreg =null;
		try {
			PreparedStatement pstate=con.prepareStatement("Select * from register where reg_no=?");
			pstate.setInt(1, regno);

			rs=pstate.executeQuery();

			if(rs.next())
			{
				Register reg=new Register(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getString(4),rs.getString(5), rs.getString(6));
				lstreg=new ArrayList<Register>();
				lstreg.add(reg);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return lstreg;
	}

	@Override
	public int delete(int regno) {

		try {
			PreparedStatement pstate=con.prepareStatement("delete from register where reg_no=(?)");
			pstate.setInt(1, regno);

			i=pstate.executeUpdate();

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return i;
	}

	@Override
	public int Update(int regno, String uname, String pass,String accbal) {
		try {
			PreparedStatement pstate=con.prepareStatement("update register set uname=?,password=?,acc_Bal=? where reg_no=?");
			pstate.setInt(4,regno);
			pstate.setString(1,uname);
			pstate.setString(2,pass);
			pstate.setString(3, accbal);

			i=pstate.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return i;

	}

	@Override
	public String validate(Login l) {

		String str=null;
		List<Register> lstreg=null;
		lstreg=displayall();
		for(Register r :lstreg)
		{
			if(r.getUname().equals(l.getUname()))
			{
				if(r.getPass().equals(l.getPass()))
				{
					str="valid";
					break;
				}
				else 
				{
					str="Invalid Password";
				}
			}
			else 
			{
				str="invalid UserName";
			}
		}
		return str;
	}

	//	@Override
	//	public boolean validate(Login l) {
	//		  boolean b=false;
	//		  try {
	//			PreparedStatement pstate=con.prepareStatement("select * from register where uname=? and password=?");
	//			pstate.setString(1,l.getUname());
	//			pstate.setString(2,l.getPass());
	//			
	//			rs=pstate.executeQuery();
	//			if(rs.next())
	//			{
	//				b=true;
	//			}
	//			
	//		} catch (SQLException e) {
	//			// TODO Auto-generated catch block
	//			e.printStackTrace();
	//		}
	//		  
	//		return b;
	//	}



}
