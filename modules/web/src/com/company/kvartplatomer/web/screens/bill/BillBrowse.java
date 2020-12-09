package com.company.kvartplatomer.web.screens.bill;

import com.company.kvartplatomer.entity.ServiceAccount;
import com.haulmont.cuba.core.global.DataManager;
import com.haulmont.cuba.core.global.MetadataTools;
import com.haulmont.cuba.gui.Notifications;
import com.haulmont.cuba.gui.components.Action;
import com.haulmont.cuba.gui.components.ActionType;
import com.haulmont.cuba.gui.components.actions.ItemTrackingAction;
import com.haulmont.cuba.gui.screen.*;
import com.company.kvartplatomer.entity.Bill;

import javax.inject.Inject;
import javax.management.Notification;
import java.util.Optional;

@UiController("kvartplatomer_Bill.browse")
@UiDescriptor("bill-browse.xml")
@LookupComponent("table")
@LoadDataBeforeShow
public class BillBrowse extends MasterDetailScreen<Bill> {
/*    @Subscribe
    public void onInitEntity(InitEntityEvent<Bill> event) {
        event.getEntity().getMonth();
    }*/
@Inject
private Notifications notifications;
    @Inject
    private DataManager dataManager;

    @Subscribe("table.mycopy")
protected void onTableMyCopyActionPerformed(Action.ActionPerformedEvent event){
        Long billCount = dataManager.loadValue("select count(s) from kvartplatomer_Bill s", Long.class)
                .one();
//        Long accountCount=dataManager.loadValue("select count(e) from kvartplatomer_ServiceAccount e " +
//                "where e.kvartplatomer_ServiceAccount is not null", Long.class)
//                .one();
        notifications.create()
                   .withCaption(String.valueOf(billCount))
//                    .withCaption(String.valueOf(accountCount))
                    .show();
    }


    @Subscribe("table.generateBills")
protected void onTableGenerateBillsActionPerformed(Action.ActionPerformedEvent event){

}
}


/*@ActionType("showSelected")
public class ShowSelectedAction extends ItemTrackingAction {
    @Inject
    private MetadataTools metadataTools;

    public ShowSelectedAction(String id){
        super(id);
        setCaption("Show Selected");
    }

}
 */