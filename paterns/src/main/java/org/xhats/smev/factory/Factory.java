/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.xhats.smev.factory;

/**
 * Интерфейс фабрики
 *
 * @author Гаврилов АН
 * @param <Req> - входной тип
 * @param <Res> - выходной тип
 */
public interface Factory<Req, Res> extends Runnable {

    public Res newInstance();

    public Res newInstance(Req request);

    public void setRequest(Req request);

    public Res getResponse();
}
