/*
 * Decompiled with CFR 0.152.
 */
package ax.pb;

import ax.pb.b0;
import java.io.IOException;
import java.net.URL;
import java.net.URLConnection;
import java.net.URLStreamHandler;

public class i
extends URLStreamHandler {
    static final URLStreamHandler a = new i();

    @Override
    protected int getDefaultPort() {
        return 445;
    }

    @Override
    public URLConnection openConnection(URL uRL) throws IOException {
        return new b0(uRL);
    }

    @Override
    protected void parseURL(URL uRL, String charSequence, int n8, int n9) {
        CharSequence charSequence2;
        int n10;
        String string = uRL.getHost();
        if (((String)charSequence).equals("smb://")) {
            n10 = n9 + 2;
            charSequence2 = "smb:////";
        } else {
            charSequence2 = charSequence;
            n10 = n9;
            if (!((String)charSequence).startsWith("smb://")) {
                charSequence2 = charSequence;
                n10 = n9;
                if (string != null) {
                    charSequence2 = charSequence;
                    n10 = n9;
                    if (string.length() == 0) {
                        charSequence2 = new StringBuilder();
                        ((StringBuilder)charSequence2).append("//");
                        ((StringBuilder)charSequence2).append((String)charSequence);
                        charSequence2 = ((StringBuilder)charSequence2).toString();
                        n10 = n9 + 2;
                    }
                }
            }
        }
        super.parseURL(uRL, (String)charSequence2, n8, n10);
        charSequence2 = uRL.getPath();
        string = uRL.getRef();
        charSequence = charSequence2;
        if (string != null) {
            charSequence = new StringBuilder();
            ((StringBuilder)charSequence).append((String)charSequence2);
            ((StringBuilder)charSequence).append('#');
            ((StringBuilder)charSequence).append(string);
            charSequence = ((StringBuilder)charSequence).toString();
        }
        n8 = n9 = uRL.getPort();
        if (n9 == -1) {
            n8 = this.getDefaultPort();
        }
        this.setURL(uRL, "smb", uRL.getHost(), n8, uRL.getAuthority(), uRL.getUserInfo(), (String)charSequence, uRL.getQuery(), null);
    }
}

