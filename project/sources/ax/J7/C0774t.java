package ax.J7;

import android.content.Context;
import android.os.Build;
import android.os.Environment;
import android.os.StatFs;
import android.text.TextUtils;
import ax.L7.F;
import j$.util.DesugarCollections;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;

/* renamed from: ax.J7.t, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public class C0774t {
    private static final Map<String, Integer> g;
    static final String h;
    private final Context a;
    private final C b;
    private final C0756a c;
    private final ax.R7.d d;
    private final ax.Q7.i e;
    private final ax.G7.j f = ax.G7.j.a;

    static {
        HashMap hashMap = new HashMap();
        g = hashMap;
        hashMap.put("armeabi", 5);
        hashMap.put("armeabi-v7a", 6);
        hashMap.put("arm64-v8a", 9);
        hashMap.put("x86", 0);
        hashMap.put("x86_64", 1);
        h = String.format(Locale.US, "Crashlytics Android SDK/%s", "19.0.3");
    }

    public C0774t(Context context, C c, C0756a c0756a, ax.R7.d dVar, ax.Q7.i iVar) {
        this.a = context;
        this.b = c;
        this.c = c0756a;
        this.d = dVar;
        this.e = iVar;
    }

    private F.e.d.a.c A(F.a aVar) {
        return this.f.a(aVar.e(), aVar.d(), aVar.c());
    }

    private F.a a(F.a aVar) {
        List<F.a.AbstractC0122a> list;
        if (!this.e.b().b.c || this.c.c.size() <= 0) {
            list = null;
        } else {
            ArrayList arrayList = new ArrayList();
            for (C0761f c0761f : this.c.c) {
                arrayList.add(F.a.AbstractC0122a.a().d(c0761f.c()).b(c0761f.a()).c(c0761f.b()).a());
            }
            list = DesugarCollections.unmodifiableList(arrayList);
        }
        return F.a.a().c(aVar.c()).e(aVar.e()).g(aVar.g()).i(aVar.i()).d(aVar.d()).f(aVar.f()).h(aVar.h()).j(aVar.j()).b(list).a();
    }

    private F.b b() {
        return ax.L7.F.b().l("19.0.3").h(this.c.a).i(this.b.a().c()).g(this.b.a().e()).f(this.b.a().d()).d(this.c.f).e(this.c.g).k(4);
    }

    private static long f(long j) {
        if (j > 0) {
            return j;
        }
        return 0L;
    }

    private static int g() {
        Integer num;
        String str = Build.CPU_ABI;
        if (TextUtils.isEmpty(str) || (num = g.get(str.toLowerCase(Locale.US))) == null) {
            return 7;
        }
        return num.intValue();
    }

    private F.e.d.a.b.AbstractC0126a h() {
        return F.e.d.a.b.AbstractC0126a.a().b(0L).d(0L).c(this.c.e).e(this.c.b).a();
    }

    private List<F.e.d.a.b.AbstractC0126a> i() {
        return Collections.singletonList(h());
    }

    private F.e.d.a j(int i, F.a aVar) {
        return F.e.d.a.a().c(Boolean.valueOf(aVar.c() != 100)).d(A(aVar)).h(i).f(o(aVar)).a();
    }

    private F.e.d.a k(int i, ax.R7.e eVar, Thread thread, int i2, int i3, boolean z) {
        Boolean bool;
        F.e.d.a.c e = this.f.e(this.a);
        if (e.b() > 0) {
            bool = Boolean.valueOf(e.b() != 100);
        } else {
            bool = null;
        }
        return F.e.d.a.a().c(bool).d(e).b(this.f.d(this.a)).h(i).f(p(eVar, thread, i2, i3, z)).a();
    }

    private F.e.d.c l(int i) {
        C0760e a = C0760e.a(this.a);
        Float b = a.b();
        Double valueOf = b != null ? Double.valueOf(b.doubleValue()) : null;
        int c = a.c();
        boolean n = C0764i.n(this.a);
        return F.e.d.c.a().b(valueOf).c(c).f(n).e(i).g(f(C0764i.b(this.a) - C0764i.a(this.a))).d(C0764i.c(Environment.getDataDirectory().getPath())).a();
    }

    private F.e.d.a.b.c m(ax.R7.e eVar, int i, int i2) {
        return n(eVar, i, i2, 0);
    }

    private F.e.d.a.b.c n(ax.R7.e eVar, int i, int i2, int i3) {
        String str = eVar.b;
        String str2 = eVar.a;
        StackTraceElement[] stackTraceElementArr = eVar.c;
        int i4 = 0;
        if (stackTraceElementArr == null) {
            stackTraceElementArr = new StackTraceElement[0];
        }
        ax.R7.e eVar2 = eVar.d;
        if (i3 >= i2) {
            ax.R7.e eVar3 = eVar2;
            while (eVar3 != null) {
                eVar3 = eVar3.d;
                i4++;
            }
        }
        F.e.d.a.b.c.AbstractC0129a d = F.e.d.a.b.c.a().f(str).e(str2).c(r(stackTraceElementArr, i)).d(i4);
        if (eVar2 != null && i4 == 0) {
            d.b(n(eVar2, i, i2, i3 + 1));
        }
        return d.a();
    }

    private F.e.d.a.b o(F.a aVar) {
        return F.e.d.a.b.a().b(aVar).e(w()).c(i()).a();
    }

    private F.e.d.a.b p(ax.R7.e eVar, Thread thread, int i, int i2, boolean z) {
        return F.e.d.a.b.a().f(z(eVar, thread, i, z)).d(m(eVar, i, i2)).e(w()).c(i()).a();
    }

    private F.e.d.a.b.AbstractC0132e.AbstractC0134b q(StackTraceElement stackTraceElement, F.e.d.a.b.AbstractC0132e.AbstractC0134b.AbstractC0135a abstractC0135a) {
        long j = 0;
        long max = stackTraceElement.isNativeMethod() ? Math.max(stackTraceElement.getLineNumber(), 0L) : 0L;
        String str = stackTraceElement.getClassName() + "." + stackTraceElement.getMethodName();
        String fileName = stackTraceElement.getFileName();
        if (!stackTraceElement.isNativeMethod() && stackTraceElement.getLineNumber() > 0) {
            j = stackTraceElement.getLineNumber();
        }
        return abstractC0135a.e(max).f(str).b(fileName).d(j).a();
    }

    private List<F.e.d.a.b.AbstractC0132e.AbstractC0134b> r(StackTraceElement[] stackTraceElementArr, int i) {
        ArrayList arrayList = new ArrayList();
        for (StackTraceElement stackTraceElement : stackTraceElementArr) {
            arrayList.add(q(stackTraceElement, F.e.d.a.b.AbstractC0132e.AbstractC0134b.a().c(i)));
        }
        return DesugarCollections.unmodifiableList(arrayList);
    }

    private F.e.a s() {
        return F.e.a.a().e(this.b.f()).g(this.c.f).d(this.c.g).f(this.b.a().c()).b(this.c.h.d()).c(this.c.h.e()).a();
    }

    private F.e t(String str, long j) {
        return F.e.a().m(j).j(str).h(h).b(s()).l(v()).e(u()).i(3).a();
    }

    private F.e.c u() {
        StatFs statFs = new StatFs(Environment.getDataDirectory().getPath());
        int g2 = g();
        int availableProcessors = Runtime.getRuntime().availableProcessors();
        long b = C0764i.b(this.a);
        long blockCount = statFs.getBlockCount() * statFs.getBlockSize();
        boolean w = C0764i.w();
        int l = C0764i.l();
        return F.e.c.a().b(g2).f(Build.MODEL).c(availableProcessors).h(b).d(blockCount).i(w).j(l).e(Build.MANUFACTURER).g(Build.PRODUCT).a();
    }

    private F.e.AbstractC0139e v() {
        return F.e.AbstractC0139e.a().d(3).e(Build.VERSION.RELEASE).b(Build.VERSION.CODENAME).c(C0764i.x()).a();
    }

    private F.e.d.a.b.AbstractC0130d w() {
        return F.e.d.a.b.AbstractC0130d.a().d("0").c("0").b(0L).a();
    }

    private F.e.d.a.b.AbstractC0132e x(Thread thread, StackTraceElement[] stackTraceElementArr) {
        return y(thread, stackTraceElementArr, 0);
    }

    private F.e.d.a.b.AbstractC0132e y(Thread thread, StackTraceElement[] stackTraceElementArr, int i) {
        return F.e.d.a.b.AbstractC0132e.a().d(thread.getName()).c(i).b(r(stackTraceElementArr, i)).a();
    }

    private List<F.e.d.a.b.AbstractC0132e> z(ax.R7.e eVar, Thread thread, int i, boolean z) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(y(thread, eVar.c, i));
        if (z) {
            for (Map.Entry<Thread, StackTraceElement[]> entry : Thread.getAllStackTraces().entrySet()) {
                Thread key = entry.getKey();
                if (!key.equals(thread)) {
                    arrayList.add(x(key, this.d.a(entry.getValue())));
                }
            }
        }
        return DesugarCollections.unmodifiableList(arrayList);
    }

    public F.e.d c(F.a aVar) {
        int i = this.a.getResources().getConfiguration().orientation;
        return F.e.d.a().g("anr").f(aVar.i()).b(j(i, a(aVar))).c(l(i)).a();
    }

    public F.e.d d(Throwable th, Thread thread, String str, long j, int i, int i2, boolean z) {
        int i3 = this.a.getResources().getConfiguration().orientation;
        return F.e.d.a().g(str).f(j).b(k(i3, ax.R7.e.a(th, this.d), thread, i, i2, z)).c(l(i3)).a();
    }

    public ax.L7.F e(String str, long j) {
        return b().m(t(str, j)).a();
    }
}
