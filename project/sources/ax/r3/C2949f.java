package ax.r3;

import android.graphics.Bitmap;
import ax.aa.C1433a;
import ax.c3.K;
import java.util.Collection;

/* renamed from: ax.r3.f, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C2949f implements ax.Z9.a {
    ax.Z9.a a;

    public C2949f(int i) {
        this.a = new C1433a(new ax.aa.b(i), ax.ka.e.a());
    }

    @Override // ax.Z9.a
    public Collection<String> a() {
        return this.a.a();
    }

    @Override // ax.Z9.a
    public Bitmap b(String str) {
        return this.a.b(str);
    }

    @Override // ax.Z9.a
    public boolean c(String str, Bitmap bitmap) {
        return this.a.c(str, bitmap);
    }

    public Bitmap d(String str) {
        if (str == null) {
            return null;
        }
        for (String str2 : a()) {
            if (str2.startsWith(str) && str.equals(str2.substring(0, str2.lastIndexOf("_")))) {
                return i(str2);
            }
        }
        return null;
    }

    public void e(K k) {
        String str = k.d().K() + "://" + k.b();
        String str2 = k.d().t() + "://" + k.b();
        for (String str3 : a()) {
            if (str3.startsWith(str) || str3.startsWith(str2)) {
                b(str3);
            }
        }
    }

    public void f(String str) {
        for (String str2 : a()) {
            if (str2.startsWith(str)) {
                b(str2);
            }
        }
    }

    @Override // ax.Z9.a
    public Bitmap i(String str) {
        return this.a.i(str);
    }
}
