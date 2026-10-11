/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.measurement.internal;

import android.database.sqlite.SQLiteException;
import android.text.TextUtils;
import android.util.Pair;
import ax.M5.p;
import ax.b6.Z1;
import ax.b6.b2;
import ax.b6.k4;
import ax.f6.F;
import com.google.android.gms.measurement.internal.J5;
import com.google.android.gms.measurement.internal.f3;
import com.google.android.gms.measurement.internal.l;
import com.google.android.gms.measurement.internal.x5;
import java.util.ArrayList;
import java.util.List;

final class L5 {
    private Z1 a;
    private Long b;
    private long c;
    private final J5 d;

    private L5(J5 j52) {
        this.d = j52;
    }

    /* synthetic */ L5(J5 j52, F f8) {
        this(j52);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    final Z1 a(String iterator, Z1 z12) {
        long l8;
        List<Object> list;
        String string;
        boolean bl;
        Long l9;
        List<b2> list2;
        String string2;
        block11: {
            block13: {
                long l10;
                block12: {
                    string2 = z12.e0();
                    list2 = z12.f0();
                    this.d.o();
                    l9 = (Long)x5.g0(z12, "_eid");
                    bl = l9 != null;
                    if (!bl || !string2.equals("_ep")) break block11;
                    p.l(l9);
                    this.d.o();
                    string = (String)x5.g0(z12, "_en");
                    if (TextUtils.isEmpty((CharSequence)string)) {
                        this.d.k().I().b("Extra parameter without an event name. eventId", l9);
                        return null;
                    }
                    if (this.a != null && this.b != null && l9.longValue() == this.b.longValue()) break block12;
                    Pair<Z1, Long> pair = this.d.q().H((String)((Object)iterator), l9);
                    if (pair == null || (list = pair.first) == null) break block13;
                    this.a = (Z1)((Object)list);
                    this.c = (Long)pair.second;
                    this.d.o();
                    this.b = (Long)x5.g0(this.a, "_eid");
                }
                this.c = l10 = this.c - 1L;
                if (l10 <= 0L) {
                    list = this.d.q();
                    ((f3)((Object)list)).n();
                    ((f3)((Object)list)).k().K().b("Clearing complex main event info. appId", iterator);
                    try {
                        ((l)((Object)list)).B().execSQL("delete from main_event_params where app_id=?", (Object[])new String[]{iterator});
                    }
                    catch (SQLiteException sQLiteException) {
                        ((f3)((Object)list)).k().G().b("Error clearing complex main event", (Object)sQLiteException);
                    }
                } else {
                    this.d.q().k0((String)((Object)iterator), l9, this.c, this.a);
                }
                list = new ArrayList<b2>();
                for (b2 b22 : this.a.f0()) {
                    this.d.o();
                    if (x5.F(z12, b22.f0()) != null) continue;
                    list.add(b22);
                }
                if (!list.isEmpty()) {
                    list.addAll(list2);
                    return (Z1)((k4)((Z1.a)z12.A()).F(string).K().E(list).q());
                }
                this.d.k().I().b("No unique parameters in main event. eventName", string);
                list = list2;
                return (Z1)((k4)((Z1.a)z12.A()).F(string).K().E(list).q());
            }
            this.d.k().I().c("Extra parameter without existing main event. eventName, eventId", string, l9);
            return null;
        }
        string = string2;
        list = list2;
        if (!bl) return (Z1)((k4)((Z1.a)z12.A()).F(string).K().E(list).q());
        this.b = l9;
        this.a = z12;
        this.d.o();
        this.c = l8 = ((Long)x5.J(z12, "_epc", 0L)).longValue();
        if (l8 <= 0L) {
            this.d.k().I().b("Complex event with zero extra param count. eventName", string2);
            string = string2;
            list = list2;
            return (Z1)((k4)((Z1.a)z12.A()).F(string).K().E(list).q());
        }
        this.d.q().k0((String)((Object)iterator), p.l(l9), this.c, z12);
        list = list2;
        string = string2;
        return (Z1)((k4)((Z1.a)z12.A()).F(string).K().E(list).q());
    }
}

