package ChainOfResponsabilityDC;
import java.util.logging.Handler;

public class store_manager_approval extends baseHandler {

	private Handler next;
	/**
	 * 
	 * @param request
	 */
	public void handle( request) {
		// TODO - implement store_manager_approval.handle
		if(canHandle(request)){
			....
			.....
			
		}
	}

}