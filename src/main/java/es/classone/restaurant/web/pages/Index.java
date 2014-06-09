package es.classone.restaurant.web.pages;

import java.util.List;

import org.apache.tapestry5.ComponentResources;
import org.apache.tapestry5.Link;
import org.apache.tapestry5.annotations.Import;
import org.apache.tapestry5.annotations.Property;
import org.apache.tapestry5.annotations.SessionState;
import org.apache.tapestry5.ioc.Messages;
import org.apache.tapestry5.ioc.annotations.Inject;
import org.apache.tapestry5.json.JSONArray;
import org.apache.tapestry5.json.JSONObject;
import org.apache.tapestry5.services.PageRenderLinkSource;
import org.apache.tapestry5.services.Request;
import org.apache.tapestry5.services.javascript.JavaScriptSupport;

import es.classone.restaurant.model.favorite.Favorite;
import es.classone.restaurant.model.userservice.DuplicateFavoriteException;
import es.classone.restaurant.model.userservice.UserService;
import es.classone.restaurant.modelutil.exceptions.InstanceNotFoundException;
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
	private PageRenderLinkSource linkSource;
	
	@Inject
	private UserService userService;

	@SessionState(create = false)
	private UserSession userSession;

	private String changeFavorites;

	@Property
	private List<Option> options;
	@Property
	private Option option;
	@Property
	private Option suboption;
	@Inject
	Request request;
	
	void setupRender() { 
		MapApp.getInstance();
		if (MapApp.getMapApp().isEmpty()){
		MapApp.setOptionName("1", messages.get("option1"),"");
		MapApp.setOptionName("2", messages.get("option2"),"");
		MapApp.setOptionName("3", messages.get("option3"),"");
		MapApp.setOptionName("4", messages.get("option4"),"");
		MapApp.setOptionName("5", messages.get("option5"),"");
		MapApp.setOptionName("6", messages.get("option6"),"");
		MapApp.setOptionName("7", messages.get("option7"),"");
		MapApp.setOptionName("A", messages.get("optiona"),"");
		MapApp.setOptionName("B", messages.get("optionb"),"");
		MapApp.setOptionName("C", messages.get("optionc"),"");
		MapApp.setOptionName("D", messages.get("optiond"),"");
		MapApp.setOptionName("E", messages.get("optione"),"");
		MapApp.setOptionName("1.1", messages.get("option11"),"");
		MapApp.setOptionName("1.2", messages.get("option12"),"");
		MapApp.setOptionName("1.3", messages.get("option13"),"");
		MapApp.setOptionName("1.4", messages.get("option14"),"");
		MapApp.setOptionName("1.5", messages.get("option15"),"");
		MapApp.setOptionName("1.6", messages.get("option16"),"");
		MapApp.setOptionName("1.7", messages.get("option17"),"");
		MapApp.setOptionName("1.8", messages.get("option18"),"");
		MapApp.setOptionName("3.1", messages.get("option31"),"");
		MapApp.setOptionName("3.2", messages.get("option32"),"");
		MapApp.setOptionName("3.3", messages.get("option33"),"");
		MapApp.setOptionName("3.4", messages.get("option34"),"");
		MapApp.setOptionName("3.5", messages.get("option35"),"");
		MapApp.setOptionName("3.6", messages.get("option36"),"");
		MapApp.setOptionName("3.7", messages.get("option37"),"");
		MapApp.setOptionName("4.1", messages.get("option41"),"");
		MapApp.setOptionName("4.2", messages.get("option42"),"");
		MapApp.setOptionName("4.3", messages.get("option43"),"");
		MapApp.setOptionName("4.4", messages.get("option44"),"");
		MapApp.setOptionName("4.5", messages.get("option45"),"");
		MapApp.setOptionName("4.6", messages.get("option46"),"");
		MapApp.setOptionName("4.7", messages.get("option47"),"");
		MapApp.setOptionName("4.8", messages.get("option48"),"");
		MapApp.setOptionName("4.A", messages.get("option4a"),"");
		MapApp.setOptionName("4.B", messages.get("option4b"),"");
		MapApp.setOptionName("4.C", messages.get("option4c"),"");
		MapApp.setOptionName("4.D", messages.get("option4d"),"");
		MapApp.setOptionName("4.E", messages.get("option4e"),"");
		MapApp.setOptionName("5.1", messages.get("option51"),"");
		MapApp.setOptionName("5.2", messages.get("option52"),"");
		MapApp.setOptionName("5.3", messages.get("option53"),"");
		MapApp.setOptionName("5.4", messages.get("option54"),"");
		MapApp.setOptionName("5.5", messages.get("option55"),"");
		MapApp.setOptionName("5.6", messages.get("option56"),"");
		MapApp.setOptionName("5.7", messages.get("option57"),"");
		MapApp.setOptionName("5.8", messages.get("option58"),"");
		MapApp.setOptionName("5.A", messages.get("option5a"),"");
		MapApp.setOptionName("5.B", messages.get("option5b"),"");
		MapApp.setOptionName("6.1", messages.get("option61"),"");
		MapApp.setOptionName("6.2", messages.get("option62"),"");
		MapApp.setOptionName("6.3", messages.get("option63"),"");
		MapApp.setOptionName("6.4", messages.get("option64"),"");
		MapApp.setOptionName("6.5", messages.get("option65"),"");
		MapApp.setOptionName("6.6", messages.get("option66"),"");
		MapApp.setOptionName("7.1", messages.get("option71"),"");
		MapApp.setOptionName("7.2", messages.get("option72"),"");
		MapApp.setOptionName("7.3", messages.get("option73"),"");
		MapApp.setOptionName("7.4", messages.get("option74"),"");
		MapApp.setOptionName("A.1", messages.get("optiona1"),"");
		MapApp.setOptionName("A.2", messages.get("optiona2"),"");
		MapApp.setOptionName("A.3", messages.get("optiona3"),"");
		MapApp.setOptionName("A.4", messages.get("optiona4"),"");
		MapApp.setOptionName("A.5", messages.get("optiona5"),"");
		MapApp.setOptionName("A.6", messages.get("optiona6"),"");
		MapApp.setOptionName("A.7", messages.get("optiona7"),"");
		MapApp.setOptionName("A.8", messages.get("optiona8"),"");
		MapApp.setOptionName("B.1", messages.get("optionb1"),"");
		MapApp.setOptionName("B.3", messages.get("optionb3"),"");
		MapApp.setOptionName("B.4", messages.get("optionb4"),"");
		MapApp.setOptionName("B.5", messages.get("optionb5"),"");
		MapApp.setOptionName("B.6", messages.get("optionb6"),"");
		MapApp.setOptionName("B.7", messages.get("optionb7"),"/restaurant/configuration/2");
		MapApp.setOptionName("E.1", messages.get("optione1"),"");
		MapApp.setOptionName("E.2", messages.get("optione2"),"");
		MapApp.setOptionName("E.3", messages.get("optione3"),"");
		MapApp.setOptionName("E.4", messages.get("optione4"),"");
		MapApp.setOptionName("E.5", messages.get("optione5"),"");
		MapApp.setOptionName("E.6", messages.get("optione6"),"");
		MapApp.setOptionName("E.7", messages.get("optione7"),"");
		MapApp.setOptionName("E.8", messages.get("optione8"),"");
		MapApp.setOptionName("E.9", messages.get("optione9"),"");
		
		}
		options=MapApp.getMapApp();
	}
	Object onAddFavorite(String option){
		System.out.println(option);
		Option opt= MapApp.getOptionObjByOption(option);
		Favorite favorite = new Favorite(opt.getOption(),opt.getPath());
		try {
			userService.createFavorite(favorite, userSession.getUserProfileId());
		} catch (InstanceNotFoundException e) {
			System.out.println("NO ENCONTRADO");
		} catch (DuplicateFavoriteException e) {
			System.out.println("FAVORITO DUPLICADO");
		}
		Link link = linkSource.createPageRenderLink(Index.class);
		link.addParameterValue("showFavorites", true);
		link.addParameterValue("showHistory", false);
		return link;
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
					literals.put("path"+option, so.getPath());
				}
			}
		}
		System.out.println(MapApp.getOptionObjByOption("A").getOptionName());
		if (changeFavorites.equals("true")) {
			List<Favorite> favorites = userService
					.getFavoritesByUserId(userSession.getUserProfileId());
			JSONArray favoriteNames = new JSONArray();
			JSONArray favoritePaths = new JSONArray();
			
			for (Favorite f : favorites) {
				favoriteNames.put(MapApp.getOptionObjByOption(f.getUseCase()).getOptionName());
				favoritePaths.put(MapApp.getOptionObjByOption(f.getUseCase()).getPath());
			}

			literals.put("favoriteNames", favoriteNames);
			literals.put("favoritePaths", favoritePaths);

			javaScriptSupport.addInitializerCall("favorites", literals);
		} else {
			javaScriptSupport.addInitializerCall("initMenu",
					literals.put("menu", messages.get("main-menu")));
		}
	}

}
