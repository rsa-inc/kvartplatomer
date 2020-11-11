package com.company.kvartplatomer.web.screens.serviceaccount;

import com.haulmont.cuba.gui.screen.*;
import com.company.kvartplatomer.entity.ServiceAccount;

@UiController("kvartplatomer_ServiceAccount.browse")
@UiDescriptor("service-account-browse.xml")
@LookupComponent("serviceAccountsTable")
@LoadDataBeforeShow
public class ServiceAccountBrowse extends StandardLookup<ServiceAccount> {
}