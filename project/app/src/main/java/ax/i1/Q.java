/*
 * Decompiled with CFR 0.152.
 */
package ax.i1;

import androidx.media3.exoplayer.p0;
import ax.P0.v;
import ax.Y0.Z;
import ax.i1.C;
import ax.i1.P;
import ax.i1.e0;
import ax.i1.f0;
import ax.i1.j;
import ax.i1.l0;
import ax.i1.q0;
import ax.l1.D;
import ax.l1.F;
import ax.r7.I;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.IdentityHashMap;
import java.util.List;

final class Q
implements C,
C.a {
    private final boolean[] c0;
    private final IdentityHashMap<e0, Integer> d0;
    private final j e0;
    private final ArrayList<C> f0;
    private final HashMap<ax.P0.P, ax.P0.P> g0;
    private C.a h0;
    private q0 i0;
    private C[] j0;
    private f0 k0;
    private final C[] q;

    public Q(j j8, long[] lArray, C ... cArray) {
        this.e0 = j8;
        this.q = cArray;
        this.f0 = new ArrayList();
        this.g0 = new HashMap();
        this.k0 = j8.empty();
        this.d0 = new IdentityHashMap();
        this.j0 = new C[0];
        this.c0 = new boolean[cArray.length];
        for (int i8 = 0; i8 < cArray.length; ++i8) {
            long l8 = lArray[i8];
            if (l8 == 0L) continue;
            this.c0[i8] = true;
            this.q[i8] = new l0(cArray[i8], l8);
        }
    }

    public static /* synthetic */ List j(C c8) {
        return c8.t().d();
    }

    @Override
    public boolean a(p0 p02) {
        if (!this.f0.isEmpty()) {
            int n8 = this.f0.size();
            for (int i8 = 0; i8 < n8; ++i8) {
                this.f0.get(i8).a(p02);
            }
            return false;
        }
        return this.k0.a(p02);
    }

    @Override
    public long b() {
        return this.k0.b();
    }

    @Override
    public boolean c() {
        return this.k0.c();
    }

    @Override
    public long d() {
        return this.k0.d();
    }

    @Override
    public void e(long l8) {
        this.k0.e(l8);
    }

    @Override
    public void f(C object) {
        int n8;
        this.f0.remove(object);
        if (!this.f0.isEmpty()) {
            return;
        }
        object = this.q;
        int n9 = ((C[])object).length;
        int n10 = 0;
        for (n8 = 0; n8 < n9; ++n8) {
            n10 += object[n8].t().a;
        }
        ax.P0.P[] pArray = new ax.P0.P[n10];
        n8 = 0;
        for (n10 = 0; n10 < ((C[])(object = this.q)).length; ++n10) {
            q0 q02 = object[n10].t();
            int n11 = q02.a;
            n9 = 0;
            while (n9 < n11) {
                ax.P0.P p8 = q02.c(n9);
                v[] vArray = new v[p8.a];
                for (int i8 = 0; i8 < p8.a; ++i8) {
                    object = p8.b(i8);
                    v.b b8 = ((v)object).b();
                    StringBuilder stringBuilder = new StringBuilder();
                    stringBuilder.append(n10);
                    stringBuilder.append(":");
                    String string = ((v)object).a;
                    object = string;
                    if (string == null) {
                        object = "";
                    }
                    stringBuilder.append((String)object);
                    vArray[i8] = b8.j0(stringBuilder.toString()).P();
                }
                object = new StringBuilder();
                ((StringBuilder)object).append(n10);
                ((StringBuilder)object).append(":");
                ((StringBuilder)object).append(p8.b);
                object = new ax.P0.P(((StringBuilder)object).toString(), vArray);
                this.g0.put((ax.P0.P)object, p8);
                pArray[n8] = object;
                ++n9;
                ++n8;
            }
        }
        this.i0 = new q0(pArray);
        ax.S0.a.e(this.h0).f(this);
    }

    @Override
    public long g(D[] dArray, boolean[] blArray, e0[] e0Array, boolean[] blArray2, long l8) {
        int n8;
        Object object;
        int n9;
        int[] nArray = new int[dArray.length];
        int[] nArray2 = new int[dArray.length];
        for (n9 = 0; n9 < dArray.length; ++n9) {
            object = e0Array[n9];
            object = object == null ? null : this.d0.get(object);
            n8 = object == null ? -1 : (Integer)object;
            nArray[n9] = n8;
            object = dArray[n9];
            if (object != null) {
                object = object.b().b;
                nArray2[n9] = Integer.parseInt(((String)object).substring(0, ((String)object).indexOf(":")));
                continue;
            }
            nArray2[n9] = -1;
        }
        this.d0.clear();
        int n10 = dArray.length;
        e0[] e0Array2 = new e0[n10];
        e0[] e0Array3 = new e0[dArray.length];
        D[] dArray2 = new D[dArray.length];
        ArrayList<C> arrayList = new ArrayList<C>(this.q.length);
        for (n9 = 0; n9 < this.q.length; ++n9) {
            block14: {
                block13: {
                    long l9;
                    block12: {
                        for (n8 = 0; n8 < dArray.length; ++n8) {
                            object = nArray[n8] == n9 ? e0Array[n8] : null;
                            e0Array3[n8] = object;
                            if (nArray2[n8] == n9) {
                                object = ax.S0.a.e(dArray[n8]);
                                ax.P0.P p8 = object.b();
                                dArray2[n8] = new a((D)object, ax.S0.a.e(this.g0.get(p8)));
                                continue;
                            }
                            dArray2[n8] = null;
                        }
                        l9 = this.q[n9].g(dArray2, blArray, e0Array3, blArray2, l8);
                        if (n9 != 0) break block12;
                        l8 = l9;
                        break block13;
                    }
                    if (l9 != l8) break block14;
                }
                int n11 = 0;
                for (int i8 = 0; i8 < dArray.length; ++i8) {
                    if (nArray2[i8] == n9) {
                        object = ax.S0.a.e(e0Array3[i8]);
                        e0Array2[i8] = e0Array3[i8];
                        this.d0.put((e0)object, n9);
                        n8 = 1;
                    } else {
                        n8 = n11;
                        if (nArray[i8] == n9) {
                            boolean bl = e0Array3[i8] == null;
                            ax.S0.a.g(bl);
                            n8 = n11;
                        }
                    }
                    n11 = n8;
                }
                if (n11 == 0) continue;
                arrayList.add(this.q[n9]);
                continue;
            }
            throw new IllegalStateException("Children enabled at different positions.");
        }
        System.arraycopy(e0Array2, 0, e0Array, 0, n10);
        this.j0 = arrayList.toArray(new C[0]);
        this.k0 = this.e0.a(arrayList, I.i(arrayList, new P()));
        return l8;
    }

    @Override
    public void l() throws IOException {
        C[] cArray = this.q;
        int n8 = cArray.length;
        for (int i8 = 0; i8 < n8; ++i8) {
            cArray[i8].l();
        }
    }

    @Override
    public long m(long l8) {
        C[] cArray;
        l8 = this.j0[0].m(l8);
        for (int i8 = 1; i8 < (cArray = this.j0).length; ++i8) {
            if (cArray[i8].m(l8) == l8) {
                continue;
            }
            throw new IllegalStateException("Unexpected child seekToUs result.");
        }
        return l8;
    }

    @Override
    public void n(C.a cArray, long l8) {
        this.h0 = cArray;
        Collections.addAll(this.f0, this.q);
        cArray = this.q;
        int n8 = cArray.length;
        for (int i8 = 0; i8 < n8; ++i8) {
            cArray[i8].n(this, l8);
        }
    }

    public C o(int n8) {
        if (this.c0[n8]) {
            return ((l0)this.q[n8]).j();
        }
        return this.q[n8];
    }

    public void p(C c8) {
        ax.S0.a.e(this.h0).i(this);
    }

    @Override
    public long q(long l8, Z z8) {
        Object object = this.j0;
        object = ((C[])object).length > 0 ? object[0] : this.q[0];
        return object.q(l8, z8);
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    @Override
    public long s() {
        C[] cArray = this.j0;
        int n8 = cArray.length;
        long l8 = -9223372036854775807L;
        for (int i8 = 0; i8 < n8; ++i8) {
            C c8 = cArray[i8];
            long l9 = c8.s();
            if (l9 != -9223372036854775807L) {
                if (l8 == -9223372036854775807L) {
                    for (C c9 : this.j0) {
                        if (c9 == c8) break;
                        if (c9.m(l9) != l9) throw new IllegalStateException("Unexpected child seekToUs result.");
                    }
                } else {
                    if (l9 != l8) throw new IllegalStateException("Conflicting discontinuities.");
                    l9 = l8;
                }
            } else {
                l9 = l8;
                if (l8 != -9223372036854775807L) {
                    if (c8.m(l8) != l8) throw new IllegalStateException("Unexpected child seekToUs result.");
                    l9 = l8;
                }
            }
            l8 = l9;
        }
        return l8;
    }

    @Override
    public q0 t() {
        return ax.S0.a.e(this.i0);
    }

    @Override
    public void v(long l8, boolean bl) {
        C[] cArray = this.j0;
        int n8 = cArray.length;
        for (int i8 = 0; i8 < n8; ++i8) {
            cArray[i8].v(l8, bl);
        }
    }

    private static final class a
    extends F {
        private final ax.P0.P b;

        public a(D d8, ax.P0.P p8) {
            super(d8);
            this.b = p8;
        }

        @Override
        public ax.P0.P b() {
            return this.b;
        }

        @Override
        public boolean equals(Object object) {
            if (super.equals(object) && object instanceof a) {
                object = (a)object;
                return this.b.equals(((a)object).b);
            }
            return false;
        }

        @Override
        public v h(int n8) {
            return this.b.b(this.u().j(n8));
        }

        @Override
        public int hashCode() {
            return super.hashCode() * 31 + this.b.hashCode();
        }

        @Override
        public v m() {
            return this.b.b(this.u().l());
        }
    }
}

