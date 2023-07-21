package ChainOfResponsabilityDC;

public interface Handler {

	/**
	 * 
	 * @param h
	 */
	void setNext(Handler h);

	/**
	 * 
	 * @param request
	 */
	void handle(int request);

}