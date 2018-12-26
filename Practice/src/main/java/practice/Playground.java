package practice;

public class Playground {

	public static void main(String[] args) {

		date(55);

	}

	
	public static String date(int day) {
		
		String [] yrs = new String[365];
		
		int jan = 1;
		int feb = 1;
		int mar = 1;
		int apr = 1;
		int may = 1;
		int jun = 1;
		int jul = 1;
		int aug = 1;
		int sep = 1;
		int oct = 1;
		int nov = 1;
		int dec = 1;
		
		for(int i = 1; i <= 365; i++) {
			//System.out.println(i);
			// JAN
			if(jan <= 31) {
				System.out.println(i + ": January " + jan);
				yrs[i] = "January " + jan;
				jan++;
			}	
			// FEB
			while(i > 31 && feb <= 28) { 
				i++;
				System.out.println(i + ": February " + feb);
				yrs[i] = "February " + feb;
				feb++;
			}
			// MAR
			while(i > 59 && mar <= 31) { 
				i++;
				System.out.println(i + ": March " + mar);
				yrs[i] = "March " + mar;
				mar++;
			}
			// APR
			while(i > 90 && apr <= 30) { 
				i++;
				System.out.println(i + ": April " + apr);
				yrs[i] = "April " + apr;
				apr++;
			}
			// MAY
			while(i > 120  && may <= 31) { 
				i++;
				System.out.println(i + ": May " + may);
				yrs[i] = "May " + may;
				may++;
			}
			// JUN
			while(i > 151 && jun <= 30) { 
				i++;
				System.out.println(i + ": June " + jun);
				yrs[i] = "June " + jun;
				jun++;
			}
			// JUL
			while(i > 181 && jul <= 31) { 
				i++;
				System.out.println(i + ": July " + jul);
				yrs[i] = "July " + jul;
				jul++;
			}
			// AUG
			while(i > 212 && aug <= 31) { 
				i++;
				System.out.println(i + ": August " + aug);
				yrs[i] = "August " + aug;
				aug++;
			}
			// SEP
			while(i > 243 && sep <= 30) { 
				i++;
				System.out.println(i + ": September " + sep);
				yrs[i] = "September " + sep;
				sep++;
			}
			// OCT
			while(i > 273 && oct <= 31) { 
				i++;
				System.out.println(i + ": October " + oct);
				yrs[i] = "October " + oct;
				oct++;
			}
			// NOV
			while(i > 304 && nov <= 30) { 
				i++;
				System.out.println(i + ": November " + nov);
				yrs[i] = "November " + nov;
				nov++;
			}
			// DEC
			while(i > 334 && dec <= 31) { 
				i++;
				System.out.println(i + ": December " + dec);
				yrs[i] = "December " + dec;
				dec++;
			}
		}
		
		return null;
	}
}
