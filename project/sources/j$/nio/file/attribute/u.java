package j$.nio.file.attribute;

import java.nio.file.attribute.PosixFileAttributeView;

/* loaded from: classes2.dex */
public final /* synthetic */ class u implements d, q {
    public final /* synthetic */ PosixFileAttributeView a;

    public /* synthetic */ u(PosixFileAttributeView posixFileAttributeView) {
        this.a = posixFileAttributeView;
    }

    @Override // j$.nio.file.attribute.d
    public final /* synthetic */ void a(s sVar, s sVar2, s sVar3) {
        this.a.setTimes(j$.com.android.tools.r8.a.D(sVar), j$.com.android.tools.r8.a.D(sVar2), j$.com.android.tools.r8.a.D(sVar3));
    }

    @Override // j$.nio.file.attribute.q
    public final /* synthetic */ void b(A a) {
        this.a.setOwner(z.a(a));
    }

    public final /* synthetic */ boolean equals(Object obj) {
        PosixFileAttributeView posixFileAttributeView = this.a;
        if (obj instanceof u) {
            obj = ((u) obj).a;
        }
        return posixFileAttributeView.equals(obj);
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

    @Override // j$.nio.file.attribute.d
    public final /* synthetic */ BasicFileAttributes readAttributes() {
        return e.a(this.a.readAttributes());
    }
}
