package com.application.service.bank.services.way.delegate;

import com.application.service.bank.model.Client;
import lombok.extern.slf4j.Slf4j;
import org.camunda.bpm.engine.delegate.JavaDelegate;
import org.springframework.stereotype.Component;
import org.camunda.bpm.engine.delegate.DelegateExecution;

import java.math.BigDecimal;

@Slf4j
@Component
public class AppCarPaymentDelegate implements JavaDelegate {
    @Override
    public void execute(DelegateExecution delegateExecution) throws Exception {
        log.info("AppCarPaymentDelegate has started");

        var client = (Client) delegateExecution.getVariable("client");
        var cost  = (BigDecimal) delegateExecution.getVariable("appCarCost");

        var peed = client.getWallet().getAmount().subtract(cost);

        log.info(new StringBuilder("Peed money wallet: ").append(peed).toString());

    }
}
