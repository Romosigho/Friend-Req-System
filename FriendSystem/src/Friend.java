package oosdterm1;

public class Friend {
	private String uName;
    private String fCode;
    
    public Friend(String n, String c){
    	super();
        this.uName = n;
        this.fCode = c;
    }
    
    public String getName() {
        return this.uName;
    }
    
    public void setName(String n) {
        this.uName = n;
    }
    
    public String getCode() {
        return this.fCode;
    }
    
    public void setCode(String c) {
        this.fCode = c;
    }
}
