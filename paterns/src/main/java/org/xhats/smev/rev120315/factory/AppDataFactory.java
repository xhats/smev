/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.xhats.smev.rev120315.factory;

import org.xhats.smev.factory.Factory;
import ru.gosuslugi.smev.rev120315.AppDataType;

/**
 * Интерфейс фабрики для дочерних типов от AppDataType
 *
 * @author Гаврилов АН
 * @param <Req> - входной тип
 * @param <Res> - выходной тип
 */
public interface AppDataFactory<Req extends AppDataType, Res extends AppDataType> extends Factory<Req, Res> {
}
