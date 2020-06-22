package ejercicios;

public class Codigo implements Comparable<Codigo> {
	private String XXX_NNNNN_Y;
	private String XXX;
	
	public Codigo(String xXX_NNNNN_Y) {
		super();
		this.XXX_NNNNN_Y = xXX_NNNNN_Y;
		this.XXX=xXX_NNNNN_Y.substring(0,3);
	}

	public String getXXX_NNNNN_Y() {
		return XXX_NNNNN_Y;
	}

	public void setXXX_NNNNN_Y(String xXX_NNNNN_Y) {
		XXX_NNNNN_Y = xXX_NNNNN_Y;
	}
	
	@Override
	public int compareTo(Codigo o)
	{
		return this.XXX.compareTo(o.getXXX());
	}
	
	
	
	

	public String getXXX() {
		return XXX;
	}

	public void setXXX(String xXX) {
		XXX = xXX;
	}

	@Override
	public String toString() {
		return "Codigo Producto [" + XXX_NNNNN_Y + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((XXX_NNNNN_Y == null) ? 0 : XXX_NNNNN_Y.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Codigo other = (Codigo) obj;
		if (XXX_NNNNN_Y == null) {
			if (other.XXX_NNNNN_Y != null)
				return false;
		} else if (!XXX_NNNNN_Y.equals(other.XXX_NNNNN_Y))
			return false;
		return true;
	}

	
	
	
	
	
	
	
	
	
}
