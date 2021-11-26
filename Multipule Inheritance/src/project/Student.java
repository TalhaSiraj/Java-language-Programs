package project;
public class Student extends Person{
private  String  class_status = null;

public void set_Class_status(String status)
{
    class_status = status;
}

public String get_Class_status()
{
    return class_status;
}
@Override
public String toString()
{
    return get_name()+"Class = Student";
    
}


}
