package com.aem.geeks.core.models;

import javax.inject.Inject;
import org.apache.sling.api.resource.Resource;
import org.apache.sling.models.annotations.DefaultInjectionStrategy;
import org.apache.sling.models.annotations.Model;
import java.util.List;

@Model(adaptables=Resource.class, defaultInjectionStrategy=DefaultInjectionStrategy.OPTIONAL)
public class XeragoFooterModel {
	@Inject
	private String footerLogo;
	
	@Inject
	private List<XeragoFooterList> footerList;

	public String getFooterLogo() {
		return footerLogo;
	}

	public List<XeragoFooterList> getFooterList() {
		return footerList;
	}
}
