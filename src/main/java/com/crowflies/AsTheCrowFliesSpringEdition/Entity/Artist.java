package com.crowflies.AsTheCrowFliesSpringEdition.Entity;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.sun.istack.internal.NotNull;

@Entity
@Table(name="artist")
public class Artist {
	
	
		
		@Id
		@GeneratedValue(strategy=GenerationType.IDENTITY)
		@Column(name="Artist_ID")
		private int id;
		
		@NotNull
		@Column(name="Artist_Name")
		private String name;
		
		@NotNull
		@Column(name="Start_Year_Active")
		private String start;
		
		@Column(name="End_Year_Active")
		private String end;
		
		@OneToMany(fetch=FetchType.LAZY, cascade=CascadeType.ALL)
		@JoinColumn(name="Album_ID")
		private List<Album> albums;
		
		
		public Artist(){
			
		}

		public int getId() {
			return id;
		}

		public void setId(int id) {
			this.id = id;
		}

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public String getStart() {
			return start;
		}

		public void setStart(String start) {
			this.start = start;
		}

		public String getEnd() {
			return end;
		}

		public void setEnd(String end) {
			this.end = end;
		}

}
