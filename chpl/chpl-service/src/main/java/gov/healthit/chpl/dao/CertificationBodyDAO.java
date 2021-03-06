package gov.healthit.chpl.dao;

import gov.healthit.chpl.acb.CertificationBody;

import java.util.List;

public interface CertificationBodyDAO {
	
	public void create(CertificationBody acb);

	public void delete(Long contactId);

	public List<CertificationBody> findAll();

	public CertificationBody getById(Long id);

	public void update(CertificationBody contact);
	
}
