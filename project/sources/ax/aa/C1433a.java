package ax.aa;

import android.graphics.Bitmap;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;

/* renamed from: ax.aa.a, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public class C1433a implements ax.Z9.a {
    private final ax.Z9.a a;
    private final Comparator<String> b;

    public C1433a(ax.Z9.a aVar, Comparator<String> comparator) {
        this.a = aVar;
        this.b = comparator;
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
        String str2;
        synchronized (this.a) {
            try {
                Iterator<String> it = this.a.a().iterator();
                while (true) {
                    if (!it.hasNext()) {
                        str2 = null;
                        break;
                    }
                    str2 = it.next();
                    if (this.b.compare(str, str2) == 0) {
                        break;
                    }
                }
                if (str2 != null) {
                    this.a.b(str2);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return this.a.c(str, bitmap);
    }

    @Override // ax.Z9.a
    public Bitmap i(String str) {
        return this.a.i(str);
    }
}
