package j$.nio.file.attribute;

import java.nio.file.attribute.AclFileAttributeView;

/* renamed from: j$.nio.file.attribute.a, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final /* synthetic */ class C3788a implements q {
    public final /* synthetic */ AclFileAttributeView a;

    @Override // j$.nio.file.attribute.q
    public final /* synthetic */ void b(A a) {
        this.a.setOwner(z.a(a));
    }

    public final /* synthetic */ boolean equals(Object obj) {
        AclFileAttributeView aclFileAttributeView = this.a;
        if (obj instanceof C3788a) {
            obj = ((C3788a) obj).a;
        }
        return aclFileAttributeView.equals(obj);
    }

    @Override // j$.nio.file.attribute.q
    public final /* synthetic */ A getOwner() {
        return y.a(this.a.getOwner());
    }

    public final /* synthetic */ int hashCode() {
        return this.a.hashCode();
    }

    @Override // j$.nio.file.attribute.n
    public final /* synthetic */ String name() {
        return this.a.name();
    }
}
