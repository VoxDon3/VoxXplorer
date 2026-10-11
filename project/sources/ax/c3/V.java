package ax.c3;

/* loaded from: classes.dex */
public enum V {
    TEXT("text/*"),
    IMAGE("image/*"),
    AUDIO("audio/*"),
    VIDEO("video/*"),
    OTHER("*/*");

    private final String q;

    V(String str) {
        this.q = str;
    }

    public static boolean j(String str) {
        return str != null && str.endsWith("*");
    }

    public String h() {
        return this.q;
    }
}
