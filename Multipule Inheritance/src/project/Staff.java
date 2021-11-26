
package project;
public class Staff extends Employee{
    private String Designation;
    
    public void set_Designation(String Designation)
{
    this.Designation=Designation;
}
 public String get_Designation()
{
    return Designation;
}
   /* @Override
    public String toString()
{
    return super.toString()+"Class = Staff";
}*/
    @Override
    public String toString()
{
    return get_name()+"Class = Staff";
}
}
