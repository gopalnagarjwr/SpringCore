package spring.ref;

public class A {
        private int id;
        private B ob;
		public int getId() {
			return id;
		}
		public void setId(int id) {
			this.id = id;
		}
		public B getOb() {
			return ob;
		}
		public void setOb(B ob) {
			this.ob = ob;
		}
		@Override
		public String toString() {
			return "A [id=" + id + ", ob=" + ob + "]";
		}
        
}
