package ax.Q8;

/* loaded from: classes3.dex */
public enum A implements ax.Y8.c<A> {
    NONE(0),
    LZNT1(1),
    LZ77(2),
    LZ77_HUFFMAN(3);

    private long q;

    A(long j) {
        this.q = j;
    }

    @Override // ax.Y8.c
    public long getValue() {
        return this.q;
    }
}
