package com.zyb.ssm.pojo;

import java.util.List;

public class Employee {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tb1_emp.emp_id
     *
     * @mbggenerated Fri Aug 12 10:26:32 CST 2022
     */
    private Integer empId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tb1_emp.emp_name
     *
     * @mbggenerated Fri Aug 12 10:26:32 CST 2022
     */
    private String empName;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tb1_emp.gender
     *
     * @mbggenerated Fri Aug 12 10:26:32 CST 2022
     */
    private String gender;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tb1_emp.email
     *
     * @mbggenerated Fri Aug 12 10:26:32 CST 2022
     */
    private String email;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tb1_emp.d_id
     *
     * @mbggenerated Fri Aug 12 10:26:32 CST 2022
     */
    private Integer dId;
    private Department department;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tb1_emp.emp_id
     *
     * @return the value of tb1_emp.emp_id
     *
     * @mbggenerated Fri Aug 12 10:26:32 CST 2022
     */
    public Integer getEmpId() {
        return empId;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "empId=" + empId +
                ", empName='" + empName + '\'' +
                ", gender='" + gender + '\'' +
                ", email='" + email + '\'' +
                ", dId=" + dId +
                ", department=" + department +
                '}';
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tb1_emp.emp_id
     *
     * @param empId the value for tb1_emp.emp_id
     *
     * @mbggenerated Fri Aug 12 10:26:32 CST 2022
     */
    public void setEmpId(Integer empId) {
        this.empId = empId;
    }

    public Department getDepartment() {
        return department;
    }

    public void setDepartment(Department department) {
        this.department = department;
    }


    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tb1_emp.emp_name
     *
     * @return the value of tb1_emp.emp_name
     *
     * @mbggenerated Fri Aug 12 10:26:32 CST 2022
     */
    public String getEmpName() {
        return empName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tb1_emp.emp_name
     *
     * @param empName the value for tb1_emp.emp_name
     *
     * @mbggenerated Fri Aug 12 10:26:32 CST 2022
     */
    public void setEmpName(String empName) {
        this.empName = empName == null ? null : empName.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tb1_emp.gender
     *
     * @return the value of tb1_emp.gender
     *
     * @mbggenerated Fri Aug 12 10:26:32 CST 2022
     */
    public String getGender() {
        return gender;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tb1_emp.gender
     *
     * @param gender the value for tb1_emp.gender
     *
     * @mbggenerated Fri Aug 12 10:26:32 CST 2022
     */
    public void setGender(String gender) {
        this.gender = gender == null ? null : gender.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tb1_emp.email
     *
     * @return the value of tb1_emp.email
     *
     * @mbggenerated Fri Aug 12 10:26:32 CST 2022
     */
    public String getEmail() {
        return email;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tb1_emp.email
     *
     * @param email the value for tb1_emp.email
     *
     * @mbggenerated Fri Aug 12 10:26:32 CST 2022
     */
    public void setEmail(String email) {
        this.email = email == null ? null : email.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tb1_emp.d_id
     *
     * @return the value of tb1_emp.d_id
     *
     * @mbggenerated Fri Aug 12 10:26:32 CST 2022
     */
    public Integer getdId() {
        return dId;
    }

    public Employee(Integer empId, String empName, String gender, String email, Integer dId) {
        this.empId = empId;
        this.empName = empName;
        this.gender = gender;
        this.email = email;
        this.dId = dId;
    }

    public Employee() {
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tb1_emp.d_id
     *
     * @param dId the value for tb1_emp.d_id
     *
     * @mbggenerated Fri Aug 12 10:26:32 CST 2022
     */
    public void setdId(Integer dId) {
        this.dId = dId;
    }
}