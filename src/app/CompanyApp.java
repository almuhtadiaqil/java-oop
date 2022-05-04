package app;

import data.Company;

public class CompanyApp {
    public static void main(String[] args) {
        Company company = new Company();
        company.setName("PT DIF");

        Company.Employee employee = company.new Employee();
        employee.setName("Aqil Almuhtadi");

        System.out.println(employee.getName() + " " + employee.getCompany());
    }
}
