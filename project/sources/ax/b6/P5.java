package ax.b6;

/* loaded from: classes3.dex */
final class P5 extends IllegalArgumentException {
    P5(int i, int i2) {
        super("Unpaired surrogate at index " + i + " of " + i2);
    }
}
