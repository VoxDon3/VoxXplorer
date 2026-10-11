/*
 * Decompiled with CFR 0.152.
 */
package com.microsoft.graph.generated;

import ax.N9.I;
import com.microsoft.graph.extensions.ContactFolder;
import com.microsoft.graph.generated.BaseContactFolderCollectionResponse;
import com.microsoft.graph.http.BaseCollectionPage;
import com.microsoft.graph.http.IBaseCollectionPage;

public class BaseContactFolderCollectionPage
extends BaseCollectionPage<ContactFolder, I>
implements IBaseCollectionPage {
    public BaseContactFolderCollectionPage(BaseContactFolderCollectionResponse baseContactFolderCollectionResponse, I i8) {
        super(baseContactFolderCollectionResponse.a, i8);
    }
}

