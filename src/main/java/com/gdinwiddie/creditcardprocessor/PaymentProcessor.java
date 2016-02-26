package com.gdinwiddie.creditcardprocessor;

public class PaymentProcessor {

	private static PaymentProcessor theProcessor;

	public static PaymentProcessor instance() {
		if (null == theProcessor) {
			theProcessor = new PaymentProcessor();
		}
		return theProcessor;
	}

	public PaymentResult acceptPayment(CreditCardInfo creditCard) {
		if (!creditCard.validate()) {
			return new PaymentResult(false, "Invalid card information");
		}
		PaymentResult paymentResult = new PaymentResult(false, "Declined for lack of merchant account");
		return paymentResult ;
	}

}
