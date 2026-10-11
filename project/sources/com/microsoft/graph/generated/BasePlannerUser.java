package com.microsoft.graph.generated;

import ax.T9.d;
import ax.T9.e;
import ax.r8.C3003l;
import com.microsoft.graph.extensions.Entity;
import com.microsoft.graph.extensions.PlannerPlan;
import com.microsoft.graph.extensions.PlannerPlanCollectionPage;
import com.microsoft.graph.extensions.PlannerTask;
import com.microsoft.graph.extensions.PlannerTaskCollectionPage;
import java.util.Arrays;

/* loaded from: classes3.dex */
public class BasePlannerUser extends Entity implements d {
    public transient PlannerTaskCollectionPage f;
    public transient PlannerPlanCollectionPage g;
    private transient C3003l h;
    private transient e i;

    @Override // com.microsoft.graph.generated.BaseEntity, ax.T9.d
    public void d(e eVar, C3003l c3003l) {
        this.i = eVar;
        this.h = c3003l;
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
            this.f = new PlannerTaskCollectionPage(basePlannerTaskCollectionResponse, null);
        }
        if (c3003l.x("plans")) {
            BasePlannerPlanCollectionResponse basePlannerPlanCollectionResponse = new BasePlannerPlanCollectionResponse();
            if (c3003l.x("plans@odata.nextLink")) {
                basePlannerPlanCollectionResponse.b = c3003l.t("plans@odata.nextLink").k();
            }
            C3003l[] c3003lArr2 = (C3003l[]) eVar.b(c3003l.t("plans").toString(), C3003l[].class);
            PlannerPlan[] plannerPlanArr = new PlannerPlan[c3003lArr2.length];
            for (int i2 = 0; i2 < c3003lArr2.length; i2++) {
                PlannerPlan plannerPlan = (PlannerPlan) eVar.b(c3003lArr2[i2].toString(), PlannerPlan.class);
                plannerPlanArr[i2] = plannerPlan;
                plannerPlan.d(eVar, c3003lArr2[i2]);
            }
            basePlannerPlanCollectionResponse.a = Arrays.asList(plannerPlanArr);
            this.g = new PlannerPlanCollectionPage(basePlannerPlanCollectionResponse, null);
        }
    }
}
