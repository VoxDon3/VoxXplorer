.class Lax/x3/a$c$e;
.super Lax/g3/c;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lax/x3/a$c;-><init>(Lax/x3/a;Landroid/view/View;Landroid/view/View;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic c:Lax/x3/a;

.field final synthetic d:Lax/x3/a$c;


# direct methods
.method constructor <init>(Lax/x3/a$c;Lax/x3/a;)V
    .registers 3

    .line 1
    iput-object p1, p0, Lax/x3/a$c$e;->d:Lax/x3/a$c;

    .line 2
    .line 3
    iput-object p2, p0, Lax/x3/a$c$e;->c:Lax/x3/a;

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
    .registers 8

    .line 1
    iget-object p1, p0, Lax/x3/a$c$e;->d:Lax/x3/a$c;

    .line 2
    .line 3
    iget-object p1, p1, Lax/x3/a$c;->r:Lax/x3/a;

    .line 4
    .line 5
    invoke-static {p1}, Lax/x3/a;->j(Lax/x3/a;)Z

    .line 6
    .line 7
    .line 8
    move-result p1

    .line 9
    if-eqz p1, :cond_1a

    .line 10
    .line 11
    iget-object p1, p0, Lax/x3/a$c$e;->d:Lax/x3/a$c;

    .line 12
    .line 13
    iget-object p1, p1, Lax/x3/a$c;->r:Lax/x3/a;

    .line 14
    .line 15
    invoke-static {p1}, Lax/x3/a;->a(Lax/x3/a;)Lax/x3/z;

    .line 16
    .line 17
    .line 18
    move-result-object p1

    .line 19
    iget-object v0, p0, Lax/x3/a$c$e;->d:Lax/x3/a$c;

    .line 20
    .line 21
    iget v0, v0, Lax/x3/a$c;->m:I

    .line 22
    .line 23
    invoke-interface {p1, v0}, Lax/x3/z;->b(I)V

    .line 24
    .line 25
    .line 26
    return-void

    .line 27
    :cond_1a
    iget-object p1, p0, Lax/x3/a$c$e;->d:Lax/x3/a$c;

    .line 28
    .line 29
    iget-object p1, p1, Lax/x3/a$c;->r:Lax/x3/a;

    .line 30
    .line 31
    invoke-static {p1}, Lax/x3/a;->k(Lax/x3/a;)Landroid/widget/AdapterView$OnItemClickListener;

    .line 32
    .line 33
    .line 34
    move-result-object v0

    .line 35
    iget-object p1, p0, Lax/x3/a$c$e;->d:Lax/x3/a$c;

    .line 36
    .line 37
    invoke-static {p1}, Lax/x3/a$c;->f(Lax/x3/a$c;)Landroid/view/View;

    .line 38
    .line 39
    .line 40
    move-result-object v2

    .line 41
    iget-object p1, p0, Lax/x3/a$c$e;->d:Lax/x3/a$c;

    .line 42
    .line 43
    iget v3, p1, Lax/x3/a$c;->m:I

    .line 44
    .line 45
    int-to-long v4, v3

    .line 46
    const/4 v1, 0x0

    .line 47
    invoke-interface/range {v0 .. v5}, Landroid/widget/AdapterView$OnItemClickListener;->onItemClick(Landroid/widget/AdapterView;Landroid/view/View;IJ)V

    .line 48
    .line 49
    .line 50
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
