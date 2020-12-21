package com.company.kvartplatomer.web.screens.bill;

import com.company.kvartplatomer.entity.ServiceAccount;
import com.haulmont.cuba.core.global.*;
import com.haulmont.cuba.gui.Notifications;
import com.haulmont.cuba.gui.components.Action;
import com.haulmont.cuba.gui.screen.*;
import com.company.kvartplatomer.entity.Bill;

import javax.inject.Inject;
import java.time.LocalDate;
import java.util.List;

import static com.sun.xml.bind.v2.ClassFactory.create;

@UiController("kvartplatomer_Bill.browse")
@UiDescriptor("bill-browse.xml")
@LookupComponent("table")
@LoadDataBeforeShow
public class BillBrowse extends MasterDetailScreen<Bill> {
    @Inject
    private Notifications notifications;
    @Inject
    private DataManager dataManager;
    @Inject
    private Metadata metadata;
    @Inject
    MetadataTools metadataTools;
    @Inject
    MessageBundle messageBundle;

private Boolean firstStart=true;

    @Subscribe("table.BillsCreate")
    protected void onTableBillsCreateActionPerformed(Action.ActionPerformedEvent event) {
        Integer currentMonth = LocalDate.now().getYear() * 100 + LocalDate.now().getMonthValue();

        LoadContext<ServiceAccount> serviceAccountLoadContext = LoadContext.create(ServiceAccount.class)
                .setQuery(LoadContext.createQuery("select s from kvartplatomer_ServiceAccount s " +
                        "where s.isActive = true"));
        Long activeServiceAccounts = dataManager.getCount(serviceAccountLoadContext);
// or activeServiceAccounts =ServiceAccountsList.stream().count();
        List<ServiceAccount> ServiceAccountsList = dataManager.loadList(serviceAccountLoadContext);
//check existing bills of current month
        LoadContext<Bill> billLoadContext = LoadContext.create(Bill.class)
                .setQuery(LoadContext.createQuery("select b from kvartplatomer_Bill b "  +
                        "where b.month = " + currentMonth))
                        ;
        Long currentNumberOfBills = dataManager.getCount(billLoadContext);
        if (currentNumberOfBills>0&&firstStart)
        {   String errorMessage;
            errorMessage = messageBundle.formatMessage(
                    "There are exist " + currentNumberOfBills + " bills for current month. " +
                            "To continue press Create Bills one more time."
            );
            notifications.create(Notifications.NotificationType.ERROR)
                .withCaption(errorMessage)
                    .show();
            firstStart=false;
            return;
        }

//        Long accountCount = dataManager
//                .loadValue("select e from kvartplatomer_ServiceAccount e " +
//                        "where e.isActive is not null", Long.class)
//                .one();
//        if (accountCount == 0) {
//            notifications.create()
//                    .withCaption("Нет активных аккаунтов.")
//                    .show();
//            return;
//        }

//        notifications.create()
//                .withCaption(String.valueOf(billCount))
//                .withCaption(String.valueOf(ServiceAccountsList.get(0).getAccountNumber()))
//.withCaption(String.valueOf(activeServiceAccounts))
//                .show();
//Creating new bills

         for (int i=0;i<activeServiceAccounts; i++)
         {
             Bill bill=metadata.create(Bill.class);
             bill.setServiceAccount(ServiceAccountsList.get(i));
             bill.setMonth(currentMonth);
             bill.setC_paid(Double.valueOf(i));
             dataManager.commit(bill);
         }

//         Bill bill=metadata.create(Bill.class);
//                 bill.setP_paid(100600.6);
//         dataManager.commit(bill);

    }
}
