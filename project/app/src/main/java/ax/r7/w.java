/*
 * Decompiled with CFR 0.152.
 */
package ax.r7;

final class w {
    static int a(int n8, double d8) {
        int n9;
        if ((n8 = Math.max(n8, 2)) > (int)(d8 * (double)(n9 = Integer.highestOneBit(n8)))) {
            n8 = n9 << 1;
            if (n8 > 0) {
                return n8;
            }
            return 0x40000000;
        }
        return n9;
    }

    static int b(int n8) {
        return (int)((long)Integer.rotateLeft((int)((long)n8 * -862048943L), 15) * 461845907L);
    }

    static int c(Object object) {
        int n8 = object == null ? 0 : object.hashCode();
        return w.b(n8);
    }
}

