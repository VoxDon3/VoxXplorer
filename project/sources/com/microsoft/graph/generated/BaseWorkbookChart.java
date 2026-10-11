package com.microsoft.graph.generated;

import ax.T9.d;
import ax.T9.e;
import ax.r8.C3003l;
import ax.s8.InterfaceC3059a;
import ax.s8.InterfaceC3061c;
import com.microsoft.graph.extensions.Entity;
import com.microsoft.graph.extensions.WorkbookChartAreaFormat;
import com.microsoft.graph.extensions.WorkbookChartAxes;
import com.microsoft.graph.extensions.WorkbookChartDataLabels;
import com.microsoft.graph.extensions.WorkbookChartLegend;
import com.microsoft.graph.extensions.WorkbookChartSeries;
import com.microsoft.graph.extensions.WorkbookChartSeriesCollectionPage;
import com.microsoft.graph.extensions.WorkbookChartTitle;
import com.microsoft.graph.extensions.WorkbookWorksheet;
import java.util.Arrays;

/* loaded from: classes3.dex */
public class BaseWorkbookChart extends Entity implements d {

    @InterfaceC3059a
    @InterfaceC3061c("height")
    public Double f;

    @InterfaceC3059a
    @InterfaceC3061c("left")
    public Double g;

    @InterfaceC3059a
    @InterfaceC3061c("name")
    public String h;

    @InterfaceC3059a
    @InterfaceC3061c("top")
    public Double i;

    @InterfaceC3059a
    @InterfaceC3061c("width")
    public Double j;

    @InterfaceC3059a
    @InterfaceC3061c("axes")
    public WorkbookChartAxes k;

    @InterfaceC3059a
    @InterfaceC3061c("dataLabels")
    public WorkbookChartDataLabels l;

    @InterfaceC3059a
    @InterfaceC3061c("format")
    public WorkbookChartAreaFormat m;

    @InterfaceC3059a
    @InterfaceC3061c("legend")
    public WorkbookChartLegend n;
    public transient WorkbookChartSeriesCollectionPage o;

    @InterfaceC3059a
    @InterfaceC3061c("title")
    public WorkbookChartTitle p;

    @InterfaceC3059a
    @InterfaceC3061c("worksheet")
    public WorkbookWorksheet q;
    private transient C3003l r;
    private transient e s;

    @Override // com.microsoft.graph.generated.BaseEntity, ax.T9.d
    public void d(e eVar, C3003l c3003l) {
        this.s = eVar;
        this.r = c3003l;
        if (c3003l.x("series")) {
            BaseWorkbookChartSeriesCollectionResponse baseWorkbookChartSeriesCollectionResponse = new BaseWorkbookChartSeriesCollectionResponse();
            if (c3003l.x("series@odata.nextLink")) {
                baseWorkbookChartSeriesCollectionResponse.b = c3003l.t("series@odata.nextLink").k();
            }
            C3003l[] c3003lArr = (C3003l[]) eVar.b(c3003l.t("series").toString(), C3003l[].class);
            WorkbookChartSeries[] workbookChartSeriesArr = new WorkbookChartSeries[c3003lArr.length];
            for (int i = 0; i < c3003lArr.length; i++) {
                WorkbookChartSeries workbookChartSeries = (WorkbookChartSeries) eVar.b(c3003lArr[i].toString(), WorkbookChartSeries.class);
                workbookChartSeriesArr[i] = workbookChartSeries;
                workbookChartSeries.d(eVar, c3003lArr[i]);
            }
            baseWorkbookChartSeriesCollectionResponse.a = Arrays.asList(workbookChartSeriesArr);
            this.o = new WorkbookChartSeriesCollectionPage(baseWorkbookChartSeriesCollectionResponse, null);
        }
    }
}
