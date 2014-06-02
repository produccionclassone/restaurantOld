package es.classone.restaurant.web.components;

import org.apache.tapestry5.Link;
import org.apache.tapestry5.annotations.Parameter;
import org.apache.tapestry5.annotations.Property;
import org.apache.tapestry5.ioc.annotations.Inject;
import org.apache.tapestry5.services.PageRenderLinkSource;

import es.classone.restaurant.web.pages.Index;

public class LayoutIndex {

	@Property
	@Parameter(required = true, defaultPrefix = "message")
	private String pageTitle;

	@Inject
	private PageRenderLinkSource linkSource;
	
	public Link getFavouriteLink(){
		Link link = linkSource.createPageRenderLink(Index.class);
		link.addParameterValue("showFavorites", true);
		link.addParameterValue("showHistory", false);
		return link;
	}

	

}