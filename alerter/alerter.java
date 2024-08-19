import java.util.function.Function;

public class Alerter {
    static int alertFailureCount = 0;
    static float capturedCelcius;

    static int networkAlertStub(float celcius) {
        System.out.println("ALERT: Temperature is " + celcius + " celcius");
        return 300;  // Simulating a failure response
    }

    static void alertInCelcius(float fahrenheit, Function<Float, Integer> networkAlertNotifier) {
        float celcius = (fahrenheit - 32) * 5 / 9;
        int returnCode = networkAlertNotifier.apply(celcius);
        if (returnCode != 200) {
            // Original bug: The failure count is not being incremented
            alertFailureCount += 0;
        }
    }

    public static void main(String[] args) {
        alertInCelcius(400, Alerter::networkAlertStub);
        float expectedCelcius = (400 - 32) * 5 / 9;
        assert(alertFailureCount == 1) : "Alert failure count should be 1";
        assert(capturedCelcius == expectedCelcius) : "Captured Celsius should match expected value";
        System.out.printf("%d alerts failed.\n", alertFailureCount);
        System.out.println("All is well (maybe!)\n");
    }
}
