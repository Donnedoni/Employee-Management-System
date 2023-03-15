class Employee {
    private String Name;
    private String Surname;
    private String Email;
    
    public Employee(String _Name, String _Surname, String _Email)
    {
        Name = _Name;
        Surname = _Surname;
        Email = _Email;
    }
    public String GetName()
    {
        return Name;
    }
    public String GetSurName()
    {
        return Surname;
    }
    public String GetEmail()
    {
        return Email;
    }
    public String toSTring()
    {
        return Name + " " + Surname + " " + Email;
    }
}