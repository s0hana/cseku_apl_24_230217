/*
 * The Student class represents a student in the hall management system.
 * It includes basic student information, such as name, ID, discipline, academic year, and contact/address details.
 * This class follows the Single Responsibility Principle (SRP) as it only manages student data.
 */

package hallmanagement.model;

/**
 *
 * @author Hp
 */
public class Student {

    // Declaring private instance variables to ensure encapsulation
    private String name;
    private int student_id;
    private String discipline;
    private String academicYear;
    private ContactInfo contactInfo;
    private Address address;
    //contactInfo and address encapsulated in their own class

    // Constructor initializing Student attributes
    public Student(String name, int student_id, String discipline, String academicYear, ContactInfo contactInfo, Address address)
    {
        this.name = name;
        this.student_id = student_id;
        this.discipline = discipline;
        this.academicYear = academicYear;
        this.address = address;
        this.contactInfo = contactInfo;
    }

    // Getters for retrieving student information
    public String getName()
    {
        return name;
    }
    public int getStudent_id()
    {
        return student_id;
    }
    public String getDiscipline()
    {
        return discipline;
    }
    public String getAcademicYear()
    {
        return academicYear;
    }
    public Address getAddress()
    {
        return address;
    }
    public ContactInfo geContactInfo()
    {
        return contactInfo;
    }

    // Setters for updating student information
    public void setName(String name)
    {
        this.name = name;
    }
    public void setStudent_id(int id)
    {
        this.student_id = id;
    }
    public void setDiscipline(String discipline)
    {
        this.discipline = discipline;
    }
    public void setAcademicYear(String academicYear)
    {
        this.academicYear = academicYear;
    }
    public void setAddress(Address address)
    {
        this.address = address;
    }
    public void setContactInfo(ContactInfo contactInfo)
    {
        this.contactInfo = contactInfo;
    }

    // Overrides toString to provide a readable summary of student details
    @Override
    public String toString()
    {
        return "Student Details:\nName: "+name+
        "\nStudent id: "+student_id+
        "\nDiscipline: "+discipline+
        "\nAcademic Year: "+academicYear+
        "\nAddress: "+address+
        "\nContact-info: "+contactInfo;
    }

}
