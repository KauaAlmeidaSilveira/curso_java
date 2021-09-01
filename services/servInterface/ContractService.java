package servInterface;

import java.util.Calendar;
import java.util.Date;

import entInterfaces.contract;
import entInterfaces.parcelas;

public class ContractService {

	private OnlinePaymentService OPS;
	
	public ContractService(OnlinePaymentService OPS) {
		this.OPS = OPS;
	}
	
	public void processContract(contract contract, Integer months) {
		
		double basicQuota = contract.getTotalValue()/months;
		
		for(int i=1; i<= months; i++) {
			
			double updateQuota = basicQuota + OPS.interest(basicQuota, i);
		
			double totalQuota = updateQuota + OPS.paymentFee(updateQuota);
			
			Date dueDate = addMonths(contract.getDate(), i);
			
			contract.getParcelas().add(new parcelas(dueDate, totalQuota));
			
		}
	}
	
	private Date addMonths(Date date, int N) {
		
		Calendar calendar = Calendar.getInstance();
		
		calendar.setTime(date);
	
		calendar.add(Calendar.MONTH, N);
		
		return calendar.getTime();
		
	}
}
