/*
 * Decompiled with CFR 0.152.
 */
package ax.O9;

import ax.M9.f;
import ax.N9.N;
import ax.N9.P;
import ax.N9.S;
import ax.N9.T;
import ax.N9.W;
import ax.N9.Y;
import ax.N9.h;
import ax.N9.k;
import ax.N9.n;
import ax.N9.o;
import ax.N9.r;
import ax.N9.t;
import ax.O9.y;
import ax.S9.c;
import com.microsoft.graph.extensions.DriveItemUploadableProperties;
import com.microsoft.graph.extensions.ItemReference;
import java.util.List;

public class i
extends ax.P9.c
implements y {
    public i(String string, f f8, List<c> list) {
        super(string, f8, list);
    }

    @Override
    public T a() {
        return this.q(this.o());
    }

    @Override
    public N b() {
        return new h(this.p("children"), this.i(), null);
    }

    @Override
    public W f(String string) {
        return new r(this.p("microsoft.graph.search"), this.i(), null, string);
    }

    @Override
    public P j(String string, ItemReference itemReference) {
        return new k(this.p("microsoft.graph.copy"), this.i(), null, string, itemReference);
    }

    @Override
    public Y k() {
        return new t(this.p("content"), this.i(), null);
    }

    @Override
    public S m(DriveItemUploadableProperties driveItemUploadableProperties) {
        return new n(this.p("microsoft.graph.createUploadSession"), this.i(), null, driveItemUploadableProperties);
    }

    public T q(List<c> list) {
        return new o(this.d(), this.i(), list);
    }
}

