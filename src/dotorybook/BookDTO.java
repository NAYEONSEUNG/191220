package dotorybook;
//DTO가 2번 변수생성 >> 디폴트 메서드 생성 >> 게터세터만들기 >>투스트링
import java.sql.Date;

public class BookDTO {
	    private String bno; 
	    private String bname; 
	    private int price; 
	    private String company; 
	    private String writer; 
	    private Date regdate;
	
	    public BookDTO () {}

		public BookDTO(String bno, String bname, int price, String company, String writer, Date regdate) {
			super();
			this.bno = bno;
			this.bname = bname;
			this.price = price;
			this.company = company;
			this.writer = writer;
			this.regdate = regdate;
		}

		public String getBno() {
			return bno;
		}

		public void setBno(String bno) {
			this.bno = bno;
		}

		public String getBname() {
			return bname;
		}

		public void setBname(String bname) {
			this.bname = bname;
		}

		public int getPrice() {
			return price;
		}

		public void setPrice(int price) {
			this.price = price;
		}

		public String getCompany() {
			return company;
		}

		public void setCompany(String company) {
			this.company = company;
		}

		public String getWriter() {
			return writer;
		}

		public void setWriter(String writer) {
			this.writer = writer;
		}

		public Date getRegdate() {
			return regdate;
		}

		public void setRegdate(Date regdate) {
			this.regdate = regdate;
		}

		//4개가방
		public BookDTO(String bname, int price, String company, String writer) {
			super();
			this.bname = bname;
			this.price = price;
			this.company = company;
			this.writer = writer;
		}

		//5개가방
		public BookDTO(String bno, String bname, int price, String company, String writer) {
			super();
			this.bno = bno;
			this.bname = bname;
			this.price = price;
			this.company = company;
			this.writer = writer;
		}

		@Override
		public String toString() {
			return "BookDTO [bno=" + bno + ", bname=" + bname + ", price=" + price + ", company=" + company
					+ ", writer=" + writer + ", regdate=" + regdate + "]";
		}
	    
	    
	    
}//CLASS
