package com.microsoft.graph.generated;

import ax.T9.d;
import ax.T9.e;
import ax.r8.C3003l;
import ax.s8.InterfaceC3059a;
import ax.s8.InterfaceC3061c;
import com.microsoft.graph.extensions.Entity;
import com.microsoft.graph.extensions.PlannerTask;
import com.microsoft.graph.extensions.PlannerTaskCollectionPage;
import java.util.Arrays;

/* loaded from: classes3.dex */
public class BasePlannerBucket extends Entity implements d {

    @InterfaceC3059a
    @InterfaceC3061c("name")
    public String f;

    @InterfaceC3059a
    @InterfaceC3061c("planId")
    public String g;

    @InterfaceC3059a
    @InterfaceC3061c("orderHint")
    public String h;
    public transient PlannerTaskCollectionPage i;
    private transient C3003l j;
    private transient e k;

    @Override // com.microsoft.graph.generated.BaseEntity, ax.T9.d
    public void d(e eVar, C3003l c3003l) {
        this.k = eVar;
        this.j = c3003l;
        if (c3003l.x("tasks")) {
            BasePlannerTaskCollectionResponse basePlannerTaskCollectionResponse = new BasePlannerTaskCollectionResponse();
            if (c3003l.x("tasks@odata.nextLink")) {
                basePlannerTaskCollectionResponse.b = c3003l.t("tasks@odata.nextLink").k();
            }
            C3003l[] c3003lArr = (C3003l[]) eVar.b(c3003l.t("tasks").toString(), C3003l[].class);
            PlannerTask[] plannerTaskArr = new PlannerTask[c3003lArr.length];
            for (int i = 0; i < c3003lArr.length; i++) {
                PlannerTask plannerTask = (PlannerTask) eVar.b(c3003lArr[i].toString(), PlannerTask.class);
                plannerTaskArr[i] = plannerTask;
                plannerTask.d(eVar, c3003lArr[i]);
            }
            basePlannerTaskCollectionResponse.a = Arrays.asList(plannerTaskArr);
            this.i = new PlannerTaskCollectionPage(basePlannerTaskCollectionResponse, null);
        }
    }
}
