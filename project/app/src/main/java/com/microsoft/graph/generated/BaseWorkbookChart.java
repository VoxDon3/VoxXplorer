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
import com.microsoft.graph.extensions.WorkbookChartAreaFormat;
import com.microsoft.graph.extensions.WorkbookChartAxes;
import com.microsoft.graph.extensions.WorkbookChartDataLabels;
import com.microsoft.graph.extensions.WorkbookChartLegend;
import com.microsoft.graph.extensions.WorkbookChartSeries;
import com.microsoft.graph.extensions.WorkbookChartSeriesCollectionPage;
import com.microsoft.graph.extensions.WorkbookChartTitle;
import com.microsoft.graph.extensions.WorkbookWorksheet;
import com.microsoft.graph.generated.BaseWorkbookChartSeriesCollectionResponse;
import java.util.Arrays;

public class BaseWorkbookChart
extends Entity
implements d {
    @a
    @c(value="height")
    public Double f;
    @a
    @c(value="left")
    public Double g;
    @a
    @c(value="name")
    public String h;
    @a
    @c(value="top")
    public Double i;
    @a
    @c(value="width")
    public Double j;
    @a
    @c(value="axes")
    public WorkbookChartAxes k;
    @a
    @c(value="dataLabels")
    public WorkbookChartDataLabels l;
    @a
    @c(value="format")
    public WorkbookChartAreaFormat m;
    @a
    @c(value="legend")
    public WorkbookChartLegend n;
    public transient WorkbookChartSeriesCollectionPage o;
    @a
    @c(value="title")
    public WorkbookChartTitle p;
    @a
    @c(value="worksheet")
    public WorkbookWorksheet q;
    private transient l r;
    private transient e s;

    @Override
    public void d(e e8, l lArray) {
        this.s = e8;
        this.r = lArray;
        if (lArray.x("series")) {
            BaseWorkbookChartSeriesCollectionResponse baseWorkbookChartSeriesCollectionResponse = new BaseWorkbookChartSeriesCollectionResponse();
            if (lArray.x("series@odata.nextLink")) {
                baseWorkbookChartSeriesCollectionResponse.b = lArray.t("series@odata.nextLink").k();
            }
            lArray = e8.b(lArray.t("series").toString(), l[].class);
            WorkbookChartSeries[] workbookChartSeriesArray = new WorkbookChartSeries[lArray.length];
            for (int i8 = 0; i8 < lArray.length; ++i8) {
                WorkbookChartSeries workbookChartSeries;
                workbookChartSeriesArray[i8] = workbookChartSeries = e8.b(lArray[i8].toString(), WorkbookChartSeries.class);
                workbookChartSeries.d(e8, lArray[i8]);
            }
            baseWorkbookChartSeriesCollectionResponse.a = Arrays.asList(workbookChartSeriesArray);
            this.o = new WorkbookChartSeriesCollectionPage(baseWorkbookChartSeriesCollectionResponse, null);
        }
    }
}

