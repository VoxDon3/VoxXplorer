/*
 * Decompiled with CFR 0.152.
 */
package ax.C2;

import android.annotation.SuppressLint;
import android.content.Context;
import androidx.work.WorkerParameters;
import androidx.work.a;
import androidx.work.b;
import androidx.work.c;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.background.systemalarm.RescheduleReceiver;
import ax.B2.g;
import ax.B2.i;
import ax.B2.r;
import ax.C2.F;
import ax.C2.t;
import ax.C2.u;
import ax.K2.m;
import ax.K2.v;
import ax.K2.w;
import ax.K2.y;
import ax.L2.B;
import ax.L2.C;
import ax.L2.D;
import ax.L2.x;
import ax.v7.e;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.UUID;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;

public class G
implements Runnable {
    static final String t0 = i.i("WorkerWrapper");
    private final String c0;
    private List<t> d0;
    private WorkerParameters.a e0;
    v f0;
    androidx.work.c g0;
    ax.N2.c h0;
    c.a i0 = c.a.a();
    private a j0;
    private ax.J2.a k0;
    private WorkDatabase l0;
    private w m0;
    private ax.K2.b n0;
    private List<String> o0;
    private String p0;
    Context q;
    ax.M2.c<Boolean> q0 = ax.M2.c.t();
    final ax.M2.c<c.a> r0 = ax.M2.c.t();
    private volatile boolean s0;

    G(c c8) {
        this.q = c8.a;
        this.h0 = c8.d;
        this.k0 = c8.c;
        Object object = c8.g;
        this.f0 = object;
        this.c0 = ((v)object).a;
        this.d0 = c8.h;
        this.e0 = c8.j;
        this.g0 = c8.b;
        this.j0 = c8.e;
        this.l0 = object = c8.f;
        this.m0 = ((WorkDatabase)object).I();
        this.n0 = this.l0.D();
        this.o0 = c8.i;
    }

    public static /* synthetic */ void a(G g8, e e8) {
        if (g8.r0.isCancelled()) {
            e8.cancel(true);
        }
    }

    private String b(List<String> object) {
        StringBuilder stringBuilder = new StringBuilder("Work [ id=");
        stringBuilder.append(this.c0);
        stringBuilder.append(", tags={ ");
        object = object.iterator();
        boolean bl = true;
        while (object.hasNext()) {
            String string = (String)object.next();
            if (bl) {
                bl = false;
            } else {
                stringBuilder.append(", ");
            }
            stringBuilder.append(string);
        }
        stringBuilder.append(" } ]");
        return stringBuilder.toString();
    }

    private void f(c.a object) {
        if (object instanceof c.a.c) {
            i i8 = i.e();
            object = t0;
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Worker result SUCCESS for ");
            stringBuilder.append(this.p0);
            i8.f((String)object, stringBuilder.toString());
            if (this.f0.h()) {
                this.k();
                return;
            }
            this.p();
            return;
        }
        if (object instanceof c.a.b) {
            object = i.e();
            String string = t0;
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Worker result RETRY for ");
            stringBuilder.append(this.p0);
            ((i)object).f(string, stringBuilder.toString());
            this.j();
            return;
        }
        i i9 = i.e();
        object = t0;
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Worker result FAILURE for ");
        stringBuilder.append(this.p0);
        i9.f((String)object, stringBuilder.toString());
        if (this.f0.h()) {
            this.k();
            return;
        }
        this.o();
    }

    private void h(String string) {
        LinkedList<String> linkedList = new LinkedList<String>();
        linkedList.add(string);
        while (!linkedList.isEmpty()) {
            string = (String)linkedList.remove();
            if (this.m0.m(string) != r.g0) {
                this.m0.j(r.e0, string);
            }
            linkedList.addAll(this.n0.a(string));
        }
    }

    private void j() {
        this.l0.e();
        try {
            this.m0.j(r.q, this.c0);
            this.m0.q(this.c0, System.currentTimeMillis());
            this.m0.b(this.c0, -1L);
            this.l0.A();
            return;
        }
        finally {
            this.l0.i();
            this.l(true);
        }
    }

    private void k() {
        this.l0.e();
        try {
            this.m0.q(this.c0, System.currentTimeMillis());
            this.m0.j(r.q, this.c0);
            this.m0.o(this.c0);
            this.m0.a(this.c0);
            this.m0.b(this.c0, -1L);
            this.l0.A();
            return;
        }
        finally {
            this.l0.i();
            this.l(false);
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private void l(boolean bl) {
        Throwable throwable2;
        block5: {
            block4: {
                this.l0.e();
                try {
                    if (this.l0.I().k()) break block4;
                    ax.L2.r.a(this.q, RescheduleReceiver.class, false);
                }
                catch (Throwable throwable2) {
                    break block5;
                }
            }
            if (bl) {
                this.m0.j(r.q, this.c0);
                this.m0.b(this.c0, -1L);
            }
            if (this.f0 != null && this.g0 != null && this.k0.b(this.c0)) {
                this.k0.a(this.c0);
            }
            this.l0.A();
            this.l0.i();
            this.q0.p(bl);
            return;
        }
        this.l0.i();
        throw throwable2;
    }

    private void m() {
        Object object = this.m0.m(this.c0);
        if (object == r.c0) {
            object = i.e();
            String string = t0;
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Status for ");
            stringBuilder.append(this.c0);
            stringBuilder.append(" is RUNNING; not doing any work and rescheduling for later execution");
            ((i)object).a(string, stringBuilder.toString());
            this.l(true);
            return;
        }
        i i8 = i.e();
        String string = t0;
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Status for ");
        stringBuilder.append(this.c0);
        stringBuilder.append(" is ");
        stringBuilder.append(object);
        stringBuilder.append(" ; not doing any work");
        i8.a(string, stringBuilder.toString());
        this.l(false);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private void n() {
        Throwable throwable2;
        block15: {
            Object object;
            Object object2;
            block14: {
                block13: {
                    if (this.q()) {
                        return;
                    }
                    this.l0.e();
                    try {
                        object2 = this.f0;
                        if (((v)object2).b != r.q) {
                            this.m();
                            this.l0.A();
                            object2 = i.e();
                            String string = t0;
                            StringBuilder stringBuilder = new StringBuilder();
                            stringBuilder.append(this.f0.c);
                            stringBuilder.append(" is not in ENQUEUED state. Nothing more to do");
                            ((i)object2).a(string, stringBuilder.toString());
                            this.l0.i();
                            return;
                        }
                        if ((((v)object2).h() || this.f0.g()) && System.currentTimeMillis() < this.f0.a()) {
                            i.e().a(t0, String.format("Delaying execution for %s because it is being executed before schedule.", this.f0.c));
                            this.l(true);
                            this.l0.A();
                            this.l0.i();
                            return;
                        }
                        this.l0.A();
                        this.l0.i();
                        if (!this.f0.h()) break block13;
                        object2 = this.f0.e;
                        break block14;
                    }
                    catch (Throwable throwable2) {
                        break block15;
                    }
                }
                object2 = this.j0.f().b(this.f0.d);
                if (object2 == null) {
                    object2 = i.e();
                    String string = t0;
                    StringBuilder stringBuilder = new StringBuilder();
                    stringBuilder.append("Could not create Input Merger ");
                    stringBuilder.append(this.f0.d);
                    ((i)object2).c(string, stringBuilder.toString());
                    this.o();
                    return;
                }
                object = new ArrayList<String>();
                object.add((String)((Object)this.f0.e));
                object.addAll(this.m0.r(this.c0));
                object2 = ((g)object2).b((List<b>)object);
            }
            UUID uUID = UUID.fromString(this.c0);
            object = this.o0;
            Object object3 = this.e0;
            v v8 = this.f0;
            object2 = new WorkerParameters(uUID, (b)object2, (Collection<String>)object, (WorkerParameters.a)object3, v8.k, v8.d(), this.j0.d(), this.h0, this.j0.n(), new D(this.l0, this.h0), new C(this.l0, this.k0, this.h0));
            if (this.g0 == null) {
                this.g0 = this.j0.n().b(this.q, this.f0.c, (WorkerParameters)object2);
            }
            if ((object = this.g0) == null) {
                object3 = i.e();
                object = t0;
                object2 = new StringBuilder();
                ((StringBuilder)object2).append("Could not create Worker ");
                ((StringBuilder)object2).append(this.f0.c);
                ((i)object3).c((String)object, ((StringBuilder)object2).toString());
                this.o();
                return;
            }
            if (((androidx.work.c)object).j()) {
                object = i.e();
                object3 = t0;
                object2 = new StringBuilder();
                ((StringBuilder)object2).append("Received an already-used Worker ");
                ((StringBuilder)object2).append(this.f0.c);
                ((StringBuilder)object2).append("; Worker Factory should return new instances");
                ((i)object).c((String)object3, ((StringBuilder)object2).toString());
                this.o();
                return;
            }
            this.g0.l();
            if (!this.r()) {
                this.m();
                return;
            }
            if (this.q()) {
                return;
            }
            object2 = new B(this.q, this.f0, this.g0, ((WorkerParameters)object2).b(), this.h0);
            this.h0.a().execute((Runnable)object2);
            object2 = ((B)object2).b();
            this.r0.h(new F(this, (e)object2), new x());
            object2.h(new Runnable(){
                final G c0;
                final e q;
                {
                    this.c0 = g8;
                    this.q = e8;
                }

                @Override
                public void run() {
                    if (!this.c0.r0.isCancelled()) {
                        try {
                            this.q.get();
                            i i8 = i.e();
                            Object object = t0;
                            StringBuilder stringBuilder = new StringBuilder();
                            stringBuilder.append("Starting work for ");
                            stringBuilder.append(this.c0.f0.c);
                            i8.a((String)object, stringBuilder.toString());
                            object = this.c0;
                            ((G)object).r0.r(((G)object).g0.m());
                            return;
                        }
                        catch (Throwable throwable) {
                            this.c0.r0.q(throwable);
                        }
                    }
                }
            }, this.h0.a());
            object2 = this.p0;
            this.r0.h(new Runnable(){
                final G c0;
                final String q;
                {
                    this.c0 = g8;
                    this.q = string;
                }

                /*
                 * Loose catch block
                 * WARNING - void declaration
                 * Enabled aggressive block sorting
                 * Enabled unnecessary exception pruning
                 * Enabled aggressive exception aggregation
                 */
                @Override
                @SuppressLint(value={"SyntheticAccessor"})
                public void run() {
                    block10: {
                        Throwable var1_9;
                        block9: {
                            Throwable throwable222;
                            block8: {
                                try {
                                    c.a a8 = (c.a)this.c0.r0.get();
                                    if (a8 == null) {
                                        i i8 = i.e();
                                        String string = t0;
                                        StringBuilder stringBuilder = new StringBuilder();
                                        stringBuilder.append(this.c0.f0.c);
                                        stringBuilder.append(" returned a null result. Treating it as a failure.");
                                        i8.c(string, stringBuilder.toString());
                                        break block8;
                                    }
                                    i i9 = i.e();
                                    String string = t0;
                                    StringBuilder stringBuilder = new StringBuilder();
                                    stringBuilder.append(this.c0.f0.c);
                                    stringBuilder.append(" returned a ");
                                    stringBuilder.append(a8);
                                    stringBuilder.append(".");
                                    i9.a(string, stringBuilder.toString());
                                    this.c0.i0 = a8;
                                }
                                catch (Throwable throwable222) {}
                            }
                            this.c0.i();
                            return;
                            this.c0.i();
                            throw throwable222;
                            catch (ExecutionException executionException) {
                                break block9;
                            }
                            catch (InterruptedException interruptedException) {}
                        }
                        i i10 = i.e();
                        String string = t0;
                        StringBuilder stringBuilder = new StringBuilder();
                        stringBuilder.append(this.q);
                        stringBuilder.append(" failed because it threw an exception/error");
                        i10.d(string, stringBuilder.toString(), (Throwable)var1_9);
                        break block10;
                        catch (CancellationException cancellationException) {}
                        i i11 = i.e();
                        String string2 = t0;
                        StringBuilder stringBuilder2 = new StringBuilder();
                        stringBuilder2.append(this.q);
                        stringBuilder2.append(" was cancelled");
                        i11.g(string2, stringBuilder2.toString(), cancellationException);
                    }
                    this.c0.i();
                }
            }, this.h0.b());
            return;
        }
        this.l0.i();
        throw throwable2;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private void p() {
        this.l0.e();
        try {
            this.m0.j(r.d0, this.c0);
            Object object = ((c.a.c)this.i0).e();
            this.m0.g(this.c0, (b)object);
            long l8 = System.currentTimeMillis();
            Iterator<String> iterator = this.n0.a(this.c0).iterator();
            while (true) {
                if (!iterator.hasNext()) {
                    this.l0.A();
                    this.l0.i();
                    this.l(false);
                    return;
                }
                String string = iterator.next();
                if (this.m0.m(string) != r.f0 || !this.n0.c(string)) continue;
                object = i.e();
                String string2 = t0;
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("Setting status to enqueued for ");
                stringBuilder.append(string);
                ((i)object).f(string2, stringBuilder.toString());
                this.m0.j(r.q, string);
                this.m0.q(string, l8);
            }
        }
        catch (Throwable throwable) {}
        this.l0.i();
        this.l(false);
        throw throwable;
    }

    private boolean q() {
        if (this.s0) {
            Object object = i.e();
            String string = t0;
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Work interrupted for ");
            stringBuilder.append(this.p0);
            ((i)object).a(string, stringBuilder.toString());
            object = this.m0.m(this.c0);
            if (object == null) {
                this.l(false);
            } else {
                this.l(((r)((Object)object)).h() ^ true);
            }
            return true;
        }
        return false;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private boolean r() {
        Throwable throwable2;
        block4: {
            boolean bl;
            block3: {
                block2: {
                    this.l0.e();
                    try {
                        if (this.m0.m(this.c0) != r.q) break block2;
                        this.m0.j(r.c0, this.c0);
                        this.m0.s(this.c0);
                        bl = true;
                        break block3;
                    }
                    catch (Throwable throwable2) {
                        break block4;
                    }
                }
                bl = false;
            }
            this.l0.A();
            this.l0.i();
            return bl;
        }
        this.l0.i();
        throw throwable2;
    }

    public e<Boolean> c() {
        return this.q0;
    }

    public m d() {
        return y.a(this.f0);
    }

    public v e() {
        return this.f0;
    }

    public void g() {
        this.s0 = true;
        this.q();
        this.r0.cancel(true);
        if (this.g0 != null && this.r0.isCancelled()) {
            this.g0.n();
            return;
        }
        CharSequence charSequence = new StringBuilder();
        charSequence.append("WorkSpec ");
        charSequence.append(this.f0);
        charSequence.append(" is already done. Not interrupting.");
        charSequence = charSequence.toString();
        i.e().a(t0, (String)charSequence);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    void i() {
        Object object;
        block11: {
            if (!this.q()) {
                Throwable throwable2;
                block10: {
                    block9: {
                        block8: {
                            this.l0.e();
                            try {
                                object = this.m0.m(this.c0);
                                this.l0.H().h(this.c0);
                                if (object != null) break block8;
                                this.l(false);
                                break block9;
                            }
                            catch (Throwable throwable2) {
                                break block10;
                            }
                        }
                        if (object == r.c0) {
                            this.f(this.i0);
                        } else if (!((r)((Object)object)).h()) {
                            this.j();
                        }
                    }
                    this.l0.A();
                    this.l0.i();
                    break block11;
                }
                this.l0.i();
                throw throwable2;
            }
        }
        if ((object = this.d0) != null) {
            object = object.iterator();
            while (object.hasNext()) {
                ((t)object.next()).d(this.c0);
            }
            u.b(this.j0, this.l0, this.d0);
        }
    }

    void o() {
        this.l0.e();
        try {
            this.h(this.c0);
            b b8 = ((c.a.a)this.i0).e();
            this.m0.g(this.c0, b8);
            this.l0.A();
            return;
        }
        finally {
            this.l0.i();
            this.l(false);
        }
    }

    @Override
    public void run() {
        this.p0 = this.b(this.o0);
        this.n();
    }

    public static class c {
        Context a;
        androidx.work.c b;
        ax.J2.a c;
        ax.N2.c d;
        a e;
        WorkDatabase f;
        v g;
        List<t> h;
        private final List<String> i;
        WorkerParameters.a j = new WorkerParameters.a();

        public c(Context context, a a8, ax.N2.c c8, ax.J2.a a9, WorkDatabase workDatabase, v v8, List<String> list) {
            this.a = context.getApplicationContext();
            this.d = c8;
            this.c = a9;
            this.e = a8;
            this.f = workDatabase;
            this.g = v8;
            this.i = list;
        }

        public G b() {
            return new G(this);
        }

        public c c(WorkerParameters.a a8) {
            if (a8 != null) {
                this.j = a8;
            }
            return this;
        }

        public c d(List<t> list) {
            this.h = list;
            return this;
        }
    }
}

