package Collections;

import java.util.Objects;

public class Hashdemo {
	int aadhar;
	String name;
	public Hashdemo(int aadhar, String name) {
		this.aadhar = aadhar;
		this.name = name;
	}
//	@Override
//	public int hashCode() {return aadhar;}
//	@Override
//	public boolean equals(Object obj) {
//		if(this == obj) {return true;}
//		if(obj == null) {return false;}
//		if(this.getClass() != obj.getClass()) {return false;}
//		Hashdemo hd = (Hashdemo)obj;
//		return (this.aadhar == hd.aadhar && this.name == hd.name) ;
//	}
	@Override
	public int hashCode() {
		return Objects.hash(aadhar, name);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Hashdemo other = (Hashdemo) obj;
		return aadhar == other.aadhar && Objects.equals(name, other.name);
	}
}
