package es.classone.restaurant.web.pages;

import java.util.List;

import org.apache.tapestry5.ComponentResources;
import org.apache.tapestry5.annotations.Import;
import org.apache.tapestry5.annotations.Property;
import org.apache.tapestry5.annotations.SessionState;
import org.apache.tapestry5.ioc.Messages;
import org.apache.tapestry5.ioc.annotations.Inject;
import org.apache.tapestry5.json.JSONArray;
import org.apache.tapestry5.json.JSONObject;
import org.apache.tapestry5.services.Request;
import org.apache.tapestry5.services.javascript.JavaScriptSupport;

import es.classone.restaurant.model.favorite.Favorite;
import es.classone.restaurant.model.userservice.UserService;
import es.classone.restaurant.web.services.AuthenticationPolicy;
import es.classone.restaurant.web.services.AuthenticationPolicyType;
import es.classone.restaurant.web.util.MapApp;
import es.classone.restaurant.web.util.Option;
import es.classone.restaurant.web.util.UserSession;

@AuthenticationPolicy(AuthenticationPolicyType.AUTHENTICATED_USERS)
@Import(library = { "context:javaScript/menu.js" })
public class Index {

	@Inject
	private Messages messages;

	@Inject
	private JavaScriptSupport javaScriptSupport;

	@Inject
	private ComponentResources componentResources;

	@Inject
	private UserService userService;

	@SessionState(create = false)
	private UserSession userSession;

	private String changeFavorites;

	private MapApp map = MapApp.getInstance();
	@Property
	private List<Option> options;
	@Property
	private Option option;
	@Property
	private Option suboption;
	@Inject
	Request request;
	
	void setupRender() {

		map.setOptionName("1", messages.get("option1"));
		map.setOptionName("2", messages.get("option2"));
		map.setOptionName("3", messages.get("option3"));
		map.setOptionName("4", messages.get("option4"));
		map.setOptionName("5", messages.get("option5"));
		map.setOptionName("6", messages.get("option6"));
		map.setOptionName("7", messages.get("option7"));
		map.setOptionName("A", messages.get("optiona"));
		map.setOptionName("B", messages.get("optionb"));
		map.setOptionName("C", messages.get("optionc"));
		map.setOptionName("D", messages.get("optiond"));
		map.setOptionName("E", messages.get("optione"));
		map.setOptionName("1.1", messages.get("option11"));
		map.setOptionName("1.2", messages.get("option12"));
		map.setOptionName("1.3", messages.get("option13"));
		map.setOptionName("1.4", messages.get("option14"));
		map.setOptionName("1.5", messages.get("option15"));
		map.setOptionName("1.6", messages.get("option16"));
		map.setOptionName("1.7", messages.get("option17"));
		map.setOptionName("1.8", messages.get("option18"));
		map.setOptionName("3.1", messages.get("option31"));
		map.setOptionName("3.2", messages.get("option32"));
		map.setOptionName("3.3", messages.get("option33"));
		map.setOptionName("3.4", messages.get("option34"));
		map.setOptionName("3.5", messages.get("option35"));
		map.setOptionName("3.6", messages.get("option36"));
		map.setOptionName("3.7", messages.get("option37"));
		map.setOptionName("4.1", messages.get("option41"));
		map.setOptionName("4.2", messages.get("option42"));
		map.setOptionName("4.3", messages.get("option43"));
		map.setOptionName("4.4", messages.get("option44"));
		map.setOptionName("4.5", messages.get("option45"));
		map.setOptionName("4.6", messages.get("option46"));
		map.setOptionName("4.7", messages.get("option47"));
		map.setOptionName("4.8", messages.get("option48"));
		map.setOptionName("4.A", messages.get("option4a"));
		map.setOptionName("4.B", messages.get("option4b"));
		map.setOptionName("4.C", messages.get("option4c"));
		map.setOptionName("4.D", messages.get("option4d"));
		map.setOptionName("4.E", messages.get("option4e"));
		map.setOptionName("5.1", messages.get("option51"));
		map.setOptionName("5.2", messages.get("option52"));
		map.setOptionName("5.3", messages.get("option53"));
		map.setOptionName("5.4", messages.get("option54"));
		map.setOptionName("5.5", messages.get("option55"));
		map.setOptionName("5.6", messages.get("option56"));
		map.setOptionName("5.7", messages.get("option57"));
		map.setOptionName("5.8", messages.get("option58"));
		map.setOptionName("5.A", messages.get("option5a"));
		map.setOptionName("5.B", messages.get("option5b"));
		map.setOptionName("6.1", messages.get("option61"));
		map.setOptionName("6.2", messages.get("option62"));
		map.setOptionName("6.3", messages.get("option63"));
		map.setOptionName("6.4", messages.get("option64"));
		map.setOptionName("6.5", messages.get("option65"));
		map.setOptionName("6.6", messages.get("option66"));
		map.setOptionName("7.1", messages.get("option71"));
		map.setOptionName("7.2", messages.get("option72"));
		map.setOptionName("7.3", messages.get("option73"));
		map.setOptionName("7.4", messages.get("option74"));
		map.setOptionName("A.1", messages.get("optiona1"));
		map.setOptionName("A.2", messages.get("optiona2"));
		map.setOptionName("A.3", messages.get("optiona3"));
		map.setOptionName("A.4", messages.get("optiona4"));
		map.setOptionName("A.5", messages.get("optiona5"));
		map.setOptionName("A.6", messages.get("optiona6"));
		map.setOptionName("A.7", messages.get("optiona7"));
		map.setOptionName("A.8", messages.get("optiona8"));
		map.setOptionName("B.1", messages.get("optionb1"));
		map.setOptionName("B.3", messages.get("optionb3"));
		map.setOptionName("B.4", messages.get("optionb4"));
		map.setOptionName("B.5", messages.get("optionb5"));
		map.setOptionName("B.6", messages.get("optionb6"));
		map.setOptionName("B.7", messages.get("optionb7"));
		map.setOptionName("E.1", messages.get("optione1"));
		map.setOptionName("E.2", messages.get("optione2"));
		map.setOptionName("E.3", messages.get("optione3"));
		map.setOptionName("E.4", messages.get("optione4"));
		map.setOptionName("E.5", messages.get("optione5"));
		map.setOptionName("E.6", messages.get("optione6"));
		map.setOptionName("E.7", messages.get("optione7"));
		map.setOptionName("E.8", messages.get("optione8"));
		map.setOptionName("E.9", messages.get("optione8"));
		options=map.getMapApp();
	}

	void afterRender() {
		changeFavorites = request.getParameter("showFavorites");
		JSONObject literals = new JSONObject();
		for (Option o : options) {
			String option = o.getOption().replace(".", "").toLowerCase();
			literals.put("option" + option.toLowerCase(), o.getOptionName());
			if (o.isParent()) {
				for (Option so : o.getOptions()) {
					option = so.getOption().replace(".", "").toLowerCase();
					literals.put("option" + option, so.getOptionName());
				}

			}
		}
		if (changeFavorites.equals("true")) {
			List<Favorite> favorites = userService
					.getFavoritesByUserId(userSession.getUserProfileId());
			JSONArray jsonArray = new JSONArray();

			for (Favorite f : favorites) {
				jsonArray.put(f.getFavoriteId(), f.getUseCase());
			}

			literals.put("favorites", jsonArray);

			javaScriptSupport.addInitializerCall("favorites", literals);
		} else {
			javaScriptSupport.addInitializerCall("initMenu",
					literals.put("menu", messages.get("main-menu")));
		}
	}

}
