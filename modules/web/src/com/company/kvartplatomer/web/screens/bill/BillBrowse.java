package com.company.kvartplatomer.web.screens.bill;

import com.haulmont.cuba.gui.screen.*;
import com.company.kvartplatomer.entity.Bill;

@UiController("kvartplatomer_Bill.browse")
@UiDescriptor("bill-browse.xml")
@LookupComponent("table")
@LoadDataBeforeShow
public class BillBrowse extends MasterDetailScreen<Bill> {
}
