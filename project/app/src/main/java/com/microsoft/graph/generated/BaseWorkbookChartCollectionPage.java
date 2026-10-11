/*
 * Decompiled with CFR 0.152.
 */
package com.microsoft.graph.generated;

import ax.N9.F0;
import com.microsoft.graph.extensions.WorkbookChart;
import com.microsoft.graph.generated.BaseWorkbookChartCollectionResponse;
import com.microsoft.graph.http.BaseCollectionPage;
import com.microsoft.graph.http.IBaseCollectionPage;

public class BaseWorkbookChartCollectionPage
extends BaseCollectionPage<WorkbookChart, F0>
implements IBaseCollectionPage {
    public BaseWorkbookChartCollectionPage(BaseWorkbookChartCollectionResponse baseWorkbookChartCollectionResponse, F0 f02) {
        super(baseWorkbookChartCollectionResponse.a, f02);
    }
}

