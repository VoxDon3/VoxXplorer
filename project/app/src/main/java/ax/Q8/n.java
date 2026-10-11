/*
 * Decompiled with CFR 0.152.
 */
package ax.Q8;

import ax.Q8.m;
import ax.Q8.q;
import ax.Q8.r;
import ax.Q8.t;
import ax.R8.A;
import ax.R8.b;
import ax.R8.c;
import ax.R8.g;
import ax.R8.h;
import ax.R8.i;
import ax.R8.j;
import ax.R8.k;
import ax.R8.o;
import ax.R8.s;
import ax.R8.v;
import ax.R8.x;
import ax.R8.y;
import ax.Xd.f;
import ax.Z8.a;
import ax.h9.d;
import ax.h9.e;

public class n {
    private static final ax.Xd.d a = f.k(n.class);

    private q a(r object) {
        object = ((t)((e)object).b()).h();
        switch (ax.Q8.n$a.a[((Enum)object).ordinal()]) {
            default: {
                ax.Xd.d d8 = a;
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("Unknown SMB2 Message Command type: ");
                stringBuilder.append(object);
                d8.f(stringBuilder.toString());
                stringBuilder = new StringBuilder();
                stringBuilder.append("Unknown SMB2 Message Command type: ");
                stringBuilder.append(object);
                throw new ax.k9.d(stringBuilder.toString());
            }
            case 18: {
                return new j();
            }
            case 17: {
                return new ax.R8.a();
            }
            case 16: {
                return new v();
            }
            case 15: {
                return new ax.R8.q();
            }
            case 14: {
                return new i();
            }
            case 13: {
                return new A();
            }
            case 12: {
                return new g();
            }
            case 11: {
                return new c();
            }
            case 10: {
                return new s();
            }
            case 9: {
                return new ax.R8.f();
            }
            case 8: {
                return new o();
            }
            case 7: {
                return new b();
            }
            case 6: {
                return new ax.R8.e();
            }
            case 5: {
                return new k();
            }
            case 4: {
                return new y();
            }
            case 3: {
                return new x();
            }
            case 2: {
                return new ax.R8.t();
            }
            case 1: 
        }
        return new ax.R8.m();
    }

    private boolean b(d<?, ?> d8, r r8) {
        if (r8.i()) {
            return true;
        }
        m m8 = ((t)r8.b()).h();
        long l8 = ((t)r8.b()).m();
        int n8 = ax.Q8.n$a.a[m8.ordinal()];
        if (n8 != 2) {
            if (n8 != 7) {
                if (n8 != 10) {
                    if (n8 != 14) {
                        if (n8 != 15) {
                            return false;
                        }
                    } else {
                        long l9 = ((h)d8).o();
                        if (l9 != 1130508L && l9 != 1163287L && l9 != 393620L) {
                            if (l9 != 1327346L && l9 != 1343730L) {
                                return false;
                            }
                            return l8 == ax.K8.a.p0.getValue();
                        }
                        return l8 == ax.K8.a.i0.getValue();
                    }
                }
                return l8 == ax.K8.a.i0.getValue();
            }
            return l8 == ax.K8.a.h0.getValue();
        }
        return l8 == ax.K8.a.r0.getValue();
    }

    public q c(d<?, ?> d8, r r8) throws a.b {
        q q8 = this.a(r8);
        if (this.b(d8, r8)) {
            q8.h(r8);
            return q8;
        }
        q8.i(r8);
        return q8;
    }
}

