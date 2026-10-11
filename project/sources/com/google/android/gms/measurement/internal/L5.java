package com.google.android.gms.measurement.internal;

import android.database.sqlite.SQLiteException;
import android.text.TextUtils;
import android.util.Pair;
import ax.M5.C0821p;
import ax.b6.AbstractC1599k4;
import ax.b6.C1516b2;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes3.dex */
final class L5 {
    private ax.b6.Z1 a;
    private Long b;
    private long c;
    private final /* synthetic */ J5 d;

    final ax.b6.Z1 a(String str, ax.b6.Z1 z1) {
        Object obj;
        String e0 = z1.e0();
        List<C1516b2> f0 = z1.f0();
        this.d.o();
        Long l = (Long) x5.g0(z1, "_eid");
        boolean z = l != null;
        if (z && e0.equals("_ep")) {
            C0821p.l(l);
            this.d.o();
            e0 = (String) x5.g0(z1, "_en");
            if (TextUtils.isEmpty(e0)) {
                this.d.k().I().b("Extra parameter without an event name. eventId", l);
                return null;
            }
            if (this.a == null || this.b == null || l.longValue() != this.b.longValue()) {
                Pair<ax.b6.Z1, Long> H = this.d.q().H(str, l);
                if (H == null || (obj = H.first) == null) {
                    this.d.k().I().c("Extra parameter without existing main event. eventName, eventId", e0, l);
                    return null;
                }
                this.a = (ax.b6.Z1) obj;
                this.c = ((Long) H.second).longValue();
                this.d.o();
                this.b = (Long) x5.g0(this.a, "_eid");
            }
            long j = this.c - 1;
            this.c = j;
            if (j <= 0) {
                C3691l q = this.d.q();
                q.n();
                q.k().K().b("Clearing complex main event info. appId", str);
                try {
                    q.B().execSQL("delete from main_event_params where app_id=?", new String[]{str});
                } catch (SQLiteException e) {
                    q.k().G().b("Error clearing complex main event", e);
                }
            } else {
                this.d.q().k0(str, l, this.c, this.a);
            }
            ArrayList arrayList = new ArrayList();
            for (C1516b2 c1516b2 : this.a.f0()) {
                this.d.o();
                if (x5.F(z1, c1516b2.f0()) == null) {
                    arrayList.add(c1516b2);
                }
            }
            if (arrayList.isEmpty()) {
                this.d.k().I().b("No unique parameters in main event. eventName", e0);
            } else {
                arrayList.addAll(f0);
                f0 = arrayList;
            }
        } else if (z) {
            this.b = l;
            this.a = z1;
            this.d.o();
            long longValue = ((Long) x5.J(z1, "_epc", 0L)).longValue();
            this.c = longValue;
            if (longValue <= 0) {
                this.d.k().I().b("Complex event with zero extra param count. eventName", e0);
            } else {
                this.d.q().k0(str, (Long) C0821p.l(l), this.c, z1);
            }
        }
        return (ax.b6.Z1) ((AbstractC1599k4) z1.A().F(e0).K().E(f0).q());
    }

    private L5(J5 j5) {
        this.d = j5;
    }
}
