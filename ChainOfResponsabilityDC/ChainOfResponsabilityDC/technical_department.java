package ChainOfResponsabilityDC;

public class technical_department extends baseHandler {

	private Handler next;
	/**
	 * 
	 * @param request
	 */
	public void handle( request) {
		// TODO - implement technical_department.handle
		if(canHandle(request)){
			....
			.....
			
		}else {
			next.inventory_manager(request);
		}
	}

}