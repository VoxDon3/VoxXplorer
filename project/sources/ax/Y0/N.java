package ax.Y0;

/* loaded from: classes.dex */
public final class N extends RuntimeException {
    public final int q;

    public N(int i) {
        super(a(i));
        this.q = i;
    }

    private static String a(int i) {
        return i != 1 ? i != 2 ? i != 3 ? "Undefined timeout." : "Detaching surface timed out." : "Setting foreground mode timed out." : "Player release timed out.";
    }
}
