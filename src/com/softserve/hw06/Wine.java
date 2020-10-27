package com.softserve.hw06;

public class Wine extends Product {
	private WineCountry country;

	public Wine(WineCountry country, double price) {
		super("Wine", price);
		this.country = country;
	}

	public WineCountry getCountry() {
		return country;
	}

	public void setCountry(WineCountry country) {
		this.country = country;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + ((country == null) ? 0 : country.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (!super.equals(obj) || (getClass() != obj.getClass())) {
			return false;
		}
		Wine other = null;
		if (obj instanceof Wine) {
			other = (Wine) obj;
		}
		if ((other == null) || ((country == null) && (other.country != null))
				|| ((country != null) && (other.country == null))) {
			return false;
		}
		if ((country == null) && (other.country == null)) {
			return true;
		}

		return country.equals(other.country);
	}

	@Override
	public String toString() {
		String result = super.toString();
		int beginIndex = result.indexOf("[") + 1;
		int endIndex = result.length() - 1;
		result = result.substring(beginIndex, endIndex);
		return "Wine [" + result + ", country = " + country.name() + "]";
	}

}
