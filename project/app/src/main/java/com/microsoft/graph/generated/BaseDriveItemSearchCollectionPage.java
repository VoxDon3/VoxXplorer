/*
 * Decompiled with CFR 0.152.
 */
package com.microsoft.graph.generated;

import ax.N9.W;
import com.microsoft.graph.extensions.DriveItem;
import com.microsoft.graph.generated.BaseDriveItemSearchCollectionResponse;
import com.microsoft.graph.http.BaseCollectionPage;
import com.microsoft.graph.http.IBaseCollectionPage;

public class BaseDriveItemSearchCollectionPage
extends BaseCollectionPage<DriveItem, W>
implements IBaseCollectionPage {
    public BaseDriveItemSearchCollectionPage(BaseDriveItemSearchCollectionResponse baseDriveItemSearchCollectionResponse, W w8) {
        super(baseDriveItemSearchCollectionResponse.a, w8);
    }
}

