package j$.nio.file;

/* loaded from: classes2.dex */
public final /* synthetic */ class u implements java.nio.file.PathMatcher {
    public final /* synthetic */ PathMatcher a;

    public /* synthetic */ u(PathMatcher pathMatcher) {
        this.a = pathMatcher;
    }

    public final /* synthetic */ boolean equals(Object obj) {
        PathMatcher pathMatcher = this.a;
        if (obj instanceof u) {
            obj = ((u) obj).a;
        }
        return pathMatcher.equals(obj);
    }

    public final /* synthetic */ int hashCode() {
        return this.a.hashCode();
    }

    @Override // java.nio.file.PathMatcher
    public final /* synthetic */ boolean matches(java.nio.file.Path path) {
        return this.a.matches(n.j(path));
    }
}
