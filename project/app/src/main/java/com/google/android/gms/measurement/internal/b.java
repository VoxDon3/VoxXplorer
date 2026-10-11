/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.measurement.internal;

import ax.B.a;
import ax.b6.B1;
import ax.b6.C1;
import ax.b6.F6;
import ax.b6.Z1;
import ax.b6.b2;
import com.google.android.gms.measurement.internal.F;
import com.google.android.gms.measurement.internal.J5;
import com.google.android.gms.measurement.internal.M5;
import com.google.android.gms.measurement.internal.V1;
import com.google.android.gms.measurement.internal.X1;
import com.google.android.gms.measurement.internal.x5;
import com.google.android.gms.measurement.internal.y;
import java.util.HashSet;
import java.util.Iterator;

final class b
extends M5 {
    private B1 g;
    private final J5 h;

    b(J5 j52, String string, int n8, B1 b12) {
        this.h = j52;
        super(string, n8);
        this.g = b12;
    }

    @Override
    final int a() {
        return this.g.N();
    }

    @Override
    final boolean i() {
        return this.g.X();
    }

    @Override
    final boolean j() {
        return false;
    }

    /*
     * WARNING - void declaration
     * Enabled aggressive block sorting
     */
    final boolean k(Long object, Long object2, Z1 object3, long l8, y object4, boolean bl) {
        Object var6_46;
        int n8;
        Object object5;
        Object object6;
        int n9;
        block39: {
            Iterator<C1> iterator;
            Object object7;
            boolean bl2;
            Iterator<C1> iterator2;
            Object object8;
            block43: {
                block40: {
                    block41: {
                        Boolean bl3;
                        block42: {
                            n9 = F6.a() && this.h.d().G(this.a, F.l0) ? 1 : 0;
                            if (this.g.V()) {
                                l8 = ((y)object4).e;
                            }
                            boolean bl4 = this.h.k().C(2);
                            object6 = null;
                            object5 = null;
                            object8 = null;
                            if (bl4) {
                                Object var6_8;
                                iterator2 = this.h.k().K();
                                n8 = this.b;
                                if (this.g.Y()) {
                                    Integer n10 = this.g.N();
                                } else {
                                    Object var6_7 = null;
                                }
                                ((X1)((Object)iterator2)).d("Evaluating filter. audience, filter, event", n8, var6_8, this.h.g().c(this.g.R()));
                                this.h.k().K().b("Filter definition", this.h.o().K(this.g));
                            }
                            if (!this.g.Y() || this.g.N() > 256) break block40;
                            bl4 = this.g.T();
                            boolean bl5 = this.g.U();
                            boolean bl6 = this.g.V();
                            n8 = !(bl4 || bl5 || bl6) ? 0 : 1;
                            if (bl2 && n8 == 0) {
                                object2 = this.h.k().K();
                                n9 = this.b;
                                object = object8;
                                if (this.g.Y()) {
                                    object = this.g.N();
                                }
                                ((X1)object2).c("Event filter already evaluated true and it is not associated with an enhanced audience. audience ID, filter ID", n9, object);
                                return true;
                            }
                            iterator2 = this.g;
                            object5 = ((Z1)object3).e0();
                            if (!((B1)((Object)iterator2)).X()) break block41;
                            bl3 = M5.c(l8, ((B1)((Object)iterator2)).Q());
                            if (bl3 != null) break block42;
                            String string = object6;
                            break block39;
                        }
                        if (bl3.booleanValue()) break block41;
                        Boolean bl7 = Boolean.FALSE;
                        break block39;
                    }
                    object7 = new HashSet<String>();
                    iterator = ((B1)((Object)iterator2)).S().iterator();
                    break block43;
                }
                object3 = this.h.k().L();
                object2 = V1.v(this.a);
                object = object5;
                if (this.g.Y()) {
                    object = this.g.N();
                }
                ((X1)object3).c("Invalid event filter ID. appId, id", object2, String.valueOf(object));
                return false;
            }
            while (iterator.hasNext()) {
                object8 = iterator.next();
                if (((C1)object8).O().isEmpty()) {
                    this.h.k().L().b("null or empty param name in filter. event", this.h.g().c((String)object5));
                    Object object9 = object6;
                    break block39;
                }
                object7.add(((C1)object8).O());
            }
            object8 = new a();
            for (b2 b22 : ((Z1)object3).f0()) {
                String string;
                if (!object7.contains(b22.f0())) continue;
                if (b22.k0()) {
                    Object var6_20;
                    string = b22.f0();
                    if (b22.k0()) {
                        Long l9 = b22.a0();
                    } else {
                        Object var6_19 = null;
                    }
                    object8.put(string, var6_20);
                    continue;
                }
                if (b22.i0()) {
                    Object var6_23;
                    string = b22.f0();
                    if (b22.i0()) {
                        Double d8 = b22.I();
                    } else {
                        Object var6_22 = null;
                    }
                    object8.put(string, var6_23);
                    continue;
                }
                if (b22.m0()) {
                    object8.put(b22.f0(), b22.g0());
                    continue;
                }
                this.h.k().L().c("Unknown value for param. event, param", this.h.g().c((String)object5), this.h.g().f(b22.f0()));
                Object object10 = object6;
                break block39;
            }
            for (C1 c12 : ((B1)((Object)iterator2)).S()) {
                Object object11;
                block44: {
                    block47: {
                        block48: {
                            Object var6_38;
                            block46: {
                                block45: {
                                    bl2 = c12.Q() && c12.P();
                                    object7 = c12.O();
                                    if (((String)object7).isEmpty()) {
                                        this.h.k().L().b("Event has empty param name. event", this.h.g().c((String)object5));
                                        Object object12 = object6;
                                        break block39;
                                    }
                                    object11 = object8.get(object7);
                                    if (object11 instanceof Long) {
                                        if (!c12.R()) {
                                            this.h.k().L().c("No number filter for long param. event, param", this.h.g().c((String)object5), this.h.g().f((String)object7));
                                            Object object13 = object6;
                                            break block39;
                                        }
                                        Boolean bl8 = M5.c((Long)object11, c12.M());
                                        if (bl8 == null) {
                                            Object object14 = object6;
                                            break block39;
                                        } else {
                                            if (bl8 != bl2) continue;
                                            Boolean bl9 = Boolean.FALSE;
                                        }
                                        break block39;
                                    }
                                    if (object11 instanceof Double) {
                                        if (!c12.R()) {
                                            this.h.k().L().c("No number filter for double param. event, param", this.h.g().c((String)object5), this.h.g().f((String)object7));
                                            Object object15 = object6;
                                            break block39;
                                        }
                                        Boolean bl10 = M5.b((Double)object11, c12.M());
                                        if (bl10 == null) {
                                            Object object16 = object6;
                                            break block39;
                                        } else {
                                            if (bl10 != bl2) continue;
                                            Boolean bl11 = Boolean.FALSE;
                                        }
                                        break block39;
                                    }
                                    if (!(object11 instanceof String)) break block44;
                                    if (!c12.T()) break block45;
                                    Boolean bl12 = M5.g((String)object11, c12.N(), this.h.k());
                                    break block46;
                                }
                                if (!c12.R()) break block47;
                                if (!x5.h0((String)(object11 = (String)object11))) break block48;
                                Boolean bl13 = M5.e((String)object11, c12.M());
                            }
                            if (var6_38 == null) {
                                Object object17 = object6;
                                break block39;
                            } else {
                                if (var6_38.booleanValue() != bl2) continue;
                                Boolean bl14 = Boolean.FALSE;
                            }
                            break block39;
                        }
                        this.h.k().L().c("Invalid param value for number filter. event, param", this.h.g().c((String)object5), this.h.g().f((String)object7));
                        Object object18 = object6;
                        break block39;
                    }
                    this.h.k().L().c("No filter for String param. event, param", this.h.g().c((String)object5), this.h.g().f((String)object7));
                    Object object19 = object6;
                    break block39;
                }
                if (object11 == null) {
                    this.h.k().K().c("Missing param for filter. event, param", this.h.g().c((String)object5), this.h.g().f((String)object7));
                    Boolean bl15 = Boolean.FALSE;
                    break block39;
                } else {
                    this.h.k().L().c("Unknown param type. event, param", this.h.g().c((String)object5), this.h.g().f((String)object7));
                    Object object20 = object6;
                }
                break block39;
            }
            Boolean bl16 = Boolean.TRUE;
        }
        object5 = this.h.k().K();
        object6 = var6_46 == null ? "null" : var6_46;
        ((X1)object5).b("Event filter result", object6);
        if (var6_46 == null) {
            return false;
        }
        this.c = object6 = Boolean.TRUE;
        if (!var6_46.booleanValue()) {
            return true;
        }
        this.d = object6;
        if (n8 == 0) return true;
        if (!((Z1)object3).i0()) return true;
        object3 = ((Z1)object3).b0();
        if (this.g.U()) {
            if (n9 == 0 || !this.g.X()) {
                object = object3;
            }
            this.f = object;
            return true;
        }
        object = object3;
        if (n9 != 0) {
            object = object3;
            if (this.g.X()) {
                object = object2;
            }
        }
        this.e = object;
        return true;
    }
}

