/*
 * Decompiled with CFR 0.152.
 */
package ax.A1;

import ax.A1.a;
import ax.P0.C;
import ax.S0.F;
import ax.z1.c;
import java.nio.ByteBuffer;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;

public final class b
extends c {
    private static C c(F f8) {
        f8.r(12);
        int n8 = f8.h(12);
        int n9 = f8.d();
        f8.r(44);
        f8.s(f8.h(12));
        f8.r(16);
        ArrayList<a> arrayList = new ArrayList<a>();
        while (true) {
            CharSequence charSequence;
            int n10 = f8.d();
            StringBuilder stringBuilder = null;
            if (n10 >= n9 + n8 - 4) break;
            f8.r(48);
            int n11 = f8.h(8);
            f8.r(4);
            n10 = f8.h(12);
            int n12 = f8.d() + n10;
            String string = null;
            while (f8.d() < n12) {
                String string2;
                n10 = f8.h(8);
                int n13 = f8.h(8);
                int n14 = f8.d() + n13;
                if (n10 == 2) {
                    n10 = f8.h(16);
                    f8.r(8);
                    charSequence = stringBuilder;
                    string2 = string;
                    if (n10 == 3) {
                        block2: while (true) {
                            charSequence = stringBuilder;
                            string2 = string;
                            if (f8.d() < n14) {
                                charSequence = f8.l(f8.h(8), StandardCharsets.US_ASCII);
                                n13 = f8.h(8);
                                n10 = 0;
                                while (true) {
                                    stringBuilder = charSequence;
                                    if (n10 >= n13) continue block2;
                                    f8.s(f8.h(8));
                                    ++n10;
                                }
                            }
                            break;
                        }
                    }
                } else {
                    charSequence = stringBuilder;
                    string2 = string;
                    if (n10 == 21) {
                        string2 = f8.l(n13, StandardCharsets.US_ASCII);
                        charSequence = stringBuilder;
                    }
                }
                f8.p(n14 * 8);
                stringBuilder = charSequence;
                string = string2;
            }
            f8.p(n12 * 8);
            if (stringBuilder == null || string == null) continue;
            charSequence = new StringBuilder();
            charSequence.append((String)((Object)stringBuilder));
            charSequence.append(string);
            arrayList.add(new a(n11, charSequence.toString()));
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        return new C(arrayList);
    }

    @Override
    protected C b(ax.z1.b b8, ByteBuffer byteBuffer) {
        if (byteBuffer.get() == 116) {
            return b.c(new F(byteBuffer.array(), byteBuffer.limit()));
        }
        return null;
    }
}

