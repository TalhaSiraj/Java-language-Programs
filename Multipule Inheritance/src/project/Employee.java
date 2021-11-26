
package project;
public class Employee extends Person{
    String office;
    String date_hired;
    double salary;
    
    public void set_office(String office)
{
    this.office=office;
}
    public void set_date_hired(String date_hired)
{
    this.date_hired=date_hired;
}
    public void set_salary(double salary)
{
    this.salary = salary;
}
    public String get_office()
{
    return office;
}
public String get_date_hired()
{
    return date_hired;
}
public double get_salary()
{
    return salary;
}

    @Override
    public String toString()
{
    return super.toString()+"Class = Employee";
}
    
}
