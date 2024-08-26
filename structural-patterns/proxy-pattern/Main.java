/**
 *  The Proxy Pattern is a structural design pattern that allows you to provide 
    a substitute or placeholder for another object. The proxy can control access 
    to the original object, allowing you to perform some actions either before or 
    after the request gets through to the original object.
 */
public class Main {
    public static void main(String[] args) {
        ReconService reconService = new ReconService();
        reconService.startMission();
        
        ReconProxyService reconProxy = new ReconProxyService();
        reconProxy.startMission();
    }
}