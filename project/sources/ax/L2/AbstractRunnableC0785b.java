package ax.L2;

import androidx.work.impl.WorkDatabase;
import ax.B2.l;
import ax.K2.InterfaceC0782b;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.UUID;

/* renamed from: ax.L2.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractRunnableC0785b implements Runnable {
    private final ax.C2.o q = new ax.C2.o();

    /* renamed from: ax.L2.b$a */
    class a extends AbstractRunnableC0785b {
        final /* synthetic */ ax.C2.D c0;
        final /* synthetic */ UUID d0;

        a(ax.C2.D d, UUID uuid) {
            this.c0 = d;
            this.d0 = uuid;
        }

        @Override // ax.L2.AbstractRunnableC0785b
        void g() {
            WorkDatabase o = this.c0.o();
            o.e();
            try {
                a(this.c0, this.d0.toString());
                o.A();
                o.i();
                f(this.c0);
            } catch (Throwable th) {
                o.i();
                throw th;
            }
        }
    }

    /* renamed from: ax.L2.b$b, reason: collision with other inner class name */
    class C0117b extends AbstractRunnableC0785b {
        final /* synthetic */ ax.C2.D c0;
        final /* synthetic */ String d0;
        final /* synthetic */ boolean e0;

        C0117b(ax.C2.D d, String str, boolean z) {
            this.c0 = d;
            this.d0 = str;
            this.e0 = z;
        }

        @Override // ax.L2.AbstractRunnableC0785b
        void g() {
            WorkDatabase o = this.c0.o();
            o.e();
            try {
                Iterator<String> it = o.I().l(this.d0).iterator();
                while (it.hasNext()) {
                    a(this.c0, it.next());
                }
                o.A();
                o.i();
                if (this.e0) {
                    f(this.c0);
                }
            } catch (Throwable th) {
                o.i();
                throw th;
            }
        }
    }

    public static AbstractRunnableC0785b b(UUID uuid, ax.C2.D d) {
        return new a(d, uuid);
    }

    public static AbstractRunnableC0785b c(String str, ax.C2.D d, boolean z) {
        return new C0117b(d, str, z);
    }

    private void e(WorkDatabase workDatabase, String str) {
        ax.K2.w I = workDatabase.I();
        InterfaceC0782b D = workDatabase.D();
        LinkedList linkedList = new LinkedList();
        linkedList.add(str);
        while (!linkedList.isEmpty()) {
            String str2 = (String) linkedList.remove();
            ax.B2.r m = I.m(str2);
            if (m != ax.B2.r.SUCCEEDED && m != ax.B2.r.FAILED) {
                I.j(ax.B2.r.CANCELLED, str2);
            }
            linkedList.addAll(D.a(str2));
        }
    }

    void a(ax.C2.D d, String str) {
        e(d.o(), str);
        d.l().p(str);
        Iterator<ax.C2.t> it = d.m().iterator();
        while (it.hasNext()) {
            it.next().d(str);
        }
    }

    public ax.B2.l d() {
        return this.q;
    }

    void f(ax.C2.D d) {
        ax.C2.u.b(d.h(), d.o(), d.m());
    }

    abstract void g();

    @Override // java.lang.Runnable
    public void run() {
        try {
            g();
            this.q.a(ax.B2.l.a);
        } catch (Throwable th) {
            this.q.a(new l.b.a(th));
        }
    }
}
