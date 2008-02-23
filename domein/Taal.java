package domein;
import java.util.Locale;
import java.util.ResourceBundle;
public class Taal {
	
	private String language,country;
	private ResourceBundle messages;
    		
    public Taal(int keuze){
    	
    
      switch(keuze)
      {
		  case 1:language = new String("en");
                 country = new String("US");
                 break;
		  case 2:language = new String("fr");
                 country = new String("FR");
                 break;
		  default:language = new String("ne");
                 country = new String("NL");
                 break;
	  }

      Locale currentLocale;
      currentLocale = new Locale(language, country);
           
      messages = ResourceBundle.getBundle("MessagesBundle",currentLocale);
     
    }
    
    public ResourceBundle getBundle(){
    	
    	return messages;
        }
}
