package com.aem.geeks.core.models;

import javax.inject.Inject;
import org.apache.sling.api.resource.Resource;
import org.apache.sling.models.annotations.DefaultInjectionStrategy;
import org.apache.sling.models.annotations.Model;
import java.util.List;

@Model(adaptables=Resource.class, defaultInjectionStrategy=DefaultInjectionStrategy.OPTIONAL)
public class XeragoFooterList {
	@Inject
	private String footerHeading;
	
	@Inject
	private List<XeragoFooterSubList> footerSubList;

	public String getFooterHeading() {
		return footerHeading;
	}

	public List<XeragoFooterSubList> getFooterSubList() {
		return footerSubList;
	}
}
