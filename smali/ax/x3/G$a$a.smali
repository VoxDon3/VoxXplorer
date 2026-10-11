.class Lax/x3/G$a$a;
.super Lax/g3/c;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lax/x3/G$a;-><init>(Lax/x3/G;Landroid/view/View;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic c:Lax/x3/G;

.field final synthetic d:Lax/x3/G$a;


# direct methods
.method constructor <init>(Lax/x3/G$a;Lax/x3/G;)V
    .registers 3

    .line 1
    iput-object p1, p0, Lax/x3/G$a$a;->d:Lax/x3/G$a;

    .line 2
    .line 3
    iput-object p2, p0, Lax/x3/G$a$a;->c:Lax/x3/G;

    .line 4
    .line 5
    invoke-direct {p0}, Lax/g3/c;-><init>()V

    .line 6
    .line 7
    .line 8
    return-void
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
    .line 23
    .line 24
    .line 25
    .line 26
    .line 27
    .line 28
    .line 29
    .line 30
    .line 31
    .line 32
    .line 33
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
.method public a(Landroid/view/View;)V
    .registers 9

    .line 1
    iget-object v0, p0, Lax/x3/G$a$a;->d:Lax/x3/G$a;

    .line 2
    .line 3
    iget-object v0, v0, Lax/x3/G$a;->v:Lax/x3/G;

    .line 4
    .line 5
    invoke-static {v0}, Lax/x3/G;->N(Lax/x3/G;)Z

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    if-eqz v0, :cond_b

    .line 10
    .line 11
    goto :goto_31

    .line 12
    :cond_b
    iget-object v0, p0, Lax/x3/G$a$a;->d:Lax/x3/G$a;

    .line 13
    .line 14
    iget-object v0, v0, Lax/x3/G$a;->v:Lax/x3/G;

    .line 15
    .line 16
    invoke-static {v0}, Lax/x3/G;->O(Lax/x3/G;)Landroid/widget/AdapterView$OnItemClickListener;

    .line 17
    .line 18
    .line 19
    move-result-object v0

    .line 20
    if-eqz v0, :cond_31

    .line 21
    .line 22
    iget-object v0, p0, Lax/x3/G$a$a;->d:Lax/x3/G$a;

    .line 23
    .line 24
    invoke-virtual {v0}, Landroidx/recyclerview/widget/RecyclerView$F;->k()I

    .line 25
    .line 26
    .line 27
    move-result v4

    .line 28
    if-gez v4, :cond_1e

    .line 29
    .line 30
    goto :goto_31

    .line 31
    :cond_1e
    iget-object v0, p0, Lax/x3/G$a$a;->d:Lax/x3/G$a;

    .line 32
    .line 33
    iget-object v0, v0, Lax/x3/G$a;->v:Lax/x3/G;

    .line 34
    .line 35
    invoke-static {v0}, Lax/x3/G;->O(Lax/x3/G;)Landroid/widget/AdapterView$OnItemClickListener;

    .line 36
    .line 37
    .line 38
    move-result-object v1

    .line 39
    iget-object v0, p0, Lax/x3/G$a$a;->d:Lax/x3/G$a;

    .line 40
    .line 41
    invoke-virtual {v0}, Landroidx/recyclerview/widget/RecyclerView$F;->l()J

    .line 42
    .line 43
    .line 44
    move-result-wide v5

    .line 45
    const/4 v2, 0x0

    .line 46
    move-object v3, p1

    .line 47
    invoke-interface/range {v1 .. v6}, Landroid/widget/AdapterView$OnItemClickListener;->onItemClick(Landroid/widget/AdapterView;Landroid/view/View;IJ)V

    .line 48
    .line 49
    .line 50
    :cond_31
    :goto_31
    return-void
    .line 51
    .line 52
    .line 53
    .line 54
    .line 55
    .line 56
    .line 57
    .line 58
    .line 59
    .line 60
    .line 61
.end method
