package com.iemr.mmu.data.neonatal;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import com.google.gson.annotations.Expose;
@Entity
@Table(name = "m_immunizationservicestype")
public class TypeOfImmunizationMasterData {
	
	@Id
	@GeneratedValue
	@Expose
	@Column(name = "id")
	private Integer id;
	
	@Expose
	@Column(name = "Name")
	private String name;
	
	@Column(name = "Deleted")
	private Boolean deleted;

}