package ax.Xa;

import okhttp3.HttpUrl;

/* loaded from: classes3.dex */
public class b {
    private final String a;
    private final String b;

    public b(String str) {
        if (str == null) {
            throw new IllegalArgumentException();
        }
        int indexOf = str.indexOf(58);
        if (indexOf == -1) {
            this.a = null;
            this.b = str;
        } else {
            String substring = str.substring(0, indexOf);
            this.a = substring;
            this.b = str.substring(indexOf + 1);
            if (substring.length() == 0) {
                throw new IllegalArgumentException();
            }
        }
        if (this.b.length() == 0) {
            throw new IllegalArgumentException();
        }
    }

    public String a() {
        return this.b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        b bVar = (b) obj;
        String str = this.b;
        if (str == null ? bVar.b != null : !str.equals(bVar.b)) {
            return false;
        }
        String str2 = this.a;
        String str3 = bVar.a;
        return str2 == null ? str3 == null : str2.equals(str3);
    }

    public int hashCode() {
        String str = this.a;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.b;
        return hashCode + (str2 != null ? str2.hashCode() : 0);
    }

    public String toString() {
        String str;
        StringBuilder sb = new StringBuilder();
        if (this.a != null) {
            str = this.a + ':';
        } else {
            str = HttpUrl.FRAGMENT_ENCODE_SET;
        }
        sb.append(str);
        sb.append(this.b);
        return sb.toString();
    }
}
