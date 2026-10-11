/*
 * Decompiled with CFR 0.152.
 */
package ax.Dc;

import ax.Dc.d;
import ax.Kc.n;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Arrays;

class c {
    private final int[] a;

    public c(int n8) {
        if (n8 >= 0 && n8 <= 30) {
            int[] nArray = new int[(int)((1L << n8 + 1) - 1L)];
            this.a = nArray;
            Arrays.fill(nArray, -1);
            return;
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("depth must be bigger than 0 and not bigger than 30 but is ");
        stringBuilder.append(n8);
        throw new IllegalArgumentException(stringBuilder.toString());
    }

    static c b(InputStream object, int n8) throws IOException {
        if (n8 >= 0) {
            int n9 = ((InputStream)object).read() + 1;
            if (n9 != 0) {
                Object[] objectArray = n.g((InputStream)object, n9);
                if (objectArray.length == n9) {
                    int n10;
                    int n11;
                    int n12;
                    Object object2;
                    object = new int[n8];
                    int n13 = objectArray.length;
                    int n14 = 0;
                    n9 = 0;
                    for (object2 = 0; object2 < n13; ++object2) {
                        n12 = objectArray[object2];
                        n11 = ((n12 & 0xF0) >> 4) + 1;
                        if (n14 + n11 <= n8) {
                            n10 = (n12 & 0xF) + 1;
                            n12 = 0;
                            while (n12 < n11) {
                                object[n14] = n10;
                                ++n12;
                                ++n14;
                            }
                            n9 = Math.max(n9, n10);
                            continue;
                        }
                        throw new IOException("Number of values exceeds given total number of values");
                    }
                    int[] nArray = new int[n8];
                    for (object2 = 0; object2 < n8; ++object2) {
                        nArray[object2] = object2;
                    }
                    Object object3 = new int[n8];
                    n14 = 0;
                    for (object2 = 0; object2 < n8; ++object2) {
                        for (n12 = 0; n12 < n8; ++n12) {
                            n13 = n14;
                            if (object[n12] == object2) {
                                object3[n14] = object2;
                                nArray[n14] = n12;
                                n13 = n14 + 1;
                            }
                            n14 = n13;
                        }
                    }
                    objectArray = new int[n8];
                    n11 = 0;
                    n13 = 0;
                    object2 = 0;
                    for (n12 = n8 - 1; n12 >= 0; --n12) {
                        n11 += n13;
                        n10 = object3[n12];
                        n14 = object2;
                        if (n10 != object2) {
                            n13 = 1 << 16 - n10;
                            n14 = n10;
                        }
                        objectArray[nArray[n12]] = n11;
                        object2 = n14;
                    }
                    object3 = new c(n9);
                    for (n9 = 0; n9 < n8; ++n9) {
                        object2 = object[n9];
                        if (object2 <= 0) continue;
                        ((c)object3).a(0, Integer.reverse(objectArray[n9] << 16), (int)object2, n9);
                    }
                    return object3;
                }
                throw new EOFException();
            }
            throw new IOException("Cannot read the size of the encoded tree, unexpected end of stream");
        }
        object = new StringBuilder();
        ((StringBuilder)object).append("totalNumberOfValues must be bigger than 0, is ");
        ((StringBuilder)object).append(n8);
        throw new IllegalArgumentException(((StringBuilder)object).toString());
    }

    public void a(int n8, int n9, int n10, int n11) {
        if (n10 == 0) {
            Object object = this.a;
            if (object[n8] == -1) {
                object[n8] = n11;
                return;
            }
            object = new StringBuilder();
            object.append("Tree value at index ");
            object.append(n8);
            object.append(" has already been assigned (");
            object.append(this.a[n8]);
            object.append(")");
            throw new IllegalArgumentException(object.toString());
        }
        this.a[n8] = -2;
        this.a(n8 * 2 + 1 + (n9 & 1), n9 >>> 1, n10 - 1, n11);
    }

    public int c(d object) throws IOException {
        int n8;
        int n9;
        int n10 = 0;
        while (true) {
            if ((n9 = ((d)object).o()) == -1) {
                return -1;
            }
            int n11 = n10 * 2 + 1 + n9;
            n8 = this.a[n11];
            if (n8 != -2) break;
            n10 = n11;
        }
        if (n8 != -1) {
            return n8;
        }
        object = new StringBuilder();
        ((StringBuilder)object).append("The child ");
        ((StringBuilder)object).append(n9);
        ((StringBuilder)object).append(" of node at index ");
        ((StringBuilder)object).append(n10);
        ((StringBuilder)object).append(" is not defined");
        throw new IOException(((StringBuilder)object).toString());
    }
}

