package ax.O9;

import ax.N9.C0849i;
import com.microsoft.graph.extensions.DriveItem;
import java.util.List;

/* renamed from: ax.O9.c, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public class C0886c extends ax.P9.b implements t {
    protected final C0849i i;

    public C0886c(String str, ax.M9.f fVar, List<ax.S9.c> list) {
        super(str, fVar, list, DriveItem.class);
        this.i = new C0849i();
    }

    @Override // ax.O9.t
    public DriveItem e() throws ax.M9.d {
        return (DriveItem) r(ax.P9.k.POST, this.i);
    }
}
