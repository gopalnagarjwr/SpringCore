package spring.constructor;

import java.util.List;

public class Emp {
        private int id;
        private String name;
        private Certi certi;
        private List<Integer> phone;
		public Emp(int id, String name, Certi certi, List<Integer> phone) {
			this.id = id;
			this.name = name;
			this.certi = certi;
			this.phone = phone;
		}
		@Override
		public String toString() {
			return "Emp [id=" + id + ", name=" + name + ", certi=" + certi + ", phone=" + phone + "]";
		}
		  
}
