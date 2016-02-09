package DefaultNamespace;

public class HellProxy implements DefaultNamespace.Hell {
  private String _endpoint = null;
  private DefaultNamespace.Hell hell = null;
  
  public HellProxy() {
    _initHellProxy();
  }
  
  public HellProxy(String endpoint) {
    _endpoint = endpoint;
    _initHellProxy();
  }
  
  private void _initHellProxy() {
    try {
      hell = (new DefaultNamespace.HellServiceLocator()).getHell();
      if (hell != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)hell)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)hell)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (hell != null)
      ((javax.xml.rpc.Stub)hell)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public DefaultNamespace.Hell getHell() {
    if (hell == null)
      _initHellProxy();
    return hell;
  }
  
  public java.lang.String helloName(java.lang.String name) throws java.rmi.RemoteException{
    if (hell == null)
      _initHellProxy();
    return hell.helloName(name);
  }
  
  
}