/*
 * Decompiled with CFR 0.152.
 */
package com.microsoft.graph.generated;

import ax.N9.c0;
import com.microsoft.graph.extensions.Event;
import com.microsoft.graph.generated.BaseEventCollectionResponse;
import com.microsoft.graph.http.BaseCollectionPage;
import com.microsoft.graph.http.IBaseCollectionPage;

public class BaseEventCollectionPage
extends BaseCollectionPage<Event, c0>
implements IBaseCollectionPage {
    public BaseEventCollectionPage(BaseEventCollectionResponse baseEventCollectionResponse, c0 c02) {
        super(baseEventCollectionResponse.a, c02);
    }
}

