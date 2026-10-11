package com.microsoft.graph.generated;

import ax.M9.d;
import ax.M9.f;
import ax.N9.C0845g;
import ax.N9.C0847h;
import ax.N9.C0863p;
import ax.N9.M;
import ax.O9.r;
import ax.S9.c;
import com.microsoft.graph.extensions.DriveItem;
import com.microsoft.graph.extensions.DriveItemCollectionPage;
import com.microsoft.graph.extensions.IDriveItemCollectionPage;
import java.util.List;

/* loaded from: classes3.dex */
public class a extends ax.P9.a<BaseDriveItemCollectionResponse, IDriveItemCollectionPage> implements r {
    public a(String str, f fVar, List<c> list) {
        super(str, fVar, list, BaseDriveItemCollectionResponse.class, IDriveItemCollectionPage.class);
    }

    @Override // ax.O9.r
    public DriveItem b(DriveItem driveItem) throws d {
        return new C0863p(m().d().toString(), m().m(), null).q(m().o()).b(driveItem);
    }

    @Override // ax.O9.r
    public M f(String str) {
        l(new ax.S9.d("$expand", str));
        return (C0845g) this;
    }

    @Override // ax.O9.r
    public IDriveItemCollectionPage get() throws d {
        return o(n());
    }

    public IDriveItemCollectionPage o(BaseDriveItemCollectionResponse baseDriveItemCollectionResponse) {
        String str = baseDriveItemCollectionResponse.b;
        DriveItemCollectionPage driveItemCollectionPage = new DriveItemCollectionPage(baseDriveItemCollectionResponse, str != null ? new C0847h(str, m().m(), null) : null);
        driveItemCollectionPage.d(baseDriveItemCollectionResponse.f(), baseDriveItemCollectionResponse.e());
        return driveItemCollectionPage;
    }
}
