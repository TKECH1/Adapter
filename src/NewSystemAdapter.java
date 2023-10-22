class NewSystemAdapter implements Adapter {
    private NewSystem newSystem;

    public NewSystemAdapter(NewSystem newSystem) {
        this.newSystem = newSystem;
    }

    @Override
    public void request() {
        newSystem.newRequest();
    }
}