/**
 * QueryValidatorServicesService.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.zdmoney.service;

import javax.xml.rpc.ServiceException;

public interface QueryValidatorServicesService extends javax.xml.rpc.Service {
    public java.lang.String getQueryValidatorServicesAddress();

    public QueryValidatorServices getQueryValidatorServices() throws ServiceException;

    public QueryValidatorServices getQueryValidatorServices(java.net.URL portAddress) throws javax.xml.rpc.ServiceException;
}
