package es.classone.restaurant.web.pages;

import java.util.ArrayList;
import java.util.List;

import org.apache.tapestry5.ComponentResources;
import org.apache.tapestry5.annotations.Import;
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
import es.classone.restaurant.web.services.appMap.AppMap;
import es.classone.restaurant.web.services.appMap.Option;
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

	@Inject
	Request request;
	
	void onActivate(){
//		AppMap appmap=new AppMap();
//		ArrayList<Option> map=appmap.getMap();
//		for (Option o: map){
//			System.out.println(o.getOption()+ " "+ o.getOptionName());
//			if (o.isHasSubLevel()){
//				ArrayList<Option> submap=o.getOptions();
//				for (Option so: submap){
//					System.out.println(so.getOption()+ " "+ so.getOptionName());
//				}
//			}
//		}
	}

	void afterRender() {
		changeFavorites = request.getParameter("showFavorites");

		if (changeFavorites.equals("true")) {
			System.out.println(changeFavorites);
			List<Favorite> favorites = userService.getFavoritesByUserId(userSession
					.getUserProfileId());
			JSONArray jsonArray = new JSONArray();

			for (Favorite f : favorites) {
				jsonArray.put(f.getFavoriteId(),f.getUseCase());
			}
			
			JSONObject spec = new JSONObject();
			spec.put("favorites", jsonArray);

			javaScriptSupport.addInitializerCall("favorites", spec);
		} else {
			javaScriptSupport.addInitializerCall(
					"initMenu",
					new JSONObject().put("menu", messages.get("main-menu"))
							.put("option1", messages.get("option1"))
							.put("option2", messages.get("option2"))
							.put("option3", messages.get("option3"))
							.put("option4", messages.get("option4"))
							.put("option5", messages.get("option5"))
							.put("option6", messages.get("option6"))
							.put("option7", messages.get("option7"))
							.put("option8", messages.get("option8"))
							.put("option9", messages.get("option9"))
							.put("optiona", messages.get("optiona"))
							.put("optionb", messages.get("optionb"))
							.put("optionc", messages.get("optionc"))
							.put("optiond", messages.get("optiond"))
							.put("optione", messages.get("optione"))
							.put("optionf", messages.get("optionf"))
							.put("optiong", messages.get("optiong"))
							.put("optionh", messages.get("optionh"))
							.put("optioni", messages.get("optioni"))
							.put("option11", messages.get("option11"))
							.put("option12", messages.get("option12"))
							.put("option13", messages.get("option13"))
							.put("option14", messages.get("option14"))
							.put("option15", messages.get("option15"))
							.put("option16", messages.get("option16"))
							.put("option17", messages.get("option17"))
							.put("option18", messages.get("option18"))
							.put("option19", messages.get("option19"))
							.put("option1a", messages.get("option1a"))
							.put("option1b", messages.get("option1b"))
							.put("option1c", messages.get("option1c"))
							.put("option1d", messages.get("option1d"))
							.put("option1e", messages.get("option1e"))
							.put("option1f", messages.get("option1f"))
							.put("option1g", messages.get("option1g"))
							.put("option1h", messages.get("option1h"))
							.put("option1i", messages.get("option1i"))
							.put("option21", messages.get("option21"))
							.put("option22", messages.get("option22"))
							.put("option23", messages.get("option23"))
							.put("option24", messages.get("option24"))
							.put("option25", messages.get("option25"))
							.put("option26", messages.get("option26"))
							.put("option27", messages.get("option27"))
							.put("option28", messages.get("option28"))
							.put("option29", messages.get("option29"))
							.put("option2a", messages.get("option2a"))
							.put("option2b", messages.get("option2b"))
							.put("option2c", messages.get("option2c"))
							.put("option2d", messages.get("option2d"))
							.put("option2e", messages.get("option2e"))
							.put("option2f", messages.get("option2f"))
							.put("option2g", messages.get("option2g"))
							.put("option2h", messages.get("option2h"))
							.put("option2i", messages.get("option2i"))
							.put("option31", messages.get("option31"))
							.put("option32", messages.get("option32"))
							.put("option33", messages.get("option33"))
							.put("option34", messages.get("option34"))
							.put("option35", messages.get("option35"))
							.put("option36", messages.get("option36"))
							.put("option37", messages.get("option37"))
							.put("option38", messages.get("option38"))
							.put("option39", messages.get("option39"))
							.put("option3a", messages.get("option3a"))
							.put("option3b", messages.get("option3b"))
							.put("option3c", messages.get("option3c"))
							.put("option3d", messages.get("option3d"))
							.put("option3e", messages.get("option3e"))
							.put("option3f", messages.get("option3f"))
							.put("option3g", messages.get("option3g"))
							.put("option3h", messages.get("option3h"))
							.put("option3i", messages.get("option3i"))
							.put("option41", messages.get("option41"))
							.put("option42", messages.get("option42"))
							.put("option43", messages.get("option43"))
							.put("option44", messages.get("option44"))
							.put("option45", messages.get("option45"))
							.put("option46", messages.get("option46"))
							.put("option47", messages.get("option47"))
							.put("option48", messages.get("option48"))
							.put("option49", messages.get("option49"))
							.put("option4a", messages.get("option4a"))
							.put("option4b", messages.get("option4b"))
							.put("option4c", messages.get("option4c"))
							.put("option4d", messages.get("option4d"))
							.put("option4e", messages.get("option4e"))
							.put("option4f", messages.get("option4f"))
							.put("option4g", messages.get("option4g"))
							.put("option4h", messages.get("option4h"))
							.put("option4i", messages.get("option4i"))
							.put("option51", messages.get("option51"))
							.put("option52", messages.get("option52"))
							.put("option53", messages.get("option53"))
							.put("option54", messages.get("option54"))
							.put("option55", messages.get("option55"))
							.put("option56", messages.get("option56"))
							.put("option57", messages.get("option57"))
							.put("option58", messages.get("option58"))
							.put("option59", messages.get("option59"))
							.put("option5a", messages.get("option5a"))
							.put("option5b", messages.get("option5b"))
							.put("option5c", messages.get("option5c"))
							.put("option5d", messages.get("option5d"))
							.put("option5e", messages.get("option5e"))
							.put("option5f", messages.get("option5f"))
							.put("option5g", messages.get("option5g"))
							.put("option5h", messages.get("option5h"))
							.put("option5i", messages.get("option5i"))
							.put("option61", messages.get("option61"))
							.put("option62", messages.get("option62"))
							.put("option63", messages.get("option63"))
							.put("option64", messages.get("option64"))
							.put("option65", messages.get("option65"))
							.put("option66", messages.get("option66"))
							.put("option67", messages.get("option67"))
							.put("option68", messages.get("option68"))
							.put("option69", messages.get("option69"))
							.put("option6a", messages.get("option6a"))
							.put("option6b", messages.get("option6b"))
							.put("option6c", messages.get("option6c"))
							.put("option6d", messages.get("option6d"))
							.put("option6e", messages.get("option6e"))
							.put("option6f", messages.get("option6f"))
							.put("option6g", messages.get("option6g"))
							.put("option6h", messages.get("option6h"))
							.put("option6i", messages.get("option6i"))
							.put("option71", messages.get("option71"))
							.put("option72", messages.get("option72"))
							.put("option73", messages.get("option73"))
							.put("option74", messages.get("option74"))
							.put("option75", messages.get("option75"))
							.put("option76", messages.get("option76"))
							.put("option77", messages.get("option77"))
							.put("option78", messages.get("option78"))
							.put("option79", messages.get("option79"))
							.put("option7a", messages.get("option7a"))
							.put("option7b", messages.get("option7b"))
							.put("option7c", messages.get("option7c"))
							.put("option7d", messages.get("option7d"))
							.put("option7e", messages.get("option7e"))
							.put("option7f", messages.get("option7f"))
							.put("option7g", messages.get("option7g"))
							.put("option7h", messages.get("option7h"))
							.put("option7i", messages.get("option7i"))
							.put("option81", messages.get("option81"))
							.put("option82", messages.get("option82"))
							.put("option83", messages.get("option83"))
							.put("option84", messages.get("option84"))
							.put("option85", messages.get("option85"))
							.put("option86", messages.get("option86"))
							.put("option87", messages.get("option87"))
							.put("option88", messages.get("option88"))
							.put("option89", messages.get("option89"))
							.put("option8a", messages.get("option8a"))
							.put("option8b", messages.get("option8b"))
							.put("option8c", messages.get("option8c"))
							.put("option8d", messages.get("option8d"))
							.put("option8e", messages.get("option8e"))
							.put("option8f", messages.get("option8f"))
							.put("option8g", messages.get("option8g"))
							.put("option8h", messages.get("option8h"))
							.put("option8i", messages.get("option8i"))
							.put("option91", messages.get("option91"))
							.put("option92", messages.get("option92"))
							.put("option93", messages.get("option93"))
							.put("option94", messages.get("option94"))
							.put("option95", messages.get("option95"))
							.put("option96", messages.get("option96"))
							.put("option97", messages.get("option97"))
							.put("option98", messages.get("option98"))
							.put("option99", messages.get("option99"))
							.put("option9a", messages.get("option9a"))
							.put("option9b", messages.get("option9b"))
							.put("option9c", messages.get("option9c"))
							.put("option9d", messages.get("option9d"))
							.put("option9e", messages.get("option9e"))
							.put("option9f", messages.get("option9f"))
							.put("option9g", messages.get("option9g"))
							.put("option9h", messages.get("option9h"))
							.put("option9i", messages.get("option9i"))
							.put("optiona1", messages.get("optiona1"))
							.put("optiona2", messages.get("optiona2"))
							.put("optiona3", messages.get("optiona3"))
							.put("optiona4", messages.get("optiona4"))
							.put("optiona5", messages.get("optiona5"))
							.put("optiona6", messages.get("optiona6"))
							.put("optiona7", messages.get("optiona7"))
							.put("optiona8", messages.get("optiona8"))
							.put("optiona9", messages.get("optiona9"))
							.put("optionaa", messages.get("optionaa"))
							.put("optionab", messages.get("optionab"))
							.put("optionac", messages.get("optionac"))
							.put("optionad", messages.get("optionad"))
							.put("optionae", messages.get("optionae"))
							.put("optionaf", messages.get("optionaf"))
							.put("optionag", messages.get("optionag"))
							.put("optionah", messages.get("optionah"))
							.put("optionai", messages.get("optionai"))
							.put("optionb1", messages.get("optionb1"))
							.put("optionb2", messages.get("optionb2"))
							.put("optionb3", messages.get("optionb3"))
							.put("optionb4", messages.get("optionb4"))
							.put("optionb5", messages.get("optionb5"))
							.put("optionb6", messages.get("optionb6"))
							.put("optionb7", messages.get("optionb7"))
							.put("optionb8", messages.get("optionb8"))
							.put("optionb9", messages.get("optionb9"))
							.put("optionba", messages.get("optionba"))
							.put("optionbb", messages.get("optionbb"))
							.put("optionbc", messages.get("optionbc"))
							.put("optionbd", messages.get("optionbd"))
							.put("optionbe", messages.get("optionbe"))
							.put("optionbf", messages.get("optionbf"))
							.put("optionbg", messages.get("optionbg"))
							.put("optionbh", messages.get("optionbh"))
							.put("optionbi", messages.get("optionbi"))
							.put("optionc1", messages.get("optionc1"))
							.put("optionc2", messages.get("optionc2"))
							.put("optionc3", messages.get("optionc3"))
							.put("optionc4", messages.get("optionc4"))
							.put("optionc5", messages.get("optionc5"))
							.put("optionc6", messages.get("optionc6"))
							.put("optionc7", messages.get("optionc7"))
							.put("optionc8", messages.get("optionc8"))
							.put("optionc9", messages.get("optionc9"))
							.put("optionca", messages.get("optionca"))
							.put("optioncb", messages.get("optioncb"))
							.put("optioncc", messages.get("optioncc"))
							.put("optioncd", messages.get("optioncd"))
							.put("optionce", messages.get("optionce"))
							.put("optioncf", messages.get("optioncf"))
							.put("optioncg", messages.get("optioncg"))
							.put("optionch", messages.get("optionch"))
							.put("optionci", messages.get("optionci"))
							.put("optiond1", messages.get("optiond1"))
							.put("optiond2", messages.get("optiond2"))
							.put("optiond3", messages.get("optiond3"))
							.put("optiond4", messages.get("optiond4"))
							.put("optiond5", messages.get("optiond5"))
							.put("optiond6", messages.get("optiond6"))
							.put("optiond7", messages.get("optiond7"))
							.put("optiond8", messages.get("optiond8"))
							.put("optiond9", messages.get("optiond9"))
							.put("optionda", messages.get("optionda"))
							.put("optiondb", messages.get("optiondb"))
							.put("optiondc", messages.get("optiondc"))
							.put("optiondd", messages.get("optiondd"))
							.put("optionde", messages.get("optionde"))
							.put("optiondf", messages.get("optiondf"))
							.put("optiondg", messages.get("optiondg"))
							.put("optiondh", messages.get("optiondh"))
							.put("optiondi", messages.get("optiondi"))
							.put("optione1", messages.get("optione1"))
							.put("optione2", messages.get("optione2"))
							.put("optione3", messages.get("optione3"))
							.put("optione4", messages.get("optione4"))
							.put("optione5", messages.get("optione5"))
							.put("optione6", messages.get("optione6"))
							.put("optione7", messages.get("optione7"))
							.put("optione8", messages.get("optione8"))
							.put("optione9", messages.get("optione9"))
							.put("optionea", messages.get("optionea"))
							.put("optioneb", messages.get("optioneb"))
							.put("optionec", messages.get("optionec"))
							.put("optioned", messages.get("optioned"))
							.put("optionee", messages.get("optionee"))
							.put("optionef", messages.get("optionef"))
							.put("optioneg", messages.get("optioneg"))
							.put("optioneh", messages.get("optioneh"))
							.put("optionei", messages.get("optionei"))
							.put("optionf1", messages.get("optionf1"))
							.put("optionf2", messages.get("optionf2"))
							.put("optionf3", messages.get("optionf3"))
							.put("optionf4", messages.get("optionf4"))
							.put("optionf5", messages.get("optionf5"))
							.put("optionf6", messages.get("optionf6"))
							.put("optionf7", messages.get("optionf7"))
							.put("optionf8", messages.get("optionf8"))
							.put("optionf9", messages.get("optionf9"))
							.put("optionfa", messages.get("optionfa"))
							.put("optionfb", messages.get("optionfb"))
							.put("optionfc", messages.get("optionfc"))
							.put("optionfd", messages.get("optionfd"))
							.put("optionfe", messages.get("optionfe"))
							.put("optionff", messages.get("optionff"))
							.put("optionfg", messages.get("optionfg"))
							.put("optionfh", messages.get("optionfh"))
							.put("optionfi", messages.get("optionfi"))
							.put("optiong1", messages.get("optiong1"))
							.put("optiong2", messages.get("optiong2"))
							.put("optiong3", messages.get("optiong3"))
							.put("optiong4", messages.get("optiong4"))
							.put("optiong5", messages.get("optiong5"))
							.put("optiong6", messages.get("optiong6"))
							.put("optiong7", messages.get("optiong7"))
							.put("optiong8", messages.get("optiong8"))
							.put("optiong9", messages.get("optiong9"))
							.put("optionga", messages.get("optionga"))
							.put("optiongb", messages.get("optiongb"))
							.put("optiongc", messages.get("optiongc"))
							.put("optiongd", messages.get("optiongd"))
							.put("optionge", messages.get("optionge"))
							.put("optiongf", messages.get("optiongf"))
							.put("optiongg", messages.get("optiongg"))
							.put("optiongh", messages.get("optiongh"))
							.put("optiongi", messages.get("optiongi"))
							.put("optioni1", messages.get("optioni1"))
							.put("optioni2", messages.get("optioni2"))
							.put("optioni3", messages.get("optioni3"))
							.put("optioni4", messages.get("optioni4"))
							.put("optioni5", messages.get("optioni5"))
							.put("optioni6", messages.get("optioni6"))
							.put("optioni7", messages.get("optioni7"))
							.put("optioni8", messages.get("optioni8"))
							.put("optioni9", messages.get("optioni9"))
							.put("optionia", messages.get("optionia"))
							.put("optionib", messages.get("optionib"))
							.put("optionic", messages.get("optionic"))
							.put("optionid", messages.get("optionid"))
							.put("optionie", messages.get("optionie"))
							.put("optionif", messages.get("optionif"))
							.put("optionig", messages.get("optionig"))
							.put("optionih", messages.get("optionih"))
							.put("optionii", messages.get("optionii")));
		}
	}

}
