package ax.C2;

import android.content.ContentValues;
import ax.l2.InterfaceC2463a;

/* renamed from: ax.C2.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0653b implements InterfaceC2463a {
    @Override // ax.l2.InterfaceC2463a
    public void a(ax.o2.g gVar) {
        ax.Gb.l.f(gVar, "db");
        gVar.C("UPDATE workspec SET period_count = 1 WHERE last_enqueue_time <> 0 AND interval_duration <> 0");
        ContentValues contentValues = new ContentValues(1);
        contentValues.put("last_enqueue_time", Long.valueOf(System.currentTimeMillis()));
        gVar.b0("WorkSpec", 3, contentValues, "last_enqueue_time = 0 AND interval_duration <> 0 ", new Object[0]);
    }
}
