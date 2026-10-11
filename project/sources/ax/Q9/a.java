package ax.Q9;

import android.util.Log;

/* loaded from: classes3.dex */
public class a implements b {
    private c a = c.Error;

    /* renamed from: ax.Q9.a$a, reason: collision with other inner class name */
    static /* synthetic */ class C0178a {
        static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[c.values().length];
            a = iArr;
            try {
                iArr[c.Debug.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                a[c.Error.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    private String d() {
        try {
            StringBuilder sb = new StringBuilder();
            String className = Thread.currentThread().getStackTrace()[4].getClassName();
            sb.append(className.substring(className.lastIndexOf(".") + 1));
            sb.append("[");
            sb.append(Thread.currentThread().getStackTrace()[4].getMethodName());
            sb.append("] - ");
            sb.append(Thread.currentThread().getStackTrace()[4].getLineNumber());
            return sb.toString();
        } catch (Exception e) {
            Log.e("DefaultLogger", e.getMessage());
            return null;
        }
    }

    @Override // ax.Q9.b
    public void a(String str) {
        for (String str2 : str.split("\n")) {
            Log.d(d(), str2);
        }
    }

    @Override // ax.Q9.b
    public void b(String str, Throwable th) {
        int i = C0178a.a[this.a.ordinal()];
        for (String str2 : str.split("\n")) {
            Log.e(d(), str2);
        }
        Log.e(d(), "Throwable detail: ", th);
    }

    @Override // ax.Q9.b
    public c c() {
        return this.a;
    }
}
