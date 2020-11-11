package com.company.kvartplatomer.web.screens.serviceprovider;

import com.haulmont.cuba.gui.screen.*;
import com.company.kvartplatomer.entity.ServiceProvider;

@UiController("kvartplatomer_ServiceProvider.browse")
@UiDescriptor("service-provider-browse.xml")
@LookupComponent("serviceProvidersTable")
@LoadDataBeforeShow
public class ServiceProviderBrowse extends StandardLookup<ServiceProvider> {
}