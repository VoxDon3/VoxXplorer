package j$.nio.file.attribute;

import java.nio.file.attribute.BasicFileAttributeView;

/* renamed from: j$.nio.file.attribute.b, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final /* synthetic */ class C3789b implements d {
    public final /* synthetic */ BasicFileAttributeView a;

    public /* synthetic */ C3789b(BasicFileAttributeView basicFileAttributeView) {
        this.a = basicFileAttributeView;
    }

    @Override // j$.nio.file.attribute.d
    public final /* synthetic */ void a(s sVar, s sVar2, s sVar3) {
        this.a.setTimes(j$.com.android.tools.r8.a.D(sVar), j$.com.android.tools.r8.a.D(sVar2), j$.com.android.tools.r8.a.D(sVar3));
    }

    public final /* synthetic */ boolean equals(Object obj) {
        BasicFileAttributeView basicFileAttributeView = this.a;
        if (obj instanceof C3789b) {
            obj = ((C3789b) obj).a;
        }
        return basicFileAttributeView.equals(obj);
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
