package es.classone.restaurant.web.pages.masterFiles;

import java.io.IOException;
import java.util.List;

import org.apache.tapestry5.annotations.Component;
import org.apache.tapestry5.annotations.Property;
import org.apache.tapestry5.corelib.components.Form;
import org.apache.tapestry5.ioc.Messages;
import org.apache.tapestry5.ioc.annotations.Inject;
import org.apache.tapestry5.services.Request;
import org.apache.tapestry5.services.javascript.JavaScriptSupport;

import es.classone.restaurant.model.dishGroup.DishGroup;
import es.classone.restaurant.model.masterFilesService.MasterFilesService;
import es.classone.restaurant.modelutil.exceptions.ConstraintViolationException;
import es.classone.restaurant.modelutil.exceptions.DuplicateInstanceException;
import es.classone.restaurant.modelutil.exceptions.InstanceNotFoundException;
import es.classone.restaurant.web.services.AuthenticationPolicy;
import es.classone.restaurant.web.services.AuthenticationPolicyType;

@AuthenticationPolicy(AuthenticationPolicyType.AUTHENTICATED_USERS)
public class MasterDishGroup {

	@Component
	private Form addRowForm;

	@Component
	private Form editRowForm;

	@Property
	private String dishGroupCode;
	@Property
	private String editdishGroupCode;

	@Property
	private String dishGroupDesc;

	@Property
	private String salesLedgerAccount="70000000";

	@Property
	private String ivaType;

	@Property
	private String typeIncome="";

	@Property
	private String macroGroup;

	@Property
	private String editDishGroupDesc;

	@Property
	private String editSalesLedgerAccount;

	@Property
	private String editIvaType;
	@Property
	private String dishGroupId;
	@Property
	private String editTypeIncome;

	@Property
	private String editMacroGroup;

	@Property
	private List<DishGroup> dishgroups;

	@Property
	private DishGroup dishGroup;

	@Inject
	private MasterFilesService masterFilesService;

	@Inject
	private JavaScriptSupport javaScriptSupport;

	@Inject
	private Request request;
	
	@Inject
	private Messages messages;

	void setupRender() throws DuplicateInstanceException {
		dishgroups = masterFilesService.findAll();
		int size= dishgroups.size();
		if (size==0){
				dishGroupCode="00";
			try {
				//masterFilesService.importDishGroupFile("/home/alexpenedo/Documentos/ClassOne/exports/RES91GRP.TXT");
				masterFilesService.importDishGroupFile("C:/Users/VaninaBusto/Documents/RES91GRP.TXT");
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		else{
			try {
				dishGroupCode=getNewCode(masterFilesService.getDishGroupByDishGroupId(size).getDishGroupCode());
				
			} catch (InstanceNotFoundException e1) {
				e1.printStackTrace();
			}
		}

	}

	private String getNewCode(String currentCode){
		if (isNumeric(currentCode)){
			if (currentCode.equals("99")){
				return ("A0");
			}
			else
			return (String.valueOf(Integer.parseInt(currentCode)+1));
		}
		else{
		String lastChar=currentCode.substring(1);
		if  (isNumeric(lastChar)){
		
				String firstChar=currentCode.substring(0,1);
				return firstChar+(String.valueOf(Integer.parseInt(lastChar)+1));
			
		}
		else return("ZZ");
		}
			
	}
	
	private boolean isNumeric(String s){
	    String pattern= "^[0-9]*$";
	        if(s.matches(pattern)){
	            return true;
	        }
	        return false;   
	}
	
	void onActivate() {
		if (request.getParameter("id") != null) {
			try {
				dishGroupId = request.getParameter("id");
				dishGroup = masterFilesService
						.getDishGroupByDishGroupId(Integer.parseInt(request
								.getParameter("id")));
				dishGroupId = String.valueOf(dishGroup.getDishGroupId());
				editdishGroupCode=dishGroup.getDishGroupCode();
				editDishGroupDesc = dishGroup.getDishGroupDescription();
				editTypeIncome = dishGroup.gettypeIncome();
				editMacroGroup = String.valueOf(dishGroup.getmacroGroup());
				editSalesLedgerAccount = dishGroup.getsalesLedgerAccount();
				editIvaType = String.valueOf(dishGroup.getivaType());
			} catch (NumberFormatException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (InstanceNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		}
		else{
		}
	}

	void onValidateFromAddRowForm() throws NumberFormatException, DuplicateInstanceException {
		masterFilesService.createDishGroup(new DishGroup(dishGroupCode, dishGroupDesc, Integer
				.valueOf(ivaType), salesLedgerAccount, typeIncome, Integer
				.valueOf(macroGroup)));
	}

	void onDeleteRows(String rows) {
		String[] row = rows.split(":");
		for (int i = 0; i < row.length; i++) {
			int dishGroupId = Integer.parseInt(row[i]);
			try {
				masterFilesService.deleteDishGroup(dishGroupId);
			} catch (InstanceNotFoundException e) {
				System.out.println("error al eliminar");
			}
		}
	}

	void onSuccessFromEditRowForm() {
		try {
			masterFilesService.editDishGroup(Integer.parseInt(dishGroupId),editdishGroupCode, editDishGroupDesc, Integer.parseInt(editIvaType), Integer.parseInt(editMacroGroup), editSalesLedgerAccount, editTypeIncome);
		} catch (NumberFormatException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (InstanceNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	

	void afterRender() {
	System.out.println("after");
	}

}
