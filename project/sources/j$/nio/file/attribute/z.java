package j$.nio.file.attribute;

import java.nio.file.attribute.UserPrincipal;
import javax.security.auth.Subject;

/* loaded from: classes2.dex */
public final /* synthetic */ class z implements UserPrincipal {
    public final /* synthetic */ A a;

    public /* synthetic */ z(A a) {
        this.a = a;
    }

    public static /* synthetic */ UserPrincipal a(A a) {
        if (a == null) {
            return null;
        }
        return a instanceof y ? ((y) a).a : a instanceof t ? ((t) a).a : new z(a);
    }

    @Override // java.security.Principal
    public final /* synthetic */ boolean equals(Object obj) {
        A a = this.a;
        if (obj instanceof z) {
            obj = ((z) obj).a;
        }
        return a.equals(obj);
    }

    @Override // java.security.Principal
    public final /* synthetic */ String getName() {
        return this.a.getName();
    }

    @Override // java.security.Principal
    public final /* synthetic */ int hashCode() {
        return this.a.hashCode();
    }

    @Override // java.security.Principal
    public final /* synthetic */ boolean implies(Subject subject) {
        return this.a.implies(subject);
    }

    @Override // java.security.Principal
    public final /* synthetic */ String toString() {
        return this.a.toString();
    }
}
