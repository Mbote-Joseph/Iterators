class people:
    title=None
    name=None
    gender=None
    address=None
    phone=None
class employee:
    emp_id=None
    salary=None
  
class hospital(employee,people):
    room_no = None
    dept = None

    def patient(self, title,name,gen,add,phone, room=None):
        self.title = title
    
        if self.title == 'In-Patients':
            self.room_no = room
            
            self.name = name
            self.gender = gen
            self.address = add
            self.phone = phone
    
    def show_patient(self):
        print('Title - ',self.title)
        print('Name - ',self.name)
        print('Gender - ',self.gender)
        print('Address - ',self.address)
        print('Phone - ',self.phone)
        
        if self.room_no:
            print('Room Nom - ',self.room_no)
    
    def employee(self, title,name,gen,add,phone,emp_id, salary, dept=None):
        self.title = title
    
        if self.title == 'Doctor' or self.title == 'Nurse':
            self.dept = dept
        
            self.name = name
            self.gender = gen
            self.address = add
            self.phone = phone
            self.emp_id = emp_id
            self.salary = salary
    
    def show_employee(self):
        print('Title - ',self.title)
        print('Emp ID - ',self.emp_id)
        print('Name - ',self.name)
        print('Gender - ',self.gender)
        print('Salary - ',self.salary)
        print('Address - ',self.address)
        print('Phone - ',self.phone)
        
        if self.dept:
            print('Department - ',self.dept)
    
in_patient = hospital()
in_patient.patient('In-Patients','Ajay', 'Male','Chennai', 9983471202, 201)
in_patient.show_patient()
print('**********')
out_patient = hospital()
out_patient.patient('Out-Patients','Vinod', 'Male','Chennai', 8983471285)
out_patient.show_patient()
print('**********')
emp = hospital()
emp.employee('Receptionist','Mala', 'Female','Chennai', 7883471202, 2222, 25000)
emp.show_employee()
print('**********')
doc = hospital()
doc.employee('Doctor','Kishor', 'Male','Chennai', 7889471222, 4747, 89000, 'Dental')
doc.show_employee()