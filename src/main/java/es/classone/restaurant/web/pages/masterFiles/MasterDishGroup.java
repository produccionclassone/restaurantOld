package es.classone.restaurant.web.pages.masterFiles;

import java.util.List;

import org.apache.tapestry5.annotations.Import;
import org.apache.tapestry5.annotations.Property;
import org.apache.tapestry5.ioc.annotations.Inject;
import org.apache.tapestry5.json.JSONObject;
import org.apache.tapestry5.services.AssetSource;
import org.apache.tapestry5.services.javascript.JavaScriptSupport;
import org.got5.tapestry5.jquery.internal.TableInformation;

import es.classone.restaurant.model.dishGroup.DishGroup;
import es.classone.restaurant.model.masterFilesService.MasterFilesService;
import es.classone.restaurant.web.services.AuthenticationPolicy;
import es.classone.restaurant.web.services.AuthenticationPolicyType;

@AuthenticationPolicy(AuthenticationPolicyType.AUTHENTICATED_USERS)
@Import(library = { "context:javaScript/jquery.dataTables.min.js",
		"context:javaScript/dataTables.tableTools.min.js",
		"context:javaScript/dataTables.colVis.min.js",
		"context:javaScript/dataTables.colReorder.min.js",
		"context:javaScript/dataTables.bootstrap.js" }, stylesheet = {
		"context:css/dataTables.bootstrap.css",	"context:css/jquery.dataTables.css",
		"context:css/dataTables.colVis.css",
		"context:css/dataTables.colReorder.css",
		"context:css/dataTables.tableTools.css"})
public class MasterDishGroup {
	@Property
	private List<DishGroup> dishgroups;

	@Property
	private DishGroup dishGroup;

	@Inject
	private MasterFilesService masterFilesService;
	@Inject
	private JavaScriptSupport js;
	@Inject
	private AssetSource as;

	void setupRender() {
		// Get all persons - ask business service to find them (from the
		// database)
		dishgroups = masterFilesService.findAll();

	}

	public JSONObject getOptions() {

		JSONObject json = new JSONObject("sDom",
				"TC<\"clear\">Rlfrtip");

		JSONObject dataTable = new JSONObject();
		dataTable.put("sSwfPath",
				as.getContextAsset("/swf/copy_csv_xls_pdf.swf", null)
						.toClientURL());
		json.put("oTableTools", dataTable);

		return json;
	}

	public TableInformation getTableInformation() {
		return new TableInformation() {

			public String getTableSummary() {
				return "";
			}

			public String getTableCaption() {
				return "Grupos de Plato";
			}

			public String getTableCSS() {
				return "";
			}
		};

	}
}
