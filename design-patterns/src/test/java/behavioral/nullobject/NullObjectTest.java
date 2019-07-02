package behavioral.nullobject;

import org.junit.Test;

/**
 * Целью Null-object является инкапсулирование отсутствия объекта путём замещения его другим объектом, который ничего
 * не делает.
 */
public class NullObjectTest {

    @Test
    public void test() {
        AbstractCustomer customer1 = CustomerFactory.getCustomer("Rob");
        AbstractCustomer customer2 = CustomerFactory.getCustomer("Bob");
        AbstractCustomer customer3 = CustomerFactory.getCustomer("Julie");
        AbstractCustomer customer4 = CustomerFactory.getCustomer("Laura");

        System.out.println("Customers");
        System.out.println(customer1.getName());
        System.out.println(customer2.getName());
        System.out.println(customer3.getName());
        System.out.println(customer4.getName());
    }
}
