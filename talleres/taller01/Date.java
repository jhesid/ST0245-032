public class Date {
	
	private int year;
	private int month;
	private int day;
	
	// Constructor
	public Date (int day,int month, int year) {
		
		this.day = day;
		this.month = month;
		this.year = year;
		
	}
	
	public int getDay() {
		return day;		
	}
	
	public int getMonth() {
		return month;		
	}
	
	public int getYear() {
		return year;		
	}
	
	// Devuelve la fecha en una cadena
	public String toString() {
		
		return (String) "La fecha es: " + day + "/" + month + "/" + year;
		
	}
	
	public boolean isEqual(Date otraFecha) {
		if ((otraFecha.getYear() == getYear()) && (otraFecha.getMonth() == getMonth()) && (otraFecha.getDay() == getDay())) {
			return true;
		}
		else {
			return false;
		}
    
	} 
    
  public String compareTo(Date otraFecha) {
		if (isEqual(otraFecha)){
	  	return "son iguales";
		  	}	
  	// Si no son iguales compara el año el mes y el dia para ver cual es diferente    
		else {
    if(otraFecha.getYear()==getYear()){
    		if(otraFecha.getMonth()==getMonth()){
          //si llega hasta aqui lo distinto esta en el dia
          //se buca cual es mayor
          if(otraFecha.getDay()>getDay()){
            return" la fecha n°2 ingresada es mayor";
          	}else{
          	return"la fecha n°1 es mayor";
          	}
        	 }else{
          //si el mes no es igual
        		 
               if(otraFecha.getMonth()>getMonth()){
            				return" la fecha n°2 ingresada es mayor";
          					}else{
          	return"la fecha n°1 es mayor";
          	}
           }
      }else{
      	//si el año no es igual
                if(otraFecha.getYear()>getYear()){
            return" la fecha n°2 ingresada es mayor";
          	}
                else{
          	return"la fecha n°1 es mayor";
          	}
      }
			    	
	  	  }
	}
    
				
	}
  