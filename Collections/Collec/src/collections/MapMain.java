package collections;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Collection;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.SortedMap;
import java.util.TreeMap;

public class MapMain {

	public static Map<Project, Employee> loadProjects() throws ParseException {

	
		SimpleDateFormat sdf= new SimpleDateFormat("DD-MM-YYYY");
		Employee e1 = new Employee(1, "Bargav", 23000.00,"abc@gmail.com");
	     Employee e2 = new Employee(2, "Anudeep",21000.00,"hello!@gmail.com");
	     Employee e3 = new Employee(3, "Bhanupratap", 22000.00,"xyz@gmail.com");
	     
	     Project p1 = new Project(1,"pro1",sdf.parse("02-03-2020"),sdf.parse("02-04-2020"));
	     Project p2 = new Project(2,"pro2",sdf.parse("01-03-2020"),sdf.parse("01-04-2020"));
	     Project p3 = new Project(3,"pro3",sdf.parse("03-03-2020"),sdf.parse("03-04-2020"));
	     Project p4 = new Project(106, "AWS", sdf.parse("12-10-2019"), sdf.parse("04-05-2020"));
		 Project p5 = new Project(105, "Datawarehouse", sdf.parse("10-10-2019"), sdf.parse("28-02-2020"));
		 Project p6 = new Project(108, "IOT", sdf.parse("02-01-2020"), sdf.parse("30-04-2020"));
		 Project p7 = new Project(109, "React js", sdf.parse("12-10-2019"), sdf.parse("04-05-2020"));
		 Project p8 = new Project(107, "Angular js", sdf.parse("12-12-2019"), sdf.parse("30-03-2020"));
		 Project p9 = new Project(102, "AI", sdf.parse("12-02-2020"), sdf.parse("31-06-2020"));
		 Project p10 = new Project(110, "Machine Learning", sdf.parse("12-10-2019"), sdf.parse("04-07-2020"));

			Map<Project, Employee> map = new TreeMap<Project, Employee>();
			map.put(p1, e1);
			map.put(p2, e2);
			map.put(p3, e3);
			map.put(p4, e1);
			map.put(p5, e1);
			map.put(p6, e2);
			map.put(p7, e3);
			map.put(p8, e1);
			map.put(p9, e1);
			map.put(p10, e3);

			return map;
	}
	      

	public static void displayByProjectId(Map<Project, Employee> map) {
		 SortedMap<Project,Employee>  sortedMap = new TreeMap<Project, Employee>(map);
		
		 sortedMap.entrySet().stream().forEach(t->System.out.println(t));
		
		
		

	}

	public static void displayByProjectDomain(Map<Project, Employee> map) {
		Comparator<Project> projectDomainComaprator = new Comparator<Project>() {

			public int compare(Project o1, Project o2) {
				// TODO Auto-generated method stub
				return o1.getDomain().compareTo(o2.getDomain());
			}
		};
		
		
		
		
		map.entrySet().stream().sorted(Map.Entry.comparingByKey(projectDomainComaprator)).forEach(t -> System.out.println(t));
		;
		

	}

	public static void main(String args[]) throws ParseException {
		Map<Project, Employee> map = loadProjects();
		displayByProjectId(map);
		System.out.println("***************");
		displayByProjectDomain(map);
	}

}
