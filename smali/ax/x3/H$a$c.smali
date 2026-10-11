.class Lax/x3/H$a$c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnLongClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lax/x3/H$a;-><init>(Lax/x3/H;Landroid/view/View;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lax/x3/H;

.field final synthetic b:Lax/x3/H$a;


# direct methods
.method constructor <init>(Lax/x3/H$a;Lax/x3/H;)V
    .registers 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()V"
        }
    .end annotation

    .line 1
    iput-object p1, p0, Lax/x3/H$a$c;->b:Lax/x3/H$a;

    .line 2
    .line 3
    iput-object p2, p0, Lax/x3/H$a$c;->a:Lax/x3/H;

    .line 4
    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

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
.method public onLongClick(Landroid/view/View;)Z
    .registers 10

    .line 1
    iget-object v0, p0, Lax/x3/H$a$c;->b:Lax/x3/H$a;

    .line 2
    .line 3
    iget-object v0, v0, Lax/x3/H$a;->A:Lax/x3/H;

    .line 4
    .line 5
    invoke-static {v0}, Lax/x3/H;->O(Lax/x3/H;)Z

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    const/4 v1, 0x0

    .line 10
    if-eqz v0, :cond_c

    .line 11
    .line 12
    return v1

    .line 13
    :cond_c
    iget-object v0, p0, Lax/x3/H$a$c;->b:Lax/x3/H$a;

    .line 14
    .line 15
    iget-object v0, v0, Lax/x3/H$a;->A:Lax/x3/H;

    .line 16
    .line 17
    invoke-static {v0}, Lax/x3/H;->R(Lax/x3/H;)Landroid/widget/AdapterView$OnItemLongClickListener;

    .line 18
    .line 19
    .line 20
    move-result-object v0

    .line 21
    if-eqz v0, :cond_34

    .line 22
    .line 23
    iget-object v0, p0, Lax/x3/H$a$c;->b:Lax/x3/H$a;

    .line 24
    .line 25
    invoke-virtual {v0}, Landroidx/recyclerview/widget/RecyclerView$F;->k()I

    .line 26
    .line 27
    .line 28
    move-result v5

    .line 29
    if-gez v5, :cond_1f

    .line 30
    .line 31
    return v1

    .line 32
    :cond_1f
    iget-object v0, p0, Lax/x3/H$a$c;->b:Lax/x3/H$a;

    .line 33
    .line 34
    iget-object v0, v0, Lax/x3/H$a;->A:Lax/x3/H;

    .line 35
    .line 36
    invoke-static {v0}, Lax/x3/H;->R(Lax/x3/H;)Landroid/widget/AdapterView$OnItemLongClickListener;

    .line 37
    .line 38
    .line 39
    move-result-object v2

    .line 40
    iget-object v0, p0, Lax/x3/H$a$c;->b:Lax/x3/H$a;

    .line 41
    .line 42
    invoke-virtual {v0}, Landroidx/recyclerview/widget/RecyclerView$F;->l()J

    .line 43
    .line 44
    .line 45
    move-result-wide v6

    .line 46
    const/4 v3, 0x0

    .line 47
    move-object v4, p1

    .line 48
    invoke-interface/range {v2 .. v7}, Landroid/widget/AdapterView$OnItemLongClickListener;->onItemLongClick(Landroid/widget/AdapterView;Landroid/view/View;IJ)Z

    .line 49
    .line 50
    .line 51
    const/4 p1, 0x1

    .line 52
    return p1

    .line 53
    :cond_34
    return v1
    .line 54
    .line 55
    .line 56
    .line 57
    .line 58
    .line 59
    .line 60
    .line 61
.end method
