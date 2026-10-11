/*
 * Decompiled with CFR 0.152.
 */
package ax.g1;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import androidx.media3.exoplayer.h;
import ax.P0.C;
import ax.P0.v;
import ax.S0.d0;
import ax.V0.i;
import ax.Y0.O;
import ax.Y0.V;
import ax.g1.a;
import ax.g1.b;
import ax.i1.F;
import java.util.ArrayList;
import java.util.List;

public final class c
extends h
implements Handler.Callback {
    private boolean A0;
    private long B0;
    private C C0;
    private long D0;
    private final a t0;
    private final b u0;
    private final Handler v0;
    private final ax.z1.b w0;
    private final boolean x0;
    private ax.z1.a y0;
    private boolean z0;

    public c(b b8, Looper looper) {
        this(b8, looper, a.a);
    }

    public c(b b8, Looper looper, a a8) {
        this(b8, looper, a8, false);
    }

    public c(b b8, Looper looper, a a8, boolean bl) {
        super(5);
        this.u0 = ax.S0.a.e(b8);
        b8 = looper == null ? null : d0.z(looper, this);
        this.v0 = b8;
        this.t0 = ax.S0.a.e(a8);
        this.x0 = bl;
        this.w0 = new ax.z1.b();
        this.D0 = -9223372036854775807L;
    }

    private void i0(C c8, List<C.a> list) {
        for (int i8 = 0; i8 < c8.e(); ++i8) {
            Object object = c8.d(i8).a();
            if (object != null && this.t0.b((v)object)) {
                ax.z1.a a8 = this.t0.a((v)object);
                object = ax.S0.a.e(c8.d(i8).c());
                this.w0.p();
                this.w0.C(((Object)object).length);
                d0.i(this.w0.e0).put((byte[])object);
                this.w0.D();
                object = a8.a(this.w0);
                if (object == null) continue;
                this.i0((C)object, list);
                continue;
            }
            list.add(c8.d(i8));
        }
    }

    private long j0(long l8) {
        boolean bl = false;
        boolean bl2 = l8 != -9223372036854775807L;
        ax.S0.a.g(bl2);
        bl2 = bl;
        if (this.D0 != -9223372036854775807L) {
            bl2 = true;
        }
        ax.S0.a.g(bl2);
        return l8 - this.D0;
    }

    private void k0(C c8) {
        Handler handler = this.v0;
        if (handler != null) {
            handler.obtainMessage(1, (Object)c8).sendToTarget();
            return;
        }
        this.l0(c8);
    }

    private void l0(C c8) {
        this.u0.r(c8);
    }

    private boolean m0(long l8) {
        boolean bl;
        C c8 = this.C0;
        if (c8 != null && (this.x0 || c8.b <= this.j0(l8))) {
            this.k0(this.C0);
            this.C0 = null;
            bl = true;
        } else {
            bl = false;
        }
        if (this.z0 && this.C0 == null) {
            this.A0 = true;
        }
        return bl;
    }

    private void n0() {
        if (!this.z0 && this.C0 == null) {
            this.w0.p();
            Object object = this.M();
            int n8 = this.f0((O)object, this.w0, 0);
            if (n8 == -4) {
                if (this.w0.s()) {
                    this.z0 = true;
                    return;
                }
                if (this.w0.g0 >= this.O()) {
                    object = this.w0;
                    ((ax.z1.b)object).k0 = this.B0;
                    ((i)object).D();
                    object = d0.i(this.y0).a(this.w0);
                    if (object != null) {
                        ArrayList<C.a> arrayList = new ArrayList<C.a>(((C)object).e());
                        this.i0((C)object, arrayList);
                        if (!arrayList.isEmpty()) {
                            this.C0 = new C(this.j0(this.w0.g0), arrayList);
                            return;
                        }
                    }
                }
            } else if (n8 == -5) {
                this.B0 = ax.S0.a.e(((O)object).b).t;
            }
        }
    }

    @Override
    protected void U() {
        this.C0 = null;
        this.y0 = null;
        this.D0 = -9223372036854775807L;
    }

    @Override
    protected void X(long l8, boolean bl) {
        this.C0 = null;
        this.z0 = false;
        this.A0 = false;
    }

    @Override
    public int b(v v8) {
        if (this.t0.b(v8)) {
            int n8 = v8.P == 0 ? 4 : 2;
            return V.a(n8);
        }
        return V.a(0);
    }

    @Override
    public boolean c() {
        return this.A0;
    }

    @Override
    protected void d0(v[] object, long l8, long l9, F.b b8) {
        this.y0 = this.t0.a(object[0]);
        object = this.C0;
        if (object != null) {
            this.C0 = ((C)object).c(((C)object).b + this.D0 - l9);
        }
        this.D0 = l9;
    }

    @Override
    public String getName() {
        return "MetadataRenderer";
    }

    public boolean handleMessage(Message message) {
        if (message.what == 1) {
            this.l0((C)message.obj);
            return true;
        }
        throw new IllegalStateException();
    }

    @Override
    public void i(long l8, long l9) {
        boolean bl = true;
        while (bl) {
            this.n0();
            bl = this.m0(l8);
        }
    }

    @Override
    public boolean isReady() {
        return true;
    }
}

