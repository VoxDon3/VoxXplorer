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
import com.microsoft.graph.extensions.WorkbookChartPoint;
import com.microsoft.graph.extensions.WorkbookChartPointCollectionPage;
import com.microsoft.graph.extensions.WorkbookChartSeriesFormat;
import com.microsoft.graph.generated.BaseWorkbookChartPointCollectionResponse;
import java.util.Arrays;

public class BaseWorkbookChartSeries
extends Entity
implements d {
    @a
    @c(value="name")
    public String f;
    @a
    @c(value="format")
    public WorkbookChartSeriesFormat g;
    public transient WorkbookChartPointCollectionPage h;
    private transient l i;
    private transient e j;

    @Override
    public void d(e e8, l workbookChartPointArray) {
        this.j = e8;
        this.i = workbookChartPointArray;
        if (workbookChartPointArray.x("points")) {
            BaseWorkbookChartPointCollectionResponse baseWorkbookChartPointCollectionResponse = new BaseWorkbookChartPointCollectionResponse();
            if (workbookChartPointArray.x("points@odata.nextLink")) {
                baseWorkbookChartPointCollectionResponse.b = workbookChartPointArray.t("points@odata.nextLink").k();
            }
            l[] lArray = e8.b(workbookChartPointArray.t("points").toString(), l[].class);
            workbookChartPointArray = new WorkbookChartPoint[lArray.length];
            for (int i8 = 0; i8 < lArray.length; ++i8) {
                WorkbookChartPoint workbookChartPoint;
                workbookChartPointArray[i8] = workbookChartPoint = e8.b(lArray[i8].toString(), WorkbookChartPoint.class);
                workbookChartPoint.d(e8, lArray[i8]);
            }
            baseWorkbookChartPointCollectionResponse.a = Arrays.asList(workbookChartPointArray);
            this.h = new WorkbookChartPointCollectionPage(baseWorkbookChartPointCollectionResponse, null);
        }
    }
}

