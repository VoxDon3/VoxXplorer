.class final Landroidx/activity/ComponentActivity$h;
.super Lax/Gb/m;
.source "SourceFile"

# interfaces
.implements Lax/Fb/a;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Landroidx/activity/ComponentActivity;-><init>()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lax/Gb/m;",
        "Lax/Fb/a<",
        "Lax/i/p;",
        ">;"
    }
.end annotation


# instance fields
.field final synthetic q:Landroidx/activity/ComponentActivity;


# direct methods
.method constructor <init>(Landroidx/activity/ComponentActivity;)V
    .registers 2

    iput-object p1, p0, Landroidx/activity/ComponentActivity$h;->q:Landroidx/activity/ComponentActivity;

    const/4 p1, 0x0

    invoke-direct {p0, p1}, Lax/Gb/m;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a()Lax/i/p;
    .registers 5

    .line 1
    new-instance v0, Lax/i/p;

    .line 2
    .line 3
    iget-object v1, p0, Landroidx/activity/ComponentActivity$h;->q:Landroidx/activity/ComponentActivity;

    .line 4
    .line 5
    # getter for: Landroidx/activity/ComponentActivity;->reportFullyDrawnExecutor:Landroidx/activity/ComponentActivity$d;
    invoke-static {v1}, Landroidx/activity/ComponentActivity;->access$getReportFullyDrawnExecutor$p(Landroidx/activity/ComponentActivity;)Landroidx/activity/ComponentActivity$d;

    .line 6
    .line 7
    .line 8
    move-result-object v1

    .line 9
    new-instance v2, Landroidx/activity/ComponentActivity$h$a;

    .line 10
    .line 11
    iget-object v3, p0, Landroidx/activity/ComponentActivity$h;->q:Landroidx/activity/ComponentActivity;

    .line 12
    .line 13
    invoke-direct {v2, v3}, Landroidx/activity/ComponentActivity$h$a;-><init>(Landroidx/activity/ComponentActivity;)V

    .line 14
    .line 15
    .line 16
    invoke-direct {v0, v1, v2}, Lax/i/p;-><init>(Ljava/util/concurrent/Executor;Lax/Fb/a;)V

    .line 17
    .line 18
    .line 19
    return-object v0
    .line 20
    .line 21
.end method

.method public bridge synthetic invoke()Ljava/lang/Object;
    .registers 2

    .line 1
    invoke-virtual {p0}, Landroidx/activity/ComponentActivity$h;->a()Lax/i/p;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    return-object v0
    .line 6
    .line 7
    .line 8
    .line 9
    .line 10
    .line 11
    .line 12
    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
.end method
