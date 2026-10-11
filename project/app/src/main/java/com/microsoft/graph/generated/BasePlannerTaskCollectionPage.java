/*
 * Decompiled with CFR 0.152.
 */
package com.microsoft.graph.generated;

import ax.N9.x0;
import com.microsoft.graph.extensions.PlannerTask;
import com.microsoft.graph.generated.BasePlannerTaskCollectionResponse;
import com.microsoft.graph.http.BaseCollectionPage;
import com.microsoft.graph.http.IBaseCollectionPage;

public class BasePlannerTaskCollectionPage
extends BaseCollectionPage<PlannerTask, x0>
implements IBaseCollectionPage {
    public BasePlannerTaskCollectionPage(BasePlannerTaskCollectionResponse basePlannerTaskCollectionResponse, x0 x02) {
        super(basePlannerTaskCollectionResponse.a, x02);
    }
}

