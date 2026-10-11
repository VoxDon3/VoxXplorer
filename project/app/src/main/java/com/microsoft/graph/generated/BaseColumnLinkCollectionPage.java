/*
 * Decompiled with CFR 0.152.
 */
package com.microsoft.graph.generated;

import ax.N9.G;
import com.microsoft.graph.extensions.ColumnLink;
import com.microsoft.graph.generated.BaseColumnLinkCollectionResponse;
import com.microsoft.graph.http.BaseCollectionPage;
import com.microsoft.graph.http.IBaseCollectionPage;

public class BaseColumnLinkCollectionPage
extends BaseCollectionPage<ColumnLink, G>
implements IBaseCollectionPage {
    public BaseColumnLinkCollectionPage(BaseColumnLinkCollectionResponse baseColumnLinkCollectionResponse, G g8) {
        super(baseColumnLinkCollectionResponse.a, g8);
    }
}

