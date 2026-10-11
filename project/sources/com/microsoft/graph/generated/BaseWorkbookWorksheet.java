package com.microsoft.graph.generated;

import ax.T9.d;
import ax.T9.e;
import ax.r8.C3003l;
import ax.s8.InterfaceC3059a;
import ax.s8.InterfaceC3061c;
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
import java.util.Arrays;

/* loaded from: classes3.dex */
public class BaseWorkbookWorksheet extends Entity implements d {

    @InterfaceC3059a
    @InterfaceC3061c("name")
    public String f;

    @InterfaceC3059a
    @InterfaceC3061c("position")
    public Integer g;

    @InterfaceC3059a
    @InterfaceC3061c("visibility")
    public String h;
    public transient WorkbookChartCollectionPage i;
    public transient WorkbookNamedItemCollectionPage j;
    public transient WorkbookPivotTableCollectionPage k;

    @InterfaceC3059a
    @InterfaceC3061c("protection")
    public WorkbookWorksheetProtection l;
    public transient WorkbookTableCollectionPage m;
    private transient C3003l n;
    private transient e o;

    @Override // com.microsoft.graph.generated.BaseEntity, ax.T9.d
    public void d(e eVar, C3003l c3003l) {
        this.o = eVar;
        this.n = c3003l;
        if (c3003l.x("charts")) {
            BaseWorkbookChartCollectionResponse baseWorkbookChartCollectionResponse = new BaseWorkbookChartCollectionResponse();
            if (c3003l.x("charts@odata.nextLink")) {
                baseWorkbookChartCollectionResponse.b = c3003l.t("charts@odata.nextLink").k();
            }
            C3003l[] c3003lArr = (C3003l[]) eVar.b(c3003l.t("charts").toString(), C3003l[].class);
            WorkbookChart[] workbookChartArr = new WorkbookChart[c3003lArr.length];
            for (int i = 0; i < c3003lArr.length; i++) {
                WorkbookChart workbookChart = (WorkbookChart) eVar.b(c3003lArr[i].toString(), WorkbookChart.class);
                workbookChartArr[i] = workbookChart;
                workbookChart.d(eVar, c3003lArr[i]);
            }
            baseWorkbookChartCollectionResponse.a = Arrays.asList(workbookChartArr);
            this.i = new WorkbookChartCollectionPage(baseWorkbookChartCollectionResponse, null);
        }
        if (c3003l.x("names")) {
            BaseWorkbookNamedItemCollectionResponse baseWorkbookNamedItemCollectionResponse = new BaseWorkbookNamedItemCollectionResponse();
            if (c3003l.x("names@odata.nextLink")) {
                baseWorkbookNamedItemCollectionResponse.b = c3003l.t("names@odata.nextLink").k();
            }
            C3003l[] c3003lArr2 = (C3003l[]) eVar.b(c3003l.t("names").toString(), C3003l[].class);
            WorkbookNamedItem[] workbookNamedItemArr = new WorkbookNamedItem[c3003lArr2.length];
            for (int i2 = 0; i2 < c3003lArr2.length; i2++) {
                WorkbookNamedItem workbookNamedItem = (WorkbookNamedItem) eVar.b(c3003lArr2[i2].toString(), WorkbookNamedItem.class);
                workbookNamedItemArr[i2] = workbookNamedItem;
                workbookNamedItem.d(eVar, c3003lArr2[i2]);
            }
            baseWorkbookNamedItemCollectionResponse.a = Arrays.asList(workbookNamedItemArr);
            this.j = new WorkbookNamedItemCollectionPage(baseWorkbookNamedItemCollectionResponse, null);
        }
        if (c3003l.x("pivotTables")) {
            BaseWorkbookPivotTableCollectionResponse baseWorkbookPivotTableCollectionResponse = new BaseWorkbookPivotTableCollectionResponse();
            if (c3003l.x("pivotTables@odata.nextLink")) {
                baseWorkbookPivotTableCollectionResponse.b = c3003l.t("pivotTables@odata.nextLink").k();
            }
            C3003l[] c3003lArr3 = (C3003l[]) eVar.b(c3003l.t("pivotTables").toString(), C3003l[].class);
            WorkbookPivotTable[] workbookPivotTableArr = new WorkbookPivotTable[c3003lArr3.length];
            for (int i3 = 0; i3 < c3003lArr3.length; i3++) {
                WorkbookPivotTable workbookPivotTable = (WorkbookPivotTable) eVar.b(c3003lArr3[i3].toString(), WorkbookPivotTable.class);
                workbookPivotTableArr[i3] = workbookPivotTable;
                workbookPivotTable.d(eVar, c3003lArr3[i3]);
            }
            baseWorkbookPivotTableCollectionResponse.a = Arrays.asList(workbookPivotTableArr);
            this.k = new WorkbookPivotTableCollectionPage(baseWorkbookPivotTableCollectionResponse, null);
        }
        if (c3003l.x("tables")) {
            BaseWorkbookTableCollectionResponse baseWorkbookTableCollectionResponse = new BaseWorkbookTableCollectionResponse();
            if (c3003l.x("tables@odata.nextLink")) {
                baseWorkbookTableCollectionResponse.b = c3003l.t("tables@odata.nextLink").k();
            }
            C3003l[] c3003lArr4 = (C3003l[]) eVar.b(c3003l.t("tables").toString(), C3003l[].class);
            WorkbookTable[] workbookTableArr = new WorkbookTable[c3003lArr4.length];
            for (int i4 = 0; i4 < c3003lArr4.length; i4++) {
                WorkbookTable workbookTable = (WorkbookTable) eVar.b(c3003lArr4[i4].toString(), WorkbookTable.class);
                workbookTableArr[i4] = workbookTable;
                workbookTable.d(eVar, c3003lArr4[i4]);
            }
            baseWorkbookTableCollectionResponse.a = Arrays.asList(workbookTableArr);
            this.m = new WorkbookTableCollectionPage(baseWorkbookTableCollectionResponse, null);
        }
    }
}
