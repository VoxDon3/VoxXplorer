package com.microsoft.graph.generated;

import ax.T9.d;
import ax.T9.e;
import ax.r8.C3003l;
import ax.s8.InterfaceC3059a;
import ax.s8.InterfaceC3061c;
import com.microsoft.graph.extensions.Entity;
import com.microsoft.graph.extensions.WorkbookChartPoint;
import com.microsoft.graph.extensions.WorkbookChartPointCollectionPage;
import com.microsoft.graph.extensions.WorkbookChartSeriesFormat;
import java.util.Arrays;

/* loaded from: classes3.dex */
public class BaseWorkbookChartSeries extends Entity implements d {

    @InterfaceC3059a
    @InterfaceC3061c("name")
    public String f;

    @InterfaceC3059a
    @InterfaceC3061c("format")
    public WorkbookChartSeriesFormat g;
    public transient WorkbookChartPointCollectionPage h;
    private transient C3003l i;
    private transient e j;

    @Override // com.microsoft.graph.generated.BaseEntity, ax.T9.d
    public void d(e eVar, C3003l c3003l) {
        this.j = eVar;
        this.i = c3003l;
        if (c3003l.x("points")) {
            BaseWorkbookChartPointCollectionResponse baseWorkbookChartPointCollectionResponse = new BaseWorkbookChartPointCollectionResponse();
            if (c3003l.x("points@odata.nextLink")) {
                baseWorkbookChartPointCollectionResponse.b = c3003l.t("points@odata.nextLink").k();
            }
            C3003l[] c3003lArr = (C3003l[]) eVar.b(c3003l.t("points").toString(), C3003l[].class);
            WorkbookChartPoint[] workbookChartPointArr = new WorkbookChartPoint[c3003lArr.length];
            for (int i = 0; i < c3003lArr.length; i++) {
                WorkbookChartPoint workbookChartPoint = (WorkbookChartPoint) eVar.b(c3003lArr[i].toString(), WorkbookChartPoint.class);
                workbookChartPointArr[i] = workbookChartPoint;
                workbookChartPoint.d(eVar, c3003lArr[i]);
            }
            baseWorkbookChartPointCollectionResponse.a = Arrays.asList(workbookChartPointArr);
            this.h = new WorkbookChartPointCollectionPage(baseWorkbookChartPointCollectionResponse, null);
        }
    }
}
