/*
 * Decompiled with CFR 0.152.
 */
package com.microsoft.graph.generated;

import ax.N9.w0;
import com.microsoft.graph.extensions.PlannerPlan;
import com.microsoft.graph.generated.BasePlannerPlanCollectionResponse;
import com.microsoft.graph.http.BaseCollectionPage;
import com.microsoft.graph.http.IBaseCollectionPage;

public class BasePlannerPlanCollectionPage
extends BaseCollectionPage<PlannerPlan, w0>
implements IBaseCollectionPage {
    public BasePlannerPlanCollectionPage(BasePlannerPlanCollectionResponse basePlannerPlanCollectionResponse, w0 w02) {
        super(basePlannerPlanCollectionResponse.a, w02);
    }
}

