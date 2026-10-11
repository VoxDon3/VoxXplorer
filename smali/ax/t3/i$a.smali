.class Lax/t3/i$a;
.super Lax/g3/c;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lax/t3/i;->f()Lax/x3/D;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic c:Lax/t3/i;


# direct methods
.method constructor <init>(Lax/t3/i;)V
    .registers 2

    .line 1
    iput-object p1, p0, Lax/t3/i$a;->c:Lax/t3/i;

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
    .registers 3

    .line 1
    :try_start_0
    invoke-virtual {p1}, Landroid/view/View;->getTag()Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    check-cast p1, Ljava/lang/Integer;

    .line 6
    .line 7
    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    .line 8
    .line 9
    .line 10
    move-result p1

    .line 11
    iget-object v0, p0, Lax/t3/i$a;->c:Lax/t3/i;

    .line 12
    .line 13
    invoke-static {v0}, Lax/t3/i;->a(Lax/t3/i;)Ljava/util/ArrayList;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->remove(I)Ljava/lang/Object;

    .line 18
    .line 19
    .line 20
    iget-object p1, p0, Lax/t3/i$a;->c:Lax/t3/i;

    .line 21
    .line 22
    invoke-static {p1}, Lax/t3/i;->b(Lax/t3/i;)Lax/x3/D;

    .line 23
    .line 24
    .line 25
    move-result-object p1

    .line 26
    invoke-virtual {p1}, Landroidx/recyclerview/widget/RecyclerView$h;->r()V

    .line 27
    .line 28
    .line 29
    iget-object p1, p0, Lax/t3/i$a;->c:Lax/t3/i;

    .line 30
    .line 31
    invoke-static {p1}, Lax/t3/i;->c(Lax/t3/i;)V
    :try_end_21
    .catch Ljava/lang/IndexOutOfBoundsException; {:try_start_0 .. :try_end_21} :catch_21

    .line 32
    .line 33
    .line 34
    :catch_21
    return-void
    .line 35
    .line 36
    .line 37
    .line 38
    .line 39
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
