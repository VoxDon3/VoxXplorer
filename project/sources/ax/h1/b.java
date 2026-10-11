package ax.h1;

import android.net.Uri;
import ax.P0.L;
import ax.h1.InterfaceC2142a;
import ax.m1.p;
import java.io.IOException;
import java.io.InputStream;
import java.util.List;

/* loaded from: classes.dex */
public final class b<T extends InterfaceC2142a<T>> implements p.a<T> {
    private final p.a<? extends T> a;
    private final List<L> b;

    public b(p.a<? extends T> aVar, List<L> list) {
        this.a = aVar;
        this.b = list;
    }

    @Override // ax.m1.p.a
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public T a(Uri uri, InputStream inputStream) throws IOException {
        T a = this.a.a(uri, inputStream);
        List<L> list = this.b;
        return (list == null || list.isEmpty()) ? a : (T) a.a(this.b);
    }
}
