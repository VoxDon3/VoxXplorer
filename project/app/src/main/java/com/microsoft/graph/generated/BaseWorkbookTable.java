/*
 * Decompiled with CFR 0.152.
 */
package com.microsoft.graph.generated;

import ax.T9.d;
import ax.T9.e;
import ax.r8.l;
import ax.s8.a;
import ax.s8.c;
import com.microsoft.graph.extensions.Entity;
import com.microsoft.graph.extensions.WorkbookTableColumn;
import com.microsoft.graph.extensions.WorkbookTableColumnCollectionPage;
import com.microsoft.graph.extensions.WorkbookTableRow;
import com.microsoft.graph.extensions.WorkbookTableRowCollectionPage;
import com.microsoft.graph.extensions.WorkbookTableSort;
import com.microsoft.graph.extensions.WorkbookWorksheet;
import com.microsoft.graph.generated.BaseWorkbookTableColumn;
import com.microsoft.graph.generated.BaseWorkbookTableColumnCollectionResponse;
import com.microsoft.graph.generated.BaseWorkbookTableRow;
import com.microsoft.graph.generated.BaseWorkbookTableRowCollectionResponse;
import java.util.Arrays;

public class BaseWorkbookTable
extends Entity
implements d {
    @a
    @c(value="highlightFirstColumn")
    public Boolean f;
    @a
    @c(value="highlightLastColumn")
    public Boolean g;
    @a
    @c(value="name")
    public String h;
    @a
    @c(value="showBandedColumns")
    public Boolean i;
    @a
    @c(value="showBandedRows")
    public Boolean j;
    @a
    @c(value="showFilterButton")
    public Boolean k;
    @a
    @c(value="showHeaders")
    public Boolean l;
    @a
    @c(value="showTotals")
    public Boolean m;
    @a
    @c(value="style")
    public String n;
    public transient WorkbookTableColumnCollectionPage o;
    public transient WorkbookTableRowCollectionPage p;
    @a
    @c(value="sort")
    public WorkbookTableSort q;
    @a
    @c(value="worksheet")
    public WorkbookWorksheet r;
    private transient l s;
    private transient e t;

    @Override
    public void d(e e8, l lArray) {
        Entity entity;
        int n8;
        Entity[] entityArray;
        d d8;
        this.t = e8;
        this.s = lArray;
        boolean bl = lArray.x("columns");
        int n9 = 0;
        if (bl) {
            d8 = new BaseWorkbookTableColumnCollectionResponse();
            if (lArray.x("columns@odata.nextLink")) {
                d8.b = lArray.t("columns@odata.nextLink").k();
            }
            l[] lArray2 = e8.b(lArray.t("columns").toString(), l[].class);
            entityArray = new WorkbookTableColumn[lArray2.length];
            for (n8 = 0; n8 < lArray2.length; ++n8) {
                entityArray[n8] = entity = e8.b(lArray2[n8].toString(), WorkbookTableColumn.class);
                ((BaseWorkbookTableColumn)entity).d(e8, lArray2[n8]);
            }
            d8.a = Arrays.asList(entityArray);
            this.o = new WorkbookTableColumnCollectionPage((BaseWorkbookTableColumnCollectionResponse)d8, null);
        }
        if (lArray.x("rows")) {
            d8 = new BaseWorkbookTableRowCollectionResponse();
            if (lArray.x("rows@odata.nextLink")) {
                ((BaseWorkbookTableRowCollectionResponse)d8).b = lArray.t("rows@odata.nextLink").k();
            }
            lArray = e8.b(lArray.t("rows").toString(), l[].class);
            entityArray = new WorkbookTableRow[lArray.length];
            for (n8 = n9; n8 < lArray.length; ++n8) {
                entityArray[n8] = entity = e8.b(lArray[n8].toString(), WorkbookTableRow.class);
                ((BaseWorkbookTableRow)entity).d(e8, lArray[n8]);
            }
            ((BaseWorkbookTableRowCollectionResponse)d8).a = Arrays.asList(entityArray);
            this.p = new WorkbookTableRowCollectionPage((BaseWorkbookTableRowCollectionResponse)d8, null);
        }
    }
}

