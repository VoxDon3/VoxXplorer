/*
 * Decompiled with CFR 0.152.
 */
package com.microsoft.graph.generated;

import ax.N9.N;
import com.microsoft.graph.extensions.DriveItem;
import com.microsoft.graph.generated.BaseDriveItemCollectionResponse;
import com.microsoft.graph.http.BaseCollectionPage;
import com.microsoft.graph.http.IBaseCollectionPage;

public class BaseDriveItemCollectionPage
extends BaseCollectionPage<DriveItem, N>
implements IBaseCollectionPage {
    public BaseDriveItemCollectionPage(BaseDriveItemCollectionResponse baseDriveItemCollectionResponse, N n8) {
        super(baseDriveItemCollectionResponse.a, n8);
    }
}

