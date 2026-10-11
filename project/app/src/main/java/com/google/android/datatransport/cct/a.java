/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.datatransport.cct;

import ax.n5.b;
import ax.p5.g;
import com.google.android.datatransport.cct.e;
import java.nio.charset.Charset;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.regex.Pattern;

public final class a
implements g {
    static final String c;
    static final String d;
    private static final String e;
    private static final Set<b> f;
    public static final a g;
    public static final a h;
    private final String a;
    private final String b;

    static {
        String string;
        String string2;
        String string3;
        c = string3 = com.google.android.datatransport.cct.e.a("hts/frbslgiggolai.o/0clgbthfra=snpoo", "tp:/ieaeogn.ogepscmvc/o/ac?omtjo_rt3");
        d = string2 = com.google.android.datatransport.cct.e.a("hts/frbslgigp.ogepscmv/ieo/eaybtho", "tp:/ieaeogn-agolai.o/1frlglgc/aclg");
        e = string = com.google.android.datatransport.cct.e.a("AzSCki82AwsLzKd5O8zo", "IayckHiZRO1EFl1aGoK");
        f = java.util.DesugarCollections.unmodifiableSet(new HashSet<b>(Arrays.asList(ax.n5.b.b("proto"), ax.n5.b.b("json"))));
        g = new a(string3, null);
        h = new a(string2, string);
    }

    public a(String string, String string2) {
        this.a = string;
        this.b = string2;
    }

    public static a c(byte[] object) {
        if (((String)(object = (Object)new String((byte[])object, Charset.forName("UTF-8")))).startsWith("1$")) {
            if (((Object)(object = ((String)object).substring(2).split(Pattern.quote("\\"), 2))).length == 2) {
                Object object2 = object[0];
                if (!((String)object2).isEmpty()) {
                    Object object3;
                    object = object3 = object[1];
                    if (((String)object3).isEmpty()) {
                        object = null;
                    }
                    return new a((String)object2, (String)object);
                }
                throw new IllegalArgumentException("Missing endpoint in CCTDestination extras");
            }
            throw new IllegalArgumentException("Extra is not a valid encoded LegacyFlgDestination");
        }
        throw new IllegalArgumentException("Version marker missing from extras");
    }

    @Override
    public Set<b> a() {
        return f;
    }

    public byte[] b() {
        String string = this.b;
        if (string == null && this.a == null) {
            return null;
        }
        String string2 = this.a;
        String string3 = string;
        if (string == null) {
            string3 = "";
        }
        return String.format("%s%s%s%s", "1$", string2, "\\", string3).getBytes(Charset.forName("UTF-8"));
    }

    public String d() {
        return this.b;
    }

    public String e() {
        return this.a;
    }

    @Override
    public byte[] getExtras() {
        return this.b();
    }

    @Override
    public String getName() {
        return "cct";
    }
}

