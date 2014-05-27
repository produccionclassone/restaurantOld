package es.classone.restaurant.web.pages;

import org.apache.tapestry5.annotations.Import;
import org.apache.tapestry5.ioc.Messages;
import org.apache.tapestry5.ioc.annotations.Inject;
import org.apache.tapestry5.json.JSONObject;
import org.apache.tapestry5.services.javascript.JavaScriptSupport;

import es.classone.restaurant.web.services.AuthenticationPolicy;
import es.classone.restaurant.web.services.AuthenticationPolicyType;

@AuthenticationPolicy(AuthenticationPolicyType.AUTHENTICATED_USERS)
@Import(library = { "context:javaScript/menu.js" })
public class Index {

	@Inject
	private Messages messages;

	@Inject
	private JavaScriptSupport javaScriptSupport;

	void afterRender() {
		javaScriptSupport.addInitializerCall(
				"initMenu",
				new JSONObject().put("menu", messages.get("menuprincipal"))
						.put("opcion1", messages.get("opcion1"))
						.put("opcion2", messages.get("opcion2"))
						.put("opcion3", messages.get("opcion3"))
						.put("opcion4", messages.get("opcion4"))
						.put("opcion5", messages.get("opcion5"))
						.put("opcion6", messages.get("opcion6"))
						.put("opcion7", messages.get("opcion7"))
						.put("opcion8", messages.get("opcion8"))
						.put("opcion9", messages.get("opcion9"))
						.put("opciona", messages.get("opciona"))
						.put("opcionb", messages.get("opcionb"))
						.put("opcionc", messages.get("opcionc"))
						.put("opciond", messages.get("opciond"))
						.put("opcione", messages.get("opcione"))
						.put("opcionf", messages.get("opcionf"))
						.put("opciong", messages.get("opciong"))
						.put("opcionh", messages.get("opcionh"))
						.put("opcioni", messages.get("opcioni"))
						.put("opcion11", messages.get("opcion11"))
						.put("opcion12", messages.get("opcion12"))
						.put("opcion13", messages.get("opcion13"))
						.put("opcion14", messages.get("opcion14"))
						.put("opcion15", messages.get("opcion15"))
						.put("opcion16", messages.get("opcion16"))
						.put("opcion17", messages.get("opcion17"))
						.put("opcion18", messages.get("opcion18"))
						.put("opcion19", messages.get("opcion19"))
						.put("opcion1a", messages.get("opcion1a"))
						.put("opcion1b", messages.get("opcion1b"))
						.put("opcion1c", messages.get("opcion1c"))
						.put("opcion1d", messages.get("opcion1d"))
						.put("opcion1e", messages.get("opcion1e"))
						.put("opcion1f", messages.get("opcion1f"))
						.put("opcion1g", messages.get("opcion1g"))
						.put("opcion1h", messages.get("opcion1h"))
						.put("opcion1i", messages.get("opcion1i"))
						.put("opcion21", messages.get("opcion21"))
						.put("opcion22", messages.get("opcion22"))
						.put("opcion23", messages.get("opcion23"))
						.put("opcion24", messages.get("opcion24"))
						.put("opcion25", messages.get("opcion25"))
						.put("opcion26", messages.get("opcion26"))
						.put("opcion27", messages.get("opcion27"))
						.put("opcion28", messages.get("opcion28"))
						.put("opcion29", messages.get("opcion29")));
	}
}
