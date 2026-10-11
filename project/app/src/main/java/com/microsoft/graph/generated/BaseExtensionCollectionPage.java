/*
 * Decompiled with CFR 0.152.
 */
package com.microsoft.graph.generated;

import ax.N9.d0;
import com.microsoft.graph.extensions.Extension;
import com.microsoft.graph.generated.BaseExtensionCollectionResponse;
import com.microsoft.graph.http.BaseCollectionPage;
import com.microsoft.graph.http.IBaseCollectionPage;

public class BaseExtensionCollectionPage
extends BaseCollectionPage<Extension, d0>
implements IBaseCollectionPage {
    public BaseExtensionCollectionPage(BaseExtensionCollectionResponse baseExtensionCollectionResponse, d0 d02) {
        super(baseExtensionCollectionResponse.a, d02);
    }
}

