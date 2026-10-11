/*
 * Decompiled with CFR 0.152.
 */
package com.microsoft.graph.generated;

import ax.M9.d;
import ax.M9.f;
import ax.N9.W;
import ax.N9.r;
import ax.O9.z;
import ax.P9.a;
import ax.S9.c;
import com.microsoft.graph.extensions.DriveItemSearchCollectionPage;
import com.microsoft.graph.extensions.IDriveItemSearchCollectionPage;
import com.microsoft.graph.generated.BaseDriveItemSearchCollectionResponse;
import java.util.List;

public class b
extends a<BaseDriveItemSearchCollectionResponse, IDriveItemSearchCollectionPage>
implements z {
    public b(String string, f f8, List<c> list) {
        super(string, f8, list, BaseDriveItemSearchCollectionResponse.class, IDriveItemSearchCollectionPage.class);
    }

    @Override
    public IDriveItemSearchCollectionPage get() throws d {
        return this.o((BaseDriveItemSearchCollectionResponse)this.n());
    }

    public IDriveItemSearchCollectionPage o(BaseDriveItemSearchCollectionResponse baseDriveItemSearchCollectionResponse) {
        String string = baseDriveItemSearchCollectionResponse.b;
        Object object = null;
        if (string != null) {
            object = new r(string, this.m().m(), null, null);
        }
        object = new DriveItemSearchCollectionPage(baseDriveItemSearchCollectionResponse, (W)object);
        object.d(baseDriveItemSearchCollectionResponse.f(), baseDriveItemSearchCollectionResponse.e());
        return object;
    }
}

