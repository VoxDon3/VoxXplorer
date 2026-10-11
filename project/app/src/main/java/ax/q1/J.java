/*
 * Decompiled with CFR 0.152.
 */
package ax.q1;

public final class J {
    private static final String[] a = new String[]{"audio/mpeg-L1", "audio/mpeg-L2", "audio/mpeg"};
    private static final int[] b = new int[]{44100, 48000, 32000};
    private static final int[] c = new int[]{32000, 64000, 96000, 128000, 160000, 192000, 224000, 256000, 288000, 320000, 352000, 384000, 416000, 448000};
    private static final int[] d = new int[]{32000, 48000, 56000, 64000, 80000, 96000, 112000, 128000, 144000, 160000, 176000, 192000, 224000, 256000};
    private static final int[] e = new int[]{32000, 48000, 56000, 64000, 80000, 96000, 112000, 128000, 160000, 192000, 224000, 256000, 320000, 384000};
    private static final int[] f = new int[]{32000, 40000, 48000, 56000, 64000, 80000, 96000, 112000, 128000, 160000, 192000, 224000, 256000, 320000};
    private static final int[] g = new int[]{8000, 16000, 24000, 32000, 40000, 48000, 56000, 64000, 80000, 96000, 112000, 128000, 144000, 160000};

    public static int j(int n8) {
        if (!J.l(n8)) {
            return -1;
        }
        int n9 = n8 >>> 19 & 3;
        if (n9 == 1) {
            return -1;
        }
        int n10 = n8 >>> 17 & 3;
        if (n10 == 0) {
            return -1;
        }
        int n11 = n8 >>> 12 & 0xF;
        if (n11 != 0 && n11 != 15) {
            int n12 = n8 >>> 10 & 3;
            if (n12 == 3) {
                return -1;
            }
            int n13 = b[n12];
            if (n9 == 2) {
                n12 = n13 / 2;
            } else {
                n12 = n13;
                if (n9 == 0) {
                    n12 = n13 / 4;
                }
            }
            int n14 = n8 >>> 9 & 1;
            if (n10 == 3) {
                n8 = n9 == 3 ? c[n11 - 1] : d[n11 - 1];
                return (n8 * 12 / n12 + n14) * 4;
            }
            n8 = n9 == 3 ? (n10 == 2 ? e[n11 - 1] : f[n11 - 1]) : g[n11 - 1];
            n13 = 144;
            if (n9 == 3) {
                return n8 * 144 / n12 + n14;
            }
            if (n10 == 1) {
                n13 = 72;
            }
            return n13 * n8 / n12 + n14;
        }
        return -1;
    }

    private static int k(int n8, int n9) {
        if (n9 != 1) {
            if (n9 != 2) {
                if (n9 == 3) {
                    return 384;
                }
                throw new IllegalArgumentException();
            }
            return 1152;
        }
        if (n8 == 3) {
            return 1152;
        }
        return 576;
    }

    private static boolean l(int n8) {
        return (n8 & 0xFFE00000) == -2097152;
    }

    public static int m(int n8) {
        if (!J.l(n8)) {
            return -1;
        }
        int n9 = n8 >>> 19 & 3;
        if (n9 == 1) {
            return -1;
        }
        int n10 = n8 >>> 17 & 3;
        if (n10 == 0) {
            return -1;
        }
        int n11 = n8 >>> 12 & 0xF;
        if (n11 != 0 && n11 != 15 && (n8 >>> 10 & 3) != 3) {
            return J.k(n9, n10);
        }
        return -1;
    }

    public static final class a {
        public int a;
        public String b;
        public int c;
        public int d;
        public int e;
        public int f;
        public int g;

        public a() {
        }

        public a(a a8) {
            this.a = a8.a;
            this.b = a8.b;
            this.c = a8.c;
            this.d = a8.d;
            this.e = a8.e;
            this.f = a8.f;
            this.g = a8.g;
        }

        public boolean a(int n8) {
            if (!J.l(n8)) {
                return false;
            }
            int n9 = n8 >>> 19 & 3;
            if (n9 == 1) {
                return false;
            }
            int n10 = n8 >>> 17 & 3;
            if (n10 == 0) {
                return false;
            }
            int n11 = n8 >>> 12 & 0xF;
            if (n11 != 0 && n11 != 15) {
                int n12 = n8 >>> 10 & 3;
                if (n12 == 3) {
                    return false;
                }
                this.a = n9;
                this.b = a[3 - n10];
                this.d = n12 = b[n12];
                int n13 = 2;
                if (n9 == 2) {
                    this.d = n12 / 2;
                } else if (n9 == 0) {
                    this.d = n12 / 4;
                }
                int n14 = n8 >>> 9 & 1;
                this.g = J.k(n9, n10);
                if (n10 == 3) {
                    n12 = n9 == 3 ? c[n11 - 1] : d[n11 - 1];
                    this.f = n12;
                    this.c = (n12 * 12 / this.d + n14) * 4;
                } else {
                    n12 = 144;
                    if (n9 == 3) {
                        n12 = n10 == 2 ? e[n11 - 1] : f[n11 - 1];
                        this.f = n12;
                        this.c = n12 * 144 / this.d + n14;
                    } else {
                        this.f = n11 = g[n11 - 1];
                        if (n10 == 1) {
                            n12 = 72;
                        }
                        this.c = n12 * n11 / this.d + n14;
                    }
                }
                n12 = n13;
                if ((n8 >> 6 & 3) == 3) {
                    n12 = 1;
                }
                this.e = n12;
                return true;
            }
            return false;
        }
    }
}

