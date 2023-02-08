package nj.smallprograms.examples.practice.SmallPrograms;

public class NewBankApplication {

		private int accno;
		private String cname;
		private float salary;
		public NewBankApplication(int accno, String cname, float salary) {
			super();
			this.accno = accno;
			this.cname = cname;
			this.salary = salary;
		}
		public NewBankApplication() {
			super();
			// TODO Auto-generated constructor stub
		}
		public int getAccno() {
			return accno;
		}
		public void setAccno(int accno) {
			this.accno = accno;
		}
		public String getCname() {
			return cname;
		}
		public void setCname(String cname) {
			this.cname = cname;
		}
		public float getSalary() {
			return salary;
		}
		public void setSalary(float salary) {
			this.salary = salary;
		}
		
		
		
		
	

}
