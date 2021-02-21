import lombok.Getter;
import lombok.Setter;

public class Guitar {
    private @Getter final String m_brand;
    private @Getter final boolean m_is_electric;
    private @Getter final int m_number_of_strings;
    private @Getter @Setter float m_price;
    private @Getter boolean m_tuned;


    public Guitar(String m_brand, boolean m_is_electric) {
        this(m_brand, m_is_electric,6 ,50f, true);

    }

    public Guitar(String m_brand) {
        this(m_brand, false);
    }

    public Guitar(String m_brand, boolean m_is_electric, int m_number_of_strings, float m_price, boolean m_tuned) {
        this.m_brand = m_brand;
        this.m_is_electric = m_is_electric;
        this.m_number_of_strings = m_number_of_strings;
        this.m_price = m_price;
        this.m_tuned = m_tuned;
    }




    public void set_tuneGuitar()   {
       if (m_tuned == true)   {
           System.out.println("The guitar is tuned");
       }



    }


}
