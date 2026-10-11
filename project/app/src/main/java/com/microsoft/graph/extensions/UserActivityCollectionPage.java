/*
 * Decompiled with CFR 0.152.
 */
package com.microsoft.graph.extensions;

import ax.N9.C0;
import com.microsoft.graph.generated.BaseUserActivityCollectionPage;
import com.microsoft.graph.generated.BaseUserActivityCollectionResponse;
import com.microsoft.graph.http.IBaseCollectionPage;

public class UserActivityCollectionPage
extends BaseUserActivityCollectionPage
implements IBaseCollectionPage {
    public UserActivityCollectionPage(BaseUserActivityCollectionResponse baseUserActivityCollectionResponse, C0 c02) {
        super(baseUserActivityCollectionResponse, c02);
    }
}

