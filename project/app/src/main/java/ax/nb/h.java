/*
 * Decompiled with CFR 0.152.
 */
package ax.nb;

import java.io.IOException;

public class h
extends IOException {
    public int c0;
    public int q;

    public h(int n8, int n9) {
        super(h.a(n8, n9));
        this.q = n8;
        this.c0 = n9;
    }

    public static String a(int n8, int n9) {
        if (n8 != 0) {
            StringBuilder stringBuilder;
            if (n8 != 1) {
                if (n8 != 2) {
                    StringBuilder stringBuilder2 = new StringBuilder();
                    stringBuilder2.append("");
                    stringBuilder2.append("unknown error class: ");
                    stringBuilder2.append(n8);
                    return stringBuilder2.toString();
                }
                CharSequence charSequence = new StringBuilder();
                charSequence.append("");
                charSequence.append("ERR_SSN_SRVC/");
                charSequence = charSequence.toString();
                if (n9 != -1) {
                    if (n9 != 143) {
                        switch (n9) {
                            default: {
                                StringBuilder stringBuilder3 = new StringBuilder();
                                stringBuilder3.append((String)charSequence);
                                stringBuilder3.append("Unknown error code: ");
                                stringBuilder3.append(n9);
                                return stringBuilder3.toString();
                            }
                            case 131: {
                                StringBuilder stringBuilder4 = new StringBuilder();
                                stringBuilder4.append((String)charSequence);
                                stringBuilder4.append("Called name present, but insufficient resources");
                                return stringBuilder4.toString();
                            }
                            case 130: {
                                StringBuilder stringBuilder5 = new StringBuilder();
                                stringBuilder5.append((String)charSequence);
                                stringBuilder5.append("Called name not present");
                                return stringBuilder5.toString();
                            }
                            case 129: {
                                StringBuilder stringBuilder6 = new StringBuilder();
                                stringBuilder6.append((String)charSequence);
                                stringBuilder6.append("Not listening for calling name");
                                return stringBuilder6.toString();
                            }
                            case 128: 
                        }
                        StringBuilder stringBuilder7 = new StringBuilder();
                        stringBuilder7.append((String)charSequence);
                        stringBuilder7.append("Not listening on called name");
                        return stringBuilder7.toString();
                    }
                    StringBuilder stringBuilder8 = new StringBuilder();
                    stringBuilder8.append((String)charSequence);
                    stringBuilder8.append("Unspecified error");
                    return stringBuilder8.toString();
                }
                StringBuilder stringBuilder9 = new StringBuilder();
                stringBuilder9.append((String)charSequence);
                stringBuilder9.append("Connection refused");
                return stringBuilder9.toString();
            }
            CharSequence charSequence = new StringBuilder();
            charSequence.append("");
            charSequence.append("ERR_NAM_SRVC/");
            charSequence = charSequence.toString();
            if (n9 == 1) {
                stringBuilder = new StringBuilder();
                stringBuilder.append((String)charSequence);
                stringBuilder.append("FMT_ERR: Format Error");
                charSequence = stringBuilder.toString();
            }
            stringBuilder = new StringBuilder();
            stringBuilder.append((String)charSequence);
            stringBuilder.append("Unknown error code: ");
            stringBuilder.append(n9);
            return stringBuilder.toString();
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("");
        stringBuilder.append("SUCCESS");
        return stringBuilder.toString();
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("errorClass=");
        stringBuilder.append(this.q);
        stringBuilder.append(",errorCode=");
        stringBuilder.append(this.c0);
        stringBuilder.append(",errorString=");
        stringBuilder.append(h.a(this.q, this.c0));
        return new String(stringBuilder.toString());
    }
}

