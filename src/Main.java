public class Main {
    public static void main(String[] args) {
        LegacySystem legacySystem = new LegacySystem();
        NewSystem newSystem = new NewSystem();

        Adapter legacyAdapter = new LegacySystemAdapter(legacySystem);
        Adapter newAdapter = new NewSystemAdapter(newSystem);

        // Using the adapters to make both systems work together
        System.out.println("Using Legacy System via Adapter:");
        legacyAdapter.request();

        System.out.println("\nUsing New System via Adapter:");
        newAdapter.request();
    }
}