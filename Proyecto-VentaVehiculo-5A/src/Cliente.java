public class Cliente {
    private String rs;
    private String rfc;
    private String email;
    
    public Cliente(String rs, String rfc, String email) {
        this.rs = rs;
        this.rfc = rfc;
        this.email = email;
    }
    
    public String getRS() {
        return this.rs;
    }
    
    public String getRFC() {
        return this.rfc;
    }
    
    public String getEmail() {
        return this.email;
    }
    
    public void setRS(String rs) {
        this.rs = rs;
    }
    
    public void setRFC(String rfc) {
        this.rfc = rfc;
    }
    
    public void setEmail(String email) {
        this.email = email;
    }
    
    @Override
    public String toString() {
        return "Razon Social " + this.rs + "\n" + 
               "RFC " + this.rfc + "\n" + 
               "Email " + this.email  + "\n";
    }   
}
