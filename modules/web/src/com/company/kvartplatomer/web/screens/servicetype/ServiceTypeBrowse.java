package com.company.kvartplatomer.web.screens.servicetype;

import com.haulmont.cuba.gui.screen.*;
import com.company.kvartplatomer.entity.ServiceType;

@UiController("kvartplatomer_ServiceType.browse")
@UiDescriptor("service-type-browse.xml")
@LookupComponent("serviceTypesTable")
@LoadDataBeforeShow
public class ServiceTypeBrowse extends StandardLookup<ServiceType> {
}