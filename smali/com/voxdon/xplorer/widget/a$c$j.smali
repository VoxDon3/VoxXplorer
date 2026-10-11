.class Lcom/voxdon/xplorer/widget/a$c$j;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnLongClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/voxdon/xplorer/widget/a$c;->E(Landroid/view/View;Landroid/view/ViewGroup;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Landroid/view/ViewGroup;

.field final synthetic b:Lcom/voxdon/xplorer/widget/a$c;


# direct methods
.method constructor <init>(Lcom/voxdon/xplorer/widget/a$c;Landroid/view/ViewGroup;)V
    .registers 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()V"
        }
    .end annotation

    .line 1
    iput-object p1, p0, Lcom/voxdon/xplorer/widget/a$c$j;->b:Lcom/voxdon/xplorer/widget/a$c;

    .line 2
    .line 3
    iput-object p2, p0, Lcom/voxdon/xplorer/widget/a$c$j;->a:Landroid/view/ViewGroup;

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
    .registers 6

    .line 1
    iget-object p1, p0, Lcom/voxdon/xplorer/widget/a$c$j;->a:Landroid/view/ViewGroup;

    .line 2
    .line 3
    instance-of v0, p1, Lax/x3/r;

    .line 4
    .line 5
    if-eqz v0, :cond_b

    .line 6
    .line 7
    check-cast p1, Lax/x3/r;

    .line 8
    .line 9
    invoke-interface {p1}, Lax/x3/r;->a()V

    .line 10
    .line 11
    .line 12
    :cond_b
    iget-object p1, p0, Lcom/voxdon/xplorer/widget/a$c$j;->b:Lcom/voxdon/xplorer/widget/a$c;

    .line 13
    .line 14
    iget-object p1, p1, Lcom/voxdon/xplorer/widget/a$c;->Q:Lcom/voxdon/xplorer/widget/a;

    .line 15
    .line 16
    invoke-static {p1}, Lcom/voxdon/xplorer/widget/a;->n(Lcom/voxdon/xplorer/widget/a;)Lax/x3/z;

    .line 17
    .line 18
    .line 19
    move-result-object p1

    .line 20
    iget-object v0, p0, Lcom/voxdon/xplorer/widget/a$c$j;->b:Lcom/voxdon/xplorer/widget/a$c;

    .line 21
    .line 22
    invoke-static {v0}, Lcom/voxdon/xplorer/widget/a$c;->n(Lcom/voxdon/xplorer/widget/a$c;)I

    .line 23
    .line 24
    .line 25
    move-result v0

    .line 26
    iget-object v1, p0, Lcom/voxdon/xplorer/widget/a$c$j;->b:Lcom/voxdon/xplorer/widget/a$c;

    .line 27
    .line 28
    invoke-static {v1}, Lcom/voxdon/xplorer/widget/a$c;->p(Lcom/voxdon/xplorer/widget/a$c;)Landroid/view/View;

    .line 29
    .line 30
    .line 31
    move-result-object v1

    .line 32
    iget-object v2, p0, Lcom/voxdon/xplorer/widget/a$c$j;->b:Lcom/voxdon/xplorer/widget/a$c;

    .line 33
    .line 34
    invoke-static {v2}, Lcom/voxdon/xplorer/widget/a$c;->q(Lcom/voxdon/xplorer/widget/a$c;)I

    .line 35
    .line 36
    .line 37
    move-result v2

    .line 38
    iget-object v3, p0, Lcom/voxdon/xplorer/widget/a$c$j;->b:Lcom/voxdon/xplorer/widget/a$c;

    .line 39
    .line 40
    invoke-static {v3}, Lcom/voxdon/xplorer/widget/a$c;->a(Lcom/voxdon/xplorer/widget/a$c;)I

    .line 41
    .line 42
    .line 43
    move-result v3

    .line 44
    invoke-interface {p1, v0, v1, v2, v3}, Lax/x3/z;->c(ILandroid/view/View;II)V

    .line 45
    .line 46
    .line 47
    const/4 p1, 0x1

    .line 48
    return p1
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
