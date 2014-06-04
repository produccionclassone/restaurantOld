package es.classone.restaurant.web.components;

import org.apache.tapestry5.Link;
import org.apache.tapestry5.annotations.Parameter;
import org.apache.tapestry5.annotations.Property;
import org.apache.tapestry5.annotations.SessionState;
import org.apache.tapestry5.ioc.Messages;
import org.apache.tapestry5.ioc.annotations.Inject;
import org.apache.tapestry5.services.PageRenderLinkSource;

import es.classone.restaurant.web.pages.Index;
import es.classone.restaurant.web.util.UserSession;

public class LayoutIndex {

	@Property
	@Parameter(required = true, defaultPrefix = "message")
	private String pageTitle;
	
	@Property
    private String loginName;

    @Property
    @SessionState(create=false)
    private UserSession userSession;
    
	@Inject
	Messages messages;
	@Inject
	private PageRenderLinkSource linkSource;

	public Link getFavouriteLink() {
		Link link = linkSource.createPageRenderLink(Index.class);
		link.addParameterValue("showFavorites", true);
		link.addParameterValue("showHistory", false);
		return link;
	}
	void setupRender() { 
		loginName=userSession.getLoginName();
	}

}