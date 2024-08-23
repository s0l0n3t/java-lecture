package InterfaceClass;

public interface IBank {

    boolean isConnected();
    String payment(String paymentPoint);
    String leave();
}
