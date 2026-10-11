package ax.Q8;

/* loaded from: classes3.dex */
public enum E implements ax.Y8.c<E> {
    SHA_512(1, "SHA-512");

    private String c0;
    private long q;

    E(long j, String str) {
        this.q = j;
        this.c0 = str;
    }

    @Override // ax.Y8.c
    public long getValue() {
        return this.q;
    }

    public String h() {
        return this.c0;
    }
}
