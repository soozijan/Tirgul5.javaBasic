package com.company.painter;

import lombok.Getter;
import lombok.Setter;

public class Surgeon extends Docter {
    private @Getter @Setter String m_department;
    private @Getter @Setter int m_yearsOfExperience;


    public void operate()   {
        System.out.println("Starting to operate...");
    }

    public Surgeon(int m_doctor_id, String m_doctor_name, String m_hospital, String m_department, int m_yearsOfExperience) {
        super(m_doctor_id, m_doctor_name, m_hospital);
        this.m_department = m_department;
        this.m_yearsOfExperience = m_yearsOfExperience;
    }
}
