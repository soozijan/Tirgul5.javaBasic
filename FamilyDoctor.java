package com.company.painter;

import lombok.ToString;


import lombok.Getter;
import lombok.Setter;

public class FamilyDoctor extends Docter {
     private @Getter @Setter Boolean m_is_occupied;
     private @Getter String m_clinic;

    public FamilyDoctor(int m_doctor_id, String m_doctor_name, String m_hospital, Boolean m_is_occupied, String m_clinic) {
        super(m_doctor_id, m_doctor_name, m_hospital);
        this.m_is_occupied = m_is_occupied;
        this.m_clinic = m_clinic;
    }

    public void acceptClient()   {
        if (m_is_occupied = false)   {
            System.out.println("The doctor is busy");
        }
        else {
            System.out.println("welcome ");
        }


     }
     public void finishApointment()  {
        m_is_occupied = true;
     }




}
