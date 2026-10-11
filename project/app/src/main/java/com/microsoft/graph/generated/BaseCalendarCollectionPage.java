/*
 * Decompiled with CFR 0.152.
 */
package com.microsoft.graph.generated;

import ax.N9.D;
import com.microsoft.graph.extensions.Calendar;
import com.microsoft.graph.generated.BaseCalendarCollectionResponse;
import com.microsoft.graph.http.BaseCollectionPage;
import com.microsoft.graph.http.IBaseCollectionPage;

public class BaseCalendarCollectionPage
extends BaseCollectionPage<Calendar, D>
implements IBaseCollectionPage {
    public BaseCalendarCollectionPage(BaseCalendarCollectionResponse baseCalendarCollectionResponse, D d8) {
        super(baseCalendarCollectionResponse.a, d8);
    }
}

