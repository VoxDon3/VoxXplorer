package com.microsoft.graph.generated;

import ax.M9.d;
import ax.M9.f;
import ax.N9.r;
import ax.O9.z;
import ax.S9.c;
import com.microsoft.graph.extensions.DriveItemSearchCollectionPage;
import com.microsoft.graph.extensions.IDriveItemSearchCollectionPage;
import java.util.List;

/* loaded from: classes3.dex */
public class b extends ax.P9.a<BaseDriveItemSearchCollectionResponse, IDriveItemSearchCollectionPage> implements z {
    public b(String str, f fVar, List<c> list) {
        super(str, fVar, list, BaseDriveItemSearchCollectionResponse.class, IDriveItemSearchCollectionPage.class);
    }

    @Override // ax.O9.z
    public IDriveItemSearchCollectionPage get() throws d {
        return o(n());
    }

    public IDriveItemSearchCollectionPage o(BaseDriveItemSearchCollectionResponse baseDriveItemSearchCollectionResponse) {
        String str = baseDriveItemSearchCollectionResponse.b;
        DriveItemSearchCollectionPage driveItemSearchCollectionPage = new DriveItemSearchCollectionPage(baseDriveItemSearchCollectionResponse, str != null ? new r(str, m().m(), null, null) : null);
        driveItemSearchCollectionPage.d(baseDriveItemSearchCollectionResponse.f(), baseDriveItemSearchCollectionResponse.e());
        return driveItemSearchCollectionPage;
    }
}
