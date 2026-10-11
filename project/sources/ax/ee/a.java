package ax.ee;

/* loaded from: classes3.dex */
abstract class a {
    final int a;
    final byte[] b = new byte[256];
    int c = 0;

    a(int i) {
        if (i < 1 || i > 256) {
            throw new IllegalArgumentException();
        }
        this.a = i;
    }
}
