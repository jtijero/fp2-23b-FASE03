public class Book extends Article {
	String ISBN;
	int copiesAvailable;
	
	public Book(String title) {
		super(title);
		super.setType((byte) 1);
	}
	
	public Book(String code, String title, int pages, int copiesAvailable) {
        	super(code, title, pages);
        	this.copiesAvailable = copiesAvailable;
        	super.setType((byte) 1);
    	}


	public void setISBN(String iSBN) {
		ISBN = iSBN;
	}
	
	public int getCopiesAvailable() {
        	return copiesAvailable;
        }

        public void setCopiesAvailable(int copiesAvailable) {
        	this.copiesAvailable = copiesAvailable;
    	}
	
	
}
