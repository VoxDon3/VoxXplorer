.class Lax/x3/D$a$a;
.super Lax/g3/c;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lax/x3/D$a;-><init>(Lax/x3/D;Landroid/view/View;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic c:Lax/x3/D;

.field final synthetic d:Lax/x3/D$a;


# direct methods
.method constructor <init>(Lax/x3/D$a;Lax/x3/D;)V
    .registers 3

    .line 1
    iput-object p1, p0, Lax/x3/D$a$a;->d:Lax/x3/D$a;

    .line 2
    .line 3
    iput-object p2, p0, Lax/x3/D$a$a;->c:Lax/x3/D;

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
    iget-object v0, p0, Lax/x3/D$a$a;->d:Lax/x3/D$a;

    .line 2
    .line 3
    iget-object v0, v0, Lax/x3/D$a;->x:Lax/x3/D;

    .line 4
    .line 5
    invoke-static {v0}, Lax/x3/D;->O(Lax/x3/D;)Landroid/widget/AdapterView$OnItemClickListener;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    if-eqz v0, :cond_26

    .line 10
    .line 11
    iget-object v0, p0, Lax/x3/D$a$a;->d:Lax/x3/D$a;

    .line 12
    .line 13
    invoke-virtual {v0}, Landroidx/recyclerview/widget/RecyclerView$F;->k()I

    .line 14
    .line 15
    .line 16
    move-result v4

    .line 17
    if-gez v4, :cond_13

    .line 18
    .line 19
    goto :goto_26

    .line 20
    :cond_13
    iget-object v0, p0, Lax/x3/D$a$a;->d:Lax/x3/D$a;

    .line 21
    .line 22
    iget-object v0, v0, Lax/x3/D$a;->x:Lax/x3/D;

    .line 23
    .line 24
    invoke-static {v0}, Lax/x3/D;->O(Lax/x3/D;)Landroid/widget/AdapterView$OnItemClickListener;

    .line 25
    .line 26
    .line 27
    move-result-object v1

    .line 28
    iget-object v0, p0, Lax/x3/D$a$a;->d:Lax/x3/D$a;

    .line 29
    .line 30
    invoke-virtual {v0}, Landroidx/recyclerview/widget/RecyclerView$F;->l()J

    .line 31
    .line 32
    .line 33
    move-result-wide v5

    .line 34
    const/4 v2, 0x0

    .line 35
    move-object v3, p1

    .line 36
    invoke-interface/range {v1 .. v6}, Landroid/widget/AdapterView$OnItemClickListener;->onItemClick(Landroid/widget/AdapterView;Landroid/view/View;IJ)V

    .line 37
    .line 38
    .line 39
    :cond_26
    :goto_26
    return-void
    .line 40
    .line 41
    .line 42
    .line 43
    .line 44
    .line 45
    .line 46
    .line 47
    .line 48
    .line 49
    .line 50
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
