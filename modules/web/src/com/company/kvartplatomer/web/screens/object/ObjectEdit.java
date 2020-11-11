package com.company.kvartplatomer.web.screens.object;

import com.haulmont.cuba.gui.screen.*;
import com.company.kvartplatomer.entity.Object;

@UiController("kvartplatomer_Object.edit")
@UiDescriptor("object-edit.xml")
@EditedEntityContainer("objectDc")
@LoadDataBeforeShow
public class ObjectEdit extends StandardEditor<Object> {
}