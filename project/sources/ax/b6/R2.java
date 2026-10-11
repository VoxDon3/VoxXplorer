package ax.b6;

import android.content.Context;
import android.database.ContentObserver;
import android.util.Log;

/* loaded from: classes3.dex */
final class R2 implements M2 {
    private static R2 c;
    private final Context a;
    private final ContentObserver b;

    private R2() {
        this.a = null;
        this.b = null;
    }

    static R2 a(Context context) {
        R2 r2;
        synchronized (R2.class) {
            try {
                if (c == null) {
                    c = ax.Q.g.b(context, "com.google.android.providers.gsf.permission.READ_GSERVICES") == 0 ? new R2(context) : new R2();
                }
                r2 = c;
            } catch (Throwable th) {
                throw th;
            }
        }
        return r2;
    }

    static synchronized void b() {
        Context context;
        synchronized (R2.class) {
            try {
                R2 r2 = c;
                if (r2 != null && (context = r2.a) != null && r2.b != null) {
                    context.getContentResolver().unregisterContentObserver(c.b);
                }
                c = null;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // ax.b6.M2
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public final String h(final String str) {
        Context context = this.a;
        if (context != null && !H2.b(context)) {
            try {
                return (String) P2.a(new O2() { // from class: ax.b6.Q2
                    @Override // ax.b6.O2
                    public final Object a() {
                        return R2.this.c(str);
                    }
                });
            } catch (IllegalStateException | NullPointerException | SecurityException e) {
                Log.e("GservicesLoader", "Unable to read GServices for: " + str, e);
            }
        }
        return null;
    }

    final /* synthetic */ String c(String str) {
        return C1669t2.a(this.a.getContentResolver(), str, null);
    }

    private R2(Context context) {
        this.a = context;
        T2 t2 = new T2(this, null);
        this.b = t2;
        context.getContentResolver().registerContentObserver(C1693w2.a, true, t2);
    }
}
