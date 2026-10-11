.class Lcom/voxdon/xplorer/widget/a$c$i;
.super Lax/g3/c;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/voxdon/xplorer/widget/a$c;->E(Landroid/view/View;Landroid/view/ViewGroup;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic c:Lcom/voxdon/xplorer/widget/a$c;


# direct methods
.method constructor <init>(Lcom/voxdon/xplorer/widget/a$c;)V
    .registers 2

    .line 1
    iput-object p1, p0, Lcom/voxdon/xplorer/widget/a$c$i;->c:Lcom/voxdon/xplorer/widget/a$c;

    .line 2
    .line 3
    invoke-direct {p0}, Lax/g3/c;-><init>()V

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
.method public a(Landroid/view/View;)V
    .registers 8

    .line 1
    iget-object p1, p0, Lcom/voxdon/xplorer/widget/a$c$i;->c:Lcom/voxdon/xplorer/widget/a$c;

    .line 2
    .line 3
    iget-object p1, p1, Lcom/voxdon/xplorer/widget/a$c;->Q:Lcom/voxdon/xplorer/widget/a;

    .line 4
    .line 5
    invoke-static {p1}, Lcom/voxdon/xplorer/widget/a;->c(Lcom/voxdon/xplorer/widget/a;)Z

    .line 6
    .line 7
    .line 8
    move-result p1

    .line 9
    if-eqz p1, :cond_1c

    .line 10
    .line 11
    iget-object p1, p0, Lcom/voxdon/xplorer/widget/a$c$i;->c:Lcom/voxdon/xplorer/widget/a$c;

    .line 12
    .line 13
    iget-object p1, p1, Lcom/voxdon/xplorer/widget/a$c;->Q:Lcom/voxdon/xplorer/widget/a;

    .line 14
    .line 15
    invoke-static {p1}, Lcom/voxdon/xplorer/widget/a;->n(Lcom/voxdon/xplorer/widget/a;)Lax/x3/z;

    .line 16
    .line 17
    .line 18
    move-result-object p1

    .line 19
    iget-object v0, p0, Lcom/voxdon/xplorer/widget/a$c$i;->c:Lcom/voxdon/xplorer/widget/a$c;

    .line 20
    .line 21
    invoke-static {v0}, Lcom/voxdon/xplorer/widget/a$c;->n(Lcom/voxdon/xplorer/widget/a$c;)I

    .line 22
    .line 23
    .line 24
    move-result v0

    .line 25
    invoke-interface {p1, v0}, Lax/x3/z;->b(I)V

    .line 26
    .line 27
    .line 28
    return-void

    .line 29
    :cond_1c
    iget-object p1, p0, Lcom/voxdon/xplorer/widget/a$c$i;->c:Lcom/voxdon/xplorer/widget/a$c;

    .line 30
    .line 31
    iget-object p1, p1, Lcom/voxdon/xplorer/widget/a$c;->Q:Lcom/voxdon/xplorer/widget/a;

    .line 32
    .line 33
    invoke-static {p1}, Lcom/voxdon/xplorer/widget/a;->d(Lcom/voxdon/xplorer/widget/a;)Landroid/widget/AdapterView$OnItemClickListener;

    .line 34
    .line 35
    .line 36
    move-result-object v0

    .line 37
    iget-object p1, p0, Lcom/voxdon/xplorer/widget/a$c$i;->c:Lcom/voxdon/xplorer/widget/a$c;

    .line 38
    .line 39
    invoke-static {p1}, Lcom/voxdon/xplorer/widget/a$c;->c(Lcom/voxdon/xplorer/widget/a$c;)Landroid/view/View;

    .line 40
    .line 41
    .line 42
    move-result-object v2

    .line 43
    iget-object p1, p0, Lcom/voxdon/xplorer/widget/a$c$i;->c:Lcom/voxdon/xplorer/widget/a$c;

    .line 44
    .line 45
    invoke-static {p1}, Lcom/voxdon/xplorer/widget/a$c;->n(Lcom/voxdon/xplorer/widget/a$c;)I

    .line 46
    .line 47
    .line 48
    move-result v3

    .line 49
    iget-object p1, p0, Lcom/voxdon/xplorer/widget/a$c$i;->c:Lcom/voxdon/xplorer/widget/a$c;

    .line 50
    .line 51
    invoke-static {p1}, Lcom/voxdon/xplorer/widget/a$c;->n(Lcom/voxdon/xplorer/widget/a$c;)I

    .line 52
    .line 53
    .line 54
    move-result p1

    .line 55
    int-to-long v4, p1

    .line 56
    const/4 v1, 0x0

    .line 57
    invoke-interface/range {v0 .. v5}, Landroid/widget/AdapterView$OnItemClickListener;->onItemClick(Landroid/widget/AdapterView;Landroid/view/View;IJ)V

    .line 58
    .line 59
    .line 60
    return-void
    .line 61
.end method
