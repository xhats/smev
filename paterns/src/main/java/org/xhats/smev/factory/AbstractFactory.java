/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.xhats.smev.factory;

/**
 * Абстрактная фабрика реализующая поддержку интерфейса Runnable
 *
 * @author Гаврилов АН
 * @param <Req> - входной тип
 * @param <Res> - выходной тип
 */
public abstract class AbstractFactory<Req, Res> implements Factory<Req, Res> {

    private Req request;
    private Res response;

    @Override
    public Res newInstance() {
        return newInstance(getRequest());
    }

    ;
    
    @Override
    abstract public Res newInstance(Req request);

    @Override
    public void run() {
        setResponse(null);
        setResponse(newInstance());
    }

    protected Req getRequest() {
        return request;
    }

    @Override
    public void setRequest(Req request) {
        this.request = request;
    }

    @Override
    public Res getResponse() {
        return response;
    }

    protected void setResponse(Res response) {
        this.response = response;
    }
}
