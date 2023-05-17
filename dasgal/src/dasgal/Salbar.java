package dasgal;

public class Salbar {

		private int SalbarNumber;
		private String SalbarName;
		private String ErkhlegchName;

		Salbar( int SalbarNumber,String SalbarName,String ErkhlegchName) {
			this.SalbarNumber=SalbarNumber;
			this.SalbarName=SalbarName;
			this.ErkhlegchName=ErkhlegchName;
		}
		public void setsalbarNumber(int SalbarNumber) {
			this.SalbarNumber=SalbarNumber;
			
		}
		public void setsalbarName(String SalbarName) {
			this.SalbarName=SalbarName;
			
		}
		public void seterkhlegchName(String ErkhlegchName) {
			this.ErkhlegchName=ErkhlegchName;
			
		}
		public String toString() {
			return SalbarName +" "+ SalbarNumber+" "+ErkhlegchName.toString();
		}
		
	}


