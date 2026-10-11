package com.microsoft.graph.generated;

import ax.T9.d;
import ax.T9.e;
import ax.r8.C3003l;
import ax.s8.InterfaceC3059a;
import ax.s8.InterfaceC3061c;
import com.microsoft.graph.extensions.Entity;
import com.microsoft.graph.extensions.WorkbookTableColumn;
import com.microsoft.graph.extensions.WorkbookTableColumnCollectionPage;
import com.microsoft.graph.extensions.WorkbookTableRow;
import com.microsoft.graph.extensions.WorkbookTableRowCollectionPage;
import com.microsoft.graph.extensions.WorkbookTableSort;
import com.microsoft.graph.extensions.WorkbookWorksheet;
import java.util.Arrays;

/* loaded from: classes3.dex */
public class BaseWorkbookTable extends Entity implements d {

    @InterfaceC3059a
    @InterfaceC3061c("highlightFirstColumn")
    public Boolean f;

    @InterfaceC3059a
    @InterfaceC3061c("highlightLastColumn")
    public Boolean g;

    @InterfaceC3059a
    @InterfaceC3061c("name")
    public String h;

    @InterfaceC3059a
    @InterfaceC3061c("showBandedColumns")
    public Boolean i;

    @InterfaceC3059a
    @InterfaceC3061c("showBandedRows")
    public Boolean j;

    @InterfaceC3059a
    @InterfaceC3061c("showFilterButton")
    public Boolean k;

    @InterfaceC3059a
    @InterfaceC3061c("showHeaders")
    public Boolean l;

    @InterfaceC3059a
    @InterfaceC3061c("showTotals")
    public Boolean m;

    @InterfaceC3059a
    @InterfaceC3061c("style")
    public String n;
    public transient WorkbookTableColumnCollectionPage o;
    public transient WorkbookTableRowCollectionPage p;

    @InterfaceC3059a
    @InterfaceC3061c("sort")
    public WorkbookTableSort q;

    @InterfaceC3059a
    @InterfaceC3061c("worksheet")
    public WorkbookWorksheet r;
    private transient C3003l s;
    private transient e t;

    @Override // com.microsoft.graph.generated.BaseEntity, ax.T9.d
    public void d(e eVar, C3003l c3003l) {
        this.t = eVar;
        this.s = c3003l;
        if (c3003l.x("columns")) {
            BaseWorkbookTableColumnCollectionResponse baseWorkbookTableColumnCollectionResponse = new BaseWorkbookTableColumnCollectionResponse();
            if (c3003l.x("columns@odata.nextLink")) {
                baseWorkbookTableColumnCollectionResponse.b = c3003l.t("columns@odata.nextLink").k();
            }
            C3003l[] c3003lArr = (C3003l[]) eVar.b(c3003l.t("columns").toString(), C3003l[].class);
            WorkbookTableColumn[] workbookTableColumnArr = new WorkbookTableColumn[c3003lArr.length];
            for (int i = 0; i < c3003lArr.length; i++) {
                WorkbookTableColumn workbookTableColumn = (WorkbookTableColumn) eVar.b(c3003lArr[i].toString(), WorkbookTableColumn.class);
                workbookTableColumnArr[i] = workbookTableColumn;
                workbookTableColumn.d(eVar, c3003lArr[i]);
            }
            baseWorkbookTableColumnCollectionResponse.a = Arrays.asList(workbookTableColumnArr);
            this.o = new WorkbookTableColumnCollectionPage(baseWorkbookTableColumnCollectionResponse, null);
        }
        if (c3003l.x("rows")) {
            BaseWorkbookTableRowCollectionResponse baseWorkbookTableRowCollectionResponse = new BaseWorkbookTableRowCollectionResponse();
            if (c3003l.x("rows@odata.nextLink")) {
                baseWorkbookTableRowCollectionResponse.b = c3003l.t("rows@odata.nextLink").k();
            }
            C3003l[] c3003lArr2 = (C3003l[]) eVar.b(c3003l.t("rows").toString(), C3003l[].class);
            WorkbookTableRow[] workbookTableRowArr = new WorkbookTableRow[c3003lArr2.length];
            for (int i2 = 0; i2 < c3003lArr2.length; i2++) {
                WorkbookTableRow workbookTableRow = (WorkbookTableRow) eVar.b(c3003lArr2[i2].toString(), WorkbookTableRow.class);
                workbookTableRowArr[i2] = workbookTableRow;
                workbookTableRow.d(eVar, c3003lArr2[i2]);
            }
            baseWorkbookTableRowCollectionResponse.a = Arrays.asList(workbookTableRowArr);
            this.p = new WorkbookTableRowCollectionPage(baseWorkbookTableRowCollectionResponse, null);
        }
    }
}
