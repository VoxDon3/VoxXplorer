.class Lax/d3/E$Q;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lax/d3/E;->g9()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic q:Lax/d3/E;


# direct methods
.method constructor <init>(Lax/d3/E;)V
    .registers 2

    .line 1
    iput-object p1, p0, Lax/d3/E$Q;->q:Lax/d3/E;

    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    return-void
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
    .line 22
.end method


# virtual methods
.method public run()V
    .registers 4

    .line 1
    iget-object v0, p0, Lax/d3/E$Q;->q:Lax/d3/E;

    .line 2
    .line 3
    invoke-virtual {v0}, Lax/d3/n;->K3()Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-eqz v0, :cond_43

    .line 8
    .line 9
    iget-object v0, p0, Lax/d3/E$Q;->q:Lax/d3/E;

    .line 10
    .line 11
    invoke-virtual {v0}, Lax/d3/n;->g3()I

    .line 12
    .line 13
    .line 14
    move-result v0

    .line 15
    iget-object v1, p0, Lax/d3/E$Q;->q:Lax/d3/E;

    .line 16
    .line 17
    invoke-static {v1}, Lax/d3/E;->b5(Lax/d3/E;)Lax/x3/d;

    .line 18
    .line 19
    .line 20
    move-result-object v1

    .line 21
    invoke-virtual {v1}, Lax/x3/d;->i()I

    .line 22
    .line 23
    .line 24
    move-result v1

    .line 25
    const/4 v2, -0x1

    .line 26
    if-gez v0, :cond_1c

    .line 27
    .line 28
    const/4 v0, -0x1

    .line 29
    :cond_1c
    if-gez v1, :cond_1f

    .line 30
    .line 31
    const/4 v1, -0x1

    .line 32
    :cond_1f
    iget-object v2, p0, Lax/d3/E$Q;->q:Lax/d3/E;

    .line 33
    .line 34
    invoke-static {v2}, Lax/d3/E;->J5(Lax/d3/E;)Landroid/widget/ListView;

    .line 35
    .line 36
    .line 37
    move-result-object v2

    .line 38
    invoke-virtual {v2, v0}, Landroid/view/View;->setNextFocusLeftId(I)V

    .line 39
    .line 40
    .line 41
    iget-object v2, p0, Lax/d3/E$Q;->q:Lax/d3/E;

    .line 42
    .line 43
    invoke-static {v2}, Lax/d3/E;->C5(Lax/d3/E;)Landroid/widget/GridView;

    .line 44
    .line 45
    .line 46
    move-result-object v2

    .line 47
    invoke-virtual {v2, v0}, Landroid/view/View;->setNextFocusLeftId(I)V

    .line 48
    .line 49
    .line 50
    iget-object v0, p0, Lax/d3/E$Q;->q:Lax/d3/E;

    .line 51
    .line 52
    invoke-static {v0}, Lax/d3/E;->J5(Lax/d3/E;)Landroid/widget/ListView;

    .line 53
    .line 54
    .line 55
    move-result-object v0

    .line 56
    invoke-virtual {v0, v1}, Landroid/view/View;->setNextFocusRightId(I)V

    .line 57
    .line 58
    .line 59
    iget-object v0, p0, Lax/d3/E$Q;->q:Lax/d3/E;

    .line 60
    .line 61
    invoke-static {v0}, Lax/d3/E;->C5(Lax/d3/E;)Landroid/widget/GridView;

    .line 62
    .line 63
    .line 64
    move-result-object v0

    .line 65
    invoke-virtual {v0, v1}, Landroid/view/View;->setNextFocusRightId(I)V

    .line 66
    .line 67
    .line 68
    :cond_43
    return-void
.end method
