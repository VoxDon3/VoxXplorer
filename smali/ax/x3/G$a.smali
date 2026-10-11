.class public Lax/x3/G$a;
.super Landroidx/recyclerview/widget/RecyclerView$F;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lax/x3/G;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = "a"
.end annotation


# instance fields
.field private u:Landroid/view/View;

.field final synthetic v:Lax/x3/G;


# direct methods
.method constructor <init>(Lax/x3/G;Landroid/view/View;)V
    .registers 4

    .line 1
    iput-object p1, p0, Lax/x3/G$a;->v:Lax/x3/G;

    .line 2
    .line 3
    invoke-direct {p0, p2}, Landroidx/recyclerview/widget/RecyclerView$F;-><init>(Landroid/view/View;)V

    .line 4
    .line 5
    .line 6
    const v0, 0x7f0a0079

    .line 7
    .line 8
    .line 9
    invoke-virtual {p2, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 10
    .line 11
    .line 12
    move-result-object p2

    .line 13
    iput-object p2, p0, Lax/x3/G$a;->u:Landroid/view/View;

    .line 14
    .line 15
    new-instance v0, Lax/x3/G$a$a;

    .line 16
    .line 17
    invoke-direct {v0, p0, p1}, Lax/x3/G$a$a;-><init>(Lax/x3/G$a;Lax/x3/G;)V

    .line 18
    .line 19
    .line 20
    invoke-virtual {p2, v0}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 21
    .line 22
    .line 23
    iget-object p2, p0, Lax/x3/G$a;->u:Landroid/view/View;

    .line 24
    .line 25
    new-instance v0, Lax/x3/G$a$b;

    .line 26
    .line 27
    invoke-direct {v0, p0, p1}, Lax/x3/G$a$b;-><init>(Lax/x3/G$a;Lax/x3/G;)V

    .line 28
    .line 29
    .line 30
    invoke-virtual {p2, v0}, Landroid/view/View;->setOnLongClickListener(Landroid/view/View$OnLongClickListener;)V

    .line 31
    .line 32
    .line 33
    return-void
    .line 34
    .line 35
    .line 36
    .line 37
    .line 38
    .line 39
    .line 40
    .line 41
.end method


# virtual methods
.method N()V
    .registers 4

    .line 1
    iget-object v0, p0, Lax/x3/G$a;->u:Landroid/view/View;

    .line 2
    .line 3
    if-eqz v0, :cond_38

    .line 4
    .line 5
    iget-object v0, p0, Lax/x3/G$a;->v:Lax/x3/G;

    .line 6
    .line 7
    invoke-static {v0}, Lax/x3/G;->N(Lax/x3/G;)Z

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    const/4 v1, 0x0

    .line 12
    if-eqz v0, :cond_24

    .line 13
    .line 14
    iget-object v0, p0, Lax/x3/G$a;->u:Landroid/view/View;

    .line 15
    .line 16
    invoke-virtual {v0, v1}, Landroid/view/View;->setBackgroundResource(I)V

    .line 17
    .line 18
    .line 19
    iget-object v0, p0, Landroidx/recyclerview/widget/RecyclerView$F;->a:Landroid/view/View;

    .line 20
    .line 21
    iget-object v1, p0, Lax/x3/G$a;->v:Lax/x3/G;

    .line 22
    .line 23
    invoke-static {v1}, Lax/x3/G;->P(Lax/x3/G;)F

    .line 24
    .line 25
    .line 26
    move-result v1

    .line 27
    invoke-virtual {v0, v1}, Landroid/view/View;->setAlpha(F)V

    .line 28
    .line 29
    .line 30
    iget-object v0, p0, Landroidx/recyclerview/widget/RecyclerView$F;->a:Landroid/view/View;

    .line 31
    .line 32
    const/4 v1, 0x1

    .line 33
    invoke-virtual {v0, v1}, Landroid/view/View;->setEnabled(Z)V

    .line 34
    .line 35
    .line 36
    return-void

    .line 37
    :cond_24
    iget-object v0, p0, Lax/x3/G$a;->u:Landroid/view/View;

    .line 38
    .line 39
    const v2, 0x7f08009c

    .line 40
    .line 41
    .line 42
    invoke-virtual {v0, v2}, Landroid/view/View;->setBackgroundResource(I)V

    .line 43
    .line 44
    .line 45
    iget-object v0, p0, Landroidx/recyclerview/widget/RecyclerView$F;->a:Landroid/view/View;

    .line 46
    .line 47
    const/high16 v2, 0x3f800000    # 1.0f

    .line 48
    .line 49
    invoke-virtual {v0, v2}, Landroid/view/View;->setAlpha(F)V

    .line 50
    .line 51
    .line 52
    iget-object v0, p0, Landroidx/recyclerview/widget/RecyclerView$F;->a:Landroid/view/View;

    .line 53
    .line 54
    invoke-virtual {v0, v1}, Landroid/view/View;->setEnabled(Z)V

    .line 55
    .line 56
    .line 57
    :cond_38
    return-void
    .line 58
    .line 59
    .line 60
    .line 61
    .line 62
    .line 63
    .line 64
    .line 65
    .line 66
    .line 67
    .line 68
.end method
