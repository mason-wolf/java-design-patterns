public class Network implements NetworkFacade {

    private Router router1;
    private Switch switch1;

    @Override
    public void startDevices() {
        router1 = new Router("router 1");
        switch1 = new Switch("switch 1");
        router1.start();
        switch1.start();
    }

    @Override
    public void getDevices() {
        System.out.println(router1.getDeviceName() + " online");
        System.out.println(switch1.getDeviceName() + " online");
    }
}
