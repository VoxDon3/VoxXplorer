/*
 * Decompiled with CFR 0.152.
 */
package com.microsoft.graph.generated;

import ax.N9.J;
import com.microsoft.graph.extensions.ContentType;
import com.microsoft.graph.generated.BaseContentTypeCollectionResponse;
import com.microsoft.graph.http.BaseCollectionPage;
import com.microsoft.graph.http.IBaseCollectionPage;

public class BaseContentTypeCollectionPage
extends BaseCollectionPage<ContentType, J>
implements IBaseCollectionPage {
    public BaseContentTypeCollectionPage(BaseContentTypeCollectionResponse baseContentTypeCollectionResponse, J j8) {
        super(baseContentTypeCollectionResponse.a, j8);
    }
}

