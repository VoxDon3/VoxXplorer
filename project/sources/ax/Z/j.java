package ax.Z;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.pm.PackageManager;
import android.graphics.Typeface;
import ax.Z.k;
import ax.b0.InterfaceC1440a;
import java.util.ArrayList;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;

/* loaded from: classes.dex */
class j {
    static final ax.B.j<String, Typeface> a = new ax.B.j<>(16);
    private static final ExecutorService b = l.a("fonts-androidx", 10, 10000);
    static final Object c = new Object();
    static final ax.B.k<String, ArrayList<InterfaceC1440a<e>>> d = new ax.B.k<>();

    class a implements Callable<e> {
        final /* synthetic */ String a;
        final /* synthetic */ Context b;
        final /* synthetic */ i c;
        final /* synthetic */ int d;

        a(String str, Context context, i iVar, int i) {
            this.a = str;
            this.b = context;
            this.c = iVar;
            this.d = i;
        }

        @Override // java.util.concurrent.Callable
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public e call() {
            return j.c(this.a, this.b, this.c, this.d);
        }
    }

    class b implements InterfaceC1440a<e> {
        final /* synthetic */ ax.Z.a a;

        b(ax.Z.a aVar) {
            this.a = aVar;
        }

        @Override // ax.b0.InterfaceC1440a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public void accept(e eVar) {
            if (eVar == null) {
                eVar = new e(-3);
            }
            this.a.b(eVar);
        }
    }

    class c implements Callable<e> {
        final /* synthetic */ String a;
        final /* synthetic */ Context b;
        final /* synthetic */ i c;
        final /* synthetic */ int d;

        c(String str, Context context, i iVar, int i) {
            this.a = str;
            this.b = context;
            this.c = iVar;
            this.d = i;
        }

        @Override // java.util.concurrent.Callable
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public e call() {
            try {
                return j.c(this.a, this.b, this.c, this.d);
            } catch (Throwable unused) {
                return new e(-3);
            }
        }
    }

    class d implements InterfaceC1440a<e> {
        final /* synthetic */ String a;

        d(String str) {
            this.a = str;
        }

        @Override // ax.b0.InterfaceC1440a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public void accept(e eVar) {
            synchronized (j.c) {
                try {
                    ax.B.k<String, ArrayList<InterfaceC1440a<e>>> kVar = j.d;
                    ArrayList<InterfaceC1440a<e>> arrayList = kVar.get(this.a);
                    if (arrayList == null) {
                        return;
                    }
                    kVar.remove(this.a);
                    for (int i = 0; i < arrayList.size(); i++) {
                        arrayList.get(i).accept(eVar);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    private static String a(i iVar, int i) {
        return iVar.d() + "-" + i;
    }

    @SuppressLint({"WrongConstant"})
    private static int b(k.a aVar) {
        int i = 1;
        if (aVar.c() != 0) {
            return aVar.c() != 1 ? -3 : -2;
        }
        k.b[] b2 = aVar.b();
        if (b2 != null && b2.length != 0) {
            i = 0;
            for (k.b bVar : b2) {
                int b3 = bVar.b();
                if (b3 != 0) {
                    if (b3 < 0) {
                        return -3;
                    }
                    return b3;
                }
            }
        }
        return i;
    }

    static e c(String str, Context context, i iVar, int i) {
        ax.B.j<String, Typeface> jVar = a;
        Typeface c2 = jVar.c(str);
        if (c2 != null) {
            return new e(c2);
        }
        try {
            k.a e2 = ax.Z.e.e(context, iVar, null);
            int b2 = b(e2);
            if (b2 != 0) {
                return new e(b2);
            }
            Typeface b3 = ax.T.e.b(context, null, e2.b(), i);
            if (b3 == null) {
                return new e(-3);
            }
            jVar.d(str, b3);
            return new e(b3);
        } catch (PackageManager.NameNotFoundException unused) {
            return new e(-1);
        }
    }

    static Typeface d(Context context, i iVar, int i, Executor executor, ax.Z.a aVar) {
        String a2 = a(iVar, i);
        Typeface c2 = a.c(a2);
        if (c2 != null) {
            aVar.b(new e(c2));
            return c2;
        }
        b bVar = new b(aVar);
        synchronized (c) {
            try {
                ax.B.k<String, ArrayList<InterfaceC1440a<e>>> kVar = d;
                ArrayList<InterfaceC1440a<e>> arrayList = kVar.get(a2);
                if (arrayList != null) {
                    arrayList.add(bVar);
                    return null;
                }
                ArrayList<InterfaceC1440a<e>> arrayList2 = new ArrayList<>();
                arrayList2.add(bVar);
                kVar.put(a2, arrayList2);
                c cVar = new c(a2, context, iVar, i);
                if (executor == null) {
                    executor = b;
                }
                l.b(executor, cVar, new d(a2));
                return null;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    static Typeface e(Context context, i iVar, ax.Z.a aVar, int i, int i2) {
        String a2 = a(iVar, i);
        Typeface c2 = a.c(a2);
        if (c2 != null) {
            aVar.b(new e(c2));
            return c2;
        }
        if (i2 == -1) {
            e c3 = c(a2, context, iVar, i);
            aVar.b(c3);
            return c3.a;
        }
        try {
            e eVar = (e) l.c(b, new a(a2, context, iVar, i), i2);
            aVar.b(eVar);
            return eVar.a;
        } catch (InterruptedException unused) {
            aVar.b(new e(-3));
            return null;
        }
    }

    static final class e {
        final Typeface a;
        final int b;

        e(int i) {
            this.a = null;
            this.b = i;
        }

        @SuppressLint({"WrongConstant"})
        boolean a() {
            return this.b == 0;
        }

        @SuppressLint({"WrongConstant"})
        e(Typeface typeface) {
            this.a = typeface;
            this.b = 0;
        }
    }
}
