package ax.Sd;

import java.nio.ByteBuffer;

/* loaded from: classes3.dex */
public abstract class b {
    private boolean a = true;

    public enum a {
        DETECTING,
        FOUND_IT,
        NOT_ME
    }

    private boolean h(byte b) {
        return (b & 128) == 0;
    }

    private boolean i(byte b) {
        int i = b & 255;
        if (i >= 65) {
            return (i > 90 && i < 97) || i > 122;
        }
        return true;
    }

    public ByteBuffer a(byte[] bArr, int i, int i2) {
        ByteBuffer allocate = ByteBuffer.allocate(i2);
        int i3 = i2 + i;
        int i4 = i;
        boolean z = false;
        while (i < i3) {
            byte b = bArr[i];
            if (b == 62) {
                z = false;
            } else if (b == 60) {
                z = true;
            }
            if (h(b) && i(b)) {
                if (i > i4 && !z) {
                    allocate.put(bArr, i4, i - i4);
                    allocate.put((byte) 32);
                }
                i4 = i + 1;
            }
            i++;
        }
        if (!z && i > i4) {
            allocate.put(bArr, i4, i - i4);
        }
        return allocate;
    }

    public ByteBuffer b(byte[] bArr, int i, int i2) {
        ByteBuffer allocate = ByteBuffer.allocate(i2);
        int i3 = i2 + i;
        int i4 = i;
        boolean z = false;
        while (i < i3) {
            byte b = bArr[i];
            if (!h(b)) {
                z = true;
            } else if (i(b)) {
                if (!z || i <= i4) {
                    i4 = i + 1;
                } else {
                    allocate.put(bArr, i4, i - i4);
                    allocate.put((byte) 32);
                    i4 = i + 1;
                    z = false;
                }
            }
            i++;
        }
        if (z && i > i4) {
            allocate.put(bArr, i4, i - i4);
        }
        return allocate;
    }

    public abstract String c();

    public abstract float d();

    public abstract a e();

    public abstract a f(byte[] bArr, int i, int i2);

    public boolean g() {
        return this.a;
    }

    public abstract void j();

    public void k(boolean z) {
        this.a = z;
    }
}
