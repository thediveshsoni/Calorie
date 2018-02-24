package dao;

import java.sql.*;

import bean.UserBean;
import config.MyConnection;

public class UserDao {
	int l[]=new int[10];
	
	int m[]=new int[10];
	Connection con=MyConnection.getConnection();
	
	//function to determine the BMR value
	public int nutrition(UserBean ub)
	{
		String status;
		int bmr,kcal;
	//	int height=(int) ((ub.getFeet()*30.48)+(ub.getInches()*2.54));
		if(ub.getGender()=="Male")
			bmr=(int) (88.362+(13.397*ub.getWeight())+(4.799*ub.getHeight())-(5.677*ub.getAge()));
		else
			bmr=(int) (447.593+(9.247*ub.getWeight())+(3.098*ub.getHeight())-(4.330*ub.getAge()));
		System.out.println(bmr);
		if(ub.getActivity()==1)
			kcal=(int) (bmr*1.2);
		else if(ub.getActivity()==2)
			kcal=(int) (bmr*1.375);
		else if(ub.getActivity()==3)
			kcal=(int) (bmr*1.55);
		else if(ub.getActivity()==4)
			kcal=(int) (bmr*1.725);
		else 
			kcal=(int) (bmr*1.9);
		System.out.println(kcal);
		int diff=ub.getEweight()-ub.getWeight();
	
		if(diff>=0)
		{
			status="gain";
		
		}
		else
		{	
			status="lose";
			diff=(-1)*diff;
			
		}		
		System.out.println(diff);
		int a=(1000/ub.getTime())*diff;
		
		System.out.println(a);
		if(status=="gain")
			a=a+kcal;
		else
			a=kcal-a;
		System.out.println(a);
		return a;
	}
	
	//function to enter data into database;
	public void entry(UserBean ub)
	{
		try {
			PreparedStatement ps=con.prepareStatement("insert into nutritionuserdata values(?,?,?,?,?,?,?,?,?)");
			ps.setInt(1, ub.getSno());
			ps.setString(2,ub.getEmail());
			ps.setString(3,ub.getGender());
			ps.setInt(4,ub.getAge());
			ps.setInt(5,ub.getHeight());
			ps.setInt(6,ub.getWeight());
			ps.setInt(7, ub.getActivity());
			ps.setInt(8, ub.getEweight());
			ps.setInt(9, ub.getTime());
			//ps.setInt(10,ub.getAge());
			//ps.setInt(11, ub.getConsumed());
			ps.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
	}
	//Daily Calories Counter
	public int caloriecount(UserBean ub)
	{
	
		
		int food[]={0,80,110,120,150,90,45,45,45,120,150,60,150,150,100};
		
		m[1]=ub.getB1();
		m[2]=ub.getB2();
		m[3]=ub.getB3();
//		m[4]=ub.getL1();
//		m[5]=ub.getL2();
//		m[6]=ub.getL3();
//		m[7]=ub.getD1();
//		m[8]=ub.getD2();
//		m[9]=ub.getD3();
		
		
		
		l[1]=food[ub.getFoodb1()]*m[1];
		l[2]=food[ub.getFoodb2()]*m[2];
		l[3]=food[ub.getFoodb3()]*m[3];
//		l[4]=food[ub.getFoodl1()]*m[4];
//		l[5]=food[ub.getFoodl2()]*m[5];
//		l[6]=food[ub.getFoodl3()]*m[6];
//		l[7]=food[ub.getFoodd1()]*m[7];
//		l[8]=food[ub.getFoodd2()]*m[8];
//		l[9]=food[ub.getFoodd3()]*m[9];
		int kcalconsumed=0;
		for(int i=1;i<=3;i++)
		kcalconsumed=kcalconsumed+l[i];
		return kcalconsumed;
	}
	public int caloriecount2(UserBean ub)
	{
	
		
		int food[]={0,80,110,120,150,90,45,45,45,120,150,60,150,150,100};
		
//		m[1]=ub.getB1();
//		m[2]=ub.getB2();
//		m[3]=ub.getB3();
		m[4]=ub.getL1();
		m[5]=ub.getL2();
		m[6]=ub.getL3();
//		m[7]=ub.getD1();
//		m[8]=ub.getD2();
//		m[9]=ub.getD3();
		
		
		
		//l[1]=food[ub.getFoodb1()]*m[1];
		//l[2]=food[ub.getFoodb2()]*m[2];
		//l[3]=food[ub.getFoodb3()]*m[3];
		l[4]=food[ub.getFoodl1()]*m[4];
		l[5]=food[ub.getFoodl2()]*m[5];
		l[6]=food[ub.getFoodl3()]*m[6];
		//l[7]=food[ub.getFoodd1()]*m[7];
		//l[8]=food[ub.getFoodd2()]*m[8];
		//l[9]=food[ub.getFoodd3()]*m[9];
		int kcalconsumed=0;
		for(int i=4;i<=6;i++)
		kcalconsumed=kcalconsumed+l[i];
		return kcalconsumed;
	}
	public int caloriecount3(UserBean ub)
	{
	
		
		int food[]={0,80,110,120,150,90,45,45,45,120,150,60,150,150,100};
		
//		m[1]=ub.getB1();
//		m[2]=ub.getB2();
//		m[3]=ub.getB3();
//		m[4]=ub.getL1();
//		m[5]=ub.getL2();
//		m[6]=ub.getL3();
		m[7]=ub.getD1();
		m[8]=ub.getD2();
		m[9]=ub.getD3();
		
		
		
//		l[1]=food[ub.getFoodb1()]*m[1];
//		l[2]=food[ub.getFoodb2()]*m[2];
//		l[3]=food[ub.getFoodb3()]*m[3];
//		l[4]=food[ub.getFoodl1()]*m[4];
//		l[5]=food[ub.getFoodl2()]*m[5];
//		l[6]=food[ub.getFoodl3()]*m[6];
		l[7]=food[ub.getFoodd1()]*m[7];
		l[8]=food[ub.getFoodd2()]*m[8];
		l[9]=food[ub.getFoodd3()]*m[9];
		int kcalconsumed=0;
		for(int i=7;i<=9;i++)
		kcalconsumed=kcalconsumed+l[i];
		return kcalconsumed;
	}
	public void entrycal(UserBean ub)
	{
		try {
			PreparedStatement ps=con.prepareStatement("insert into nutritiondata values(?,?,?,?)");
			ps.setInt(1, ub.getSn());
			ps.setString(2,ub.getEmail());
			ps.setInt(3,ub.getKcal());
			ps.setInt(4,ub.getConsumed());
			ps.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}
