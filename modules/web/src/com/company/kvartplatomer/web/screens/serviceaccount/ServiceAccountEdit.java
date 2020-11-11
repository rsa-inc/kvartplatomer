package com.company.kvartplatomer.web.screens.serviceaccount;

import com.haulmont.cuba.gui.screen.*;
import com.company.kvartplatomer.entity.ServiceAccount;

@UiController("kvartplatomer_ServiceAccount.edit")
@UiDescriptor("service-account-edit.xml")
@EditedEntityContainer("serviceAccountDc")
@LoadDataBeforeShow
public class ServiceAccountEdit extends StandardEditor<ServiceAccount> {
}