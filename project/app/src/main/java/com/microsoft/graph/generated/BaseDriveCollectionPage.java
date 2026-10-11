/*
 * Decompiled with CFR 0.152.
 */
package com.microsoft.graph.generated;

import ax.N9.L;
import com.microsoft.graph.extensions.Drive;
import com.microsoft.graph.generated.BaseDriveCollectionResponse;
import com.microsoft.graph.http.BaseCollectionPage;
import com.microsoft.graph.http.IBaseCollectionPage;

public class BaseDriveCollectionPage
extends BaseCollectionPage<Drive, L>
implements IBaseCollectionPage {
    public BaseDriveCollectionPage(BaseDriveCollectionResponse baseDriveCollectionResponse, L l8) {
        super(baseDriveCollectionResponse.a, l8);
    }
}

