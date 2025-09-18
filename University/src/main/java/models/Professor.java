package models;

import util.Utils;

import java.util.Objects;

public class Professor extends Person{
    protected String department;

    @Override
    public String toString() {
        return "Professor{" +
                "department='" + department + '\'' +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Professor professor = (Professor) o;
        return Objects.equals(department, professor.department);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), department);
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) throws Exception {
        if(!Utils.isEmptyStr(department))
        {
            throw new Exception("This field is empty");
        }
        this.department = department;
    }

    public Professor(String firstName, String lastName, String department) throws Exception {
        super(firstName, lastName);
        this.setDepartment(department);
    }
}
