package com.zsmart.declaration.ws.rest.converter;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import com.zsmart.declaration.service.util.*;
import com.zsmart.declaration.bean.Document;
import com.zsmart.declaration.ws.rest.vo.DocumentVo;

@Component
public class DocumentConverter extends AbstractConverter<Document, DocumentVo> {

    private boolean servicePropose;

    @Autowired
    private ServiceProposeConverter serviceProposeConverter;

    @Override
    public Document toItem(DocumentVo vo) {
        if (vo == null) {
            return null;
        } else {
            Document item = new Document();

            if (servicePropose && vo.getServiceProposeVo() != null) {
                item.setServicePropose(serviceProposeConverter.toItem(vo.getServiceProposeVo()));
            }

            if (StringUtil.isNotEmpty(vo.getLibelle())) {
                item.setLibelle(vo.getLibelle());
            }

            if (StringUtil.isNotEmpty(vo.getCode())) {
                item.setCode(vo.getCode());
            }

            if (vo.getId() != null) {
                item.setId(NumberUtil.toLong(vo.getId()));
            }

            if (vo.getOrdre() != null) {
                item.setOrdre(NumberUtil.toInt(vo.getOrdre()));
            }

            if (vo.getNombre() != null) {
                item.setNombre(NumberUtil.toInt(vo.getNombre()));
            }

            return item;
        }
    }

    @Override
    public DocumentVo toVo(Document item) {
        if (item == null) {
            return null;
        } else {
            DocumentVo vo = new DocumentVo();

            if (servicePropose && item.getServicePropose() != null) {
                vo.setServiceProposeVo(serviceProposeConverter.toVo(item.getServicePropose()));
            }

            if (StringUtil.isNotEmpty(item.getLibelle())) {
                vo.setLibelle(item.getLibelle());
            }

            if (StringUtil.isNotEmpty(item.getCode())) {
                vo.setCode(item.getCode());
            }

            if (item.getId() != null) {
                vo.setId(NumberUtil.toString(item.getId()));
            }

            if (item.getOrdre() != null) {
                vo.setOrdre(NumberUtil.toString(item.getOrdre()));
            }

            if (item.getNombre() != null) {
                vo.setNombre(NumberUtil.toString(item.getNombre()));
            }

            return vo;
        }
    }

    public void init() {

        servicePropose = true;
    }
}
