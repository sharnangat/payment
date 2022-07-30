package com.payment.system.Account.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="departments")
public class Deparments {

	    @Id
	    @GeneratedValue(strategy=GenerationType.AUTO)
	    private Long id;
	    
	    
	    @Column(name="dept_no", length=4, nullable=false, unique=false)
	    private String dept_no;
	    
	    
	    @Column(name="dept_name", length=40, nullable=false, unique=false)
	    private String dept_name;


		public String getDept_no() {
			return dept_no;
		}


		public void setDept_no(String dept_no) {
			this.dept_no = dept_no;
		}


		public String getDept_name() {
			return dept_name;
		}


		public void setDept_name(String dept_name) {
			this.dept_name = dept_name;
		}
	    
}
