/*
 * Decompiled with CFR 0.152.
 */
package com.microsoft.graph.generated;

import ax.N9.v0;
import com.microsoft.graph.extensions.PlannerBucket;
import com.microsoft.graph.generated.BasePlannerBucketCollectionResponse;
import com.microsoft.graph.http.BaseCollectionPage;
import com.microsoft.graph.http.IBaseCollectionPage;

public class BasePlannerBucketCollectionPage
extends BaseCollectionPage<PlannerBucket, v0>
implements IBaseCollectionPage {
    public BasePlannerBucketCollectionPage(BasePlannerBucketCollectionResponse basePlannerBucketCollectionResponse, v0 v02) {
        super(basePlannerBucketCollectionResponse.a, v02);
    }
}

