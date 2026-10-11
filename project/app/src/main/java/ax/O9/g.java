/*
 * Decompiled with CFR 0.152.
 */
package ax.O9;

import ax.M9.a;
import ax.N9.Q;
import ax.N9.m;
import ax.O9.f;
import ax.S9.c;
import com.microsoft.graph.extensions.DriveItemUploadableProperties;
import java.util.List;

public class g
extends a {
    public g(String string, ax.M9.f f8, List<c> list, DriveItemUploadableProperties driveItemUploadableProperties) {
        super(string, f8, list);
        this.e.put("item", driveItemUploadableProperties);
    }

    public Q a() {
        return this.s(this.o());
    }

    public Q s(List<c> object) {
        object = new m(this.d(), this.i(), (List<c>)object);
        if (this.r("item")) {
            ((f)object).i.a = (DriveItemUploadableProperties)this.q("item");
        }
        return object;
    }
}

