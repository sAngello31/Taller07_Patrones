Dpackage ChainOfResponsabilityDC;

import java.util.logging.Handler;

public class inventory_manager extends baseHandler {
	private Handler next;

	/**
	 * 
	 * @param request
	 */
	public void handle( request) {
		// TODO - implement inventory_manager.handle
		if(canHandle(request)){
			....
			.....
			
		}else {
			next.store_manager_approval(request);
		}
	}

}