/*
 * Decompiled with CFR 0.152.
 */
package com.microsoft.graph.generated;

import ax.M9.f;
import ax.N9.M;
import ax.N9.N;
import ax.N9.g;
import ax.N9.h;
import ax.N9.p;
import ax.O9.r;
import ax.S9.c;
import ax.S9.d;
import com.microsoft.graph.extensions.DriveItem;
import com.microsoft.graph.extensions.DriveItemCollectionPage;
import com.microsoft.graph.extensions.IDriveItemCollectionPage;
import com.microsoft.graph.generated.BaseDriveItemCollectionResponse;
import com.microsoft.graph.http.BaseCollectionPage;
import java.util.List;

public class a
extends ax.P9.a<BaseDriveItemCollectionResponse, IDriveItemCollectionPage>
implements r {
    public a(String string, f f8, List<c> list) {
        super(string, f8, list, BaseDriveItemCollectionResponse.class, IDriveItemCollectionPage.class);
    }

    @Override
    public DriveItem b(DriveItem driveItem) throws ax.M9.d {
        return new p(this.m().d().toString(), this.m().m(), null).q(this.m().o()).b(driveItem);
    }

    @Override
    public M f(String string) {
        this.l(new d("$expand", string));
        return (g)this;
    }

    @Override
    public IDriveItemCollectionPage get() throws ax.M9.d {
        return this.o((BaseDriveItemCollectionResponse)this.n());
    }

    public IDriveItemCollectionPage o(BaseDriveItemCollectionResponse baseDriveItemCollectionResponse) {
        String string = baseDriveItemCollectionResponse.b;
        Object object = null;
        if (string != null) {
            object = new h(string, this.m().m(), null);
        }
        object = new DriveItemCollectionPage(baseDriveItemCollectionResponse, (N)object);
        ((BaseCollectionPage)object).d(baseDriveItemCollectionResponse.f(), baseDriveItemCollectionResponse.e());
        return object;
    }
}

