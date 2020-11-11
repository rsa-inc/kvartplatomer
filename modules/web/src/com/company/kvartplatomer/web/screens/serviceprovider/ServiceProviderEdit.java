package com.company.kvartplatomer.web.screens.serviceprovider;

import com.haulmont.cuba.gui.screen.*;
import com.company.kvartplatomer.entity.ServiceProvider;

@UiController("kvartplatomer_ServiceProvider.edit")
@UiDescriptor("service-provider-edit.xml")
@EditedEntityContainer("serviceProviderDc")
@LoadDataBeforeShow
public class ServiceProviderEdit extends StandardEditor<ServiceProvider> {
}