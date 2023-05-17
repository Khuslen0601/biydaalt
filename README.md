# biydaalt
package dasgal;

public class Oyutan {

	
		private String OyutanName;
		private String OyutniiKod;
		private Salbar salbar;
		  public Oyutan(String OyutanName,String string ,Salbar s) {
			this.OyutanName=OyutanName;
			this.OyutniiKod=string;
			this.salbar=s;
			
		}
		public String getOyutanName() {
			return OyutanName;
		}
		public String getOyutniiKod() {
			return OyutniiKod;
		}
		public Salbar getSalbar() {
			return salbar=salbar;
		}
		public String toString() {
			return OyutanName +" "+ OyutniiKod+" "+salbar.toString();
		}
		
}
