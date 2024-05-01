package com.aem.geeks.core.models;

import javax.inject.Inject;
import org.apache.sling.api.resource.Resource;
import org.apache.sling.models.annotations.DefaultInjectionStrategy;
import org.apache.sling.models.annotations.Model;

@Model(adaptables=Resource.class, defaultInjectionStrategy=DefaultInjectionStrategy.OPTIONAL)
public class XeragoDigitalSub {

	@Inject
	private String innerImage;
	@Inject
	private String subHeading;
	@Inject
	private String description;
	public String getInnerImage() {
		return innerImage;
	}
	public String getSubHeading() {
		return subHeading;
	}
	public String getDescription() {
		return description;
	}
}
