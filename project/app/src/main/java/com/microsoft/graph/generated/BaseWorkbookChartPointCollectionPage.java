/*
 * Decompiled with CFR 0.152.
 */
package com.microsoft.graph.generated;

import ax.N9.G0;
import com.microsoft.graph.extensions.WorkbookChartPoint;
import com.microsoft.graph.generated.BaseWorkbookChartPointCollectionResponse;
import com.microsoft.graph.http.BaseCollectionPage;
import com.microsoft.graph.http.IBaseCollectionPage;

public class BaseWorkbookChartPointCollectionPage
extends BaseCollectionPage<WorkbookChartPoint, G0>
implements IBaseCollectionPage {
    public BaseWorkbookChartPointCollectionPage(BaseWorkbookChartPointCollectionResponse baseWorkbookChartPointCollectionResponse, G0 g02) {
        super(baseWorkbookChartPointCollectionResponse.a, g02);
    }
}

