package lab13;

public class lab13 {

	public static void main(String[] args) {
		student [] students = {new graduate("2019******",3.0),
							   new undergraduate("2019xxxxx",3.0),
							   new graduate("2019738367",2.0),
							   new undergraduate("201917857",2.0),
							   new graduate("201973KGJF",1.0),
							   new undergraduate("2019FGIoo",1.0),
							   };
		for (int i = 0;i<students.length;i++)
			System.out.println("id: "+students[i].getId()+"   GPA: "+students[i].getGpa()+"   status: "+students[i].getStatus());

	}

}
