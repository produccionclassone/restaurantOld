package es.classone.restaurant.model.masterFilesService;

import java.io.IOException;
import java.text.ParseException;
import java.util.Calendar;
import java.util.List;

import es.classone.restaurant.model.channelSegment.ChannelSegment;
import es.classone.restaurant.model.client.Client;
import es.classone.restaurant.model.client.ClientHeader;
import es.classone.restaurant.model.currency.Currency;
import es.classone.restaurant.model.dish.Dish;
import es.classone.restaurant.model.dish.DishHeader;
import es.classone.restaurant.model.dishGroup.DishGroup;
import es.classone.restaurant.model.methodOfPayment.MethodOfPayment;
import es.classone.restaurant.model.qualifier.Qualifier;
import es.classone.restaurant.model.waiter.Waiter;
import es.classone.restaurant.model.waiter.WaiterHeader;
import es.classone.restaurant.modelutil.exceptions.DuplicateInstanceException;
import es.classone.restaurant.modelutil.exceptions.InstanceNotFoundException;

public interface MasterFilesService {
	public List<DishGroup> findAll();

	public DishGroup createDishGroup(DishGroup dishGroup) throws DuplicateInstanceException;

	public DishGroup getDishGroupByDishGroupId(int dishgroupId)
			throws InstanceNotFoundException;

	public void deleteDishGroup(int dishGroupId)
			throws InstanceNotFoundException;

	public DishGroup editDishGroup(int dishGroupId, String dishGroupCode,
			String dishGroupDescription, int ivaType, int macroGroup,
			String salesLedgerAccount, String typeIncome)
			throws InstanceNotFoundException;

	public void importDishGroupFile(String path) throws IOException, DuplicateInstanceException;

	public List<DishHeader> findAllDish();

	public Dish createDish(Dish dish);

	public Dish getDishByDishId(int dishId)
			throws InstanceNotFoundException;

	public void deleteDish(int dishId)
			throws InstanceNotFoundException;

	public Dish editDish(int dishId, String dishDescriptionLang1,String dishDescriptionLang2, String dishDescriptionLang3,
 						 int dishPrint, int dishListPrice, double dishPVP, double dishCostPrice, String dishType, boolean dishDiscount,
						 boolean dishDeleted,boolean dishPending,DishGroup dishGroup, boolean dishTractable,boolean dishOrderer,
						 boolean dishVisible, int dishNumbers, String dishLongDesc, String dishShortDesc) throws InstanceNotFoundException;

	public void importDishFile(String path) throws IOException;

	public List<ClientHeader> findAllClient();

	public Client createClient(Client client);

	public Client getClientByClientId(Long clientId)
			throws InstanceNotFoundException;

	public void deleteClient(Long clientId)
			throws InstanceNotFoundException;

	public Client editClient(long clientId, String clientName, String clientAddress,
			String clientZipCode, String clientDown, String clientProvince,
			String clientDNI, String clientPhoneContact,
			String clientPersonContact, String clientNotes1,
			String clientNotes2, String clientNotes3, double clientLimitCredit,
			double outstandingAmount, Calendar clientLastDateFood,
			double clientAmountSpent, int clientDiners, int clientTimesToEat,
			String clientObservation1, String clientObservation2,
			String clientObservation3, String clientObservation4,
			String ledgerAccount, ChannelSegment channelSegment, boolean sendEmail,
			String clientEmail, boolean sendSMS)
			throws InstanceNotFoundException;

	public void importClientFile(String path) throws IOException, NumberFormatException, ParseException;
	
	
	
	public List<WaiterHeader> findAllWaiter();
	public Waiter  createWaiter(Waiter waiter);

	public void deleteWaiter(int waiterId) throws InstanceNotFoundException;

	public Waiter getWaiterByWaiterId(int waiterId) throws InstanceNotFoundException;

	public Waiter editWaiter(int waiterId, String waiterName,
			String waiterAddress, String waiterZip, String waiterTown,
			String waiterProvince, String waiterDNI, String waiterPhone,
			String waiterContact, String notes1, String notes2, String notes3,
			String chargeType, boolean waiterEnable, Calendar enableTime,
			Calendar disableTime) throws InstanceNotFoundException;
	
	public List<Qualifier> findAllQualifier();
	
	public Qualifier  createQualifier(Qualifier qualifier);

	public void deleteQualifier(int qualifierId) throws InstanceNotFoundException;

	public Qualifier getQualifierByQualifierId(int qualifierId) throws InstanceNotFoundException;

	public Qualifier editQualifier(int qualifierId, String qualifierNameLang1,
			String qualifierNameLang2, String qualifierNameLang3) throws InstanceNotFoundException;
	
	public List<Currency> findAllCurrency();
	
	public Currency  createCurrency(Currency currency);

	public void deleteCurrency(int currencyId) throws InstanceNotFoundException;

	public Currency getCurrencyByCurrencyId(int currencyId) throws InstanceNotFoundException;

	public Currency editCurrency(int currencyId, String currencyCode, String currencyName,
			int currencyChange, float currencyQuote, float commisionPercent) throws InstanceNotFoundException;
	
	public List<MethodOfPayment> findAllMethodOfPayment();
	
	public MethodOfPayment  createMethodOfPayment(MethodOfPayment methodOfPayment);

	public void deleteMethodPayment(int methodPaymentId) throws InstanceNotFoundException;

	public MethodOfPayment getMethodPaymentByMethodPaymentId(int methodPaymentId) throws InstanceNotFoundException;

	public MethodOfPayment editMethodOfPayment(int methodPayId, String methodPayName, String ledgerAccount,
			int chargeType, float percentage, String ledgerAccountTC,
			String ledgerAccountDtoTC, String virtualTpv) throws InstanceNotFoundException;
		
	public List<ChannelSegment> getChannelsSegments();
	
	
	
}
