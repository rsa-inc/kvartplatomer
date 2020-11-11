package com.company.kvartplatomer.web.screens.object;

import com.haulmont.cuba.gui.screen.*;
import com.company.kvartplatomer.entity.Object;

@UiController("kvartplatomer_Object.browse")
@UiDescriptor("object-browse.xml")
@LookupComponent("objectsTable")
@LoadDataBeforeShow
public class ObjectBrowse extends StandardLookup<Object> {
}