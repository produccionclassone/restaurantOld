package es.classone.restaurant.modelutil.exceptions;

@SuppressWarnings("serial")
public abstract class ConstraintViolationException extends Exception {
	private Object key;
    private String className;
    
    protected ConstraintViolationException(String specificMessage, Object key, 
        String className) {
        
        super(specificMessage + " (key = '" + key + "' - className = '" + 
            className + "')");
        this.key = key;
        this.className = className;
        
    }
    
    public Object getKey() {
        return key;
    }
    
    public String getClassName() {
        return className;
    }

}
