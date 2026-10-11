.class public Lax/x3/I;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lax/x3/I$b;,
        Lax/x3/I$c;
    }
.end annotation


# instance fields
.field a:Landroidx/recyclerview/widget/RecyclerView;

.field b:Lax/i2/I;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lax/i2/I<",
            "Ljava/lang/Long;",
            ">;"
        }
    .end annotation
.end field

.field c:Lax/i2/p;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lax/i2/p<",
            "Ljava/lang/Long;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method constructor <init>(Landroidx/recyclerview/widget/RecyclerView;Lax/i2/I;Lax/i2/p;)V
    .registers 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/recyclerview/widget/RecyclerView;",
            "Lax/i2/I<",
            "Ljava/lang/Long;",
            ">;",
            "Lax/i2/p<",
            "Ljava/lang/Long;",
            ">;)V"
        }
    .end annotation

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lax/x3/I;->a:Landroidx/recyclerview/widget/RecyclerView;

    .line 5
    .line 6
    iput-object p2, p0, Lax/x3/I;->b:Lax/i2/I;

    .line 7
    .line 8
    iput-object p3, p0, Lax/x3/I;->c:Lax/i2/p;

    .line 9
    .line 10
    return-void
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
    .line 62
    .line 63
    .line 64
    .line 65
    .line 66
    .line 67
    .line 68
    .line 69
    .line 70
    .line 71
    .line 72
    .line 73
    .line 74
    .line 75
    .line 76
    .line 77
    .line 78
    .line 79
    .line 80
    .line 81
    .line 82
    .line 83
    .line 84
    .line 85
    .line 86
    .line 87
    .line 88
.end method

.method public static a(Landroidx/recyclerview/widget/RecyclerView;Lax/x3/H;)Lax/x3/I;
    .registers 8

    .line 1
    new-instance v3, Lax/x3/I$b;

    .line 2
    .line 3
    invoke-direct {v3, p0, p1}, Lax/x3/I$b;-><init>(Landroidx/recyclerview/widget/RecyclerView;Lax/x3/H;)V

    .line 4
    .line 5
    .line 6
    new-instance v0, Lax/i2/I$a;

    .line 7
    .line 8
    new-instance v4, Lax/x3/I$c;

    .line 9
    .line 10
    invoke-direct {v4, p0}, Lax/x3/I$c;-><init>(Landroidx/recyclerview/widget/RecyclerView;)V

    .line 11
    .line 12
    .line 13
    invoke-static {}, Lax/i2/J;->a()Lax/i2/J;

    .line 14
    .line 15
    .line 16
    move-result-object v5

    .line 17
    const-string v1, "selection-1"

    .line 18
    .line 19
    move-object v2, p0

    .line 20
    invoke-direct/range {v0 .. v5}, Lax/i2/I$a;-><init>(Ljava/lang/String;Landroidx/recyclerview/widget/RecyclerView;Lax/i2/p;Lax/i2/o;Lax/i2/J;)V

    .line 21
    .line 22
    .line 23
    new-instance p0, Lax/x3/I$a;

    .line 24
    .line 25
    invoke-direct {p0, v2}, Lax/x3/I$a;-><init>(Landroidx/recyclerview/widget/RecyclerView;)V

    .line 26
    .line 27
    .line 28
    invoke-virtual {v0, p0}, Lax/i2/I$a;->b(Lax/i2/I$c;)Lax/i2/I$a;

    .line 29
    .line 30
    .line 31
    move-result-object p0

    .line 32
    invoke-virtual {p0}, Lax/i2/I$a;->a()Lax/i2/I;

    .line 33
    .line 34
    .line 35
    move-result-object p0

    .line 36
    new-instance p1, Lax/x3/I;

    .line 37
    .line 38
    invoke-direct {p1, v2, p0, v3}, Lax/x3/I;-><init>(Landroidx/recyclerview/widget/RecyclerView;Lax/i2/I;Lax/i2/p;)V

    .line 39
    .line 40
    .line 41
    return-object p1
.end method


# virtual methods
.method public b(J)I
    .registers 4

    .line 1
    iget-object v0, p0, Lax/x3/I;->c:Lax/i2/p;

    .line 2
    .line 3
    invoke-static {p1, p2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    invoke-virtual {v0, p1}, Lax/i2/p;->b(Ljava/lang/Object;)I

    .line 8
    .line 9
    .line 10
    move-result p1

    .line 11
    return p1
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

.method public c()Lax/i2/I;
    .registers 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lax/i2/I<",
            "Ljava/lang/Long;",
            ">;"
        }
    .end annotation

    .line 1
    iget-object v0, p0, Lax/x3/I;->b:Lax/i2/I;

    .line 2
    .line 3
    return-object v0
    .line 4
    .line 5
    .line 6
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
.end method
