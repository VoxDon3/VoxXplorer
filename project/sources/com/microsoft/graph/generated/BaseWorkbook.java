package com.microsoft.graph.generated;

import ax.T9.d;
import ax.T9.e;
import ax.r8.C3003l;
import ax.s8.InterfaceC3059a;
import ax.s8.InterfaceC3061c;
import com.microsoft.graph.extensions.Entity;
import com.microsoft.graph.extensions.WorkbookApplication;
import com.microsoft.graph.extensions.WorkbookFunctions;
import com.microsoft.graph.extensions.WorkbookNamedItem;
import com.microsoft.graph.extensions.WorkbookNamedItemCollectionPage;
import com.microsoft.graph.extensions.WorkbookTable;
import com.microsoft.graph.extensions.WorkbookTableCollectionPage;
import com.microsoft.graph.extensions.WorkbookWorksheet;
import com.microsoft.graph.extensions.WorkbookWorksheetCollectionPage;
import java.util.Arrays;

/* loaded from: classes3.dex */
public class BaseWorkbook extends Entity implements d {

    @InterfaceC3059a
    @InterfaceC3061c("application")
    public WorkbookApplication f;
    public transient WorkbookNamedItemCollectionPage g;
    public transient WorkbookTableCollectionPage h;
    public transient WorkbookWorksheetCollectionPage i;

    @InterfaceC3059a
    @InterfaceC3061c("functions")
    public WorkbookFunctions j;
    private transient C3003l k;
    private transient e l;

    @Override // com.microsoft.graph.generated.BaseEntity, ax.T9.d
    public void d(e eVar, C3003l c3003l) {
        this.l = eVar;
        this.k = c3003l;
        if (c3003l.x("names")) {
            BaseWorkbookNamedItemCollectionResponse baseWorkbookNamedItemCollectionResponse = new BaseWorkbookNamedItemCollectionResponse();
            if (c3003l.x("names@odata.nextLink")) {
                baseWorkbookNamedItemCollectionResponse.b = c3003l.t("names@odata.nextLink").k();
            }
            C3003l[] c3003lArr = (C3003l[]) eVar.b(c3003l.t("names").toString(), C3003l[].class);
            WorkbookNamedItem[] workbookNamedItemArr = new WorkbookNamedItem[c3003lArr.length];
            for (int i = 0; i < c3003lArr.length; i++) {
                WorkbookNamedItem workbookNamedItem = (WorkbookNamedItem) eVar.b(c3003lArr[i].toString(), WorkbookNamedItem.class);
                workbookNamedItemArr[i] = workbookNamedItem;
                workbookNamedItem.d(eVar, c3003lArr[i]);
            }
            baseWorkbookNamedItemCollectionResponse.a = Arrays.asList(workbookNamedItemArr);
            this.g = new WorkbookNamedItemCollectionPage(baseWorkbookNamedItemCollectionResponse, null);
        }
        if (c3003l.x("tables")) {
            BaseWorkbookTableCollectionResponse baseWorkbookTableCollectionResponse = new BaseWorkbookTableCollectionResponse();
            if (c3003l.x("tables@odata.nextLink")) {
                baseWorkbookTableCollectionResponse.b = c3003l.t("tables@odata.nextLink").k();
            }
            C3003l[] c3003lArr2 = (C3003l[]) eVar.b(c3003l.t("tables").toString(), C3003l[].class);
            WorkbookTable[] workbookTableArr = new WorkbookTable[c3003lArr2.length];
            for (int i2 = 0; i2 < c3003lArr2.length; i2++) {
                WorkbookTable workbookTable = (WorkbookTable) eVar.b(c3003lArr2[i2].toString(), WorkbookTable.class);
                workbookTableArr[i2] = workbookTable;
                workbookTable.d(eVar, c3003lArr2[i2]);
            }
            baseWorkbookTableCollectionResponse.a = Arrays.asList(workbookTableArr);
            this.h = new WorkbookTableCollectionPage(baseWorkbookTableCollectionResponse, null);
        }
        if (c3003l.x("worksheets")) {
            BaseWorkbookWorksheetCollectionResponse baseWorkbookWorksheetCollectionResponse = new BaseWorkbookWorksheetCollectionResponse();
            if (c3003l.x("worksheets@odata.nextLink")) {
                baseWorkbookWorksheetCollectionResponse.b = c3003l.t("worksheets@odata.nextLink").k();
            }
            C3003l[] c3003lArr3 = (C3003l[]) eVar.b(c3003l.t("worksheets").toString(), C3003l[].class);
            WorkbookWorksheet[] workbookWorksheetArr = new WorkbookWorksheet[c3003lArr3.length];
            for (int i3 = 0; i3 < c3003lArr3.length; i3++) {
                WorkbookWorksheet workbookWorksheet = (WorkbookWorksheet) eVar.b(c3003lArr3[i3].toString(), WorkbookWorksheet.class);
                workbookWorksheetArr[i3] = workbookWorksheet;
                workbookWorksheet.d(eVar, c3003lArr3[i3]);
            }
            baseWorkbookWorksheetCollectionResponse.a = Arrays.asList(workbookWorksheetArr);
            this.i = new WorkbookWorksheetCollectionPage(baseWorkbookWorksheetCollectionResponse, null);
        }
    }
}
