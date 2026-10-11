.class Lax/t2/a$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/animation/ValueAnimator$AnimatorUpdateListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lax/t2/a;->m()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lax/t2/a$c;

.field final synthetic b:Lax/t2/a;


# direct methods
.method constructor <init>(Lax/t2/a;Lax/t2/a$c;)V
    .registers 3

    .line 1
    iput-object p1, p0, Lax/t2/a$a;->b:Lax/t2/a;

    .line 2
    .line 3
    iput-object p2, p0, Lax/t2/a$a;->a:Lax/t2/a$c;

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
.method public onAnimationUpdate(Landroid/animation/ValueAnimator;)V
    .registers 5

    .line 1
    invoke-virtual {p1}, Landroid/animation/ValueAnimator;->getAnimatedValue()Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    check-cast p1, Ljava/lang/Float;

    .line 6
    .line 7
    invoke-virtual {p1}, Ljava/lang/Float;->floatValue()F

    .line 8
    .line 9
    .line 10
    move-result p1

    .line 11
    iget-object v0, p0, Lax/t2/a$a;->b:Lax/t2/a;

    .line 12
    .line 13
    iget-object v1, p0, Lax/t2/a$a;->a:Lax/t2/a$c;

    .line 14
    .line 15
    invoke-virtual {v0, p1, v1}, Lax/t2/a;->n(FLax/t2/a$c;)V

    .line 16
    .line 17
    .line 18
    iget-object v0, p0, Lax/t2/a$a;->b:Lax/t2/a;

    .line 19
    .line 20
    iget-object v1, p0, Lax/t2/a$a;->a:Lax/t2/a$c;

    .line 21
    .line 22
    const/4 v2, 0x0

    .line 23
    invoke-virtual {v0, p1, v1, v2}, Lax/t2/a;->b(FLax/t2/a$c;Z)V

    .line 24
    .line 25
    .line 26
    iget-object p1, p0, Lax/t2/a$a;->b:Lax/t2/a;

    .line 27
    .line 28
    invoke-virtual {p1}, Landroid/graphics/drawable/Drawable;->invalidateSelf()V

    .line 29
    .line 30
    .line 31
    return-void
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
.end method
