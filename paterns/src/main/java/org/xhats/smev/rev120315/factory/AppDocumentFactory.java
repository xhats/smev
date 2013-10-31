/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.xhats.smev.rev120315.factory;

import org.xhats.smev.factory.Factory;
import ru.gosuslugi.smev.rev120315.AppDocumentType;

/**
 *
 * @author Гаврилов АН
 */
public interface AppDocumentFactory<Req extends AppDocumentType, Res extends AppDocumentType> extends Factory<Req, Res> {
}
