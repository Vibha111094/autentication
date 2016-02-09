/**
 * HelloagainServiceLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package DefaultNamespace;

public class HelloagainServiceLocator extends org.apache.axis.client.Service implements DefaultNamespace.HelloagainService {

    public HelloagainServiceLocator() {
    }


    public HelloagainServiceLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public HelloagainServiceLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for Helloagain
    private java.lang.String Helloagain_address = "http://localhost:8088/Helloagain/services/Helloagain";

    public java.lang.String getHelloagainAddress() {
        return Helloagain_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String HelloagainWSDDServiceName = "Helloagain";

    public java.lang.String getHelloagainWSDDServiceName() {
        return HelloagainWSDDServiceName;
    }

    public void setHelloagainWSDDServiceName(java.lang.String name) {
        HelloagainWSDDServiceName = name;
    }

    public DefaultNamespace.Helloagain getHelloagain() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(Helloagain_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getHelloagain(endpoint);
    }

    public DefaultNamespace.Helloagain getHelloagain(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            DefaultNamespace.HelloagainSoapBindingStub _stub = new DefaultNamespace.HelloagainSoapBindingStub(portAddress, this);
            _stub.setPortName(getHelloagainWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setHelloagainEndpointAddress(java.lang.String address) {
        Helloagain_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (DefaultNamespace.Helloagain.class.isAssignableFrom(serviceEndpointInterface)) {
                DefaultNamespace.HelloagainSoapBindingStub _stub = new DefaultNamespace.HelloagainSoapBindingStub(new java.net.URL(Helloagain_address), this);
                _stub.setPortName(getHelloagainWSDDServiceName());
                return _stub;
            }
        }
        catch (java.lang.Throwable t) {
            throw new javax.xml.rpc.ServiceException(t);
        }
        throw new javax.xml.rpc.ServiceException("There is no stub implementation for the interface:  " + (serviceEndpointInterface == null ? "null" : serviceEndpointInterface.getName()));
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(javax.xml.namespace.QName portName, Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        if (portName == null) {
            return getPort(serviceEndpointInterface);
        }
        java.lang.String inputPortName = portName.getLocalPart();
        if ("Helloagain".equals(inputPortName)) {
            return getHelloagain();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("http://DefaultNamespace", "HelloagainService");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("http://DefaultNamespace", "Helloagain"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("Helloagain".equals(portName)) {
            setHelloagainEndpointAddress(address);
        }
        else 
{ // Unknown Port Name
            throw new javax.xml.rpc.ServiceException(" Cannot set Endpoint Address for Unknown Port" + portName);
        }
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(javax.xml.namespace.QName portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        setEndpointAddress(portName.getLocalPart(), address);
    }

}
