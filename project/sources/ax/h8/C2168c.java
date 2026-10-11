package ax.h8;

import ax.D7.C0661c;
import ax.D7.InterfaceC0663e;
import ax.D7.r;
import java.util.Iterator;
import java.util.Set;

/* renamed from: ax.h8.c, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public class C2168c implements i {
    private final String a;
    private final C2169d b;

    C2168c(Set<f> set, C2169d c2169d) {
        this.a = d(set);
        this.b = c2169d;
    }

    public static /* synthetic */ i b(InterfaceC0663e interfaceC0663e) {
        return new C2168c(interfaceC0663e.f(f.class), C2169d.a());
    }

    public static C0661c<i> c() {
        return C0661c.e(i.class).b(r.m(f.class)).e(new ax.D7.h() { // from class: ax.h8.b
            @Override // ax.D7.h
            public final Object a(InterfaceC0663e interfaceC0663e) {
                return C2168c.b(interfaceC0663e);
            }
        }).c();
    }

    private static String d(Set<f> set) {
        StringBuilder sb = new StringBuilder();
        Iterator<f> it = set.iterator();
        while (it.hasNext()) {
            f next = it.next();
            sb.append(next.b());
            sb.append('/');
            sb.append(next.c());
            if (it.hasNext()) {
                sb.append(' ');
            }
        }
        return sb.toString();
    }

    @Override // ax.h8.i
    public String a() {
        if (this.b.b().isEmpty()) {
            return this.a;
        }
        return this.a + ' ' + d(this.b.b());
    }
}
