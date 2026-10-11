/*
 * Decompiled with CFR 0.152.
 */
package com.microsoft.graph.generated;

import ax.N9.B0;
import com.microsoft.graph.extensions.ThumbnailSet;
import com.microsoft.graph.generated.BaseThumbnailSetCollectionResponse;
import com.microsoft.graph.http.BaseCollectionPage;
import com.microsoft.graph.http.IBaseCollectionPage;

public class BaseThumbnailSetCollectionPage
extends BaseCollectionPage<ThumbnailSet, B0>
implements IBaseCollectionPage {
    public BaseThumbnailSetCollectionPage(BaseThumbnailSetCollectionResponse baseThumbnailSetCollectionResponse, B0 b02) {
        super(baseThumbnailSetCollectionResponse.a, b02);
    }
}

