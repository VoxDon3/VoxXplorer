.class public final Lax/x0/f;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lax/x0/f$c;,
        Lax/x0/f$b;,
        Lax/x0/f$a;
    }
.end annotation


# instance fields
.field private final a:Lax/x0/f$b;


# direct methods
.method public constructor <init>(Landroid/widget/TextView;Z)V
    .registers 4

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    const-string v0, "textView cannot be null"

    .line 5
    .line 6
    invoke-static {p1, v0}, Lax/b0/g;->h(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 7
    .line 8
    .line 9
    if-nez p2, :cond_12

    .line 10
    .line 11
    new-instance p2, Lax/x0/f$c;

    .line 12
    .line 13
    invoke-direct {p2, p1}, Lax/x0/f$c;-><init>(Landroid/widget/TextView;)V

    .line 14
    .line 15
    .line 16
    iput-object p2, p0, Lax/x0/f;->a:Lax/x0/f$b;

    .line 17
    .line 18
    return-void

    .line 19
    :cond_12
    new-instance p2, Lax/x0/f$a;

    .line 20
    .line 21
    invoke-direct {p2, p1}, Lax/x0/f$a;-><init>(Landroid/widget/TextView;)V

    .line 22
    .line 23
    .line 24
    iput-object p2, p0, Lax/x0/f;->a:Lax/x0/f$b;

    .line 25
    .line 26
    return-void
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
.method public a([Landroid/text/InputFilter;)[Landroid/text/InputFilter;
    .registers 3

    .line 1
    iget-object v0, p0, Lax/x0/f;->a:Lax/x0/f$b;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, Lax/x0/f$b;->a([Landroid/text/InputFilter;)[Landroid/text/InputFilter;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    return-object p1
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

.method public b()Z
    .registers 2

    .line 1
    iget-object v0, p0, Lax/x0/f;->a:Lax/x0/f$b;

    .line 2
    .line 3
    invoke-virtual {v0}, Lax/x0/f$b;->b()Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    return v0
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

.method public c(Z)V
    .registers 3

    .line 1
    iget-object v0, p0, Lax/x0/f;->a:Lax/x0/f$b;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, Lax/x0/f$b;->c(Z)V

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

.method public d(Z)V
    .registers 3

    .line 1
    iget-object v0, p0, Lax/x0/f;->a:Lax/x0/f$b;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, Lax/x0/f$b;->d(Z)V

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

.method public e(Landroid/text/method/TransformationMethod;)Landroid/text/method/TransformationMethod;
    .registers 3

    .line 1
    iget-object v0, p0, Lax/x0/f;->a:Lax/x0/f$b;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, Lax/x0/f$b;->e(Landroid/text/method/TransformationMethod;)Landroid/text/method/TransformationMethod;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    return-object p1
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
