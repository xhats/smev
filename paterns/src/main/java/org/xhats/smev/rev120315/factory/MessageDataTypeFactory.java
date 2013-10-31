/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.xhats.smev.rev120315.factory;

import javax.annotation.Resource;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Component;
import org.xhats.smev.factory.AbstractFactory;
import ru.gosuslugi.smev.rev120315.AppDataType;
import ru.gosuslugi.smev.rev120315.AppDocumentType;
import ru.gosuslugi.smev.rev120315.MessageDataType;

/**
 * Фабрика создающая и заполняющая сообщение в формате СМЭВ
 *
 * @author Гаврилов АН
 */
@Component
public class MessageDataTypeFactory extends AbstractFactory<MessageDataType, MessageDataType> {

    @Resource
    ApplicationContext applicationContext;

    @Override
    public MessageDataType newInstance(MessageDataType request) {
        AbstractFactory<AppDataType, AppDataType> appDataFactory = applicationContext.getBean(request.getAppData().getClass().getSimpleName() + "Factory", AbstractFactory.class);
        AbstractFactory<AppDocumentType, AppDocumentType> appDocumentFactory = applicationContext.getBean(request.getAppDocument().getClass().getSimpleName() + "Factory", AbstractFactory.class);;
        return new MessageDataType(appDataFactory.newInstance(request.getAppData()), appDocumentFactory.newInstance(request.getAppDocument()));
    }
}
