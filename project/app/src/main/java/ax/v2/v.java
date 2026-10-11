/*
 * Decompiled with CFR 0.152.
 */
package ax.v2;

import android.animation.TimeInterpolator;
import android.util.AndroidRuntimeException;
import android.view.View;
import android.view.ViewGroup;
import ax.v2.g;
import ax.v2.k;
import ax.v2.s;
import ax.v2.u;
import ax.v2.x;
import ax.v2.y;
import java.util.ArrayList;

public class v
extends k {
    ArrayList<k> N0 = new ArrayList();
    private boolean O0 = true;
    int P0;
    boolean Q0 = false;
    private int R0 = 0;

    private void A0() {
        b b8 = new b(this);
        ArrayList<k> arrayList = this.N0;
        int n8 = arrayList.size();
        for (int i8 = 0; i8 < n8; ++i8) {
            k k8 = arrayList.get(i8);
            k8.b(b8);
        }
        this.P0 = this.N0.size();
    }

    private void q0(k k8) {
        this.N0.add(k8);
        k8.s0 = this;
    }

    @Override
    public void X(View view) {
        super.X(view);
        int n8 = this.N0.size();
        for (int i8 = 0; i8 < n8; ++i8) {
            this.N0.get(i8).X(view);
        }
    }

    @Override
    public void b0(View view) {
        super.b0(view);
        int n8 = this.N0.size();
        for (int i8 = 0; i8 < n8; ++i8) {
            this.N0.get(i8).b0(view);
        }
    }

    @Override
    protected void cancel() {
        super.cancel();
        int n8 = this.N0.size();
        for (int i8 = 0; i8 < n8; ++i8) {
            this.N0.get(i8).cancel();
        }
    }

    @Override
    protected void d0() {
        int n8;
        if (this.N0.isEmpty()) {
            this.k0();
            this.t();
            return;
        }
        this.A0();
        boolean bl = this.O0;
        if (!bl) {
            for (n8 = 1; n8 < this.N0.size(); ++n8) {
                this.N0.get(n8 - 1).b(new s(this, this.N0.get(n8)){
                    final k a;
                    final v b;
                    {
                        this.b = v8;
                        this.a = k8;
                    }

                    @Override
                    public void a(k k8) {
                        this.a.d0();
                        k8.Z(this);
                    }
                });
            }
            k k8 = this.N0.get(0);
            if (k8 != null) {
                k8.d0();
                return;
            }
        } else {
            ArrayList<k> arrayList = this.N0;
            int n9 = arrayList.size();
            for (n8 = 0; n8 < n9; ++n8) {
                k k9 = arrayList.get(n8);
                k9.d0();
            }
        }
    }

    @Override
    public void f0(k.e e8) {
        super.f0(e8);
        this.R0 |= 8;
        int n8 = this.N0.size();
        for (int i8 = 0; i8 < n8; ++i8) {
            this.N0.get(i8).f0(e8);
        }
    }

    @Override
    public void h0(g g8) {
        super.h0(g8);
        this.R0 |= 4;
        if (this.N0 != null) {
            for (int i8 = 0; i8 < this.N0.size(); ++i8) {
                this.N0.get(i8).h0(g8);
            }
        }
    }

    @Override
    public void i(x x8) {
        if (this.N(x8.b)) {
            ArrayList<k> arrayList = this.N0;
            int n8 = arrayList.size();
            int n9 = 0;
            while (n9 < n8) {
                int n10;
                k k8 = arrayList.get(n9);
                n9 = n10 = n9 + 1;
                if (!k8.N(x8.b)) continue;
                k8.i(x8);
                x8.c.add(k8);
                n9 = n10;
            }
        }
    }

    @Override
    public void i0(u u8) {
        super.i0(u8);
        this.R0 |= 2;
        int n8 = this.N0.size();
        for (int i8 = 0; i8 < n8; ++i8) {
            this.N0.get(i8).i0(u8);
        }
    }

    @Override
    void k(x x8) {
        super.k(x8);
        int n8 = this.N0.size();
        for (int i8 = 0; i8 < n8; ++i8) {
            this.N0.get(i8).k(x8);
        }
    }

    @Override
    public void l(x x8) {
        if (this.N(x8.b)) {
            ArrayList<k> arrayList = this.N0;
            int n8 = arrayList.size();
            int n9 = 0;
            while (n9 < n8) {
                int n10;
                k k8 = arrayList.get(n9);
                n9 = n10 = n9 + 1;
                if (!k8.N(x8.b)) continue;
                k8.l(x8);
                x8.c.add(k8);
                n9 = n10;
            }
        }
    }

    @Override
    String l0(String string) {
        Object object = super.l0(string);
        for (int i8 = 0; i8 < this.N0.size(); ++i8) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append((String)object);
            stringBuilder.append("\n");
            object = this.N0.get(i8);
            StringBuilder stringBuilder2 = new StringBuilder();
            stringBuilder2.append(string);
            stringBuilder2.append("  ");
            stringBuilder.append(((k)object).l0(stringBuilder2.toString()));
            object = stringBuilder.toString();
        }
        return object;
    }

    public v m0(k.f f8) {
        return (v)super.b(f8);
    }

    public v n0(View view) {
        for (int i8 = 0; i8 < this.N0.size(); ++i8) {
            this.N0.get(i8).c(view);
        }
        return (v)super.c(view);
    }

    @Override
    public k o() {
        v v8 = (v)super.o();
        v8.N0 = new ArrayList();
        int n8 = this.N0.size();
        for (int i8 = 0; i8 < n8; ++i8) {
            v8.q0(this.N0.get(i8).o());
        }
        return v8;
    }

    public v p0(k k8) {
        this.q0(k8);
        long l8 = this.d0;
        if (l8 >= 0L) {
            k8.e0(l8);
        }
        if ((this.R0 & 1) != 0) {
            k8.g0(this.x());
        }
        if ((this.R0 & 2) != 0) {
            this.C();
            k8.i0(null);
        }
        if ((this.R0 & 4) != 0) {
            k8.h0(this.B());
        }
        if ((this.R0 & 8) != 0) {
            k8.f0(this.w());
        }
        return this;
    }

    public k r0(int n8) {
        if (n8 >= 0 && n8 < this.N0.size()) {
            return this.N0.get(n8);
        }
        return null;
    }

    @Override
    void s(ViewGroup viewGroup, y y8, y y9, ArrayList<x> arrayList, ArrayList<x> arrayList2) {
        long l8 = this.F();
        int n8 = this.N0.size();
        for (int i8 = 0; i8 < n8; ++i8) {
            k k8 = this.N0.get(i8);
            if (l8 > 0L && (this.O0 || i8 == 0)) {
                long l9 = k8.F();
                if (l9 > 0L) {
                    k8.j0(l9 + l8);
                } else {
                    k8.j0(l8);
                }
            }
            k8.s(viewGroup, y8, y9, arrayList, arrayList2);
        }
    }

    public int s0() {
        return this.N0.size();
    }

    public v t0(k.f f8) {
        return (v)super.Z(f8);
    }

    public v v0(View view) {
        for (int i8 = 0; i8 < this.N0.size(); ++i8) {
            this.N0.get(i8).a0(view);
        }
        return (v)super.a0(view);
    }

    public v w0(long l8) {
        ArrayList<k> arrayList;
        super.e0(l8);
        if (this.d0 >= 0L && (arrayList = this.N0) != null) {
            int n8 = arrayList.size();
            for (int i8 = 0; i8 < n8; ++i8) {
                this.N0.get(i8).e0(l8);
            }
        }
        return this;
    }

    public v x0(TimeInterpolator timeInterpolator) {
        this.R0 |= 1;
        ArrayList<k> arrayList = this.N0;
        if (arrayList != null) {
            int n8 = arrayList.size();
            for (int i8 = 0; i8 < n8; ++i8) {
                this.N0.get(i8).g0(timeInterpolator);
            }
        }
        return (v)super.g0(timeInterpolator);
    }

    public v y0(int n8) {
        if (n8 != 0) {
            if (n8 == 1) {
                this.O0 = false;
                return this;
            }
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Invalid parameter for TransitionSet ordering: ");
            stringBuilder.append(n8);
            throw new AndroidRuntimeException(stringBuilder.toString());
        }
        this.O0 = true;
        return this;
    }

    public v z0(long l8) {
        return (v)super.j0(l8);
    }

    static class b
    extends s {
        v a;

        b(v v8) {
            this.a = v8;
        }

        @Override
        public void a(k k8) {
            int n8;
            v v8 = this.a;
            v8.P0 = n8 = v8.P0 - 1;
            if (n8 == 0) {
                v8.Q0 = false;
                v8.t();
            }
            k8.Z(this);
        }

        @Override
        public void g(k k8) {
            k8 = this.a;
            if (!((v)k8).Q0) {
                k8.k0();
                this.a.Q0 = true;
            }
        }
    }
}

