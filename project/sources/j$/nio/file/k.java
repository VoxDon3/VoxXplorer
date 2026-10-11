package j$.nio.file;

/* loaded from: classes2.dex */
public final /* synthetic */ class k implements OpenOption {
    public final /* synthetic */ java.nio.file.OpenOption a;

    public /* synthetic */ k(java.nio.file.OpenOption openOption) {
        this.a = openOption;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v2, types: [j$.nio.file.OpenOption, java.nio.file.StandardOpenOption] */
    /* JADX WARN: Type inference failed for: r1v4, types: [j$.nio.file.OpenOption, java.nio.file.LinkOption] */
    public static /* synthetic */ OpenOption a(java.nio.file.OpenOption openOption) {
        if (openOption == 0) {
            return null;
        }
        if (openOption instanceof l) {
            return ((l) openOption).a;
        }
        if (!(openOption instanceof LinkOption)) {
            return openOption instanceof StandardOpenOption ? x.a((StandardOpenOption) openOption) : new k(openOption);
        }
        return java.nio.file.LinkOption.NOFOLLOW_LINKS;
    }

    public final /* synthetic */ boolean equals(Object obj) {
        java.nio.file.OpenOption openOption = this.a;
        if (obj instanceof k) {
            obj = ((k) obj).a;
        }
        return openOption.equals(obj);
    }

    public final /* synthetic */ int hashCode() {
        return this.a.hashCode();
    }
}
