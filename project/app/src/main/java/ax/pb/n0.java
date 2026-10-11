/*
 * Decompiled with CFR 0.152.
 */
package ax.pb;

import ax.pb.Q;
import ax.pb.Z;
import ax.pb.h;
import ax.pb.s;
import ax.qb.e;
import java.io.UnsupportedEncodingException;
import java.util.Date;

class n0
extends Q {
    int Y0;
    boolean Z0;
    int a1;
    int b1;
    int c1;
    String d1;
    int e1;

    n0() {
        this.d0 = (byte)50;
        this.R0 = 1;
    }

    @Override
    int E(byte[] byArray, int n8, int n9) {
        this.c1 = this.b1 + n8;
        this.X0 = new a[this.W0];
        for (n9 = 0; n9 < this.W0; ++n9) {
            int n10;
            int n11;
            Object object = this.X0;
            a a8 = new a(this);
            object[n9] = a8;
            a8.a = s.j(byArray, n8);
            a8.b = s.j(byArray, n8 + 4);
            a8.c = s.q(byArray, n8 + 8);
            a8.e = s.q(byArray, n8 + 24);
            a8.g = s.k(byArray, n8 + 40);
            a8.i = s.j(byArray, n8 + 56);
            a8.j = n11 = s.j(byArray, n8 + 60);
            a8.n = object = this.G(byArray, n8 + 94, n11);
            n11 = this.c1;
            if (n11 >= n8 && ((n10 = a8.a) == 0 || n11 < n10 + n8)) {
                this.d1 = object;
                this.e1 = a8.b;
            }
            n8 += a8.a;
        }
        return this.Q0;
    }

    @Override
    int F(byte[] byArray, int n8, int n9) {
        n9 = this.R0;
        boolean bl = true;
        if (n9 == 1) {
            this.Y0 = s.i(byArray, n8);
            n9 = n8 + 2;
        } else {
            n9 = n8;
        }
        this.W0 = s.i(byArray, n9);
        if ((byArray[n9 + 2] & 1) != 1) {
            bl = false;
        }
        this.Z0 = bl;
        this.a1 = s.i(byArray, n9 + 4);
        this.b1 = s.i(byArray, n9 + 6);
        return n9 + 8 - n8;
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    String G(byte[] object, int n8, int n9) {
        UnsupportedEncodingException unsupportedEncodingException2;
        block4: {
            try {
                if (this.q0) {
                    return new String((byte[])object, n8, n9, "UTF-16LE");
                }
            }
            catch (UnsupportedEncodingException unsupportedEncodingException2) {
                break block4;
            }
            int n10 = n9;
            if (n9 <= 0) return new String((byte[])object, n8, n10, Z.K);
            n10 = n9;
            if (object[n8 + n9 - 1] != 0) return new String((byte[])object, n8, n10, Z.K);
            n10 = n9 - 1;
            return new String((byte[])object, n8, n10, Z.K);
        }
        if (e.c0 <= 1) return null;
        unsupportedEncodingException2.printStackTrace(s.A0);
        return null;
    }

    @Override
    public String toString() {
        String string = this.R0 == 1 ? "Trans2FindFirst2Response[" : "Trans2FindNext2Response[";
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(string);
        stringBuilder.append(super.toString());
        stringBuilder.append(",sid=");
        stringBuilder.append(this.Y0);
        stringBuilder.append(",searchCount=");
        stringBuilder.append(this.W0);
        stringBuilder.append(",isEndOfSearch=");
        stringBuilder.append(this.Z0);
        stringBuilder.append(",eaErrorOffset=");
        stringBuilder.append(this.a1);
        stringBuilder.append(",lastNameOffset=");
        stringBuilder.append(this.b1);
        stringBuilder.append(",lastName=");
        stringBuilder.append(this.d1);
        stringBuilder.append("]");
        return new String(stringBuilder.toString());
    }

    class a
    implements h {
        int a;
        int b;
        long c;
        long d;
        long e;
        long f;
        long g;
        long h;
        int i;
        int j;
        int k;
        int l;
        String m;
        String n;
        final n0 o;

        a(n0 n02) {
            this.o = n02;
        }

        @Override
        public int a() {
            return 1;
        }

        @Override
        public int b() {
            return this.i;
        }

        @Override
        public long c() {
            return this.c;
        }

        @Override
        public String getName() {
            return this.n;
        }

        @Override
        public long h() {
            return this.e;
        }

        @Override
        public long length() {
            return this.g;
        }

        public String toString() {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("SmbFindFileBothDirectoryInfo[nextEntryOffset=");
            stringBuilder.append(this.a);
            stringBuilder.append(",fileIndex=");
            stringBuilder.append(this.b);
            stringBuilder.append(",creationTime=");
            stringBuilder.append(new Date(this.c));
            stringBuilder.append(",lastAccessTime=");
            stringBuilder.append(new Date(this.d));
            stringBuilder.append(",lastWriteTime=");
            stringBuilder.append(new Date(this.e));
            stringBuilder.append(",changeTime=");
            stringBuilder.append(new Date(this.f));
            stringBuilder.append(",endOfFile=");
            stringBuilder.append(this.g);
            stringBuilder.append(",allocationSize=");
            stringBuilder.append(this.h);
            stringBuilder.append(",extFileAttributes=");
            stringBuilder.append(this.i);
            stringBuilder.append(",fileNameLength=");
            stringBuilder.append(this.j);
            stringBuilder.append(",eaSize=");
            stringBuilder.append(this.k);
            stringBuilder.append(",shortNameLength=");
            stringBuilder.append(this.l);
            stringBuilder.append(",shortName=");
            stringBuilder.append(this.m);
            stringBuilder.append(",filename=");
            stringBuilder.append(this.n);
            stringBuilder.append("]");
            return new String(stringBuilder.toString());
        }
    }
}

