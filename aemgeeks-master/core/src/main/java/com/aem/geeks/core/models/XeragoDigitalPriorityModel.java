package com.aem.geeks.core.models;

import javax.inject.Inject;
import org.apache.sling.api.resource.Resource;
import org.apache.sling.models.annotations.DefaultInjectionStrategy;
import org.apache.sling.models.annotations.Model;
import java.util.List;

@Model(adaptables=Resource.class, defaultInjectionStrategy=DefaultInjectionStrategy.OPTIONAL)
public class XeragoDigitalPriorityModel {

	@Inject
	private String digitalHeading;
	
	@Inject
	private List<XeragoDigitalSub> digitalMultifield;

	public String getDigitalHeading() {
		return digitalHeading;
	}

	public List<XeragoDigitalSub> getDigitalMultifield() {
		return digitalMultifield;
	}

	
}
