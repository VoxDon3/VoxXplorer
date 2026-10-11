package ax.Q8;

/* loaded from: classes3.dex */
public enum D implements ax.Y8.c<D> {
    AES_128_CCM(1, "AES/CCM/NoPadding", 11),
    AES_128_GCM(2, "AES/GCM/NoPadding", 12);

    private String c0;
    private int d0;
    private long q;

    D(long j, String str, int i) {
        this.q = j;
        this.c0 = str;
        this.d0 = i;
    }

    @Override // ax.Y8.c
    public long getValue() {
        return this.q;
    }

    public String h() {
        return this.c0;
    }

    public int j() {
        return this.d0;
    }
}
