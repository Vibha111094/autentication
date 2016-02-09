package DefaultNamespace;

public class HelloagainProxy implements DefaultNamespace.Helloagain {
  private String _endpoint = null;
  private DefaultNamespace.Helloagain helloagain = null;
  
  public HelloagainProxy() {
    _initHelloagainProxy();
  }
  
  public HelloagainProxy(String endpoint) {
    _endpoint = endpoint;
    _initHelloagainProxy();
  }
  
  private void _initHelloagainProxy() {
    try {
      helloagain = (new DefaultNamespace.HelloagainServiceLocator()).getHelloagain();
      if (helloagain != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)helloagain)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)helloagain)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (helloagain != null)
      ((javax.xml.rpc.Stub)helloagain)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public DefaultNamespace.Helloagain getHelloagain() {
    if (helloagain == null)
      _initHelloagainProxy();
    return helloagain;
  }
  
  public java.lang.String helloName(java.lang.String name) throws java.rmi.RemoteException{
    if (helloagain == null)
      _initHelloagainProxy();
    return helloagain.helloName(name);
  }
  
  
}