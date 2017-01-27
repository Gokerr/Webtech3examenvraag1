package patient;

public class PatientIngevenProxy implements patient.PatientIngeven {
  private String _endpoint = null;
  private patient.PatientIngeven patientIngeven = null;
  
  public PatientIngevenProxy() {
    _initPatientIngevenProxy();
  }
  
  public PatientIngevenProxy(String endpoint) {
    _endpoint = endpoint;
    _initPatientIngevenProxy();
  }
  
  private void _initPatientIngevenProxy() {
    try {
      patientIngeven = (new patient.PatientIngevenServiceLocator()).getPatientIngeven();
      if (patientIngeven != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)patientIngeven)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)patientIngeven)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (patientIngeven != null)
      ((javax.xml.rpc.Stub)patientIngeven)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public patient.PatientIngeven getPatientIngeven() {
    if (patientIngeven == null)
      _initPatientIngevenProxy();
    return patientIngeven;
  }
  
  public java.lang.String Patient(java.lang.String datumuur, java.lang.String naampatient, java.lang.String naamverpleegkundige, java.lang.String geboortedatum, java.lang.String Alergien, java.lang.String diagnose){
    if (patientIngeven == null)
      _initPatientIngevenProxy();
    return patientIngeven.Patient(datumuur, naampatient, naamverpleegkundige, geboortedatum, Alergien, diagnose);
  }
  
  
}