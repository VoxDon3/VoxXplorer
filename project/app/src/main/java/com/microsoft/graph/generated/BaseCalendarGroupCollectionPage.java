/*
 * Decompiled with CFR 0.152.
 */
package com.microsoft.graph.generated;

import ax.N9.E;
import com.microsoft.graph.extensions.CalendarGroup;
import com.microsoft.graph.generated.BaseCalendarGroupCollectionResponse;
import com.microsoft.graph.http.BaseCollectionPage;
import com.microsoft.graph.http.IBaseCollectionPage;

public class BaseCalendarGroupCollectionPage
extends BaseCollectionPage<CalendarGroup, E>
implements IBaseCollectionPage {
    public BaseCalendarGroupCollectionPage(BaseCalendarGroupCollectionResponse baseCalendarGroupCollectionResponse, E e8) {
        super(baseCalendarGroupCollectionResponse.a, e8);
    }
}

