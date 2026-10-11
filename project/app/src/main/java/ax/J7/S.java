/*
 * Decompiled with CFR 0.152.
 */
package ax.J7;

import android.app.ApplicationExitInfo;
import android.content.Context;
import ax.G7.g;
import ax.J7.B;
import ax.J7.C;
import ax.J7.F;
import ax.J7.H;
import ax.J7.I;
import ax.J7.J;
import ax.J7.K;
import ax.J7.L;
import ax.J7.M;
import ax.J7.N;
import ax.J7.O;
import ax.J7.P;
import ax.J7.Q;
import ax.J7.a;
import ax.J7.m;
import ax.J7.t;
import ax.J7.u;
import ax.K7.e;
import ax.L2.f;
import ax.L2.h;
import ax.L7.F;
import ax.P7.b;
import ax.Q7.i;
import ax.R7.d;
import ax.j6.j;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.SortedSet;
import java.util.concurrent.Executor;

public class S {
    private final t a;
    private final ax.O7.e b;
    private final b c;
    private final e d;
    private final ax.K7.m e;
    private final C f;

    S(t t8, ax.O7.e e8, b b8, e e9, ax.K7.m m8, C c8) {
        this.a = t8;
        this.b = e8;
        this.c = b8;
        this.d = e9;
        this.e = m8;
        this.f = c8;
    }

    public static /* synthetic */ int a(F.c c8, F.c c9) {
        return c8.b().compareTo(c9.b());
    }

    public static /* synthetic */ boolean b(S s8, j j8) {
        return s8.q(j8);
    }

    private F.e.d c(F.e.d d8, e list, ax.K7.m object) {
        F.e.d.b b8 = d8.h();
        if ((list = ((e)((Object)list)).c()) != null) {
            b8.d(F.e.d.d.a().b((String)((Object)list)).a());
        } else {
            g.f().i("No log data to include with this event.");
        }
        list = S.m(((ax.K7.m)object).e());
        object = S.m(((ax.K7.m)object).f());
        if (!list.isEmpty() || !object.isEmpty()) {
            b8.b(d8.b().i().e(list).g((List<F.c>)object).a());
        }
        return b8.a();
    }

    private F.e.d d(F.e.d d8) {
        return this.e(this.c(d8, this.d, this.e), this.e);
    }

    private F.e.d e(F.e.d object, ax.K7.m object2) {
        if ((object2 = ((ax.K7.m)object2).g()).isEmpty()) {
            return object;
        }
        object = ((F.e.d)object).h();
        ((F.e.d.b)object).e(F.e.d.f.a().b((List<F.e.d.e>)object2).a());
        return ((F.e.d.b)object).a();
    }

    private static F.a f(ApplicationExitInfo applicationExitInfo) {
        CharSequence charSequence;
        block3: {
            StringBuilder stringBuilder = null;
            InputStream inputStream = I.a(applicationExitInfo);
            charSequence = stringBuilder;
            if (inputStream == null) break block3;
            try {
                charSequence = S.g(inputStream);
            }
            catch (IOException iOException) {
                g g8 = g.f();
                charSequence = new StringBuilder();
                ((StringBuilder)charSequence).append("Could not get input trace in application exit info: ");
                ((StringBuilder)charSequence).append(J.a(applicationExitInfo));
                ((StringBuilder)charSequence).append(" Error: ");
                ((StringBuilder)charSequence).append(iOException);
                g8.k(((StringBuilder)charSequence).toString());
                charSequence = stringBuilder;
            }
        }
        return F.a.a().c(K.a(applicationExitInfo)).e(L.a(applicationExitInfo)).g(ax.L2.g.a(applicationExitInfo)).i(h.a(applicationExitInfo)).d(M.a(applicationExitInfo)).f(N.a(applicationExitInfo)).h(O.a(applicationExitInfo)).j((String)charSequence).a();
    }

    public static String g(InputStream inputStream) throws IOException {
        int n8;
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        byte[] byArray = new byte[8192];
        while ((n8 = inputStream.read(byArray)) != -1) {
            byteArrayOutputStream.write(byArray, 0, n8);
        }
        return byteArrayOutputStream.toString(StandardCharsets.UTF_8.name());
    }

    public static S h(Context context, C c8, ax.O7.g g8, a a8, e e8, ax.K7.m m8, d d8, i i8, H h8, m m9) {
        return new S(new t(context, c8, a8, d8, i8), new ax.O7.e(g8, i8, m9), ax.P7.b.b(context, i8, h8), e8, m8, c8);
    }

    private u i(u u8) {
        if (u8.b().h() != null && u8.b().g() != null) {
            return u8;
        }
        B b8 = this.f.d(true);
        return u.a(u8.b().t(b8.b()).s(b8.a()), u8.d(), u8.c());
    }

    private ApplicationExitInfo l(String string, List<ApplicationExitInfo> object) {
        long l8 = this.b.q(string);
        object = object.iterator();
        while (object.hasNext()) {
            string = ax.L2.f.a(object.next());
            if (h.a((ApplicationExitInfo)string) < l8) {
                return null;
            }
            if (ax.L2.g.a((ApplicationExitInfo)string) != 6) continue;
            return string;
        }
        return null;
    }

    private static List<F.c> m(Map<String, String> object) {
        ArrayList<F.c> arrayList = new ArrayList<F.c>();
        arrayList.ensureCapacity(object.size());
        for (Map.Entry entry : object.entrySet()) {
            arrayList.add(F.c.a().b((String)entry.getKey()).c((String)entry.getValue()).a());
        }
        Collections.sort(arrayList, new P());
        return java.util.DesugarCollections.unmodifiableList(arrayList);
    }

    private boolean q(j<u> object) {
        if (((j)object).m()) {
            object = ((j)object).j();
            Object object2 = g.f();
            Object object3 = new StringBuilder();
            ((StringBuilder)object3).append("Crashlytics report successfully enqueued to DataTransport: ");
            ((StringBuilder)object3).append(((u)object).d());
            ((g)object2).b(((StringBuilder)object3).toString());
            object = ((u)object).c();
            if (((File)object).delete()) {
                object3 = g.f();
                object2 = new StringBuilder();
                ((StringBuilder)object2).append("Deleted report file: ");
                ((StringBuilder)object2).append(((File)object).getPath());
                ((g)object3).b(((StringBuilder)object2).toString());
            } else {
                object2 = g.f();
                object3 = new StringBuilder();
                ((StringBuilder)object3).append("Crashlytics could not delete report file: ");
                ((StringBuilder)object3).append(((File)object).getPath());
                ((g)object2).k(((StringBuilder)object3).toString());
            }
            return true;
        }
        g.f().l("Crashlytics report could not be enqueued to DataTransport", ((j)object).i());
        return false;
    }

    private void r(Throwable object, Thread thread, String string, String string2, long l8, boolean bl) {
        boolean bl2 = string2.equals("crash");
        object = this.a.d((Throwable)object, thread, string2, l8, 4, 8, bl);
        this.b.w(this.d((F.e.d)object), string, bl2);
    }

    public void j(String string, List<F> object, F.a a8) {
        g.f().b("SessionReportingCoordinator#finalizeSessionWithNativeEvent");
        ArrayList<F.d.b> arrayList = new ArrayList<F.d.b>();
        object = object.iterator();
        while (object.hasNext()) {
            F.d.b b8 = ((F)object.next()).b();
            if (b8 == null) continue;
            arrayList.add(b8);
        }
        this.b.l(string, F.d.a().b(java.util.DesugarCollections.unmodifiableList(arrayList)).a(), a8);
    }

    public void k(long l8, String string) {
        this.b.k(string, l8);
    }

    public boolean n() {
        return this.b.r();
    }

    public SortedSet<String> o() {
        return this.b.p();
    }

    public void p(String object, long l8) {
        object = this.a.e((String)object, l8);
        this.b.x((ax.L7.F)object);
    }

    public void s(Throwable throwable, Thread thread, String string, long l8) {
        g g8 = g.f();
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Persisting fatal event for session ");
        stringBuilder.append(string);
        g8.i(stringBuilder.toString());
        this.r(throwable, thread, string, "crash", l8, true);
    }

    public void t(Throwable throwable, Thread thread, String string, long l8) {
        g g8 = g.f();
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Persisting non-fatal event for session ");
        stringBuilder.append(string);
        g8.i(stringBuilder.toString());
        this.r(throwable, thread, string, "error", l8, false);
    }

    public void u(String string, List<ApplicationExitInfo> object, e object2, ax.K7.m m8) {
        if ((object = this.l(string, (List<ApplicationExitInfo>)object)) == null) {
            object2 = g.f();
            object = new StringBuilder();
            ((StringBuilder)object).append("No relevant ApplicationExitInfo occurred during session: ");
            ((StringBuilder)object).append(string);
            ((g)object2).i(((StringBuilder)object).toString());
            return;
        }
        object = this.a.c(S.f((ApplicationExitInfo)object));
        g g8 = g.f();
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Persisting anr for session ");
        stringBuilder.append(string);
        g8.b(stringBuilder.toString());
        object = this.e(this.c((F.e.d)object, (e)object2, m8), m8);
        this.b.w((F.e.d)object, string, true);
    }

    public void v() {
        this.b.i();
    }

    public j<Void> w(Executor executor) {
        return this.x(executor, null);
    }

    public j<Void> x(Executor executor, String string) {
        Object object = this.b.u();
        ArrayList arrayList = new ArrayList();
        Iterator<u> iterator = object.iterator();
        while (iterator.hasNext()) {
            u u8 = iterator.next();
            if (string != null && !string.equals(u8.d())) continue;
            object = this.c;
            u8 = this.i(u8);
            boolean bl = string != null;
            arrayList.add(((b)object).c(u8, bl).g(executor, new Q(this)));
        }
        return ax.j6.m.f(arrayList);
    }
}

