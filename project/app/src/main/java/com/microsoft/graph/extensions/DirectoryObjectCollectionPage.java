/*
 * Decompiled with CFR 0.152.
 */
package com.microsoft.graph.extensions;

import ax.N9.K;
import com.microsoft.graph.generated.BaseDirectoryObjectCollectionPage;
import com.microsoft.graph.generated.BaseDirectoryObjectCollectionResponse;
import com.microsoft.graph.http.IBaseCollectionPage;

public class DirectoryObjectCollectionPage
extends BaseDirectoryObjectCollectionPage
implements IBaseCollectionPage {
    public DirectoryObjectCollectionPage(BaseDirectoryObjectCollectionResponse baseDirectoryObjectCollectionResponse, K k8) {
        super(baseDirectoryObjectCollectionResponse, k8);
    }
}

