/*
 * Decompiled with CFR 0.152.
 */
package com.microsoft.graph.generated;

import ax.N9.H0;
import com.microsoft.graph.extensions.WorkbookChartSeries;
import com.microsoft.graph.generated.BaseWorkbookChartSeriesCollectionResponse;
import com.microsoft.graph.http.BaseCollectionPage;
import com.microsoft.graph.http.IBaseCollectionPage;

public class BaseWorkbookChartSeriesCollectionPage
extends BaseCollectionPage<WorkbookChartSeries, H0>
implements IBaseCollectionPage {
    public BaseWorkbookChartSeriesCollectionPage(BaseWorkbookChartSeriesCollectionResponse baseWorkbookChartSeriesCollectionResponse, H0 h02) {
        super(baseWorkbookChartSeriesCollectionResponse.a, h02);
    }
}

