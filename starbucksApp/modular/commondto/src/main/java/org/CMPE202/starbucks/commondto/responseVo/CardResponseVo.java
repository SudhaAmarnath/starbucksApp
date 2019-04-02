package org.CMPE202.starbucks.commondto.responseVo;

import org.CMPE202.starbucks.commondto.model.Card;

import java.util.ArrayList;
import java.util.List;



public class CardResponseVo{

	 String cardNumber;
	 Double balance;
   
	List<Card> allcards = new ArrayList<>();
	

    public List<Card>  getCardDetails() {
        return allcards;
    }

    public void setCardDetails(String cardNumber,String securityCode) {
//        Card card = new Card(cardNumber,securityCode);
        //allcards.add(card);
        
    }

    public Double getBalance() {
		return balance;
	}

	public void setBalance(Double balance) {
		this.balance = balance;
	}

	public String getCardNumber() {
		return cardNumber;
	}

	public void setCardNumber(String cardNumber) {
		this.cardNumber = cardNumber;
	}

	@Override
    public String toString() {
        return "CardResponseVo{" +
                "allcards=" + allcards +
                '}';
    }
}