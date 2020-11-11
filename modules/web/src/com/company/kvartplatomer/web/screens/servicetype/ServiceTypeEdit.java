package com.company.kvartplatomer.web.screens.servicetype;

import com.haulmont.cuba.gui.screen.*;
import com.company.kvartplatomer.entity.ServiceType;

@UiController("kvartplatomer_ServiceType.edit")
@UiDescriptor("service-type-edit.xml")
@EditedEntityContainer("serviceTypeDc")
@LoadDataBeforeShow
public class ServiceTypeEdit extends StandardEditor<ServiceType> {
}