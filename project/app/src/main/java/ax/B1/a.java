/*
 * Decompiled with CFR 0.152.
 */
package ax.B1;

import ax.P0.A;
import ax.P0.B;
import ax.P0.C;
import ax.P0.v;
import java.util.Arrays;

public final class a
implements C.a {
    private static final v g = new v.b().y0("application/id3").P();
    private static final v h = new v.b().y0("application/x-scte35").P();
    public final String a;
    public final String b;
    public final long c;
    public final long d;
    public final byte[] e;
    private int f;

    public a(String string, String string2, long l8, long l9, byte[] byArray) {
        this.a = string;
        this.b = string2;
        this.c = l8;
        this.d = l9;
        this.e = byArray;
    }

    @Override
    public v a() {
        String string = this.a;
        string.getClass();
        int n8 = -1;
        switch (string.hashCode()) {
            default: {
                break;
            }
            case 1303648457: {
                if (!string.equals("https://developer.apple.com/streaming/emsg-id3")) break;
                n8 = 2;
                break;
            }
            case -795945609: {
                if (!string.equals("https://aomedia.org/emsg/ID3")) break;
                n8 = 1;
                break;
            }
            case -1468477611: {
                if (!string.equals("urn:scte:scte35:2014:bin")) break;
                n8 = 0;
            }
        }
        switch (n8) {
            default: {
                return null;
            }
            case 1: 
            case 2: {
                return g;
            }
            case 0: 
        }
        return h;
    }

    @Override
    public /* synthetic */ void b(A.b b8) {
        B.c(this, b8);
    }

    @Override
    public byte[] c() {
        if (this.a() != null) {
            return this.e;
        }
        return null;
    }

    public boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        if (object != null && a.class == object.getClass()) {
            object = (a)object;
            if (this.c == ((a)object).c && this.d == ((a)object).d && j.Objects.equals((Object)this.a, (Object)((a)object).a) && j.Objects.equals((Object)this.b, (Object)((a)object).b) && Arrays.equals(this.e, ((a)object).e)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        if (this.f == 0) {
            String string = this.a;
            int n8 = 0;
            int n9 = string != null ? string.hashCode() : 0;
            string = this.b;
            if (string != null) {
                n8 = string.hashCode();
            }
            long l8 = this.c;
            int n10 = (int)(l8 ^ l8 >>> 32);
            l8 = this.d;
            this.f = ((((527 + n9) * 31 + n8) * 31 + n10) * 31 + (int)(l8 ^ l8 >>> 32)) * 31 + Arrays.hashCode(this.e);
        }
        return this.f;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("EMSG: scheme=");
        stringBuilder.append(this.a);
        stringBuilder.append(", id=");
        stringBuilder.append(this.d);
        stringBuilder.append(", durationMs=");
        stringBuilder.append(this.c);
        stringBuilder.append(", value=");
        stringBuilder.append(this.b);
        return stringBuilder.toString();
    }
}

