package com.zihenx.dsmeta.services;

import com.zihenx.dsmeta.entities.Sale;
import com.zihenx.dsmeta.repositories.SaleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import com.twilio.Twilio;
import com.twilio.rest.api.v2010.account.Message;
import com.twilio.type.PhoneNumber;

import java.time.LocalDate;
import java.util.Locale;

@Service
public class SmsService {

    @Value("${twilio.sid}")
    private String twilioSid;

    @Value("${twilio.key}")
    private String twilioKey;

    @Value("${twilio.phone.from}")
    private String twilioPhoneFrom;

    @Value("${twilio.phone.to}")
    private String twilioPhoneTo;


    @Autowired
    private SaleRepository saleRepository;

    public void sendSms(Long saleId) {
        Sale sale = saleRepository.findById(saleId).get();

        String msg = String.format(new Locale("pt"),"Vendedor %s visitou %d clientes, vendeu para |%,d| no total de R$%.2f no dia %s/%s/%s", sale.getSellerName(), sale.getVisited(), sale.getDeals(), sale.getAmounth(), sale.getDate().getDayOfMonth(), sale.getDate().getMonthValue(), sale.getDate().getYear());

        Twilio.init(twilioSid, twilioKey);

        PhoneNumber to = new PhoneNumber(twilioPhoneTo);
        PhoneNumber from = new PhoneNumber(twilioPhoneFrom);

        Message message = Message.creator(to, from, msg).create();

        System.out.println(message.getSid());
    }
}