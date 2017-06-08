package pkg17;

import com.thoughtworks.xstream.XStream;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Calendar;
import java.util.Date;
import org.apache.commons.lang3.*;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.math.NumberUtils;
import org.apache.commons.lang3.text.WordUtils;
import minhaslibs.*;

public class Main {

    public static void main(String[] args) {
        
        Date d = new Date();
        
        System.out.println(
                d.getDate()+ "/" 
             + (d.getMonth() + 1)
             + "/" + (1900 + d.getYear()));

        Calendar c = Calendar.getInstance();
        System.out.println(c);
        
        LocalDate lc = LocalDate.now();
        System.out.println(lc);      
        
        String titulo = "POO";
        
        System.out.println("|" + 
            StringUtils.center(titulo, 20)
        + "|");
        
        System.out.println(
                StringUtils.leftPad(titulo, 70, ".-"));
        
        String s = WordUtils.initials("um teste qualquer");
        
        System.out.println(s);
        
        double v = NumberUtils.max(12, 44.2, 23, 1);
        System.out.println(v);
        
        // System.out.println(Validate.notBlank("  "));
        
        Aluno a = new Aluno("11223344", "Rafael Betito");
        
        XStream xs = new XStream();
        xs.alias("aluno", Aluno.class);
        // XStream
        System.out.println(xs.toXML(a)); // XML
     
        IList lista = new List();
        

        
    }
    
}
/*
<aluno>
    <matricula>11223344</matricula>
    <nome>Rafael Betito</nome>
</aluno>
*/
