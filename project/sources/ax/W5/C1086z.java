package ax.W5;

import android.content.Context;
import android.database.ContentObserver;
import android.util.Log;

/* renamed from: ax.W5.z, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
final class C1086z implements InterfaceC1077w {
    private static C1086z c;
    private final Context a;
    private final ContentObserver b;

    private C1086z() {
        this.a = null;
        this.b = null;
    }

    static C1086z b(Context context) {
        C1086z c1086z;
        synchronized (C1086z.class) {
            try {
                if (c == null) {
                    c = ax.Q.g.b(context, "com.google.android.providers.gsf.permission.READ_GSERVICES") == 0 ? new C1086z(context) : new C1086z();
                }
                c1086z = c;
            } catch (Throwable th) {
                throw th;
            }
        }
        return c1086z;
    }

    static synchronized void e() {
        Context context;
        synchronized (C1086z.class) {
            try {
                C1086z c1086z = c;
                if (c1086z != null && (context = c1086z.a) != null && c1086z.b != null) {
                    context.getContentResolver().unregisterContentObserver(c.b);
                }
                c = null;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // ax.W5.InterfaceC1077w
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public final String a(final String str) {
        Context context = this.a;
        if (context != null && !C1051n.a(context)) {
            try {
                return (String) C1071u.a(new InterfaceC1074v() { // from class: ax.W5.x
                    @Override // ax.W5.InterfaceC1074v
                    public final Object a() {
                        return C1086z.this.d(str);
                    }
                });
            } catch (IllegalStateException | NullPointerException | SecurityException e) {
                Log.e("GservicesLoader", "Unable to read GServices for: ".concat(String.valueOf(str)), e);
            }
        }
        return null;
    }

    final /* synthetic */ String d(String str) {
        return C1045l.a(this.a.getContentResolver(), str, null);
    }

    private C1086z(Context context) {
        this.a = context;
        C1083y c1083y = new C1083y(this, null);
        this.b = c1083y;
        context.getContentResolver().registerContentObserver(C1045l.a, true, c1083y);
    }
}
