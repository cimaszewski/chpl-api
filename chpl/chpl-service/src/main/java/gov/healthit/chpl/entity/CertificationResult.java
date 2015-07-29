package gov.healthit.chpl.entity;

import gov.healthit.chpl.entity.OptionalFunctionalityMet;
import gov.healthit.chpl.entity.StandardsMet;
import java.io.Serializable;
import java.util.Collections;
import java.util.Date;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.WeakHashMap;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.persistence.Transient;
import org.hibernate.proxy.HibernateProxy;


/** 
 * Object mapping for hibernate-handled table: certification_result.
 * 
 *
 * @author autogenerated
 */

@Entity
@Table(name = "certification_result", catalog = "openchpl", schema = "openchpl")
public class CertificationResult implements Cloneable, Serializable {

	/** Serial Version UID. */
	private static final long serialVersionUID = -9050374846030066967L;

	/** Use a WeakHashMap so entries will be garbage collected once all entities 
		referring to a saved hash are garbage collected themselves. */
	private static final Map<Serializable, Long> SAVED_HASHES =
		Collections.synchronizedMap(new WeakHashMap<Serializable, Long>());
	
	/** hashCode temporary storage. */
	private volatile Long hashCode;
	

	/** Field mapping. */
	private Boolean automatedMeasureCapable;
	/** Field mapping. */
	private Boolean automatedNumerator;
	/** Field mapping. */
	private CertificationCriterion certificationCriterion;
	/** Field mapping. */
	private CertifiedProduct certifiedProduct;
	/** Field mapping. */
	private Date creationDate;
	/** Field mapping. */
	private Boolean deleted;
	/** Field mapping. */
	private Boolean gap;
	/** Field mapping. */
	private Long id;
	/** Field mapping. */
	private Boolean inherited;
	/** Field mapping. */
	private Date lastModifiedDate;
	/** Field mapping. */
	private Long lastModifiedUser;
	/** Field mapping. */
	private Set<OptionalFunctionalityMet> optionalFunctionalityMets = new HashSet<OptionalFunctionalityMet>();

	/** Field mapping. */
	private Boolean sedInherited;
	/** Field mapping. */
	private Boolean sedSuccessful;
	/** Field mapping. */
	private Set<StandardsMet> standardsMet = new HashSet<StandardsMet>();

	/** Field mapping. */
	private Boolean successful;
	/** Field mapping. */
	private TestDataVersion testDataVersion;
	/** Field mapping. */
	private TestProcedureVersion testProcedureVersion;
	/**
	 * Default constructor, mainly for hibernate use.
	 */
	public CertificationResult() {
		// Default constructor
	} 

	/** Constructor taking a given ID.
	 * @param id to set
	 */
	public CertificationResult(Long id) {
		this.id = id;
	}
	
	/** Constructor taking a given ID.
	 * @param certificationCriterion CertificationCriterion object;
	 * @param certifiedProduct CertifiedProduct object;
	 * @param creationDate Date object;
	 * @param deleted Boolean object;
	 * @param id Long object;
	 * @param lastModifiedDate Date object;
	 * @param lastModifiedUser Long object;
	 * @param successful Boolean object;
	 */
	public CertificationResult(CertificationCriterion certificationCriterion, CertifiedProduct certifiedProduct, Date creationDate, 					
			Boolean deleted, Long id, Date lastModifiedDate, 					
			Long lastModifiedUser, Boolean successful) {

		this.certificationCriterion = certificationCriterion;
		this.certifiedProduct = certifiedProduct;
		this.creationDate = creationDate;
		this.deleted = deleted;
		this.id = id;
		this.lastModifiedDate = lastModifiedDate;
		this.lastModifiedUser = lastModifiedUser;
		this.successful = successful;
	}
	
 


 
	/** Return the type of this class. Useful for when dealing with proxies.
	* @return Defining class.
	*/
	@Transient
	public Class<?> getClassType() {
		return CertificationResult.class;
	}
 

	 /**
	 * Return the value associated with the column: automatedMeasureCapable.
	 * @return A Boolean object (this.automatedMeasureCapable)
	 */
	@Basic( optional = true )
	@Column( name = "automated_measure_capable"  )
	public Boolean isAutomatedMeasureCapable() {
		return this.automatedMeasureCapable;
		
	}
	

  
	 /**  
	 * Set the value related to the column: automatedMeasureCapable.
	 * @param automatedMeasureCapable the automatedMeasureCapable value you wish to set
	 */
	public void setAutomatedMeasureCapable(final Boolean automatedMeasureCapable) {
		this.automatedMeasureCapable = automatedMeasureCapable;
	}

	 /**
	 * Return the value associated with the column: automatedNumerator.
	 * @return A Boolean object (this.automatedNumerator)
	 */
	@Basic( optional = true )
	@Column( name = "automated_numerator"  )
	public Boolean isAutomatedNumerator() {
		return this.automatedNumerator;
		
	}
	

  
	 /**  
	 * Set the value related to the column: automatedNumerator.
	 * @param automatedNumerator the automatedNumerator value you wish to set
	 */
	public void setAutomatedNumerator(final Boolean automatedNumerator) {
		this.automatedNumerator = automatedNumerator;
	}

	 /**
	 * Return the value associated with the column: certificationCriterion.
	 * @return A CertificationCriterion object (this.certificationCriterion)
	 */
	@ManyToOne( cascade = { CascadeType.PERSIST, CascadeType.MERGE }, fetch = FetchType.LAZY )
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.SAVE_UPDATE})
	@Basic( optional = false )
	@JoinColumn(name = "certification_criterion_id", nullable = false )
	public CertificationCriterion getCertificationCriterion() {
		return this.certificationCriterion;
		
	}
	

  
	 /**  
	 * Set the value related to the column: certificationCriterion.
	 * @param certificationCriterion the certificationCriterion value you wish to set
	 */
	public void setCertificationCriterion(final CertificationCriterion certificationCriterion) {
		this.certificationCriterion = certificationCriterion;
	}

	 /**
	 * Return the value associated with the column: certifiedProduct.
	 * @return A CertifiedProduct object (this.certifiedProduct)
	 */
	@ManyToOne( cascade = { CascadeType.PERSIST, CascadeType.MERGE }, fetch = FetchType.LAZY )
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.SAVE_UPDATE})
	@Basic( optional = false )
	@JoinColumn(name = "certified_product_id", nullable = false )
	public CertifiedProduct getCertifiedProduct() {
		return this.certifiedProduct;
		
	}
	

  
	 /**  
	 * Set the value related to the column: certifiedProduct.
	 * @param certifiedProduct the certifiedProduct value you wish to set
	 */
	public void setCertifiedProduct(final CertifiedProduct certifiedProduct) {
		this.certifiedProduct = certifiedProduct;
	}

	 /**
	 * Return the value associated with the column: creationDate.
	 * @return A Date object (this.creationDate)
	 */
	@Basic( optional = false )
	@Column( name = "creation_date", nullable = false  )
	public Date getCreationDate() {
		return this.creationDate;
		
	}
	

  
	 /**  
	 * Set the value related to the column: creationDate.
	 * @param creationDate the creationDate value you wish to set
	 */
	public void setCreationDate(final Date creationDate) {
		this.creationDate = creationDate;
	}

	 /**
	 * Return the value associated with the column: deleted.
	 * @return A Boolean object (this.deleted)
	 */
	@Basic( optional = false )
	@Column( nullable = false  )
	public Boolean isDeleted() {
		return this.deleted;
		
	}
	

  
	 /**  
	 * Set the value related to the column: deleted.
	 * @param deleted the deleted value you wish to set
	 */
	public void setDeleted(final Boolean deleted) {
		this.deleted = deleted;
	}

	 /**
	 * Return the value associated with the column: gap.
	 * @return A Boolean object (this.gap)
	 */
	public Boolean isGap() {
		return this.gap;
		
	}
	

  
	 /**  
	 * Set the value related to the column: gap.
	 * @param gap the gap value you wish to set
	 */
	public void setGap(final Boolean gap) {
		this.gap = gap;
	}

	 /**
	 * Return the value associated with the column: id.
	 * @return A Long object (this.id)
	 */
    @Id 
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "certificationResultCertification_result_idGenerator")
	@Basic( optional = false )
	@Column( name = "certification_result_id", nullable = false  )
	@SequenceGenerator(name = "certificationResultCertification_result_idGenerator", sequenceName = "openchpl.openchpl.certification_result_certification_result_id_seq", schema = "openchpl", catalog = "openchpl")
	public Long getId() {
		return this.id;
		
	}
	

  
	 /**  
	 * Set the value related to the column: id.
	 * @param id the id value you wish to set
	 */
	public void setId(final Long id) {
		// If we've just been persisted and hashCode has been
		// returned then make sure other entities with this
		// ID return the already returned hash code
		if ( (this.id == null || this.id == 0L) &&
				(id != null) &&
				(this.hashCode != null) ) {
		SAVED_HASHES.put( id, this.hashCode );
		}
		this.id = id;
	}

	 /**
	 * Return the value associated with the column: inherited.
	 * @return A Boolean object (this.inherited)
	 */
	public Boolean isInherited() {
		return this.inherited;
		
	}
	

  
	 /**  
	 * Set the value related to the column: inherited.
	 * @param inherited the inherited value you wish to set
	 */
	public void setInherited(final Boolean inherited) {
		this.inherited = inherited;
	}

	 /**
	 * Return the value associated with the column: lastModifiedDate.
	 * @return A Date object (this.lastModifiedDate)
	 */
	@Basic( optional = false )
	@Column( name = "last_modified_date", nullable = false  )
	public Date getLastModifiedDate() {
		return this.lastModifiedDate;
		
	}
	

  
	 /**  
	 * Set the value related to the column: lastModifiedDate.
	 * @param lastModifiedDate the lastModifiedDate value you wish to set
	 */
	public void setLastModifiedDate(final Date lastModifiedDate) {
		this.lastModifiedDate = lastModifiedDate;
	}

	 /**
	 * Return the value associated with the column: lastModifiedUser.
	 * @return A Long object (this.lastModifiedUser)
	 */
	@Basic( optional = false )
	@Column( name = "last_modified_user", nullable = false  )
	public Long getLastModifiedUser() {
		return this.lastModifiedUser;
		
	}
	

  
	 /**  
	 * Set the value related to the column: lastModifiedUser.
	 * @param lastModifiedUser the lastModifiedUser value you wish to set
	 */
	public void setLastModifiedUser(final Long lastModifiedUser) {
		this.lastModifiedUser = lastModifiedUser;
	}

	 /**
	 * Return the value associated with the column: optionalFunctionalityMet.
	 * @return A Set&lt;OptionalFunctionalityMet&gt; object (this.optionalFunctionalityMet)
	 */
 	@OneToMany( fetch = FetchType.LAZY, cascade = { CascadeType.PERSIST, CascadeType.MERGE }, mappedBy = "certificationResult"  )
 	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.SAVE_UPDATE})
	@Basic( optional = false )
	@Column( name = "certification_result_id", nullable = false  )
	public Set<OptionalFunctionalityMet> getOptionalFunctionalityMets() {
		return this.optionalFunctionalityMets;
		
	}
	
	/**
	 * Adds a bi-directional link of type OptionalFunctionalityMet to the optionalFunctionalityMets set.
	 * @param optionalFunctionalityMet item to add
	 */
	public void addOptionalFunctionalityMet(OptionalFunctionalityMet optionalFunctionalityMet) {
		optionalFunctionalityMet.setCertificationResult(this);
		this.optionalFunctionalityMets.add(optionalFunctionalityMet);
	}

  
	 /**  
	 * Set the value related to the column: optionalFunctionalityMet.
	 * @param optionalFunctionalityMet the optionalFunctionalityMet value you wish to set
	 */
	public void setOptionalFunctionalityMets(final Set<OptionalFunctionalityMet> optionalFunctionalityMet) {
		this.optionalFunctionalityMets = optionalFunctionalityMet;
	}

	 /**
	 * Return the value associated with the column: sedInherited.
	 * @return A Boolean object (this.sedInherited)
	 */
	@Basic( optional = true )
	@Column( name = "sed_inherited"  )
	public Boolean isSedInherited() {
		return this.sedInherited;
		
	}
	

  
	 /**  
	 * Set the value related to the column: sedInherited.
	 * @param sedInherited the sedInherited value you wish to set
	 */
	public void setSedInherited(final Boolean sedInherited) {
		this.sedInherited = sedInherited;
	}

	 /**
	 * Return the value associated with the column: sedSuccessful.
	 * @return A Boolean object (this.sedSuccessful)
	 */
	@Basic( optional = true )
	@Column( name = "sed_successful"  )
	public Boolean isSedSuccessful() {
		return this.sedSuccessful;
		
	}
	

  
	 /**  
	 * Set the value related to the column: sedSuccessful.
	 * @param sedSuccessful the sedSuccessful value you wish to set
	 */
	public void setSedSuccessful(final Boolean sedSuccessful) {
		this.sedSuccessful = sedSuccessful;
	}

	 /**
	 * Return the value associated with the column: standardsMet.
	 * @return A Set&lt;StandardsMet&gt; object (this.standardsMet)
	 */
 	@OneToMany( fetch = FetchType.LAZY, cascade = { CascadeType.PERSIST, CascadeType.MERGE }, mappedBy = "certificationResult"  )
 	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.SAVE_UPDATE})
	@Basic( optional = false )
	@Column( name = "certification_result_id", nullable = false  )
	public Set<StandardsMet> getStandardsMets() {
		return this.standardsMet;
		
	}
	
	/**
	 * Adds a bi-directional link of type StandardsMet to the standardsMets set.
	 * @param standardsMet item to add
	 */
	public void addStandardsMet(StandardsMet standardsMet) {
		standardsMet.setCertificationResult(this);
		this.standardsMet.add(standardsMet);
	}

  
	 /**  
	 * Set the value related to the column: standardsMet.
	 * @param standardsMet the standardsMet value you wish to set
	 */
	public void setStandardsMet(final Set<StandardsMet> standardsMet) {
		this.standardsMet = standardsMet;
	}

	 /**
	 * Return the value associated with the column: successful.
	 * @return A Boolean object (this.successful)
	 */
	@Basic( optional = false )
	@Column( nullable = false  )
	public Boolean isSuccessful() {
		return this.successful;
		
	}
	

  
	 /**  
	 * Set the value related to the column: successful.
	 * @param successful the successful value you wish to set
	 */
	public void setSuccessful(final Boolean successful) {
		this.successful = successful;
	}

	 /**
	 * Return the value associated with the column: testDataVersion.
	 * @return A TestDataVersion object (this.testDataVersion)
	 */
	@ManyToOne( cascade = { CascadeType.PERSIST, CascadeType.MERGE }, fetch = FetchType.LAZY )
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.SAVE_UPDATE})
	@Basic( optional = true )
	@JoinColumn(name = "test_data_version_id", nullable = true )
	public TestDataVersion getTestDataVersion() {
		return this.testDataVersion;
		
	}
	

  
	 /**  
	 * Set the value related to the column: testDataVersion.
	 * @param testDataVersion the testDataVersion value you wish to set
	 */
	public void setTestDataVersion(final TestDataVersion testDataVersion) {
		this.testDataVersion = testDataVersion;
	}

	 /**
	 * Return the value associated with the column: testProcedureVersion.
	 * @return A TestProcedureVersion object (this.testProcedureVersion)
	 */
	@ManyToOne( cascade = { CascadeType.PERSIST, CascadeType.MERGE }, fetch = FetchType.LAZY )
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.SAVE_UPDATE})
	@Basic( optional = true )
	@JoinColumn(name = "test_procedure_version_id", nullable = true )
	public TestProcedureVersion getTestProcedureVersion() {
		return this.testProcedureVersion;
		
	}
	

  
	 /**  
	 * Set the value related to the column: testProcedureVersion.
	 * @param testProcedureVersion the testProcedureVersion value you wish to set
	 */
	public void setTestProcedureVersion(final TestProcedureVersion testProcedureVersion) {
		this.testProcedureVersion = testProcedureVersion;
	}


   /**
    * Deep copy.
	* @return cloned object
	* @throws CloneNotSupportedException on error
    */
    @Override
    public CertificationResult clone() throws CloneNotSupportedException {
		
        final CertificationResult copy = (CertificationResult)super.clone();

		copy.setAutomatedMeasureCapable(this.isAutomatedMeasureCapable());
		copy.setAutomatedNumerator(this.isAutomatedNumerator());
		copy.setCertificationCriterion(this.getCertificationCriterion());
		copy.setCertifiedProduct(this.getCertifiedProduct());
		copy.setCreationDate(this.getCreationDate());
		copy.setDeleted(this.isDeleted());
		copy.setGap(this.isGap());
		copy.setId(this.getId());
		copy.setInherited(this.isInherited());
		copy.setLastModifiedDate(this.getLastModifiedDate());
		copy.setLastModifiedUser(this.getLastModifiedUser());
		if (this.getOptionalFunctionalityMets() != null) {
			copy.getOptionalFunctionalityMets().addAll(this.getOptionalFunctionalityMets());
		}
		copy.setSedInherited(this.isSedInherited());
		copy.setSedSuccessful(this.isSedSuccessful());
		if (this.getStandardsMets() != null) {
			copy.getStandardsMets().addAll(this.getStandardsMets());
		}
		copy.setSuccessful(this.isSuccessful());
		copy.setTestDataVersion(this.getTestDataVersion());
		copy.setTestProcedureVersion(this.getTestProcedureVersion());
		return copy;
	}
	


	/** Provides toString implementation.
	 * @see java.lang.Object#toString()
	 * @return String representation of this class.
	 */
	@Override
	public String toString() {
		StringBuffer sb = new StringBuffer();
		
		sb.append("automatedMeasureCapable: " + this.isAutomatedMeasureCapable() + ", ");
		sb.append("automatedNumerator: " + this.isAutomatedNumerator() + ", ");
		sb.append("creationDate: " + this.getCreationDate() + ", ");
		sb.append("deleted: " + this.isDeleted() + ", ");
		sb.append("gap: " + this.isGap() + ", ");
		sb.append("id: " + this.getId() + ", ");
		sb.append("inherited: " + this.isInherited() + ", ");
		sb.append("lastModifiedDate: " + this.getLastModifiedDate() + ", ");
		sb.append("lastModifiedUser: " + this.getLastModifiedUser() + ", ");
		sb.append("sedInherited: " + this.isSedInherited() + ", ");
		sb.append("sedSuccessful: " + this.isSedSuccessful() + ", ");
		sb.append("successful: " + this.isSuccessful() + ", ");
		return sb.toString();		
	}


	/** Equals implementation. 
	 * @see java.lang.Object#equals(java.lang.Object)
	 * @param aThat Object to compare with
	 * @return true/false
	 */
	@Override
	public boolean equals(final Object aThat) {
		Object proxyThat = aThat;
		
		if ( this == aThat ) {
			 return true;
		}

		
		if (aThat instanceof HibernateProxy) {
 			// narrow down the proxy to the class we are dealing with.
 			try {
				proxyThat = ((HibernateProxy) aThat).getHibernateLazyInitializer().getImplementation(); 
			} catch (org.hibernate.ObjectNotFoundException e) {
				return false;
		   	}
		}
		if (aThat == null)  {
			 return false;
		}
		
		final CertificationResult that; 
		try {
			that = (CertificationResult) proxyThat;
			if ( !(that.getClassType().equals(this.getClassType()))){
				return false;
			}
		} catch (org.hibernate.ObjectNotFoundException e) {
				return false;
		} catch (ClassCastException e) {
				return false;
		}
		
		
		boolean result = true;
		result = result && (((this.getId() == null) && ( that.getId() == null)) || (this.getId() != null  && this.getId().equals(that.getId())));
		result = result && (((isAutomatedMeasureCapable() == null) && (that.isAutomatedMeasureCapable() == null)) || (isAutomatedMeasureCapable() != null && isAutomatedMeasureCapable().equals(that.isAutomatedMeasureCapable())));
		result = result && (((isAutomatedNumerator() == null) && (that.isAutomatedNumerator() == null)) || (isAutomatedNumerator() != null && isAutomatedNumerator().equals(that.isAutomatedNumerator())));
		result = result && (((getCertificationCriterion() == null) && (that.getCertificationCriterion() == null)) || (getCertificationCriterion() != null && getCertificationCriterion().getId().equals(that.getCertificationCriterion().getId())));	
		result = result && (((getCertifiedProduct() == null) && (that.getCertifiedProduct() == null)) || (getCertifiedProduct() != null && getCertifiedProduct().getId().equals(that.getCertifiedProduct().getId())));	
		result = result && (((getCreationDate() == null) && (that.getCreationDate() == null)) || (getCreationDate() != null && getCreationDate().equals(that.getCreationDate())));
		result = result && (((isDeleted() == null) && (that.isDeleted() == null)) || (isDeleted() != null && isDeleted().equals(that.isDeleted())));
		result = result && (((isGap() == null) && (that.isGap() == null)) || (isGap() != null && isGap().equals(that.isGap())));
		result = result && (((isInherited() == null) && (that.isInherited() == null)) || (isInherited() != null && isInherited().equals(that.isInherited())));
		result = result && (((getLastModifiedDate() == null) && (that.getLastModifiedDate() == null)) || (getLastModifiedDate() != null && getLastModifiedDate().equals(that.getLastModifiedDate())));
		result = result && (((getLastModifiedUser() == null) && (that.getLastModifiedUser() == null)) || (getLastModifiedUser() != null && getLastModifiedUser().equals(that.getLastModifiedUser())));
		result = result && (((isSedInherited() == null) && (that.isSedInherited() == null)) || (isSedInherited() != null && isSedInherited().equals(that.isSedInherited())));
		result = result && (((isSedSuccessful() == null) && (that.isSedSuccessful() == null)) || (isSedSuccessful() != null && isSedSuccessful().equals(that.isSedSuccessful())));
		result = result && (((isSuccessful() == null) && (that.isSuccessful() == null)) || (isSuccessful() != null && isSuccessful().equals(that.isSuccessful())));
		result = result && (((getTestDataVersion() == null) && (that.getTestDataVersion() == null)) || (getTestDataVersion() != null && getTestDataVersion().getId().equals(that.getTestDataVersion().getId())));	
		result = result && (((getTestProcedureVersion() == null) && (that.getTestProcedureVersion() == null)) || (getTestProcedureVersion() != null && getTestProcedureVersion().getId().equals(that.getTestProcedureVersion().getId())));	
		return result;
	}
	
	/** Calculate the hashcode.
	 * @see java.lang.Object#hashCode()
	 * @return a calculated number
	 */
	@Override
	public int hashCode() {
		if ( this.hashCode == null ) {
			synchronized ( this ) {
				if ( this.hashCode == null ) {
					Long newHashCode = null;

					if ( getId() != null ) {
					newHashCode = SAVED_HASHES.get( getId() );
					}
					
					if ( newHashCode == null ) {
						if ( getId() != null && getId() != 0L) {
							newHashCode = getId();
						} else {
							newHashCode = (long) super.hashCode();

						}
					}
					
					this.hashCode = newHashCode;
				}
			}
		}
		return (int) (this.hashCode & 0xffffff);
	}
	

	
}
