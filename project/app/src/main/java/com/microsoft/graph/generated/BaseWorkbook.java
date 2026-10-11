/*
 * Decompiled with CFR 0.152.
 */
package com.microsoft.graph.generated;

import ax.T9.d;
import ax.T9.e;
import ax.r8.i;
import ax.r8.l;
import ax.s8.a;
import ax.s8.c;
import com.microsoft.graph.extensions.Entity;
import com.microsoft.graph.extensions.WorkbookApplication;
import com.microsoft.graph.extensions.WorkbookFunctions;
import com.microsoft.graph.extensions.WorkbookNamedItem;
import com.microsoft.graph.extensions.WorkbookNamedItemCollectionPage;
import com.microsoft.graph.extensions.WorkbookTable;
import com.microsoft.graph.extensions.WorkbookTableCollectionPage;
import com.microsoft.graph.extensions.WorkbookWorksheet;
import com.microsoft.graph.extensions.WorkbookWorksheetCollectionPage;
import com.microsoft.graph.generated.BaseWorkbookNamedItem;
import com.microsoft.graph.generated.BaseWorkbookNamedItemCollectionResponse;
import com.microsoft.graph.generated.BaseWorkbookTable;
import com.microsoft.graph.generated.BaseWorkbookTableCollectionResponse;
import com.microsoft.graph.generated.BaseWorkbookWorksheet;
import com.microsoft.graph.generated.BaseWorkbookWorksheetCollectionResponse;
import java.util.Arrays;

public class BaseWorkbook
extends Entity
implements d {
    @a
    @c(value="application")
    public WorkbookApplication f;
    public transient WorkbookNamedItemCollectionPage g;
    public transient WorkbookTableCollectionPage h;
    public transient WorkbookWorksheetCollectionPage i;
    @a
    @c(value="functions")
    public WorkbookFunctions j;
    private transient l k;
    private transient e l;

    @Override
    public void d(e e8, l object) {
        Entity entity;
        int n8;
        Object[] objectArray;
        l[] lArray;
        Object[] objectArray2;
        this.l = e8;
        this.k = object;
        boolean bl = ((l)object).x("names");
        int n9 = 0;
        if (bl) {
            objectArray2 = new BaseWorkbookNamedItemCollectionResponse();
            if (((l)object).x("names@odata.nextLink")) {
                objectArray2.b = ((l)object).t("names@odata.nextLink").k();
            }
            lArray = e8.b(((l)object).t("names").toString(), l[].class);
            objectArray = new WorkbookNamedItem[lArray.length];
            for (n8 = 0; n8 < lArray.length; ++n8) {
                entity = e8.b(lArray[n8].toString(), WorkbookNamedItem.class);
                objectArray[n8] = entity;
                ((BaseWorkbookNamedItem)entity).d(e8, lArray[n8]);
            }
            objectArray2.a = Arrays.asList(objectArray);
            this.g = new WorkbookNamedItemCollectionPage((BaseWorkbookNamedItemCollectionResponse)objectArray2, null);
        }
        if (((l)object).x("tables")) {
            lArray = new BaseWorkbookTableCollectionResponse();
            if (((l)object).x("tables@odata.nextLink")) {
                lArray.b = ((l)object).t("tables@odata.nextLink").k();
            }
            objectArray2 = e8.b(((l)object).t("tables").toString(), l[].class);
            objectArray = new WorkbookTable[objectArray2.length];
            for (n8 = 0; n8 < objectArray2.length; ++n8) {
                entity = e8.b(((i)objectArray2[n8]).toString(), WorkbookTable.class);
                objectArray[n8] = entity;
                ((BaseWorkbookTable)entity).d(e8, (l)objectArray2[n8]);
            }
            lArray.a = Arrays.asList(objectArray);
            this.h = new WorkbookTableCollectionPage((BaseWorkbookTableCollectionResponse)lArray, null);
        }
        if (((l)object).x("worksheets")) {
            lArray = new BaseWorkbookWorksheetCollectionResponse();
            if (((l)object).x("worksheets@odata.nextLink")) {
                lArray.b = ((l)object).t("worksheets@odata.nextLink").k();
            }
            objectArray = e8.b(((l)object).t("worksheets").toString(), l[].class);
            objectArray2 = new WorkbookWorksheet[objectArray.length];
            for (n8 = n9; n8 < objectArray.length; ++n8) {
                objectArray2[n8] = object = e8.b(((i)objectArray[n8]).toString(), WorkbookWorksheet.class);
                ((BaseWorkbookWorksheet)object).d(e8, (l)objectArray[n8]);
            }
            lArray.a = Arrays.asList(objectArray2);
            this.i = new WorkbookWorksheetCollectionPage((BaseWorkbookWorksheetCollectionResponse)lArray, null);
        }
    }
}

