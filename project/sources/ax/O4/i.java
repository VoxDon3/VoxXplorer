package ax.O4;

/* loaded from: classes.dex */
public class i extends RuntimeException {
    private final int c0;
    private final int d0;
    private final int q;

    i(String str, int i, int i2, int i3) {
        super(str + " at " + i2 + ":" + i3);
        this.q = i;
        this.c0 = i2;
        this.d0 = i3;
    }
}
