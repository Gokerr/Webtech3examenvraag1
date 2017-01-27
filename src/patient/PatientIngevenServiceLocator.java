/**
 * PatientIngevenServiceLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package patient;

public class PatientIngevenServiceLocator extends org.apache.axis.client.Service implements patient.PatientIngevenService {

    public PatientIngevenServiceLocator() {
    }


    public PatientIngevenServiceLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public PatientIngevenServiceLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for PatientIngeven
    private java.lang.String PatientIngeven_address = "http://localhost:8080/Webtech3examenvraag1/services/PatientIngeven";

    public java.lang.String getPatientIngevenAddress() {
        return PatientIngeven_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String PatientIngevenWSDDServiceName = "PatientIngeven";

    public java.lang.String getPatientIngevenWSDDServiceName() {
        return PatientIngevenWSDDServiceName;
    }

    public void setPatientIngevenWSDDServiceName(java.lang.String name) {
        PatientIngevenWSDDServiceName = name;
    }

    public patient.PatientIngeven getPatientIngeven() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(PatientIngeven_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getPatientIngeven(endpoint);
    }

    public patient.PatientIngeven getPatientIngeven(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            patient.PatientIngevenSoapBindingStub _stub = new patient.PatientIngevenSoapBindingStub(portAddress, this);
            _stub.setPortName(getPatientIngevenWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setPatientIngevenEndpointAddress(java.lang.String address) {
        PatientIngeven_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (patient.PatientIngeven.class.isAssignableFrom(serviceEndpointInterface)) {
                patient.PatientIngevenSoapBindingStub _stub = new patient.PatientIngevenSoapBindingStub(new java.net.URL(PatientIngeven_address), this);
                _stub.setPortName(getPatientIngevenWSDDServiceName());
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
        if ("PatientIngeven".equals(inputPortName)) {
            return getPatientIngeven();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("http://patient", "PatientIngevenService");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("http://patient", "PatientIngeven"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("PatientIngeven".equals(portName)) {
            setPatientIngevenEndpointAddress(address);
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
