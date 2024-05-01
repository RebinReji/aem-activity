package com.aem.geeks.core.models;

import javax.inject.Inject;
import org.apache.sling.api.resource.Resource;
import org.apache.sling.models.annotations.DefaultInjectionStrategy;
import org.apache.sling.models.annotations.Model;
import java.util.List;

@Model(adaptables=Resource.class, defaultInjectionStrategy=DefaultInjectionStrategy.OPTIONAL)
public class XeragoHeaderModel {



	@Inject
	private String xeragoLogo;
	
	@Inject
	private String talkToButton;
	
	@Inject
	private String talkToButtonUrl;
	
	@Inject
	private String searchIcon;
	
	@Inject
	private List<XeragoHeaderMenu> mainMenu;
	
	public String getXeragoLogo() {
		return xeragoLogo;
	}

	public String getTalkToButton() {
		return talkToButton;
	}

	public String getTalkToButtonUrl() {
		return talkToButtonUrl;
	}

	public String getSearchIcon() {
		return searchIcon;
	}

	public List<XeragoHeaderMenu> getMainMenu() {
		return mainMenu;
	}
}
