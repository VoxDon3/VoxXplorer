/*
 * Decompiled with CFR 0.152.
 */
package ax.c1;

import android.annotation.SuppressLint;
import android.net.Uri;
import android.text.TextUtils;
import ax.N1.t;
import ax.P0.C;
import ax.P0.D;
import ax.P0.q;
import ax.P0.v;
import ax.S0.M;
import ax.X1.K;
import ax.X1.b;
import ax.X1.j;
import ax.Z0.I1;
import ax.c1.a;
import ax.c1.e;
import ax.c1.h;
import ax.c1.k;
import ax.q1.r;
import ax.q1.s;
import ax.r7.z;
import ax.u7.f;
import java.io.EOFException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;

public final class c
implements e {
    private static final int[] f = new int[]{8, 13, 11, 2, 0, 1, 7};
    private final int a;
    private t.a b;
    private boolean c;
    private int d;
    private final boolean e;

    public c() {
        this(0, true);
    }

    public c(int n8, boolean bl) {
        this.a = n8;
        this.e = bl;
        this.b = new ax.N1.h();
    }

    private static void f(int n8, List<Integer> list) {
        if (ax.u7.f.k(f, n8) != -1 && !list.contains(n8)) {
            list.add(n8);
        }
    }

    @SuppressLint(value={"SwitchIntDef"})
    private r h(int n8, v v8, List<v> list, M m8) {
        if (n8 != 0) {
            if (n8 != 1) {
                if (n8 != 2) {
                    if (n8 != 7) {
                        if (n8 != 8) {
                            if (n8 != 11) {
                                if (n8 != 13) {
                                    return null;
                                }
                                return new k(v8.d, m8, this.b, this.c);
                            }
                            return ax.c1.c.j(this.a, this.e, v8, list, m8, this.b, this.c);
                        }
                        return ax.c1.c.i(this.b, this.c, m8, v8, list, this.d);
                    }
                    return new ax.J1.f(0, 0L);
                }
                return new ax.X1.h();
            }
            return new ax.X1.e();
        }
        return new b();
    }

    private static ax.K1.h i(t.a a8, boolean bl, M m8, v v8, List<v> list, int n8) {
        int n9;
        block1: {
            int n10 = ax.c1.c.m(v8) ? 4 : 0;
            n9 = n10;
            if (!bl) {
                a8 = t.a.a;
                n9 = n10 | 0x20;
            }
            n8 = ax.K1.h.l(n8);
            if (list != null) break block1;
            list = z.z();
        }
        return new ax.K1.h(a8, n9 | n8, m8, null, list, null);
    }

    private static K j(int n8, boolean bl, v object, List<v> list, M m8, t.a a8, boolean bl2) {
        int n9 = n8 | 0x10;
        if (list != null) {
            n8 |= 0x30;
        } else if (bl) {
            list = Collections.singletonList(new v.b().y0("application/cea-608").P());
            n8 = n9;
        } else {
            list = Collections.EMPTY_LIST;
            n8 = n9;
        }
        object = ((v)object).k;
        n9 = n8;
        if (!TextUtils.isEmpty((CharSequence)object)) {
            int n10 = n8;
            if (!D.b((String)object, "audio/mp4a-latm")) {
                n10 = n8 | 2;
            }
            n9 = n10;
            if (!D.b((String)object, "video/avc")) {
                n9 = n10 | 4;
            }
        }
        if (!bl2) {
            a8 = t.a.a;
            n8 = 1;
        } else {
            n8 = 0;
        }
        return new K(2, n8, a8, m8, new j(n9, list), 112800);
    }

    private static boolean m(v object) {
        C c8 = ((v)object).l;
        if (c8 == null) {
            return false;
        }
        for (int i8 = 0; i8 < c8.e(); ++i8) {
            object = c8.d(i8);
            if (!(object instanceof h)) continue;
            return ((h)object).c.isEmpty() ^ true;
        }
        return false;
    }

    private static boolean o(r r8, s s8) throws IOException {
        try {
            boolean bl = r8.c(s8);
            return bl;
        }
        catch (EOFException eOFException) {
            return false;
        }
        finally {
            s8.m();
        }
    }

    @Override
    public v d(v object) {
        Object object2 = object;
        if (this.c) {
            object2 = object;
            if (this.b.b((v)object)) {
                v.b b8 = ((v)object).b().y0("application/x-media3-cues").Y(this.b.a((v)object));
                object2 = new StringBuilder();
                ((StringBuilder)object2).append(((v)object).o);
                if (((v)object).k != null) {
                    StringBuilder stringBuilder = new StringBuilder();
                    stringBuilder.append(" ");
                    stringBuilder.append(((v)object).k);
                    object = stringBuilder.toString();
                } else {
                    object = "";
                }
                ((StringBuilder)object2).append((String)object);
                object2 = b8.U(((StringBuilder)object2).toString()).C0(Long.MAX_VALUE).P();
            }
        }
        return object2;
    }

    public a g(Uri object, v v8, List<v> list, M m8, Map<String, List<String>> object2, s s8, I1 object3) throws IOException {
        int n8;
        int n9 = q.a(v8.o);
        int n10 = q.b(object2);
        int n11 = q.c(object);
        object = f;
        ArrayList<Integer> arrayList = new ArrayList<Integer>(((Uri)object).length);
        ax.c1.c.f(n9, arrayList);
        ax.c1.c.f(n10, arrayList);
        ax.c1.c.f(n11, arrayList);
        int n12 = ((Uri)object).length;
        int n13 = 0;
        for (n8 = 0; n8 < n12; ++n8) {
            ax.c1.c.f((int)object[n8], arrayList);
        }
        s8.m();
        object2 = null;
        for (n8 = n13; n8 < arrayList.size(); ++n8) {
            block6: {
                block7: {
                    n13 = (Integer)arrayList.get(n8);
                    object3 = ax.S0.a.e(this.h(n13, v8, list, m8));
                    if (ax.c1.c.o((r)object3, s8)) {
                        return new a((r)object3, v8, m8, this.b, this.c);
                    }
                    object = object2;
                    if (object2 != null) break block6;
                    if (n13 == n9 || n13 == n10 || n13 == n11) break block7;
                    object = object2;
                    if (n13 != 11) break block6;
                }
                object = object3;
            }
            object2 = object;
        }
        return new a((r)((Object)ax.S0.a.e(object2)), v8, m8, this.b, this.c);
    }

    public c k(boolean bl) {
        this.c = bl;
        return this;
    }

    public c l(int n8) {
        this.d = n8;
        return this;
    }

    public c n(t.a a8) {
        this.b = a8;
        return this;
    }
}

