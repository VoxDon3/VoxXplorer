/*
 * Decompiled with CFR 0.152.
 */
package ax.P0;

import android.os.Bundle;
import ax.S0.d0;
import java.util.Arrays;

public final class j {
    public static final j h = new b().d(1).c(2).e(3).a();
    public static final j i = new b().d(1).c(1).e(2).a();
    private static final String j = d0.G0(0);
    private static final String k = d0.G0(1);
    private static final String l = d0.G0(2);
    private static final String m = d0.G0(3);
    private static final String n = d0.G0(4);
    private static final String o = d0.G0(5);
    public final int a;
    public final int b;
    public final int c;
    public final byte[] d;
    public final int e;
    public final int f;
    private int g;

    private j(int n8, int n9, int n10, byte[] byArray, int n11, int n12) {
        this.a = n8;
        this.b = n9;
        this.c = n10;
        this.d = byArray;
        this.e = n11;
        this.f = n12;
    }

    private static String b(int n8) {
        if (n8 != -1) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(n8);
            stringBuilder.append("bit Chroma");
            return stringBuilder.toString();
        }
        return "NA";
    }

    private static String c(int n8) {
        if (n8 != -1) {
            if (n8 != 1) {
                if (n8 != 2) {
                    StringBuilder stringBuilder = new StringBuilder();
                    stringBuilder.append("Undefined color range ");
                    stringBuilder.append(n8);
                    return stringBuilder.toString();
                }
                return "Limited range";
            }
            return "Full range";
        }
        return "Unset color range";
    }

    private static String d(int n8) {
        if (n8 != -1) {
            if (n8 != 6) {
                if (n8 != 1) {
                    if (n8 != 2) {
                        StringBuilder stringBuilder = new StringBuilder();
                        stringBuilder.append("Undefined color space ");
                        stringBuilder.append(n8);
                        return stringBuilder.toString();
                    }
                    return "BT601";
                }
                return "BT709";
            }
            return "BT2020";
        }
        return "Unset color space";
    }

    private static String e(int n8) {
        if (n8 != -1) {
            if (n8 != 10) {
                if (n8 != 1) {
                    if (n8 != 2) {
                        if (n8 != 3) {
                            if (n8 != 6) {
                                if (n8 != 7) {
                                    StringBuilder stringBuilder = new StringBuilder();
                                    stringBuilder.append("Undefined color transfer ");
                                    stringBuilder.append(n8);
                                    return stringBuilder.toString();
                                }
                                return "HLG";
                            }
                            return "ST2084 PQ";
                        }
                        return "SDR SMPTE 170M";
                    }
                    return "sRGB";
                }
                return "Linear";
            }
            return "Gamma 2.2";
        }
        return "Unset color transfer";
    }

    public static j f(Bundle bundle) {
        return new j(bundle.getInt(j, -1), bundle.getInt(k, -1), bundle.getInt(l, -1), bundle.getByteArray(m), bundle.getInt(n, -1), bundle.getInt(o, -1));
    }

    public static boolean i(j j8) {
        if (j8 == null) {
            return true;
        }
        int n8 = j8.a;
        return !(n8 != -1 && n8 != 1 && n8 != 2 || (n8 = j8.b) != -1 && n8 != 2 || (n8 = j8.c) != -1 && n8 != 3 || j8.d != null || (n8 = j8.f) != -1 && n8 != 8 || (n8 = j8.e) != -1 && n8 != 8);
    }

    public static int k(int n8) {
        if (n8 != 1) {
            if (n8 != 9) {
                if (n8 != 4 && n8 != 5 && n8 != 6 && n8 != 7) {
                    return -1;
                }
                return 2;
            }
            return 6;
        }
        return 1;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public static int l(int n8) {
        if (n8 == 1) return 3;
        if (n8 == 4) return 10;
        if (n8 == 13) return 2;
        if (n8 == 16) return 6;
        if (n8 == 18) return 7;
        if (n8 == 6 || n8 == 7) return 3;
        return -1;
    }

    private static String m(int n8) {
        if (n8 != -1) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(n8);
            stringBuilder.append("bit Luma");
            return stringBuilder.toString();
        }
        return "NA";
    }

    public b a() {
        return new b(this);
    }

    public boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        if (object != null && j.class == object.getClass()) {
            object = (j)object;
            if (this.a == ((j)object).a && this.b == ((j)object).b && this.c == ((j)object).c && Arrays.equals(this.d, ((j)object).d) && this.e == ((j)object).e && this.f == ((j)object).f) {
                return true;
            }
        }
        return false;
    }

    public boolean g() {
        return this.e != -1 && this.f != -1;
    }

    public boolean h() {
        return this.a != -1 && this.b != -1 && this.c != -1;
    }

    public int hashCode() {
        if (this.g == 0) {
            this.g = (((((527 + this.a) * 31 + this.b) * 31 + this.c) * 31 + Arrays.hashCode(this.d)) * 31 + this.e) * 31 + this.f;
        }
        return this.g;
    }

    public boolean j() {
        return this.g() || this.h();
        {
        }
    }

    public Bundle n() {
        Bundle bundle = new Bundle();
        bundle.putInt(j, this.a);
        bundle.putInt(k, this.b);
        bundle.putInt(l, this.c);
        bundle.putByteArray(m, this.d);
        bundle.putInt(n, this.e);
        bundle.putInt(o, this.f);
        return bundle;
    }

    public String o() {
        CharSequence charSequence;
        String string = this.h() ? d0.G("%s/%s/%s", ax.P0.j.d(this.a), ax.P0.j.c(this.b), ax.P0.j.e(this.c)) : "NA/NA/NA";
        if (this.g()) {
            charSequence = new StringBuilder();
            ((StringBuilder)charSequence).append(this.e);
            ((StringBuilder)charSequence).append("/");
            ((StringBuilder)charSequence).append(this.f);
            charSequence = ((StringBuilder)charSequence).toString();
        } else {
            charSequence = "NA/NA";
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(string);
        stringBuilder.append("/");
        stringBuilder.append((String)charSequence);
        return stringBuilder.toString();
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("ColorInfo(");
        stringBuilder.append(ax.P0.j.d(this.a));
        stringBuilder.append(", ");
        stringBuilder.append(ax.P0.j.c(this.b));
        stringBuilder.append(", ");
        stringBuilder.append(ax.P0.j.e(this.c));
        stringBuilder.append(", ");
        boolean bl = this.d != null;
        stringBuilder.append(bl);
        stringBuilder.append(", ");
        stringBuilder.append(ax.P0.j.m(this.e));
        stringBuilder.append(", ");
        stringBuilder.append(ax.P0.j.b(this.f));
        stringBuilder.append(")");
        return stringBuilder.toString();
    }

    public static final class b {
        private int a;
        private int b;
        private int c;
        private byte[] d;
        private int e;
        private int f;

        public b() {
            this.a = -1;
            this.b = -1;
            this.c = -1;
            this.e = -1;
            this.f = -1;
        }

        private b(j j8) {
            this.a = j8.a;
            this.b = j8.b;
            this.c = j8.c;
            this.d = j8.d;
            this.e = j8.e;
            this.f = j8.f;
        }

        public j a() {
            return new j(this.a, this.b, this.c, this.d, this.e, this.f);
        }

        public b b(int n8) {
            this.f = n8;
            return this;
        }

        public b c(int n8) {
            this.b = n8;
            return this;
        }

        public b d(int n8) {
            this.a = n8;
            return this;
        }

        public b e(int n8) {
            this.c = n8;
            return this;
        }

        public b f(byte[] byArray) {
            this.d = byArray;
            return this;
        }

        public b g(int n8) {
            this.e = n8;
            return this;
        }
    }
}

