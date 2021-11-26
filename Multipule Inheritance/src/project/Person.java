
package project;
public class Person {

    private  String name = "Talha",address,email_address,phone_number;
   
    public void set_name(String name)
{
    this.name=name;
}
    public void set_address(String address)
{
    this.address=address;
}
    public void set_email(String email)
{
    email_address = email;
}
     public void set_phone(String phone)
{
    phone_number= phone;
}

public String get_name()
{
    return name;
}
public String get_email()
{
    return email_address;
}
public String get_Address()
{
    return address;
}
public String get_phone()
{
    return phone_number;
}
    @Override
    public String toString()
{
    return "Name : "+name;
}

}
