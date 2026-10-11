/*
 * Decompiled with CFR 0.152.
 */
package ax.k2;

import ax.Gb.l;

public final class v {
    public static final v a = new v();

    private v() {
    }

    public static final String a(String string) {
        l.f(string, "hash");
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, '");
        stringBuilder.append(string);
        stringBuilder.append("')");
        return stringBuilder.toString();
    }
}

