/*
 * Decompiled with CFR 0.152.
 */
package ax.b6;

import ax.b6.A;
import ax.b6.G;
import ax.b6.Z;
import ax.b6.Z2;
import ax.b6.h;
import ax.b6.k;
import ax.b6.m;
import ax.b6.q;
import ax.b6.s;
import ax.b6.u;
import ax.b6.y2;
import ax.b6.z;
import java.util.List;

public final class D
extends A {
    public D() {
        this.a.add(Z.z0);
        this.a.add(Z.N0);
        this.a.add(Z.O0);
        this.a.add(Z.P0);
        this.a.add(Z.Q0);
        this.a.add(Z.S0);
        this.a.add(Z.T0);
        this.a.add(Z.Y0);
    }

    /*
     * Enabled aggressive block sorting
     */
    private static boolean c(s s8, s s9) {
        s s10 = s8;
        while (true) {
            block16: {
                block19: {
                    block14: {
                        boolean bl;
                        boolean bl2;
                        block18: {
                            block17: {
                                block15: {
                                    block13: {
                                        if (s10.getClass().equals(s9.getClass())) {
                                            if (s10 instanceof z) return true;
                                            if (s10 instanceof q) {
                                                return true;
                                            }
                                            if (s10 instanceof k) {
                                                if (Double.isNaN(s10.f())) return false;
                                                if (Double.isNaN(s9.f())) {
                                                    return false;
                                                }
                                                if (s10.f().doubleValue() != s9.f().doubleValue()) return false;
                                                return true;
                                            }
                                            if (s10 instanceof u) {
                                                return s10.g().equals(s9.g());
                                            }
                                            if (s10 instanceof h) {
                                                return s10.e().equals(s9.e());
                                            }
                                            if (s10 != s9) return false;
                                            return true;
                                        }
                                        if (s10 instanceof z || s10 instanceof q) {
                                            if (s9 instanceof z) return true;
                                            if (s9 instanceof q) {
                                                return true;
                                            }
                                        }
                                        if (!(bl2 = s10 instanceof k) || !(s9 instanceof u)) break block13;
                                        s8 = new k(s9.f());
                                        break block14;
                                    }
                                    bl = s10 instanceof u;
                                    if (!bl || !(s9 instanceof k)) break block15;
                                    s8 = new k(s10.f());
                                    break block16;
                                }
                                if (!(s10 instanceof h)) break block17;
                                s8 = new k(s10.f());
                                break block16;
                            }
                            if (!(s9 instanceof h)) break block18;
                            s8 = new k(s9.f());
                            break block14;
                        }
                        if (!bl && !bl2 || !(s9 instanceof m)) break block19;
                        s8 = new u(s9.g());
                    }
                    s9 = s8;
                    continue;
                }
                if (!(s10 instanceof m)) return false;
                if (!(s9 instanceof u)) {
                    if (!(s9 instanceof k)) return false;
                }
                s8 = new u(s10.g());
            }
            s10 = s8;
        }
    }

    private static boolean d(s s8, s s9) {
        s s10 = s8;
        if (s8 instanceof m) {
            s10 = new u(s8.g());
        }
        s8 = s9;
        if (s9 instanceof m) {
            s8 = new u(s9.g());
        }
        if (s10 instanceof u && s8 instanceof u) {
            return s10.g().compareTo(s8.g()) < 0;
        }
        double d8 = s10.f();
        double d9 = s8.f();
        if (!Double.isNaN(d8) && !Double.isNaN(d9)) {
            if (d8 == 0.0 && d9 == 0.0 || d8 == 0.0 && d9 == 0.0) {
                return false;
            }
            if (Double.compare(d8, d9) < 0) {
                return true;
            }
        }
        return false;
    }

    private static boolean e(s s8, s s9) {
        s s10 = s8;
        if (s8 instanceof m) {
            s10 = new u(s8.g());
        }
        s8 = s9;
        if (s9 instanceof m) {
            s8 = new u(s9.g());
        }
        return (s10 instanceof u && s8 instanceof u || !Double.isNaN(s10.f()) && !Double.isNaN(s8.f())) && !D.d(s8, s10);
    }

    /*
     * Unable to fully structure code
     */
    @Override
    public final s b(String var1_1, Z2 var2_2, List<s> var3_3) {
        y2.f(y2.c(var1_1), 2, var3_3);
        var5_4 = var2_2.b(var3_3.get(0));
        var2_2 = var2_2.b(var3_3.get(1));
        block0 : switch (G.a[y2.c(var1_1).ordinal()]) {
            default: {
                return super.a(var1_1);
            }
            case 8: {
                var4_5 = D.c(var5_4, (s)var2_2);
lbl9:
                // 2 sources

                while (true) {
                    var4_5 ^= true;
                    break block0;
                    break;
                }
            }
            case 7: {
                var4_5 = D.e(var5_4, (s)var2_2);
                break;
            }
            case 6: {
                var4_5 = D.d(var5_4, (s)var2_2);
                break;
            }
            case 5: {
                var4_5 = y2.h(var5_4, (s)var2_2);
                ** continue;
            }
            case 4: {
                var4_5 = y2.h(var5_4, (s)var2_2);
                break;
            }
            case 3: {
                var4_5 = D.e((s)var2_2, var5_4);
                break;
            }
            case 2: {
                var4_5 = D.d((s)var2_2, var5_4);
                break;
            }
            case 1: {
                var4_5 = D.c(var5_4, (s)var2_2);
            }
        }
        if (var4_5) {
            return s.k;
        }
        return s.l;
    }
}

