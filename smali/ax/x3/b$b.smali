.class Lax/x3/b$b;
.super Lax/g3/c;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lax/x3/b;->getManageSpaceButtonClickListener()Landroid/view/View$OnClickListener;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic c:Lax/x3/b;


# direct methods
.method constructor <init>(Lax/x3/b;)V
    .registers 2

    .line 1
    iput-object p1, p0, Lax/x3/b$b;->c:Lax/x3/b;

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
    .registers 4

    .line 1
    invoke-static {}, Lax/X2/Q;->C0()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-nez v0, :cond_7

    .line 6
    .line 7
    goto :goto_38

    .line 8
    :cond_7
    invoke-virtual {p1}, Landroid/view/View;->getId()I

    .line 9
    .line 10
    .line 11
    move-result v0

    .line 12
    const v1, 0x7f0a0261

    .line 13
    .line 14
    .line 15
    if-ne v0, v1, :cond_38

    .line 16
    .line 17
    invoke-virtual {p1}, Landroid/view/View;->getTag()Ljava/lang/Object;

    .line 18
    .line 19
    .line 20
    move-result-object p1

    .line 21
    check-cast p1, Ljava/lang/Integer;

    .line 22
    .line 23
    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    .line 24
    .line 25
    .line 26
    move-result p1

    .line 27
    iget-object v0, p0, Lax/x3/b$b;->c:Lax/x3/b;

    .line 28
    .line 29
    invoke-static {v0}, Lax/x3/b;->a(Lax/x3/b;)Lax/x3/a;

    .line 30
    .line 31
    .line 32
    move-result-object v0

    .line 33
    invoke-interface {v0}, Landroid/widget/Adapter;->getCount()I

    .line 34
    .line 35
    .line 36
    move-result v0

    .line 37
    if-lt p1, v0, :cond_27

    .line 38
    .line 39
    goto :goto_38

    .line 40
    :cond_27
    iget-object v0, p0, Lax/x3/b$b;->c:Lax/x3/b;

    .line 41
    .line 42
    invoke-static {v0}, Lax/x3/b;->a(Lax/x3/b;)Lax/x3/a;

    .line 43
    .line 44
    .line 45
    move-result-object v0

    .line 46
    invoke-interface {v0, p1}, Landroid/widget/Adapter;->getItem(I)Ljava/lang/Object;

    .line 47
    .line 48
    .line 49
    move-result-object p1

    .line 50
    check-cast p1, Lax/U2/f;

    .line 51
    .line 52
    iget-object v0, p0, Lax/x3/b$b;->c:Lax/x3/b;

    .line 53
    .line 54
    invoke-static {v0, p1}, Lax/x3/b;->c(Lax/x3/b;Lax/U2/f;)V

    .line 55
    .line 56
    .line 57
    :cond_38
    :goto_38
    return-void
    .line 58
    .line 59
    .line 60
    .line 61
.end method
