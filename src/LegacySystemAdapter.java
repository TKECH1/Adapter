class LegacySystemAdapter implements Adapter {
    private LegacySystem legacy;

    public LegacySystemAdapter(LegacySystem legacy) {
        this.legacy = legacy;
    }

    @Override
    public void request() {
        legacy.legacyRequest();
    }
}