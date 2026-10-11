/*
 * Decompiled with CFR 0.152.
 */
package ax.O9;

import ax.M9.f;
import ax.N9.T;
import ax.N9.o;
import ax.O9.x;
import ax.P9.b;
import ax.P9.k;
import ax.S9.c;
import ax.S9.d;
import com.microsoft.graph.extensions.DriveItem;
import java.util.List;

public class h
extends b
implements x {
    public h(String string, f f8, List<c> list, Class clazz) {
        super(string, f8, list, clazz);
    }

    @Override
    public DriveItem b(DriveItem driveItem) throws ax.M9.d {
        return (DriveItem)this.r(k.c0, driveItem);
    }

    @Override
    public void delete() throws ax.M9.d {
        this.r(k.e0, null);
    }

    @Override
    public DriveItem get() throws ax.M9.d {
        return (DriveItem)this.r(k.q, null);
    }

    @Override
    public DriveItem j(DriveItem driveItem) throws ax.M9.d {
        return (DriveItem)this.r(k.d0, driveItem);
    }

    public T u(String string) {
        this.p().add(new d("$expand", string));
        return (o)this;
    }
}

