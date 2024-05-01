package com.aem.geeks.core.models;

import javax.inject.Inject;
import org.apache.sling.api.resource.Resource;
import org.apache.sling.models.annotations.DefaultInjectionStrategy;
import org.apache.sling.models.annotations.Model;
import java.util.List;

@Model(adaptables=Resource.class, defaultInjectionStrategy=DefaultInjectionStrategy.OPTIONAL)
public class XeragoHighlightModel {

	@Inject
	private String highHeading;
	
	@Inject
	private String highSubHeading;
	
	@Inject
	private List<XeragoHighlightCards> highCards;

	public String getHighHeading() {
		return highHeading;
	}

	public String getHighSubHeading() {
		return highSubHeading;
	}

	public List<XeragoHighlightCards> getHighCards() {
		return highCards;
	}
}
