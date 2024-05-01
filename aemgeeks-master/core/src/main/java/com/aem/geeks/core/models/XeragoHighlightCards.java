package com.aem.geeks.core.models;

import javax.inject.Inject;
import org.apache.sling.api.resource.Resource;
import org.apache.sling.models.annotations.DefaultInjectionStrategy;
import org.apache.sling.models.annotations.Model;

@Model(adaptables=Resource.class, defaultInjectionStrategy=DefaultInjectionStrategy.OPTIONAL)
public class XeragoHighlightCards {

	@Inject
	private String highCardTitle;
	
	@Inject
	private String highCardDes;
	
	@Inject
	private String highMore;

	public String getHighCardTitle() {
		return highCardTitle;
	}

	public String getHighCardDes() {
		return highCardDes;
	}

	public String getHighMore() {
		return highMore;
	}
}
