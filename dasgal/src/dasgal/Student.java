package dasgal;

public class Student {

	public static void main(String[] args) {
		Salbar salbar = new Salbar(1, "Уянгасайхан","МТС");	
		Oyutan oyutan = new Oyutan("B210910111", "Шинэбаяр", salbar);
		
		System.out.println(salbar);
		System.out.println(oyutan);
		
		Salbar salbar2 = new Salbar(2, "ИС", "Ч. Ганзориг");
		Oyutan oyutan2 = new Oyutan("Оюутан B18092005"+ " кодтой "+  "Болд" + " нь " + salbar2, null, salbar2);
		
		System.out.println(salbar2);
		System.out.println(oyutan2);
	}

}
