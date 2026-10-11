/*
 * Decompiled with CFR 0.152.
 */
package com.microsoft.graph.generated;

import ax.N9.K;
import com.microsoft.graph.extensions.DirectoryObject;
import com.microsoft.graph.generated.BaseDirectoryObjectCollectionResponse;
import com.microsoft.graph.http.BaseCollectionPage;
import com.microsoft.graph.http.IBaseCollectionPage;

public class BaseDirectoryObjectCollectionPage
extends BaseCollectionPage<DirectoryObject, K>
implements IBaseCollectionPage {
    public BaseDirectoryObjectCollectionPage(BaseDirectoryObjectCollectionResponse baseDirectoryObjectCollectionResponse, K k8) {
        super(baseDirectoryObjectCollectionResponse.a, k8);
    }
}

