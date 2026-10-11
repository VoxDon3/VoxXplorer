package ax.b6;

/* loaded from: classes3.dex */
final class N3 implements E3 {
    private N3() {
    }

    @Override // ax.b6.E3
    public final byte[] a(byte[] bArr, int i, int i2) {
        byte[] bArr2 = new byte[i2];
        System.arraycopy(bArr, i, bArr2, 0, i2);
        return bArr2;
    }
}
