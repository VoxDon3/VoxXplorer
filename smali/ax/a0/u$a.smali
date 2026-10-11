.class Lax/a0/u$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lax/a0/u$c;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lax/a0/u;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0xa
    name = "a"
.end annotation


# static fields
.field static final b:Lax/a0/u$a;


# instance fields
.field private final a:Z


# direct methods
.method static constructor <clinit>()V
    .registers 2

    .line 1
    new-instance v0, Lax/a0/u$a;

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    invoke-direct {v0, v1}, Lax/a0/u$a;-><init>(Z)V

    .line 5
    .line 6
    .line 7
    sput-object v0, Lax/a0/u$a;->b:Lax/a0/u$a;

    .line 8
    .line 9
    return-void
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

.method private constructor <init>(Z)V
    .registers 2

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-boolean p1, p0, Lax/a0/u$a;->a:Z

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
.method public a(Ljava/lang/CharSequence;II)I
    .registers 8

    .line 1
    add-int/2addr p3, p2

    .line 2
    const/4 v0, 0x0

    .line 3
    const/4 v1, 0x0

    .line 4
    :goto_3
    if-ge p2, p3, :cond_26

    .line 5
    .line 6
    invoke-interface {p1, p2}, Ljava/lang/CharSequence;->charAt(I)C

    .line 7
    .line 8
    .line 9
    move-result v2

    .line 10
    invoke-static {v2}, Ljava/lang/Character;->getDirectionality(C)B

    .line 11
    .line 12
    .line 13
    move-result v2

    .line 14
    invoke-static {v2}, Lax/a0/u;->a(I)I

    .line 15
    .line 16
    .line 17
    move-result v2

    .line 18
    const/4 v3, 0x1

    .line 19
    if-eqz v2, :cond_1e

    .line 20
    .line 21
    if-eq v2, v3, :cond_17

    .line 22
    .line 23
    goto :goto_23

    .line 24
    :cond_17
    iget-boolean v1, p0, Lax/a0/u$a;->a:Z

    .line 25
    .line 26
    if-nez v1, :cond_1c

    .line 27
    .line 28
    return v3

    .line 29
    :cond_1c
    const/4 v1, 0x1

    .line 30
    goto :goto_23

    .line 31
    :cond_1e
    iget-boolean v1, p0, Lax/a0/u$a;->a:Z

    .line 32
    .line 33
    if-eqz v1, :cond_1c

    .line 34
    .line 35
    return v0

    .line 36
    :goto_23
    add-int/lit8 p2, p2, 0x1

    .line 37
    .line 38
    goto :goto_3

    .line 39
    :cond_26
    if-eqz v1, :cond_2b

    .line 40
    .line 41
    iget-boolean p1, p0, Lax/a0/u$a;->a:Z

    .line 42
    .line 43
    return p1

    .line 44
    :cond_2b
    const/4 p1, 0x2

    .line 45
    return p1
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
