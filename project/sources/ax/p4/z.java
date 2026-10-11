package ax.p4;

/* loaded from: classes.dex */
public enum z {
    ONLINE("online"),
    OFFLINE("offline");

    private String q;

    z(String str) {
        this.q = str;
    }

    @Override // java.lang.Enum
    public String toString() {
        return this.q;
    }
}
