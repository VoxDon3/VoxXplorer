/*
 * Decompiled with CFR 0.152.
 */
package ax.P9;

import ax.P9.j;
import com.microsoft.graph.http.GraphErrorResponse;
import java.util.List;

public class h
extends j {
    protected h(String string, String string2, List<String> list, String string3, int n8, String string4, List<String> list2, GraphErrorResponse graphErrorResponse) {
        super(string, string2, list, string3, n8, string4, list2, graphErrorResponse);
    }

    @Override
    public String c(boolean bl) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("[This is an unexpected error from Graph, please report this at ");
        stringBuilder.append("https://github.com/microsoftgraph/msgraph-sdk-android/issues");
        stringBuilder.append(']');
        stringBuilder.append('\n');
        stringBuilder.append(super.c(true));
        return stringBuilder.toString();
    }
}

