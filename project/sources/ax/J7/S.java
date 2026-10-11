package ax.J7;

import android.app.ApplicationExitInfo;
import android.content.Context;
import ax.L7.F;
import ax.j6.AbstractC2327j;
import ax.j6.InterfaceC2319b;
import j$.util.DesugarCollections;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.SortedSet;
import java.util.concurrent.Executor;

/* loaded from: classes3.dex */
public class S {
    private final C0774t a;
    private final ax.O7.e b;
    private final ax.P7.b c;
    private final ax.K7.e d;
    private final ax.K7.m e;
    private final C f;

    S(C0774t c0774t, ax.O7.e eVar, ax.P7.b bVar, ax.K7.e eVar2, ax.K7.m mVar, C c) {
        this.a = c0774t;
        this.b = eVar;
        this.c = bVar;
        this.d = eVar2;
        this.e = mVar;
        this.f = c;
    }

    private F.e.d c(F.e.d dVar, ax.K7.e eVar, ax.K7.m mVar) {
        F.e.d.b h = dVar.h();
        String c = eVar.c();
        if (c != null) {
            h.d(F.e.d.AbstractC0137d.a().b(c).a());
        } else {
            ax.G7.g.f().i("No log data to include with this event.");
        }
        List<F.c> m = m(mVar.e());
        List<F.c> m2 = m(mVar.f());
        if (!m.isEmpty() || !m2.isEmpty()) {
            h.b(dVar.b().i().e(m).g(m2).a());
        }
        return h.a();
    }

    private F.e.d d(F.e.d dVar) {
        return e(c(dVar, this.d, this.e), this.e);
    }

    private F.e.d e(F.e.d dVar, ax.K7.m mVar) {
        List<F.e.d.AbstractC0138e> g = mVar.g();
        if (g.isEmpty()) {
            return dVar;
        }
        F.e.d.b h = dVar.h();
        h.e(F.e.d.f.a().b(g).a());
        return h.a();
    }

    private static F.a f(ApplicationExitInfo applicationExitInfo) {
        String applicationExitInfo2;
        int importance;
        String processName;
        int reason;
        long timestamp;
        int pid;
        long pss;
        long rss;
        InputStream traceInputStream;
        String str = null;
        try {
            traceInputStream = applicationExitInfo.getTraceInputStream();
            if (traceInputStream != null) {
                str = g(traceInputStream);
            }
        } catch (IOException e) {
            ax.G7.g f = ax.G7.g.f();
            StringBuilder sb = new StringBuilder();
            sb.append("Could not get input trace in application exit info: ");
            applicationExitInfo2 = applicationExitInfo.toString();
            sb.append(applicationExitInfo2);
            sb.append(" Error: ");
            sb.append(e);
            f.k(sb.toString());
        }
        F.a.b a = F.a.a();
        importance = applicationExitInfo.getImportance();
        F.a.b c = a.c(importance);
        processName = applicationExitInfo.getProcessName();
        F.a.b e2 = c.e(processName);
        reason = applicationExitInfo.getReason();
        F.a.b g = e2.g(reason);
        timestamp = applicationExitInfo.getTimestamp();
        F.a.b i = g.i(timestamp);
        pid = applicationExitInfo.getPid();
        F.a.b d = i.d(pid);
        pss = applicationExitInfo.getPss();
        F.a.b f2 = d.f(pss);
        rss = applicationExitInfo.getRss();
        return f2.h(rss).j(str).a();
    }

    public static String g(InputStream inputStream) throws IOException {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        byte[] bArr = new byte[8192];
        while (true) {
            int read = inputStream.read(bArr);
            if (read == -1) {
                return byteArrayOutputStream.toString(StandardCharsets.UTF_8.name());
            }
            byteArrayOutputStream.write(bArr, 0, read);
        }
    }

    public static S h(Context context, C c, ax.O7.g gVar, C0756a c0756a, ax.K7.e eVar, ax.K7.m mVar, ax.R7.d dVar, ax.Q7.i iVar, H h, C0768m c0768m) {
        return new S(new C0774t(context, c, c0756a, dVar, iVar), new ax.O7.e(gVar, iVar, c0768m), ax.P7.b.b(context, iVar, h), eVar, mVar, c);
    }

    private AbstractC0775u i(AbstractC0775u abstractC0775u) {
        if (abstractC0775u.b().h() != null && abstractC0775u.b().g() != null) {
            return abstractC0775u;
        }
        B d = this.f.d(true);
        return AbstractC0775u.a(abstractC0775u.b().t(d.b()).s(d.a()), abstractC0775u.d(), abstractC0775u.c());
    }

    private ApplicationExitInfo l(String str, List<ApplicationExitInfo> list) {
        long timestamp;
        int reason;
        long q = this.b.q(str);
        Iterator<ApplicationExitInfo> it = list.iterator();
        while (it.hasNext()) {
            ApplicationExitInfo a = ax.L2.f.a(it.next());
            timestamp = a.getTimestamp();
            if (timestamp < q) {
                return null;
            }
            reason = a.getReason();
            if (reason == 6) {
                return a;
            }
        }
        return null;
    }

    private static List<F.c> m(Map<String, String> map) {
        ArrayList arrayList = new ArrayList();
        arrayList.ensureCapacity(map.size());
        for (Map.Entry<String, String> entry : map.entrySet()) {
            arrayList.add(F.c.a().b(entry.getKey()).c(entry.getValue()).a());
        }
        Collections.sort(arrayList, new Comparator() { // from class: ax.J7.P
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                int compareTo;
                compareTo = ((F.c) obj).b().compareTo(((F.c) obj2).b());
                return compareTo;
            }
        });
        return DesugarCollections.unmodifiableList(arrayList);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean q(AbstractC2327j<AbstractC0775u> abstractC2327j) {
        if (!abstractC2327j.m()) {
            ax.G7.g.f().l("Crashlytics report could not be enqueued to DataTransport", abstractC2327j.i());
            return false;
        }
        AbstractC0775u j = abstractC2327j.j();
        ax.G7.g.f().b("Crashlytics report successfully enqueued to DataTransport: " + j.d());
        File c = j.c();
        if (c.delete()) {
            ax.G7.g.f().b("Deleted report file: " + c.getPath());
            return true;
        }
        ax.G7.g.f().k("Crashlytics could not delete report file: " + c.getPath());
        return true;
    }

    private void r(Throwable th, Thread thread, String str, String str2, long j, boolean z) {
        this.b.w(d(this.a.d(th, thread, str2, j, 4, 8, z)), str, str2.equals("crash"));
    }

    public void j(String str, List<F> list, F.a aVar) {
        ax.G7.g.f().b("SessionReportingCoordinator#finalizeSessionWithNativeEvent");
        ArrayList arrayList = new ArrayList();
        Iterator<F> it = list.iterator();
        while (it.hasNext()) {
            F.d.b b = it.next().b();
            if (b != null) {
                arrayList.add(b);
            }
        }
        this.b.l(str, F.d.a().b(DesugarCollections.unmodifiableList(arrayList)).a(), aVar);
    }

    public void k(long j, String str) {
        this.b.k(str, j);
    }

    public boolean n() {
        return this.b.r();
    }

    public SortedSet<String> o() {
        return this.b.p();
    }

    public void p(String str, long j) {
        this.b.x(this.a.e(str, j));
    }

    public void s(Throwable th, Thread thread, String str, long j) {
        ax.G7.g.f().i("Persisting fatal event for session " + str);
        r(th, thread, str, "crash", j, true);
    }

    public void t(Throwable th, Thread thread, String str, long j) {
        ax.G7.g.f().i("Persisting non-fatal event for session " + str);
        r(th, thread, str, "error", j, false);
    }

    public void u(String str, List<ApplicationExitInfo> list, ax.K7.e eVar, ax.K7.m mVar) {
        ApplicationExitInfo l = l(str, list);
        if (l == null) {
            ax.G7.g.f().i("No relevant ApplicationExitInfo occurred during session: " + str);
            return;
        }
        F.e.d c = this.a.c(f(l));
        ax.G7.g.f().b("Persisting anr for session " + str);
        this.b.w(e(c(c, eVar, mVar), mVar), str, true);
    }

    public void v() {
        this.b.i();
    }

    public AbstractC2327j<Void> w(Executor executor) {
        return x(executor, null);
    }

    public AbstractC2327j<Void> x(Executor executor, String str) {
        List<AbstractC0775u> u = this.b.u();
        ArrayList arrayList = new ArrayList();
        for (AbstractC0775u abstractC0775u : u) {
            if (str == null || str.equals(abstractC0775u.d())) {
                arrayList.add(this.c.c(i(abstractC0775u), str != null).g(executor, new InterfaceC2319b() { // from class: ax.J7.Q
                    @Override // ax.j6.InterfaceC2319b
                    public final Object a(AbstractC2327j abstractC2327j) {
                        boolean q;
                        q = S.this.q(abstractC2327j);
                        return Boolean.valueOf(q);
                    }
                }));
            }
        }
        return ax.j6.m.f(arrayList);
    }
}
