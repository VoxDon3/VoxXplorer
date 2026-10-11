package ax.P9;

import com.microsoft.graph.http.GraphErrorResponse;
import java.util.List;

/* loaded from: classes3.dex */
public class h extends j {
    protected h(String str, String str2, List<String> list, String str3, int i, String str4, List<String> list2, GraphErrorResponse graphErrorResponse) {
        super(str, str2, list, str3, i, str4, list2, graphErrorResponse);
    }

    @Override // ax.P9.j
    public String c(boolean z) {
        return "[This is an unexpected error from Graph, please report this at https://github.com/microsoftgraph/msgraph-sdk-android/issues]\n" + super.c(true);
    }
}
