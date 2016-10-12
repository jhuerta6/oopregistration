package assignment_three_task_one;

public class CreditCard {
	private int number;
	private String expirationDate;
	private int CVS;
	
	public CreditCard(int numbers, String expirationdate, int cvs){
		setNumber(numbers);
		setExpirationDate(expirationdate);
		setCVS(cvs);
	}
	
	/* Getters and setters */
	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}

	public String getExpirationDate() {
		return expirationDate;
	}

	public void setExpirationDate(String expirationDate) {
		this.expirationDate = expirationDate;
	}

	public int getCVS() {
		return CVS;
	}

	public void setCVS(int cvs) {
		CVS = cvs;
	}
	/* End getters and setters */
}
