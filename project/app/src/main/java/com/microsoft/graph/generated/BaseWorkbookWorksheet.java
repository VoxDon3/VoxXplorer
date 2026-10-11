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
import com.microsoft.graph.extensions.WorkbookChart;
import com.microsoft.graph.extensions.WorkbookChartCollectionPage;
import com.microsoft.graph.extensions.WorkbookNamedItem;
import com.microsoft.graph.extensions.WorkbookNamedItemCollectionPage;
import com.microsoft.graph.extensions.WorkbookPivotTable;
import com.microsoft.graph.extensions.WorkbookPivotTableCollectionPage;
import com.microsoft.graph.extensions.WorkbookTable;
import com.microsoft.graph.extensions.WorkbookTableCollectionPage;
import com.microsoft.graph.extensions.WorkbookWorksheetProtection;
import com.microsoft.graph.generated.BaseWorkbookChart;
import com.microsoft.graph.generated.BaseWorkbookChartCollectionResponse;
import com.microsoft.graph.generated.BaseWorkbookNamedItem;
import com.microsoft.graph.generated.BaseWorkbookNamedItemCollectionResponse;
import com.microsoft.graph.generated.BaseWorkbookPivotTable;
import com.microsoft.graph.generated.BaseWorkbookPivotTableCollectionResponse;
import com.microsoft.graph.generated.BaseWorkbookTable;
import com.microsoft.graph.generated.BaseWorkbookTableCollectionResponse;
import java.util.Arrays;

public class BaseWorkbookWorksheet
extends Entity
implements d {
    @a
    @c(value="name")
    public String f;
    @a
    @c(value="position")
    public Integer g;
    @a
    @c(value="visibility")
    public String h;
    public transient WorkbookChartCollectionPage i;
    public transient WorkbookNamedItemCollectionPage j;
    public transient WorkbookPivotTableCollectionPage k;
    @a
    @c(value="protection")
    public WorkbookWorksheetProtection l;
    public transient WorkbookTableCollectionPage m;
    private transient l n;
    private transient e o;

    @Override
    public void d(e e8, l lArray) {
        Object object;
        int n8;
        Entity[] entityArray;
        l[] lArray2;
        Object object2;
        this.o = e8;
        this.n = lArray;
        boolean bl = lArray.x("charts");
        int n9 = 0;
        if (bl) {
            object2 = new BaseWorkbookChartCollectionResponse();
            if (lArray.x("charts@odata.nextLink")) {
                ((BaseWorkbookChartCollectionResponse)object2).b = lArray.t("charts@odata.nextLink").k();
            }
            lArray2 = e8.b(lArray.t("charts").toString(), l[].class);
            entityArray = new WorkbookChart[lArray2.length];
            for (n8 = 0; n8 < lArray2.length; ++n8) {
                object = e8.b(lArray2[n8].toString(), WorkbookChart.class);
                entityArray[n8] = object;
                ((BaseWorkbookChart)object).d(e8, lArray2[n8]);
            }
            ((BaseWorkbookChartCollectionResponse)object2).a = Arrays.asList(entityArray);
            this.i = new WorkbookChartCollectionPage((BaseWorkbookChartCollectionResponse)object2, null);
        }
        if (lArray.x("names")) {
            object2 = new BaseWorkbookNamedItemCollectionResponse();
            if (lArray.x("names@odata.nextLink")) {
                ((BaseWorkbookNamedItemCollectionResponse)object2).b = lArray.t("names@odata.nextLink").k();
            }
            lArray2 = e8.b(lArray.t("names").toString(), l[].class);
            entityArray = new WorkbookNamedItem[lArray2.length];
            for (n8 = 0; n8 < lArray2.length; ++n8) {
                entityArray[n8] = object = e8.b(lArray2[n8].toString(), WorkbookNamedItem.class);
                ((BaseWorkbookNamedItem)object).d(e8, lArray2[n8]);
            }
            ((BaseWorkbookNamedItemCollectionResponse)object2).a = Arrays.asList(entityArray);
            this.j = new WorkbookNamedItemCollectionPage((BaseWorkbookNamedItemCollectionResponse)object2, null);
        }
        if (lArray.x("pivotTables")) {
            entityArray = new BaseWorkbookPivotTableCollectionResponse();
            if (lArray.x("pivotTables@odata.nextLink")) {
                entityArray.b = lArray.t("pivotTables@odata.nextLink").k();
            }
            lArray2 = e8.b(lArray.t("pivotTables").toString(), l[].class);
            object = new WorkbookPivotTable[lArray2.length];
            for (n8 = 0; n8 < lArray2.length; ++n8) {
                object[n8] = object2 = e8.b(lArray2[n8].toString(), WorkbookPivotTable.class);
                ((BaseWorkbookPivotTable)object2).d(e8, lArray2[n8]);
            }
            entityArray.a = Arrays.asList(object);
            this.k = new WorkbookPivotTableCollectionPage((BaseWorkbookPivotTableCollectionResponse)entityArray, null);
        }
        if (lArray.x("tables")) {
            lArray2 = new BaseWorkbookTableCollectionResponse();
            if (lArray.x("tables@odata.nextLink")) {
                lArray2.b = lArray.t("tables@odata.nextLink").k();
            }
            lArray = e8.b(lArray.t("tables").toString(), l[].class);
            object2 = new WorkbookTable[lArray.length];
            for (n8 = n9; n8 < lArray.length; ++n8) {
                object2[n8] = object = e8.b(lArray[n8].toString(), WorkbookTable.class);
                ((BaseWorkbookTable)object).d(e8, lArray[n8]);
            }
            lArray2.a = Arrays.asList(object2);
            this.m = new WorkbookTableCollectionPage((BaseWorkbookTableCollectionResponse)lArray2, null);
        }
    }
}

