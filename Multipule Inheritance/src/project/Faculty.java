
package project;
public class Faculty extends Employee{
    private double office_hours;
    private String rank;
    
 public void set_rank(String rank)
{
    this.rank=rank;
}
    public void set_office_hours(double office_hours)
{
    this.office_hours = office_hours;
}
    public String get_rank()
{
    return rank;
}
public double get_office_hours()
{
    return office_hours;
}

   /* @Override
    public String toString()
{
    return super.toString()+"Class = Faculty";
}*/
       @Override
    public String toString()
{
    return get_name()+"Class = Faculty";
}
}
