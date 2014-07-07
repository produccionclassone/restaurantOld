package es.classone.restaurant.web.pages.masterFiles;

import java.util.ArrayList;
import java.util.List;

import org.apache.tapestry5.annotations.Component;
import org.apache.tapestry5.annotations.Import;
import org.apache.tapestry5.annotations.InjectComponent;
import org.apache.tapestry5.annotations.Property;
import org.apache.tapestry5.corelib.components.Form;
import org.apache.tapestry5.corelib.components.Zone;
import org.apache.tapestry5.ioc.annotations.Inject;
import org.apache.tapestry5.json.JSONObject;
import org.apache.tapestry5.services.ajax.AjaxResponseRenderer;
import org.apache.tapestry5.services.ajax.JavaScriptCallback;
import org.apache.tapestry5.services.javascript.JavaScriptSupport;

import es.classone.restaurant.model.masterFilesService.MasterFilesService;
import es.classone.restaurant.model.qualifier.Qualifier;
import es.classone.restaurant.modelutil.exceptions.DuplicateInstanceException;
import es.classone.restaurant.modelutil.exceptions.InstanceNotFoundException;
import es.classone.restaurant.web.services.AuthenticationPolicy;
import es.classone.restaurant.web.services.AuthenticationPolicyType;

@AuthenticationPolicy(AuthenticationPolicyType.AUTHENTICATED_USERS)
@Import(library = "context:javaScript/addQualifier.js")
public class MasterQualifier {

	
	@Component
	private Form tableForm;

	@Property
	private List<Qualifier> qualifiers;

	@Property
	private Qualifier qualifier;

	@Property
	private int qualifierId=-1;

	@Property
	private String qualifierNameLang1;

	@Property
	private String qualifierNameLang2;

	@Property
	private String qualifierNameLang3;

	@Inject
	private MasterFilesService masterFilesService;

	@Property
	private ArrayList<Integer> links;
	@Property
	private int link;

	@InjectComponent
	private Zone zone;

	@InjectComponent
	private Zone tableZone;

	@Inject
	private AjaxResponseRenderer ajaxResponseRenderer;

	@Inject
	private JavaScriptSupport javaScriptSupport;

	void setupRender() {
		int lastId=0;
		qualifiers = masterFilesService.findAllQualifier();
		int size = qualifiers.size();

		if (size == 0) {
		} else {
			 lastId= qualifiers.get(size - 1).getQualifierId();
			
		}
		links = new ArrayList<>();
		for (int i = 1; i < 100; i++) {
			links.add(lastId + i);
		}

	}

	void onValidateFromTableForm() throws InstanceNotFoundException,
			NumberFormatException, DuplicateInstanceException {

		if (qualifierId == -1) {
			Qualifier qualifier = new Qualifier(qualifierNameLang1,
					qualifierNameLang2, qualifierNameLang3);
			qualifierId = masterFilesService.createQualifier(qualifier)
					.getQualifierId();
			ajaxResponseRenderer.addCallback(new JavaScriptCallback() {
				public void run(JavaScriptSupport javascriptSupport) {
					JSONObject newRow = new JSONObject();
					newRow.put("qualifierId", qualifierId);
					newRow.put("qualifierNameLang1", qualifierNameLang1);
					newRow.put("qualifierNameLang2", qualifierNameLang2);
					newRow.put("qualifierNameLang3", qualifierNameLang3);
					javascriptSupport
							.addInitializerCall("addQualifier", newRow);
				}
			});
		} else {
			masterFilesService.editQualifier(qualifierId, qualifierNameLang1,
					qualifierNameLang2, qualifierNameLang3);

		}
	}

	void onEdit(int id) throws InstanceNotFoundException {
		qualifier = masterFilesService.getQualifierByQualifierId(id);
		qualifierId = qualifier.getQualifierId();
		qualifierNameLang1 = qualifier.getQualifierNameLang1();
		qualifierNameLang2 = qualifier.getQualifierNameLang2();
		qualifierNameLang3 = qualifier.getQualifierNameLang3();
		ajaxResponseRenderer.addCallback(new JavaScriptCallback() {
			public void run(JavaScriptSupport javascriptSupport) {
				javascriptSupport.addScript(String
						.format(" $('#modal').modal('show'); "
								+ "$('#modal').on('shown.bs.modal', function() {"
								+ "			$('.focus').focus();});"));
			}
		});
		ajaxResponseRenderer.addRender(zone);
	}

	void onDelete(int row) {
		try {
			masterFilesService.deleteQualifier(row);
		} catch (InstanceNotFoundException e) {
			System.out.println("error al eliminar");
		}
	}

	// Valores por defecto en el formulario de inserción
	void onInsert() {
		ajaxResponseRenderer.addRender(zone);
		ajaxResponseRenderer.addCallback(new JavaScriptCallback() {
			public void run(JavaScriptSupport javascriptSupport) {
				javascriptSupport.addScript(String
						.format(" $('#modal').modal('show'); "
								+ "$('#modal').on('shown.bs.modal', function() {"
								+ "			$('.focus').focus();});"));
			}
		});
	}

	void onSuccess() {
		ajaxResponseRenderer.addCallback(new JavaScriptCallback() {
			public void run(JavaScriptSupport javascriptSupport) {
				javascriptSupport.addScript(String
						.format(" $('#modal').modal('hide');"));
			}
		});

	}

	void afterRender() {
		ajaxResponseRenderer.addRender(tableZone);
		javaScriptSupport.addScript(String.format("$('#table').show();"));
	}

}
