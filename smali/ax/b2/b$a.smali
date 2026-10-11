.class Lax/b2/b$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/content/DialogInterface$OnMultiChoiceClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lax/b2/b;->i3(Landroidx/appcompat/app/a$a;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lax/b2/b;


# direct methods
.method constructor <init>(Lax/b2/b;)V
    .registers 2

    .line 1
    iput-object p1, p0, Lax/b2/b$a;->a:Lax/b2/b;

    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

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
.method public onClick(Landroid/content/DialogInterface;IZ)V
    .registers 6

    .line 1
    if-eqz p3, :cond_18

    .line 2
    .line 3
    iget-object p1, p0, Lax/b2/b$a;->a:Lax/b2/b;

    .line 4
    .line 5
    iget-boolean p3, p1, Lax/b2/b;->C0:Z

    .line 6
    .line 7
    iget-object v0, p1, Lax/b2/b;->B0:Ljava/util/Set;

    .line 8
    .line 9
    iget-object v1, p1, Lax/b2/b;->E0:[Ljava/lang/CharSequence;

    .line 10
    .line 11
    aget-object p2, v1, p2

    .line 12
    .line 13
    invoke-interface {p2}, Ljava/lang/CharSequence;->toString()Ljava/lang/String;

    .line 14
    .line 15
    .line 16
    move-result-object p2

    .line 17
    invoke-interface {v0, p2}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    .line 18
    .line 19
    .line 20
    move-result p2

    .line 21
    or-int/2addr p2, p3

    .line 22
    iput-boolean p2, p1, Lax/b2/b;->C0:Z

    .line 23
    .line 24
    return-void

    .line 25
    :cond_18
    iget-object p1, p0, Lax/b2/b$a;->a:Lax/b2/b;

    .line 26
    .line 27
    iget-boolean p3, p1, Lax/b2/b;->C0:Z

    .line 28
    .line 29
    iget-object v0, p1, Lax/b2/b;->B0:Ljava/util/Set;

    .line 30
    .line 31
    iget-object v1, p1, Lax/b2/b;->E0:[Ljava/lang/CharSequence;

    .line 32
    .line 33
    aget-object p2, v1, p2

    .line 34
    .line 35
    invoke-interface {p2}, Ljava/lang/CharSequence;->toString()Ljava/lang/String;

    .line 36
    .line 37
    .line 38
    move-result-object p2

    .line 39
    invoke-interface {v0, p2}, Ljava/util/Set;->remove(Ljava/lang/Object;)Z

    .line 40
    .line 41
    .line 42
    move-result p2

    .line 43
    or-int/2addr p2, p3

    .line 44
    iput-boolean p2, p1, Lax/b2/b;->C0:Z

    .line 45
    .line 46
    return-void
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
