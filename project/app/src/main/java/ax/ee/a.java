/*
 * Decompiled with CFR 0.152.
 */
package ax.ee;

abstract class a {
    final int a;
    final byte[] b = new byte[256];
    int c = 0;

    a(int n8) {
        if (n8 >= 1 && n8 <= 256) {
            this.a = n8;
            return;
        }
        throw new IllegalArgumentException();
    }
}

