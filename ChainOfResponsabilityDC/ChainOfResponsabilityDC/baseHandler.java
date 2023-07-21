package ChainOfResponsabilityDC;

public class baseHandler implements Handler {

	private Handler next;

	/**
	 * 
	 * @param h
	 */
	public void setNext(Handler h) {
		this.next = h;
	}

	/**
	 * 
	 * @param request
	 */
	public void handle(request) {
		// TODO - implement baseHandler.handle
		if(next!=null)
			next.handle(request);
	}

}