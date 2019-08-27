	namespace java com.thrift.api


	struct Student {
			1:string name,
			2:i32 gender,
			3:i32 age,
			4:double height,
			5:string number,
			6:string School,
			7:list<string> familyMember
	}
	struct Teacher {
			1:string classNo,
			2:string name,
			3:i32 age,
			4:string subject
	}
	struct Classes {
			1:i32 studentSum,
			2:list<Student> students,
			3:list<Teacher> teachers,
			4:string classNum,
			5:Teacher headTeacher
	}


	service Recall {
		 	list<Student> hello(1:Classes arg0)		        	
	}
