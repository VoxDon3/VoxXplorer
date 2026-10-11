package j$.nio.file;

/* loaded from: classes2.dex */
public final /* synthetic */ class t implements PathMatcher {
    public final /* synthetic */ java.nio.file.PathMatcher a;

    public /* synthetic */ t(java.nio.file.PathMatcher pathMatcher) {
        this.a = pathMatcher;
    }

    public final /* synthetic */ boolean equals(Object obj) {
        java.nio.file.PathMatcher pathMatcher = this.a;
        if (obj instanceof t) {
            obj = ((t) obj).a;
        }
        return pathMatcher.equals(obj);
    }

    public final /* synthetic */ int hashCode() {
        return this.a.hashCode();
    }

    @Override // j$.nio.file.PathMatcher
    public final /* synthetic */ boolean matches(Path path) {
        return this.a.matches(o.j(path));
    }
}
