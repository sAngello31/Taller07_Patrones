package ChainOfResponsabilityDC;

public class user_service_departament extends baseHandler {

	private Handler next;
	/**
	 * 
	 * @param request
	 */
	public void handle( request) {
		// TODO - implement user_service_departament.handle
		if(canHandle(request)){
			....
			.....
			
		}else {
			next.technical_department(request);
		}
	}

}