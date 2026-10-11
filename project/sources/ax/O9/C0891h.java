package ax.O9;

import ax.N9.C0861o;
import ax.N9.T;
import com.microsoft.graph.extensions.DriveItem;
import java.util.List;

/* renamed from: ax.O9.h, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public class C0891h extends ax.P9.b implements x {
    public C0891h(String str, ax.M9.f fVar, List<ax.S9.c> list, Class cls) {
        super(str, fVar, list, cls);
    }

    @Override // ax.O9.x
    public DriveItem b(DriveItem driveItem) throws ax.M9.d {
        return (DriveItem) r(ax.P9.k.POST, driveItem);
    }

    @Override // ax.O9.x
    public void delete() throws ax.M9.d {
        r(ax.P9.k.DELETE, null);
    }

    @Override // ax.O9.x
    public DriveItem get() throws ax.M9.d {
        return (DriveItem) r(ax.P9.k.GET, null);
    }

    @Override // ax.O9.x
    public DriveItem j(DriveItem driveItem) throws ax.M9.d {
        return (DriveItem) r(ax.P9.k.PATCH, driveItem);
    }

    @Override // ax.O9.x
    /* renamed from: u, reason: merged with bridge method [inline-methods] */
    public T f(String str) {
        p().add(new ax.S9.d("$expand", str));
        return (C0861o) this;
    }
}
