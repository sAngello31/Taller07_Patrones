package ChainOfResponsabilityDC;

public class Cliente {
    h1 = new user_service_departament();
    h2 = new technical_department(h1);
    h3 = new inventory_manager(h2);
    h4 = new store_manager_approval(h3);
    h1.setNext(h2);
    h2.setNext(h3);
    .....
    .....
    .....
    h1.handle(request);
    .....
    ....
    ..
    
}