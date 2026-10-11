package j$.nio.file.attribute;

import java.nio.file.attribute.DosFileAttributeView;

/* loaded from: classes2.dex */
public final /* synthetic */ class g implements d {
    public final /* synthetic */ DosFileAttributeView a;

    public /* synthetic */ g(DosFileAttributeView dosFileAttributeView) {
        this.a = dosFileAttributeView;
    }

    @Override // j$.nio.file.attribute.d
    public final /* synthetic */ void a(s sVar, s sVar2, s sVar3) {
        this.a.setTimes(j$.com.android.tools.r8.a.D(sVar), j$.com.android.tools.r8.a.D(sVar2), j$.com.android.tools.r8.a.D(sVar3));
    }

    public final /* synthetic */ boolean equals(Object obj) {
        DosFileAttributeView dosFileAttributeView = this.a;
        if (obj instanceof g) {
            obj = ((g) obj).a;
        }
        return dosFileAttributeView.equals(obj);
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
