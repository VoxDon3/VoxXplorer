/*
 * Decompiled with CFR 0.152.
 */
package com.microsoft.graph.generated;

import ax.N9.C0;
import com.microsoft.graph.extensions.UserActivity;
import com.microsoft.graph.generated.BaseUserActivityCollectionResponse;
import com.microsoft.graph.http.BaseCollectionPage;
import com.microsoft.graph.http.IBaseCollectionPage;

public class BaseUserActivityCollectionPage
extends BaseCollectionPage<UserActivity, C0>
implements IBaseCollectionPage {
    public BaseUserActivityCollectionPage(BaseUserActivityCollectionResponse baseUserActivityCollectionResponse, C0 c02) {
        super(baseUserActivityCollectionResponse.a, c02);
    }
}

