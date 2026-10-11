/*
 * Decompiled with CFR 0.152.
 */
package ax.Ob;

import ax.Ob.b;

class c
extends b {
    public static final boolean d(char c8, char c9, boolean bl) {
        if (c8 == c9) {
            return true;
        }
        if (!bl) {
            return false;
        }
        return (c8 = Character.toUpperCase(c8)) == (c9 = Character.toUpperCase(c9)) || Character.toLowerCase(c8) == Character.toLowerCase(c9);
        {
        }
    }
}

