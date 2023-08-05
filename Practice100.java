package javatutorial;

import java.util.Arrays;
import java.util.List;

public class Practice100 {

	public static void main(String[] args) {
		

				Employee2[] employees = {

						new Employee2(1, "ganesh sharma", 100), 
						new Employee2(1, "ram sharma", 1000),
						new Employee2(1, "Ravi shrestha", 10000)

				};

//				for(int i = 0 ; i < employees.length;i++) {
//					employees[i].displayFullName();
//				}

				List<Employee2> emplist = Arrays.asList(employees);

				// forEach()

				emplist.stream().forEach(emp -> emp.incrementSalary(10));

				for (int i = 0; i < employees.length; i++) {
					System.out.println(employees[i].salary);
				}

				// filter()

				// map()

			}

		}

		class Employee2 {

			int id;
			String fullName;
			int salary;

			public Employee2(int id, String fn, int sy) {

				this.id = id;
				this.fullName = fn;
				this.salary = sy;

			}

			public void displayFullName() {
				System.out.println(this.fullName);
			}

			public void incrementSalary(int x) {
				this.salary = this.salary + x;
				// it is same as above line this.salary += x;
			}

		}