/*
 * Decompiled with CFR 0.152.
 */
package ax.Xa;

public class b {
    private final String a;
    private final String b;

    public b(String string) {
        block4: {
            block7: {
                block6: {
                    String string2;
                    int n8;
                    block5: {
                        if (string == null) break block4;
                        n8 = string.indexOf(58);
                        if (n8 != -1) break block5;
                        this.a = null;
                        this.b = string;
                        break block6;
                    }
                    this.a = string2 = string.substring(0, n8);
                    this.b = string.substring(n8 + 1);
                    if (string2.length() == 0) break block7;
                }
                if (this.b.length() != 0) {
                    return;
                }
                throw new IllegalArgumentException();
            }
            throw new IllegalArgumentException();
        }
        throw new IllegalArgumentException();
    }

    public String a() {
        return this.b;
    }

    public boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        if (object != null && this.getClass() == object.getClass()) {
            object = (b)object;
            String string = this.b;
            if (string != null ? !string.equals(((b)object).b) : ((b)object).b != null) {
                return false;
            }
            string = this.a;
            object = ((b)object).a;
            return !(string != null ? !string.equals(object) : object != null);
        }
        return false;
    }

    public int hashCode() {
        String string = this.a;
        int n8 = 0;
        int n9 = string != null ? string.hashCode() : 0;
        string = this.b;
        if (string != null) {
            n8 = string.hashCode();
        }
        return n9 * 31 + n8;
    }

    public String toString() {
        CharSequence charSequence;
        StringBuilder stringBuilder = new StringBuilder();
        if (this.a != null) {
            charSequence = new StringBuilder();
            ((StringBuilder)charSequence).append(this.a);
            ((StringBuilder)charSequence).append(':');
            charSequence = ((StringBuilder)charSequence).toString();
        } else {
            charSequence = "";
        }
        stringBuilder.append((String)charSequence);
        stringBuilder.append(this.b);
        return stringBuilder.toString();
    }
}

