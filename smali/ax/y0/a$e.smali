.class Lax/y0/a$e;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lax/y0/a;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0xa
    name = "e"
.end annotation


# instance fields
.field public final a:I

.field public final b:Ljava/lang/String;

.field public final c:I

.field public final d:I


# direct methods
.method constructor <init>(Ljava/lang/String;II)V
    .registers 4

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput-object p1, p0, Lax/y0/a$e;->b:Ljava/lang/String;

    .line 3
    iput p2, p0, Lax/y0/a$e;->a:I

    .line 4
    iput p3, p0, Lax/y0/a$e;->c:I

    const/4 p1, -0x1

    .line 5
    iput p1, p0, Lax/y0/a$e;->d:I

    return-void
.end method

.method constructor <init>(Ljava/lang/String;III)V
    .registers 5

    .line 6
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 7
    iput-object p1, p0, Lax/y0/a$e;->b:Ljava/lang/String;

    .line 8
    iput p2, p0, Lax/y0/a$e;->a:I

    .line 9
    iput p3, p0, Lax/y0/a$e;->c:I

    .line 10
    iput p4, p0, Lax/y0/a$e;->d:I

    return-void
.end method


# virtual methods
.method a(I)Z
    .registers 6

    .line 1
    iget v0, p0, Lax/y0/a$e;->c:I

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    const/4 v2, 0x7

    .line 5
    if-eq v0, v2, :cond_31

    .line 6
    .line 7
    if-ne p1, v2, :cond_9

    .line 8
    .line 9
    goto :goto_31

    .line 10
    :cond_9
    if-eq v0, p1, :cond_31

    .line 11
    .line 12
    iget v2, p0, Lax/y0/a$e;->d:I

    .line 13
    .line 14
    if-ne v2, p1, :cond_10

    .line 15
    .line 16
    goto :goto_31

    .line 17
    :cond_10
    const/4 v3, 0x4

    .line 18
    if-eq v0, v3, :cond_15

    .line 19
    .line 20
    if-ne v2, v3, :cond_19

    .line 21
    .line 22
    :cond_15
    const/4 v3, 0x3

    .line 23
    if-ne p1, v3, :cond_19

    .line 24
    .line 25
    return v1

    .line 26
    :cond_19
    const/16 v3, 0x9

    .line 27
    .line 28
    if-eq v0, v3, :cond_1f

    .line 29
    .line 30
    if-ne v2, v3, :cond_24

    .line 31
    .line 32
    :cond_1f
    const/16 v3, 0x8

    .line 33
    .line 34
    if-ne p1, v3, :cond_24

    .line 35
    .line 36
    return v1

    .line 37
    :cond_24
    const/16 v3, 0xc

    .line 38
    .line 39
    if-eq v0, v3, :cond_2a

    .line 40
    .line 41
    if-ne v2, v3, :cond_2f

    .line 42
    .line 43
    :cond_2a
    const/16 v0, 0xb

    .line 44
    .line 45
    if-ne p1, v0, :cond_2f

    .line 46
    .line 47
    return v1

    .line 48
    :cond_2f
    const/4 p1, 0x0

    .line 49
    return p1

    .line 50
    :cond_31
    :goto_31
    return v1
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
