package HandOnExamples;

public class RegistrationSuccessResponse {
	
	public String Message;
	public String SuccessCode;
	public String FaultId;
	public String fault;
	
	
	/*
	 * public RegistrationSuccessResponse(String Message, String SuccessCode, String
	 * FaultId, String fault) { this.Message=Message; this.SuccessCode=SuccessCode;
	 * this.FaultId=FaultId; this.fault=fault;
	 * 
	 * }
	 */
		       
	    public String getMessage() {
	        return Message;
	    }
	    public void setMessage(String Message) {
	        this.Message = Message;
	    }
	    public String getSuccessCode() {
	        return SuccessCode;
	    }
	    public void setSuccessCode(String SuccessCode) {
	        this.SuccessCode = SuccessCode;
	    }	
	    
	    
	    public String getFault() {
	        return fault;
	    }
	    public void setFault(String fault) {
	        this.fault = fault;
	    }
	    public String getFaultId() {
	        return FaultId;
	    }
	    public void setFaultId(String FaultId) {
	        this.FaultId = FaultId;
	    }	
	

}
