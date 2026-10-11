/*
 * Decompiled with CFR 0.152.
 */
package ax.J7;

import android.content.Context;
import android.os.Build;
import android.os.Environment;
import android.os.StatFs;
import android.text.TextUtils;
import ax.G7.j;
import ax.J7.C;
import ax.J7.a;
import ax.J7.e;
import ax.J7.f;
import ax.J7.i;
import ax.L7.F;
import ax.R7.d;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;

public class t {
    private static final Map<String, Integer> g;
    static final String h;
    private final Context a;
    private final C b;
    private final a c;
    private final d d;
    private final ax.Q7.i e;
    private final j f = j.a;

    static {
        HashMap<String, Integer> hashMap = new HashMap<String, Integer>();
        g = hashMap;
        hashMap.put("armeabi", 5);
        hashMap.put("armeabi-v7a", 6);
        hashMap.put("arm64-v8a", 9);
        hashMap.put("x86", 0);
        hashMap.put("x86_64", 1);
        h = String.format(Locale.US, "Crashlytics Android SDK/%s", "19.0.3");
    }

    public t(Context context, C c8, a a8, d d8, ax.Q7.i i8) {
        this.a = context;
        this.b = c8;
        this.c = a8;
        this.d = d8;
        this.e = i8;
    }

    private F.e.d.a.c A(F.a a8) {
        return this.f.a(a8.e(), a8.d(), a8.c());
    }

    private F.a a(F.a a8) {
        Object object;
        if (this.e.b().b.c && this.c.c.size() > 0) {
            ArrayList<F.a.a> arrayList = new ArrayList<F.a.a>();
            for (f f8 : this.c.c) {
                arrayList.add(F.a.a.a().d(f8.c()).b(f8.a()).c(f8.b()).a());
            }
            object = java.util.DesugarCollections.unmodifiableList(arrayList);
        } else {
            object = null;
        }
        return F.a.a().c(a8.c()).e(a8.e()).g(a8.g()).i(a8.i()).d(a8.d()).f(a8.f()).h(a8.h()).j(a8.j()).b((List<F.a.a>)object).a();
    }

    private F.b b() {
        return F.b().l("19.0.3").h(this.c.a).i(this.b.a().c()).g(this.b.a().e()).f(this.b.a().d()).d(this.c.f).e(this.c.g).k(4);
    }

    private static long f(long l8) {
        if (l8 > 0L) {
            return l8;
        }
        return 0L;
    }

    private static int g() {
        Object object = Build.CPU_ABI;
        if (TextUtils.isEmpty((CharSequence)object)) {
            return 7;
        }
        if ((object = g.get(((String)object).toLowerCase(Locale.US))) == null) {
            return 7;
        }
        return (Integer)object;
    }

    private F.e.d.a.b.a h() {
        return F.e.d.a.b.a.a().b(0L).d(0L).c(this.c.e).e(this.c.b).a();
    }

    private List<F.e.d.a.b.a> i() {
        return Collections.singletonList(this.h());
    }

    private F.e.d.a j(int n8, F.a a8) {
        boolean bl = a8.c() != 100;
        return F.e.d.a.a().c(bl).d(this.A(a8)).h(n8).f(this.o(a8)).a();
    }

    private F.e.d.a k(int n8, ax.R7.e e8, Thread thread, int n9, int n10, boolean bl) {
        Boolean bl2;
        F.e.d.a.c c8 = this.f.e(this.a);
        if (c8.b() > 0) {
            boolean bl3 = c8.b() != 100;
            bl2 = bl3;
        } else {
            bl2 = null;
        }
        return F.e.d.a.a().c(bl2).d(c8).b(this.f.d(this.a)).h(n8).f(this.p(e8, thread, n9, n10, bl)).a();
    }

    private F.e.d.c l(int n8) {
        e e8 = ax.J7.e.a(this.a);
        Number number = e8.b();
        number = number != null ? Double.valueOf(number.doubleValue()) : null;
        int n9 = e8.c();
        boolean bl = i.n(this.a);
        long l8 = t.f(i.b(this.a) - i.a(this.a));
        long l9 = i.c(Environment.getDataDirectory().getPath());
        return F.e.d.c.a().b((Double)number).c(n9).f(bl).e(n8).g(l8).d(l9).a();
    }

    private F.e.d.a.b.c m(ax.R7.e e8, int n8, int n9) {
        return this.n(e8, n8, n9, 0);
    }

    private F.e.d.a.b.c n(ax.R7.e object, int n8, int n9, int n10) {
        String string = ((ax.R7.e)object).b;
        String string2 = ((ax.R7.e)object).a;
        StackTraceElement[] stackTraceElementArray = ((ax.R7.e)object).c;
        int n11 = 0;
        int n12 = 0;
        if (stackTraceElementArray == null) {
            stackTraceElementArray = new StackTraceElement[]{};
        }
        ax.R7.e e8 = ((ax.R7.e)object).d;
        if (n10 >= n9) {
            object = e8;
            while (true) {
                n11 = n12++;
                if (object == null) break;
                object = ((ax.R7.e)object).d;
            }
        }
        object = F.e.d.a.b.c.a().f(string).e(string2).c(this.r(stackTraceElementArray, n8)).d(n11);
        if (e8 != null && n11 == 0) {
            ((F.e.d.a.b.c.a)object).b(this.n(e8, n8, n9, n10 + 1));
        }
        return ((F.e.d.a.b.c.a)object).a();
    }

    private F.e.d.a.b o(F.a a8) {
        return F.e.d.a.b.a().b(a8).e(this.w()).c(this.i()).a();
    }

    private F.e.d.a.b p(ax.R7.e e8, Thread thread, int n8, int n9, boolean bl) {
        return F.e.d.a.b.a().f(this.z(e8, thread, n8, bl)).d(this.m(e8, n8, n9)).e(this.w()).c(this.i()).a();
    }

    private F.e.d.a.b.e.b q(StackTraceElement stackTraceElement, F.e.d.a.b.e.b.a a8) {
        boolean bl = stackTraceElement.isNativeMethod();
        long l8 = 0L;
        long l9 = bl ? Math.max((long)stackTraceElement.getLineNumber(), 0L) : 0L;
        CharSequence charSequence = new StringBuilder();
        charSequence.append(stackTraceElement.getClassName());
        charSequence.append(".");
        charSequence.append(stackTraceElement.getMethodName());
        charSequence = charSequence.toString();
        String string = stackTraceElement.getFileName();
        long l10 = l8;
        if (!stackTraceElement.isNativeMethod()) {
            l10 = l8;
            if (stackTraceElement.getLineNumber() > 0) {
                l10 = stackTraceElement.getLineNumber();
            }
        }
        return a8.e(l9).f((String)charSequence).b(string).d(l10).a();
    }

    private List<F.e.d.a.b.e.b> r(StackTraceElement[] stackTraceElementArray, int n8) {
        ArrayList<F.e.d.a.b.e.b> arrayList = new ArrayList<F.e.d.a.b.e.b>();
        int n9 = stackTraceElementArray.length;
        for (int i8 = 0; i8 < n9; ++i8) {
            arrayList.add(this.q(stackTraceElementArray[i8], F.e.d.a.b.e.b.a().c(n8)));
        }
        return java.util.DesugarCollections.unmodifiableList(arrayList);
    }

    private F.e.a s() {
        return F.e.a.a().e(this.b.f()).g(this.c.f).d(this.c.g).f(this.b.a().c()).b(this.c.h.d()).c(this.c.h.e()).a();
    }

    private F.e t(String string, long l8) {
        return F.e.a().m(l8).j(string).h(h).b(this.s()).l(this.v()).e(this.u()).i(3).a();
    }

    private F.e.c u() {
        Object object = new StatFs(Environment.getDataDirectory().getPath());
        int n8 = t.g();
        int n9 = Runtime.getRuntime().availableProcessors();
        long l8 = i.b(this.a);
        long l9 = object.getBlockCount();
        long l10 = object.getBlockSize();
        boolean bl = i.w();
        int n10 = i.l();
        object = Build.MANUFACTURER;
        String string = Build.PRODUCT;
        return F.e.c.a().b(n8).f(Build.MODEL).c(n9).h(l8).d(l9 * l10).i(bl).j(n10).e((String)object).g(string).a();
    }

    private F.e.e v() {
        return F.e.e.a().d(3).e(Build.VERSION.RELEASE).b(Build.VERSION.CODENAME).c(i.x()).a();
    }

    private F.e.d.a.b.d w() {
        return F.e.d.a.b.d.a().d("0").c("0").b(0L).a();
    }

    private F.e.d.a.b.e x(Thread thread, StackTraceElement[] stackTraceElementArray) {
        return this.y(thread, stackTraceElementArray, 0);
    }

    private F.e.d.a.b.e y(Thread thread, StackTraceElement[] stackTraceElementArray, int n8) {
        return F.e.d.a.b.e.a().d(thread.getName()).c(n8).b(this.r(stackTraceElementArray, n8)).a();
    }

    private List<F.e.d.a.b.e> z(ax.R7.e entry2, Thread thread, int n8, boolean bl) {
        ArrayList<F.e.d.a.b.e> arrayList = new ArrayList<F.e.d.a.b.e>();
        arrayList.add(this.y(thread, ((ax.R7.e)((Object)entry2)).c, n8));
        if (bl) {
            for (Map.Entry<Thread, StackTraceElement[]> entry2 : Thread.getAllStackTraces().entrySet()) {
                Thread thread2 = (Thread)entry2.getKey();
                if (thread2.equals(thread)) continue;
                arrayList.add(this.x(thread2, this.d.a((StackTraceElement[])entry2.getValue())));
            }
        }
        return java.util.DesugarCollections.unmodifiableList(arrayList);
    }

    public F.e.d c(F.a a8) {
        int n8 = this.a.getResources().getConfiguration().orientation;
        return F.e.d.a().g("anr").f(a8.i()).b(this.j(n8, this.a(a8))).c(this.l(n8)).a();
    }

    public F.e.d d(Throwable object, Thread thread, String string, long l8, int n8, int n9, boolean bl) {
        int n10 = this.a.getResources().getConfiguration().orientation;
        object = ax.R7.e.a((Throwable)object, this.d);
        return F.e.d.a().g(string).f(l8).b(this.k(n10, (ax.R7.e)object, thread, n8, n9, bl)).c(this.l(n10)).a();
    }

    public F e(String string, long l8) {
        return this.b().m(this.t(string, l8)).a();
    }
}

