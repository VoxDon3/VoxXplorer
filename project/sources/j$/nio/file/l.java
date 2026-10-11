package j$.nio.file;

/* loaded from: classes2.dex */
public final /* synthetic */ class l implements java.nio.file.OpenOption {
    public final /* synthetic */ OpenOption a;

    public /* synthetic */ l(OpenOption openOption) {
        this.a = openOption;
    }

    public static /* synthetic */ java.nio.file.OpenOption a(OpenOption openOption) {
        if (openOption == null) {
            return null;
        }
        if (openOption instanceof k) {
            return ((k) openOption).a;
        }
        if (!(openOption instanceof LinkOption)) {
            return openOption instanceof StandardOpenOption ? x.a((StandardOpenOption) openOption) : new l(openOption);
        }
        return java.nio.file.LinkOption.NOFOLLOW_LINKS;
    }

    public final /* synthetic */ boolean equals(Object obj) {
        OpenOption openOption = this.a;
        if (obj instanceof l) {
            obj = ((l) obj).a;
        }
        return openOption.equals(obj);
    }

    public final /* synthetic */ int hashCode() {
        return this.a.hashCode();
    }
}
